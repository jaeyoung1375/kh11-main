package jdbc.select3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.SubjectDto;
import jdbc.util.JdbcUtils;

public class Test02 {
	public static void main(String[] args) {
		//subject 단일 조회
		
		//데이터
		int no = 11;
		
		//JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql = "select * from subject where no = ?";
		Object[] param = {no};
		RowMapper<SubjectDto> mapper = new RowMapper<SubjectDto>() {
			@Override
			public SubjectDto mapRow(ResultSet rs, int idx) throws SQLException {
				SubjectDto dto = new SubjectDto();
				dto.setNo(rs.getInt("no"));//no -> no
				dto.setName(rs.getString("name"));
				dto.setPeriod(rs.getInt("period"));
				dto.setPrice(rs.getInt("price"));
				dto.setType(rs.getString("type"));
				return dto;
			}
		};
		
		List<SubjectDto> list = jdbcTemplate.query(sql, mapper, param);
		if(list.isEmpty()) {
			System.out.println("데이터가 없습니다");
		}
		else {
			System.out.println("데이터를 찾았습니다");
			
			SubjectDto dto = list.get(0);
			System.out.println(dto);
		}
	}
}











