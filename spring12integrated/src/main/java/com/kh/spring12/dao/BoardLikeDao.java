package com.kh.spring12.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring12.dto.BoardLikeDto;

@Repository
public class BoardLikeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// 등록
	public void insert(BoardLikeDto boardLikeDto) {
		String sql = "insert into board_like(member_id,board_no) values(?,?)";
		Object[] param = {boardLikeDto.getMemberId(), boardLikeDto.getBoardNo()};
		jdbcTemplate.update(sql,param);
	}
	// 삭제
	public void delete(BoardLikeDto dto) {
		String sql = "delete * from board_like where member_id = ? and board_no = ?";
		Object[] param = {dto.getMemberId(),dto.getBoardNo()};
		
		jdbcTemplate.update(sql,param);
	}
	// 확인 - 상세
	public boolean check(BoardLikeDto dto) {
		String sql = "select count(*) board_like where member_id ? and board_no = ?";
		Object[] param = {dto.getMemberId(), dto.getBoardNo()};
		
		int count = jdbcTemplate.queryForObject(sql,int.class,param);
		
		return count == 1;
	}

}
