package oop.keyword8;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		//목표 : static과 final을 같이 쓰는 이유
		
		//(ex) 화면에 랜덤으로 가위/바위/보 중 하나가 출력
		//- 가위는 0이라고 치자
		//- 바위는 1이라고 치자
		//- 보는 2라고 치자
		
		Random r = new Random();
		int rsp = r.nextInt(3);
		System.out.println("rsp = " + rsp);
		
		switch(rsp) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2://default:
			System.out.println("보");
			break;
		}
	}
}










