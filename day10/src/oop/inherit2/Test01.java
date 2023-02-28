package oop.inherit2;

public class Test01 {
	public static void main(String[] args) {
		//IPhone14 객체를 생성
		IPhone14 a = new IPhone14();
		a.setNumber("010-1212-3434");
		a.setColor("black");
		
		a.call();
		a.sms();
		a.airDrop();
		
		//GalaxyFold4 객체를 생성
		GalaxyFold4 b = new GalaxyFold4();
		b.setNumber("010-2323-3434");
		b.setColor("white");
		
		b.call();
		b.sms();
		b.samsungPay();
	}
}
