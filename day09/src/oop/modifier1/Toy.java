package oop.modifier1;

//장난감 클래스
public class Toy {
	//field - 잠금 처리(private)
	private String name;
	private int price;
	
	//method
	
	//setter 메소드 - 설정용 메소드
	void setName(String name) {
		this.name = name;
	}
	void setPrice(int price) {
		if(price >= 0) {
			this.price = price;
		}
	}
	//getter 메소드 - 반환용 메소드
	//- return : 데이터를 반환하며 종료
	//- void : 반환값(실행결과)이 없음
	String getName() {
		return this.name;
	}
	int getPrice() {
		return this.price;
	}
	
	//constructor
	//- 생성자에서도 설정 시 setter 메소드를 사용하도록 한다
	Toy(String name, int price) {
		this.setName(name);
		this.setPrice(price);
	}
	
	void output() {
		//System.out.println(this.name);
		//System.out.println(this.price);
		System.out.println(this.getName());
		System.out.println(this.getPrice());
	}
}










