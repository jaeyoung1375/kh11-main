package com.kh.spring06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//컨트롤러로 등록해주세요
public class ParameterController {

	//주소에 ?를 적고 뒤에 key=value 형태로 데이터를 추가할 수 있다
	//이를 요청 파라미터(request parameter)라고 부른다
	//서버에서는 파라미터의 이름과 형태를 반드시 알아야 한다
	//@RequestParam 과 변수를 사용하여 파라미터를 수신하도록 선언
	@RequestMapping("/age")
	@ResponseBody
	public String age(
			@RequestParam String name, 
			@RequestParam int birth) {
//		System.out.println("name = " + name);
//		System.out.println("birth = " + birth);
		int result = 2023 - birth + 1;
		return name+" 님의 나이는 " + result + "입니다";
	}
	
}





