package jdbc.select2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.SubjectDto;
import jdbc.util.JdbcUtils;

public class Test04 {
	public static void main(String[] args) {
		//subject 검색
		
		//데이터 준비
		String type = "name";
		String keyword = "파이썬";
		
		//JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		//String sql = "select * from subject where instr(#1, ?) > 0";
		String sql = "select * from subject "
						+ "where instr(#1, ?) > 0 "
						+ "order by #1 asc";
		sql = sql.replace("#1", type);
		
		//System.out.println(sql);
		
		Object[] param = {keyword};
		
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
		//if(list.size() == 0) {
		if(list.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다");
		}
		else {
			System.out.println("검색 결과 총 "+list.size()+"건");
			for(SubjectDto dto : list) {
				System.out.println(dto);
			}
		}
		
	}
}








