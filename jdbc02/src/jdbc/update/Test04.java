package jdbc.update;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcUtils;

public class Test04 {
	public static void main(String[] args) {
		//student 테이블 정보 수정
		//- no를 이용해서 name, korean, english, math를 변경
		//- update student set name=?,korean=?,english=?,math=? where no=?
		
		//데이터 준비
		int no = 2;
		String name = "테스트";
		int korean = 30;
		int english = 30;
		int math = 30;
		
		//JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql = "update student "
						+ "set name=?,korean=?,english=?,math=? "
						+ "where no=?";
		Object[] param = {name,korean,english,math,no};
		
		int result = jdbcTemplate.update(sql, param);
		if(result > 0) {
			System.out.println("학생 성적 정보 변경 완료");
		}
		else {
			System.out.println("존재하지 않는 번호");
		}
	}
}







