package oop.modifier3;

//과목 정보
public class Subject {
	//필드
	private String name;
	private int time;
	private int price;
	private String type;
	
	//setter & getter
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getTime() {
		return time;
	}
	void setTime(int time) {
		if(time % 30 != 0) {//30시간 단위가 아닐 경우(30의 배수면)
			return;
		}
		
		if(time < 0) {
			return;
		}
		
		this.time = time;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		if(price < 0) {
			return;
		}
		this.price = price;
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		switch(type) {
		case "오프라인", "온라인", "혼합":
			this.type = type;
		}
	}
	
	//constructor
	Subject(String name, int time, int price, String type) {
		this.setName(name);
		this.setTime(time);
		this.setPrice(price);
		this.setType(type);
	}
	
	//method
	void output() {
		System.out.println("<과정 정보>");
		System.out.println("이름 : " + this.getName());
		System.out.println("총 "+this.getTime() + "시간");
		System.out.println("금액 : " + this.price + "원");
		System.out.println("구분 : " + this.type);
	}
}






