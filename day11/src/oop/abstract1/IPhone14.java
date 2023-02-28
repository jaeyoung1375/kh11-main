package oop.abstract1;

public class IPhone14 extends IPhone {

	public IPhone14(String color) {
		super(color);
	}

	@Override
	public void siri() {
		System.out.println("아이폰14 음성인식 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("아이폰14 통화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("아이폰14 문자 기능 실행");
	}
	
	public void faceTime() {
		System.out.println("아이폰14 페이스타임 기능 실행");
	}
	
}
