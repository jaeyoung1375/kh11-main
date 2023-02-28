package oop.inherit6;

public class Galaxy22s extends Galaxy {

	public Galaxy22s(String number, String color) {
		super(number, color);
	}

	public Galaxy22s(String color) {
		super(color);
	}
	
	//필요한 기능 재정의
	public void call() {
		System.out.println("Galaxy22s의 전화 기능 실행!");
	}
	
	public void sms() {
		System.out.println("Galaxy22s의 문자 기능 실행!");
	}
	
	public void samsungPay() {
		System.out.println("Galaxy22s의 삼성페이 기능 실행");
	}
	
	//고유 기능 추가
	public void bixby() {
		System.out.println("Galaxy22s의 음성인식 기능 실행");
	}
	
	
}
