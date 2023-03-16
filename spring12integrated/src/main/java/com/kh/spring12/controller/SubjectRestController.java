package com.kh.spring12.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring12.dao.SubjectDao;
import com.kh.spring12.dto.SubjectDto;

@CrossOrigin(origins = {"http://127.0.0.1:5500"}) // 특정 출처만 허용
@RestController
@RequestMapping("/rest/subject")
public class SubjectRestController {
	
	@Autowired
	private SubjectDao subjectDao;
	
	@GetMapping("/")
	public List<SubjectDto> list() {
		return subjectDao.selectList();
	}
	
	@PostMapping("/")
	public void insert(SubjectDto dto) {
		subjectDao.insert(dto);
	}
	
	@DeleteMapping("/{no}")
	public void delete(@PathVariable int no) {
		subjectDao.delete(no);
	}
	
	

}
