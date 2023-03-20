package com.kh.spring12.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring12.dao.BoardDao;
import com.kh.spring12.dao.ReplyDao;
import com.kh.spring12.dto.ReplyDto;

@RestController
@RequestMapping("/rest/reply")
public class ReplyRestController {
	
	@Autowired
	private ReplyDao replyDao;
	
	@Autowired
	private BoardDao boardDao;

	@GetMapping("/{replyOrigin}")
	public List<ReplyDto> list(@PathVariable int replyOrigin) {
		return replyDao.selectList(replyOrigin);
	}
	
	@PostMapping("/")
	public void write(HttpSession session, 
				@ModelAttribute ReplyDto replyDto) {
		//작성자 설정
		String memberId = (String)session.getAttribute("memberId");
		replyDto.setReplyWriter(memberId);
		
		//등록
		replyDao.insert(replyDto);
		
		boardDao.updateReplyCount(replyDto.getReplyOrigin());
	}
	
	@DeleteMapping("/{replyNo}")
	public void delete(@PathVariable int replyNo) {
		replyDao.delete(replyNo);
		ReplyDto replyDto = replyDao.selectOne(replyNo);
		boardDao.updateReplyCount(replyDto.getReplyOrigin());
	}
	
//	@PutMapping("/")//전체수정
	@PatchMapping("/")//일부수정
	public void edit(@ModelAttribute ReplyDto replyDto) {
		replyDao.update(replyDto);
	}
	
}

