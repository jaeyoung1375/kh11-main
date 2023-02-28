package com.kh.spring05.controller;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuizController {
	
	@RequestMapping("/lotto")
	@ResponseBody
	public int lotto() {
		Random r = new Random();
		int n = r.nextInt(45) + 1;
		return n;
	}
	
	@RequestMapping("/lotto2")
	@ResponseBody
	public String lotto2() {
		Random r = new Random();
		int n = r.nextInt(45) + 1;
		return "로또 : " + n;
	}
	
	@RequestMapping("/lotto3")
	@ResponseBody
	public Set<Integer> lotto3(){
		Set<Integer> numbers = new TreeSet<>();
		Random r = new Random();
		while(numbers.size() < 6) {
			numbers.add(r.nextInt(45) + 1);
		}
		return numbers;
	}
	
	@RequestMapping("/lotto4")
	@ResponseBody
	public String lotto4(){
		Set<Integer> numbers = new TreeSet<>();
		Random r = new Random();
		while(numbers.size() < 6) {
			numbers.add(r.nextInt(45) + 1);
		}
		StringBuffer buffer = new StringBuffer();
		for(int number : numbers) {
			buffer.append("번호 = " + number);
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	
	@RequestMapping("/otp")
	@ResponseBody
	public String otp() {
		Random r = new Random();
		int number = r.nextInt(1000000);
		Format f = new DecimalFormat("000000");
		return "otp = " + f.format(number);
	}
	
}












