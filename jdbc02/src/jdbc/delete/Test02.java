package jdbc.delete;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcUtils;

public class Test02 {
	public static void main(String[] args) {
		//student 삭제 프로그램
		
		//데이터
		int no = 2;
		
		//JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql = "delete student where no = ?";
		Object[] param = {no};
		
		int result = jdbcTemplate.update(sql, param);
		if(result > 0) {
			System.out.println("성적 정보 삭제 완료");
		}
		else {
			System.out.println("존재하지 않는 성적 정보 번호");
		}
	}
}









