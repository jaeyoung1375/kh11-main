package oop.inherit6;

public class GalaxyFold4 extends Galaxy {

	public GalaxyFold4(String number, String color) {
		super(number, color);
	}

	public GalaxyFold4(String color) {
		super(color);
	}
	
	//고유 기능
	public void iris() {
		System.out.println("갤럭시 폴드4의 홍채인식 기능 실행");
	}

	@Override
	public void samsungPay() {
		System.out.println("갤럭시 폴드4의 삼성페이 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("갤럭시 폴드4의 통화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시 폴드4의 문자 기능 실행");
	}
	
	
	
}
