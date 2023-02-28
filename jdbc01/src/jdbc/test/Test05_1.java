package jdbc.test;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05_1 {
	public static void main(String[] args) {
		//mobile 등록
		
		//데이터 준비
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("통신사 : ");
		String telecom = sc.nextLine();
		
		System.out.print("판매가 : ");
		int price = sc.nextInt();
		
		System.out.print("할부개월수(0:미설정) : ");
		Integer month = sc.nextInt();
		
		sc.close();
		
		if(month == 0) {
			month = null;
		}
		
		//Spring JDBC
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh11");
		dataSource.setPassword("kh11");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		
		String sql = "insert into mobile(name,telecom,price,month) values(?,?,?,?)";
		Object[] param = {name,telecom,price,month};
		
		jdbcTemplate.update(sql, param);
		
		System.out.println("실행 완료");
	}
}


