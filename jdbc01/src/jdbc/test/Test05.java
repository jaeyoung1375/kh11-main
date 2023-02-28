package jdbc.test;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05 {
	public static void main(String[] args) {
		//mobile 등록
		
		//데이터 준비
		String name = "Galaxy ZFlip";
		String telecom = "KT";
		int price = 1400000;
		Integer month = 24;
		
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


