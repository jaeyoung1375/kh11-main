package com.kh.spring12.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring12.dao.BoardDao;
import com.kh.spring12.dao.BoardLikeDao;
import com.kh.spring12.dto.BoardLikeDto;
import com.kh.spring12.vo.BoardLikeVO;

@RestController
@RequestMapping("/rest/board")
public class BoardRestController {

	@Autowired
	private BoardLikeDao boardLikeDao;
	
	@Autowired
	private BoardDao boardDao;
	
	@PostMapping("/like")
	public BoardLikeVO like(HttpSession session,
			@ModelAttribute BoardLikeDto boardLikeDto) {
		String memberId = (String)session.getAttribute("memberId");
		boardLikeDto.setMemberId(memberId);
		
		boolean current = boardLikeDao.check(boardLikeDto);
		if(current) {
			boardLikeDao.delete(boardLikeDto);
		}else {
			boardLikeDao.insert(boardLikeDto);
		}
		
		// 좋아요 개수
		int count = boardLikeDao.count(boardLikeDto.getBoardNo());
		
		// 게시글 좋아요 개수를 업데이트
		boardDao.updateLikeCount(boardLikeDto.getBoardNo(),count);
		
		return BoardLikeVO.builder()
				.result(!current)
				.count(count)
				.build();
		
		
	}
	@PostMapping("/check")
	public boolean check(HttpSession session,
			@ModelAttribute BoardLikeDto boardLikeDto) {
		String memberId = (String)session.getAttribute("memberId");
		boardLikeDto.setMemberId(memberId);
		
		return boardLikeDao.check(boardLikeDto);
	}
}
