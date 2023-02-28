package com.kh.spring11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	@RequestMapping("/student")
	public String studentHome() {
		return "/WEB-INF/views/student.jsp";
	}
	
	@RequestMapping("/subject")
	public String subjectHome() {
		return "/WEB-INF/views/subject.jsp";
	}
	
}
