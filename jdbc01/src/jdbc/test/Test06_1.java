package jdbc.test;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test06_1 {
	public static void main(String[] args) {
		//STUDENT INSERT 프로그램
		
		//데이터 준비
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		sc.close();
		
		//Spring JDBC
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		//dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");//구버전(deprecated)
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("kh11");
		dataSource.setPassword("kh11");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		
		String sql = "insert into student(no,name,korean,english,math) "
						+ "values(student_seq.nextval, ?, ?, ?, ?)";
		Object[] param = {name,korean,english,math};
		
		jdbcTemplate.update(sql, param);
		System.out.println("실행 완료");
		
	}
}









