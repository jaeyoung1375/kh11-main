package oop.abstract1;

public class Test02 {
	public static void main(String[] args) {
		//좌/우가 일치하도록 생성한 코드(정적 타입 생성 구문)
		IPhone13 a = new IPhone13("black");
		IPhone14 b = new IPhone14("silver");
		Galaxy22s c = new Galaxy22s("wine");
		GalaxyFold4 d = new GalaxyFold4("brown");
		
		//좌/우가 일치하지 않도록 생성한 코드(동적 타입 생성 구문)
		Mobile m1 = new IPhone13("black");
		Mobile m2 = new IPhone14("silver");
		Mobile m3 = new Galaxy22s("wine");
		Mobile m4 = new GalaxyFold4("brown");
		
		IPhone ip1 = new IPhone13("black");
		IPhone ip2 = new IPhone14("silver");
		Galaxy g1 = new Galaxy22s("wine");
		Galaxy g2 = new GalaxyFold4("brown");
		
		//ex : 휴대폰을 10개 보관할 수 있는 배열
		Mobile[] arr1 = new Mobile[10];
		//ex : 아이폰을 10개 보관할 수 있는 배열
		IPhone[] arr2 = new IPhone[10];
		
	}
}










