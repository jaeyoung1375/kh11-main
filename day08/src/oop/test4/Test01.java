package oop.test4;

public class Test01 {
	public static void main(String[] args) {
		//선수 객체 생성
		Record r1 = new Record();
		Record r2 = new Record();
		Record r3 = new Record();
		
		//데이터 초기화
		r1.name = "진종오";
		r1.event = "사격";
		r1.type = "하계";
		r1.gold = 4;
		r1.silver = 2;
		r1.bronze = 0;
		
		r2.name = "김수녕";
		r2.event = "양궁";
		r2.type = "하계";
		r2.gold = 4;
		r2.silver = 1;
		r2.bronze = 1;
		
		r3.name = "전이경";
		r3.event = "쇼트트랙";
		r3.type = "동계";
		r3.gold = 4;
		r3.silver = 0;
		r3.bronze = 1;
		
		//출력
		System.out.println("<선수 정보>");
		System.out.println("이름 : " + r1.name);
		System.out.println("종목 : " + r1.event);
		System.out.println("구분 : " + r1.type);
		System.out.println("금 : " + r1.gold);
		System.out.println("은 : " + r1.silver);
		System.out.println("동 : " + r1.bronze);
		
		System.out.println("<선수 정보>");
		System.out.println("이름 : " + r2.name);
		System.out.println("종목 : " + r2.event);
		System.out.println("구분 : " + r2.type);
		System.out.println("금 : " + r2.gold);
		System.out.println("은 : " + r2.silver);
		System.out.println("동 : " + r2.bronze);
		
		System.out.println("<선수 정보>");
		System.out.println("이름 : " + r3.name);
		System.out.println("종목 : " + r3.event);
		System.out.println("구분 : " + r3.type);
		System.out.println("금 : " + r3.gold);
		System.out.println("은 : " + r3.silver);
		System.out.println("동 : " + r3.bronze);
	}
}




