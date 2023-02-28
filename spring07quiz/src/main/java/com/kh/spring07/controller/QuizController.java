package com.kh.spring07.controller;

import java.text.DecimalFormat;
import java.text.Format;
import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//Spring의 제1 특징 : 제어반전(Inversion Of Control, IOC)
//- 주도권을 개발자가 아닌 애플리케이션이 갖는다.
//- 생성을 하지 말고 등록을 해라
//- 등록만 역할에 맞게 제대로 하면 나머지 처리는 스프링이 해준다
@Controller
public class QuizController {
	
//	- 주소 : /theater 
//	- 성인(adult)과 청소년(teen)인원수를 전달받아 요금 출력
//	- 성인요금 : 16000원, 청소년요금 10000원으로 계산
	
//	(참고) required와 defaultValue를 조합하여 없는 경우를 처리할 수 있다
//	- 통신은 원래 문자열이나 byte만 전송이 가능하므로 defaultValue는 문자열이다
	@RequestMapping("/theater")
	@ResponseBody
	public String theater(
			@RequestParam(required = false, defaultValue = "0") int adult, 
			@RequestParam(required = false, defaultValue = "0") int teen) {
		int price = adult * 16000 + teen * 10000;
		return "예상요금 = " + price + "원";
	}
	
//	- 주소 : /china
//	- 자장면(jjajang) 한 그릇에 6000원, 짬뽕(champon) 한 그릇에 7500원
//	- 자장면과 짬뽕 수를 전달받아 금액을 계산하여 출력
	
	@RequestMapping("/china")
	@ResponseBody
	public String china(
			@RequestParam(required = false, defaultValue = "0") int jjajang, 
			@RequestParam(required = false, defaultValue = "0") int champon) {
		int total = jjajang * 6000 + champon * 7500;
		Format f = new DecimalFormat("#,##0");
		return "결제 금액 = " + f.format(total) + "원";
	}
	
//	- 주소 : /bmi
//	- 사용자에게 키(height)와 몸무게(weight)를 전달받아 BMI 지수를 계산
//	- 키는 cm 단위, 몸무게는 kg 단위로 입력받는다
//	- BMI 는 `체중(kg) / 키²(m²)` 로 구한다
	@RequestMapping("/bmi")
	@ResponseBody
	public String bmi(
			@RequestParam double height,
			@RequestParam double weight) {
		double heightMeter = height / 100;
		double bmiValue = weight / Math.pow(heightMeter, 2);
		return "BMI = " + bmiValue;
	}
	
//	- 주소 : /subway
//	- 사용자의 출생년도(birth)를 전달받아 나이를 계산한 뒤 지하철 요금을 출력
//	- 지하철 요금표
//		- 공통 : 카드보증금 500원
//		- 성인(20~64세) - 1250원
//		- 청소년(14~19세) - 720원
//		- 어린이(8~13세) - 450원
//		- 영유아 및 어르신 - 무료
	@RequestMapping("/subway")
	@ResponseBody
	public String subway(@RequestParam int birth) {
		int age = LocalDate.now().getYear() - birth + 1;
		int price = 500;
		if(age < 8 || age >= 65) {
			price += 0;
		}
		else if(age >= 20) {
			price += 1250;
		}
		else if(age >= 14) {
			price += 720;
		}
		else {
			price += 450;
		}
		return "나이 = "+age+", 이용요금 = " + price;
	}
	
//	- 주소 : /pcroom
//		- PC방 요금이 한 시간에 1300원입니다
//		- 사용자의 이용 시작시간(start)과 종료시간(finish)를 전달받아 요금을 출력
//		- 시간은 `0900` 형태로 숫자로 전달된다고 가정
	@RequestMapping("/pcroom")
	@ResponseBody
	public String pcroom(
			@RequestParam int start, @RequestParam int finish) {
		int inHour = start / 100, inMinute = start % 100;
		int outHour = finish / 100, outMinute = finish % 100;
		int time = Math.abs((inHour*60+inMinute) - (outHour*60+outMinute));
		double pricePerMinute = 1300 / 60.0;
		int price = (int)(time * pricePerMinute) / 100 * 100;
		return "이용요금 = " + price;
	}
	
//	- 주소 : /sum
//		- 시작숫자(begin)와 종료숫자(end)를 전달받아 해당 구간 숫자 합계를 출력
	@RequestMapping("/sum")
	@ResponseBody
	public String sum(@RequestParam int begin, 
								@RequestParam int end) {
		int total = 0;
//		for(int i=begin; i<=end; i++) {
		for(int i=Math.min(begin, end); i <= Math.max(begin, end); i++) {
			total += i;
		}
		return "합계 = " + total;
	}
	
//	- 주소 : /score
//		- 국어(korean), 영어(english), 수학(math) 점수를 전달받아 합격여부 출력
//		- 합격은 각 과목 40이상, 평균 60이상인 경우를 말합니다
	@RequestMapping("/score")
	@ResponseBody
	public String score(
			@RequestParam int korean,
			@RequestParam int english,
			@RequestParam int math) {
		int total = korean + english + math;
		double average = total / 3.0;
		boolean isPass = korean >= 40 && english >= 40 && math >= 40;
		isPass &= average >= 60;//논리 복합대입 연산
		if(isPass) {
			return "합격";
		}
		else {
			return "불합격";
		}
	}
	
//	- 주소 : /leap
//		- 연도(year)를 전달받아 윤년인지 아닌지 판정하여 출력
	@RequestMapping("/leap")
	@ResponseBody
	public String leap(@RequestParam int year) {
		boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		if(isLeap) {
			return "윤년";
		}
		else {
			return "윤년아님";
		}
	}
	
	//파라미터가 너무 많거나 의미가 있는 데이터(객체)인 경우
	//-> 클래스를 만들어서 필드를 원하는 형태로 구성한 뒤 자동 수신을 부탁
	//-> @ModelAttribute를 사용
	//-> 파라미터를 강제하기 어려움(추가 검사 및 예외처리가 필요)
	//ex : 학생 정보(이름, 점수)
	@RequestMapping("/student")
	@ResponseBody
//	public String student(@RequestParam String name, @RequestParam int score) {
	public String student(@ModelAttribute Student stu) {
		return "받은 데이터 : " + stu.toString();
	}
}








