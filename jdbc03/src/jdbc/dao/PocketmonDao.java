package jdbc.dao;
//DAO(Data Access Object) 
//- DB 작업 전담 처리 클래스

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.PocketmonDto;
import jdbc.util.JdbcUtils;

public class PocketmonDao {
	
	//Read에 필요한 RowMapper를 미리 생성
	private RowMapper<PocketmonDto> mapper = new RowMapper<PocketmonDto>() {
		@Override
		public PocketmonDto mapRow(ResultSet rs, int idx) throws SQLException {
			PocketmonDto dto = new PocketmonDto();
			dto.setNo(rs.getInt("no"));
			dto.setName(rs.getString("name"));
			dto.setType(rs.getString("type"));
			return dto;
		}
	};
	
	//C(등록)
	//public void insert(int no, String name, String type) {
	public void insert(PocketmonDto dto) {
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql = "insert into pocketmon(no,name,type) "
					+ "values(?,?,?)";
//		Java 13+에서 사용 가능한 여러줄 문자열 구문
//		String sql = """
//					insert into pocketmon(no,name,type)
//					values(?,?,?)
//				""";
		
		Object[] param = {
			dto.getNo(), dto.getName(), dto.getType()
		};
		
		jdbcTemplate.update(sql, param);
	}
	
	//R(목록)
	public List<PocketmonDto> selectList() {
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql = "select * from pocketmon order by no asc";
		
//		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper);
//		return list;
		return jdbcTemplate.query(sql, mapper);
	}
	//R(검색)
	public List<PocketmonDto> selectList(String column, String keyword) {
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql = "select * from pocketmon "
						+ "where instr(#1, ?) > 0 "
						+ "order by #1 asc";
		sql = sql.replace("#1", column);
		Object[] param = {keyword};
		
		return jdbcTemplate.query(sql, mapper, param);
	}
	
	//R(상세)
	public PocketmonDto selectOne(int no) {
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql = "select * from pocketmon where no = ?";
		Object[] param = {no};
		
		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper, param);
		if(list.isEmpty()) {
			return null;
		}
		else {
			return list.get(0);
		}
	}
	
	//U(수정)
	public boolean update(PocketmonDto dto) {
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql = "update pocketmon set name=?,type=? where no=?";
		Object[] param = {
			dto.getName(),dto.getType(),dto.getNo()
		};
		
		int result = jdbcTemplate.update(sql, param);
		
		return result > 0;//result가 0보다 큰지 판정하여 반환하세요
	}
	
	//D(삭제)
	public boolean delete(int no) {
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql = "delete pocketmon where no = ?";	
		Object[] param = {no};
		
		int result = jdbcTemplate.update(sql, param);
		return result > 0;
	}
}
















