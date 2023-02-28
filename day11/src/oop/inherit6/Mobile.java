package oop.inherit6;

public class Mobile {
	//공통 필드 - 접근제한(private/protected)
	protected String number;
	protected String color;
	
	//생성자 - 반드시 초기화가 필요한 필드
	public Mobile(String color) {
		this.color = color;
	}
	public Mobile(String number, String color) {
		this.number = number;
		this.color = color;
	}
	
	//공통 메소드 - 재정의(x/final)
	public void call() {
		System.out.println("통화 기능 실행");
	}
	public void sms() {
		System.out.println("문자 기능 실행");
	}
	
}
