package oop.inherit6;

public class Galaxy extends Mobile {
	
	public Galaxy(String color) {
		super(color);
	}

	public Galaxy(String number, String color) {
		super(number, color);
	}

	//공통 메소드
	public void samsungPay() {
		System.out.println("삼성페이 기능 실행!");
	}

}
