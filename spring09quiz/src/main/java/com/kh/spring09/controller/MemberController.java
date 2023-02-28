package com.kh.spring09.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.spring09.dao.MemberDao;
import com.kh.spring09.dto.MemberDto;

@Controller
@RequestMapping("/member")//공용 주소
public class MemberController {

	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping("/join")//매핑 주소
	@ResponseBody 
	public String join(@ModelAttribute MemberDto memberDto) {
		memberDao.insert(memberDto);
		return "<h1>가입 성공</h1>";
	}
	
}







