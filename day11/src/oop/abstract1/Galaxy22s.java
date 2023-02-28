package oop.abstract1;

public class Galaxy22s extends Galaxy {

	public Galaxy22s(String color) {
		super(color);
	}
	
	@Override
	public void call() {
		System.out.println("갤럭시 22s 통화 기능 실행");
	}
	@Override
	public void sms() {
		System.out.println("갤럭시 22s 문자 기능 실행");
	}
	@Override
	public void samsungPay() {
		System.out.println("갤럭시 22s 삼성페이 기능 실행");
	}
	public void bixby() {
		System.out.println("갤럭시 22s 음성 인식 기능 실행");
	}
	
}
