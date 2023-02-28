package oop.modifier2_1;

public class Student {
	//field - 잠금
	private String name;
	private int korean;
	private int english;
	private int math;
	
	//method
	//- setter&getter
	void setName(String name) {
		this.name = name;
	}
//	1. 0이상 100이하일 경우만 설정하세요
//	2. 0이상 100이하가 아니면 설정하지 마세요
	void setKorean(int korean) {
//		1
//		if(korean >= 0 && korean <= 100) {
//			this.korean = korean;
//		}
		
//		2
		if(korean < 0 || korean > 100) {
			return;//그만하세요
		}
		this.korean = korean;
	}
	void setEnglish(int english) {
		if(english < 0 || english > 100) {
			return;
		}
		this.english = english;
	}
	void setMath(int math) {
		if(!(math>=0 && math <=100)) {
			return;
		}
		this.math = math;
	}
	
	String getName() {
		return this.name;
	}
	int getKorean() {
		return this.korean;
	}
	int getEnglish() {
		return this.english;
	}
	int getMath() {
		return this.math;
	}
	//가상의 Getter 메소드를 만들어 개발을 편하게 한다
	//-> total 이라는 필드는 없지만 total을 계산해서 반환하는 getTotal()을 만든다
	int getTotal() {
		//return this.total;
		return this.getKorean() + this.getEnglish() + this.getMath();
	}
	//-> average라는 필드는 없지만 average를 계산해서 반환하도록 getAverage()를 만든다
	double getAverage() {
		return this.getTotal() / 3.0;
	}
	
	Student(String name, int korean, int english, int math) {
		this.setName(name);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}
	
	void output() {
		System.out.println("<학생 성적 정보>");
		System.out.println("이름 : " + this.getName());
		System.out.println("국어 : " + this.getKorean()+"점");
		System.out.println("영어 : " + this.getEnglish()+"점");
		System.out.println("수학 : " + this.getMath()+"점");
		System.out.println("총점 : " + this.getTotal()+"점");
		System.out.println("평균 : " + this.getAverage()+"점");
	}
}






