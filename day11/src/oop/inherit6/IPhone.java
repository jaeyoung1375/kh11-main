package oop.inherit6;

public class IPhone extends Mobile {

	public IPhone(String number, String color) {
		super(number, color);
	}

	public IPhone(String color) {
		super(color);
	}
	
	public void siri() {
		System.out.println("음성인식 기능 실행");
	}
	
}
