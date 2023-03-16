package com.kh.spring12.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring12.dao.BoardLikeDao;
import com.kh.spring12.dto.BoardLikeDto;

@RestController
@RequestMapping("/rest/board")
public class BoardRestController {

	@Autowired
	private BoardLikeDao boardLikeDao;
	@PostMapping("/like")
	public boolean like(HttpSession session,
			@ModelAttribute BoardLikeDto boardLikeDto) {
		String memberId = (String)session.getAttribute("memberId");
		boardLikeDto.setMemberId(memberId);
		
		boolean current = boardLikeDao.check(boardLikeDto);
		if(current) {
			boardLikeDao.delete(boardLikeDto);
		}else {
			boardLikeDao.insert(boardLikeDto);
		}
		
		return !current;
		
		
	}
	@PostMapping("/check")
	public boolean check(HttpSession session,
			@ModelAttribute BoardLikeDto boardLikeDto) {
		String memberId = (String)session.getAttribute("memberId");
		boardLikeDto.setMemberId(memberId);
		
		return boardLikeDao.check(boardLikeDto);
	}
}
