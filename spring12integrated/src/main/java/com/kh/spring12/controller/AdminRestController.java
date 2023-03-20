package com.kh.spring12.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring12.dao.MemberStatDao;
import com.kh.spring12.dao.PocketmonStatDao;
import com.kh.spring12.dao.SubjectDao;
import com.kh.spring12.dao.SubjectStatDao;
import com.kh.spring12.dto.MemberStatDto;
import com.kh.spring12.dto.PocketmonStatDto;
import com.kh.spring12.dto.SubjectStatDto;

// 목표 : 관리자가 보는 페이지에 필요한 데이터를 전송하는 비동기 대응 컨트롤러
@CrossOrigin(origins = {"http://127.0.0.1:5500"})
@RestController
@RequestMapping("/rest/admin")
public class AdminRestController {
	
	@Autowired
	private PocketmonStatDao pocketmonStatDao;
	
	@Autowired
	private SubjectStatDao subjectStatDao;
	
	@Autowired
	private MemberStatDao memberStatDao;
	
	@GetMapping("/pocketmon")
	public Map<String, List<Object>> pocketmon() {
		List<PocketmonStatDto> list = pocketmonStatDao.selectList();
		// list를 두개로 분리
		List<Object> names = new ArrayList<>();
		List<Object> counts = new ArrayList<>();
		
		for(PocketmonStatDto dto : list) {
			names.add(dto.getType());
			counts.add(dto.getCnt());
		}
		
		Map<String, List<Object>> map = new HashMap<>();
		map.put("label",names);
		map.put("data", counts);
		
		
		return map;
	}
	
	@GetMapping("/subject")
	public Map<String,List<Object>> subject(){
		List<SubjectStatDto> list = subjectStatDao.selectList();
		
		List<Object> types = new ArrayList<>();
		List<Object> counts = new ArrayList<>();
		List<Object> avg = new ArrayList<>();
		
		for(SubjectStatDto dto : list) {
			types.add(dto.getType());
			counts.add(dto.getCnt());
			avg.add(dto.getAverage());
		}
		
		Map<String,List<Object>> map = new HashMap<>();
		map.put("label", types);
		map.put("data", counts);
		map.put("avg", avg);
		
		return map;
		
	}
	
	@GetMapping("/member")
	public Map<String,List<Object>> member(){
		List<MemberStatDto> list = memberStatDao.selectList();
		
		List<Object> levels = new ArrayList<>();
		List<Object> counts = new ArrayList<>();
		
		for(MemberStatDto dto : list) {
			levels.add(dto.getMemberLevel());
			counts.add(dto.getCnt());
		}
		
		Map<String,List<Object>> map = new HashMap<>();
		map.put("label",levels);
		map.put("data", counts);
		
		return map;
	}
}
