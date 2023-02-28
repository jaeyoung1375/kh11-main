package jdbc.test;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test04_1 {
	public static void main(String[] args) {
		//pocketmon 등록
		
		//데이터 준비
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호 : ");
		int no = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("속성 : ");
		String type = sc.nextLine();
		
		sc.close();
		
		//Spring JDBC
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh11");
		dataSource.setPassword("kh11");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		
		String sql = "insert into pocketmon(no,name,type) values(?,?,?)";
		Object[] param = {no,name,type};
		
		jdbcTemplate.update(sql, param);
		System.out.println("실행 완료");
	}
}








