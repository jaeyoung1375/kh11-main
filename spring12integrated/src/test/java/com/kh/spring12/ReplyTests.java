package com.kh.spring12;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring12.dao.ReplyDao;
import com.kh.spring12.dto.ReplyDto;

@SpringBootTest
public class ReplyTests {
	
	@Autowired
	private ReplyDao replyDao;
	
	@Test
	public void list() {
		
		int replyNo = 18;
		
		
	replyDao.selectOne(1);
	}

}
