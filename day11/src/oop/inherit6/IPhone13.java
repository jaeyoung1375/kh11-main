package oop.inherit6;

public class IPhone13 extends IPhone {

	public IPhone13(String number, String color) {
		super(number, color);
	}
	public IPhone13(String color) {
		super(color);
	}
	
	public void itunes() {
		System.out.println("아이폰13의 아이튠즈 기능 실행");
	}
	@Override
	public void siri() {
		System.out.println("아이폰13의 음성인식 기능 실행");
	}
	@Override
	public void call() {
		System.out.println("아이폰13의 전화 기능 실행");
	}
	@Override
	public void sms() {
		System.out.println("아이폰13의 문자 기능 실행");
	}
	
	
	
}
