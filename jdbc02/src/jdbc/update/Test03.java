package jdbc.update;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import jdbc.util.JdbcUtils;

public class Test03 {
	public static void main(String[] args) {
		//subject 테이블 데이터 수정 코드
		//- no를 이용해서 name, period, price, type을 변경
		//- update subject set name=?,period=?,price=?,type=? where no=?
		
		//데이터 준비(5개)
		int no = 1;
		String name = "변경된과정이름";
		int period = 90;
		int price = 1000000;
		String type = "혼합";
		
		//JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql = "update subject "
						+ "set name=?,period=?,price=?,type=? "
						+ "where no=?";
		Object[] param = {name,period,price,type,no};
		
		int result = jdbcTemplate.update(sql, param);
		if(result > 0) {
			System.out.println("과정 정보가 변경되었습니다");
		}
		else {
			System.out.println("해당 번호는 존재하지 않는 과정입니다");
		}
	}
}











