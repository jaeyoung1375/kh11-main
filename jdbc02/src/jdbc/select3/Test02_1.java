package jdbc.select3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.SubjectDto;
import jdbc.util.JdbcUtils;

public class Test02_1 {
	public static void main(String[] args) {
		//subject 단일 조회
		//- List 형태로 조회하지 않을 경우 RowMapper가 아니라 ResultSetExtractor라는 것을 사용한다
		
		//데이터
		int no = 11;
		
		//JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql = "select * from subject where no = ?";
		Object[] param = {no};
		
		ResultSetExtractor<SubjectDto> extractor = new ResultSetExtractor<SubjectDto>() {
			@Override
			public SubjectDto extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {//데이터가 있으면
					SubjectDto dto = new SubjectDto();
					dto.setNo(rs.getInt("no"));//no -> no
					dto.setName(rs.getString("name"));
					dto.setPeriod(rs.getInt("period"));
					dto.setPrice(rs.getInt("price"));
					dto.setType(rs.getString("type"));
					return dto;
				}
				else {//데이터가 없으면
					return null;
				}
			}
		};
		
		SubjectDto dto = jdbcTemplate.query(sql, extractor, param);
		if(dto == null) {
			System.out.println("데이터가 없습니다");
		}
		else {
			System.out.println("데이터를 찾았습니다");
			System.out.println(dto);
		}
	}
}











