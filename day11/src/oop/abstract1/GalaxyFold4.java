package oop.abstract1;

public class GalaxyFold4 extends Galaxy {

	public GalaxyFold4(String color) {
		super(color);
	}
	
	@Override
	public void call() {
		System.out.println("갤럭시 폴드 4 통화 기능 실행");
	}
	@Override
	public void sms() {
		System.out.println("갤럭시 폴드 4 문자 기능 실행");
	}
	@Override
	public void samsungPay() {
		System.out.println("갤럭시 폴드 4 삼성페이 기능 실행");
	}
	public void iris() {
		System.out.println("갤럭시 폴드 4 홍채 인식 기능 실행");
	}
	
}
