package oop.poly3;

public class Test01 {
	public static void main(String[] args) {
		Hwang a = new Hwang();
		a.drink();
		a.game();
		a.teach();
		
		//출근
		Teacher b = a;//Hwang → Teacher(업 캐스팅)
		//b.drink();//없는건 아닌데 못씀
		//b.game();//없는건 아닌데 못씀
		b.teach();
		
		//퇴근
		//Hwang c = b;
		Hwang c = (Hwang)b;//Teacher → Hwang(다운 캐스팅)
		c.drink();
		c.game();
		c.teach();
		
		//타입 검사
		
		//b에 들어있는 실 데이터는 Hwang의 객체입니까?
		System.out.println(b instanceof Hwang);
	}
}








