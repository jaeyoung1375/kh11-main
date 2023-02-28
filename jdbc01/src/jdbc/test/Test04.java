package jdbc.test;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test04 {
	public static void main(String[] args) {
		//pocketmon 등록
		
		//데이터 준비
		int no = 10;
		String name = "테스트";
		String type = "전기";
		
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








