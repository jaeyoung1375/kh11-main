package oop.method1;

//요금제 정보 클래스
public class Plan {
	//멤버 필드 - 데이터
	String telecom;
	String name;
	int price;
	int data;
	int call;
	int sms;
	
	//멤버 메소드 - 코드(기능)
	void setting(String telecom, String name, int price,
							int data, int call, int sms) {
		this.telecom = telecom;
		this.name = name;
		this.price = price;
		this.data = data;
		this.call = call;
		this.sms = sms;
	}
	void output() {
		System.out.println("<요금제 정보>");
		System.out.println("통신사 : " + this.telecom);
		System.out.println("이름 : " + this.name);
		System.out.println("월정액요금 : " + this.price+"원");
		System.out.println("월 데이터 : " + this.data+"GB");
		System.out.println("월 통화량 : " + this.call+"분");
		System.out.println("월 문자량 : " + this.sms+"건");
		System.out.println();
	}
	
}






