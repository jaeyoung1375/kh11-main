package oop.interface1;

public class ExitButton implements Button {

	@Override
	public void push() {
		System.out.println("프로그램 종료");
	}

}
