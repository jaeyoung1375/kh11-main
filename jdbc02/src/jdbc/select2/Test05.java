package jdbc.select2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.StudentDto;
import jdbc.util.JdbcUtils;

public class Test05 {
	public static void main(String[] args) {
		//student 키워드 검색
		
		//데이터 준비
		String type = "name";
		String keyword = "피카";
		
		//JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql = "select * from student where instr(#1, ?) > 0 "
												+ "order by #1 asc";
		sql = sql.replace("#1", type);
		
		Object[] param = {keyword};
		
		RowMapper<StudentDto> mapper = new RowMapper<StudentDto>() {
			@Override
			public StudentDto mapRow(ResultSet rs, int arg1) throws SQLException {
				StudentDto dto = new StudentDto();
				dto.setNo(rs.getInt("no"));
				dto.setName(rs.getString("name"));
				dto.setKorean(rs.getInt("korean"));
				dto.setEnglish(rs.getInt("english"));
				dto.setMath(rs.getInt("math"));
				return dto;
			}
		};
		
		List<StudentDto> list = jdbcTemplate.query(sql, mapper, param);
		if(list.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다");
		}
		else {
			System.out.println("검색 결과 : "+list.size()+"개");
			for(StudentDto dto : list) {
				System.out.println(dto);
			}
		}
	}
}











