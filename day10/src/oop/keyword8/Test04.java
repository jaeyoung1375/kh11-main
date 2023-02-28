package oop.keyword8;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		//목표 : static과 final을 같이 쓰는 이유
		
		//(ex) 화면에 랜덤으로 가위/바위/보 중 하나가 출력
		Random r = new Random();
		int rsp = r.nextInt(3);
		System.out.println("rsp = " + rsp);
		
		switch(rsp) {
		case RspGame.SCISSORS:
			System.out.println("가위");
			break;
		case RspGame.ROCK:
			System.out.println("바위");
			break;
		case RspGame.PAPER://default:
			System.out.println("보");
			break;
		}
	}
}










