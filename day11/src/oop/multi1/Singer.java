package oop.multi1;

//인터페이스(interface)
//- 다중상속 전용 클래스
public interface Singer {
	//필드 - 인터페이스는 변수가 없다(상수만 있으며, 키워드 생략 가능)
	//private int a;
	//public static final int a = 10;
	//int a = 10;
	
	//생성자 - 필드가 없으니 생성자가 없다
	//public Singer() {}
	
	//메소드 
	//- 오직 추상 메소드만 가질 수 있다(~Java 7까지)
	//- 키워드를 안적어도 자동 추가된다(public, abstract)
	//- Java 8부터는 default 메소드를 가질 수 있다(Lambda에 활용)
	//public abstract void sing();
	void sing();
}









