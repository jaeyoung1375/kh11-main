package jdbc.test;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test06 {
	public static void main(String[] args) {
		//STUDENT INSERT 프로그램
		
		//데이터 준비
		String name = "피카츄";
		int korean = 70;
		int english = 80;
		int math = 90;
		
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









