package com.kh.spring12.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring12.dao.PocketmonDao;
import com.kh.spring12.dto.PocketmonDto;

// 이 컨트롤러의 목표는 XHR 통신에 대해서 처리 후 JSON을 반환하는 것
// Spring에서는 JSON을 어떻게 만드나?
// 안만들어도 된다 Jackson-Databind 라이브러리가 자동 변환을 처리한다

// CORS를 허용해야 한다면 @CrossOrigin을 추가한다
// CrossOrigin(orgins={"*"}) // 전부다 허용(공공데이터 API 만드는 경우)
@CrossOrigin(origins = {"http://127.0.0.1:5500"}) // 특정 출처만 허용
@RestController
@RequestMapping("/rest/pocketmon")
public class PocketmonRestController {
	
	@Autowired
	private PocketmonDao pocketmonDao;

	@GetMapping("/")
	public List<PocketmonDto> list(){
		return pocketmonDao.selectList();
	}
	
	@GetMapping("/{no}")
	public String find(@PathVariable int no) {
		PocketmonDto dto = pocketmonDao.selectOne(no);
		if(dto == null) {
			return "NNNNY";
		}else{
			return "NNNNN";
		}
	}
	
	@PostMapping("/")
	public void insert(@ModelAttribute PocketmonDto dto) {
		pocketmonDao.insert(dto);
	}
	
	@DeleteMapping("/{no}")
	public void delete(@PathVariable int no) {
		pocketmonDao.delete(no);
	}
	
//	@PatchMapping() // 일부 정보를 바꿀 때
	@PutMapping("/") // 모든 정보를 바꿀 때
	public void edit(@ModelAttribute PocketmonDto dto) {
		pocketmonDao.update(dto);
	}

	
}
