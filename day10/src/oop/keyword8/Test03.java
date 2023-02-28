package oop.keyword8;

import java.util.Random;

public class Test03 {
	//상수(constant)
	//- 언제나 변하지 않고 한결같은 값을 가지는 변수
	//- 가독성을 높이도록 약속을 명문화 하는 기능이 있음
	//- 일반적으로 상수는 대문자로 작성
	static final int SCISSORS = 0;
	static final int ROCK = 1;
	static final int PAPER = 2;
	
	public static void main(String[] args) {
		//목표 : static과 final을 같이 쓰는 이유
		
		//(ex) 화면에 랜덤으로 가위/바위/보 중 하나가 출력
		Random r = new Random();
		int rsp = r.nextInt(3);
		System.out.println("rsp = " + rsp);
		
		switch(rsp) {
		case SCISSORS:
			System.out.println("가위");
			break;
		case ROCK:
			System.out.println("바위");
			break;
		case PAPER://default:
			System.out.println("보");
			break;
		}
	}
}










