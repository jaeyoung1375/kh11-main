package oop.modifier2;

public class Student {
	//field - 잠금
	private String name;
	private int korean;
	private int english;
	private int math;
	private int total;
	private double average;
	
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
		this.setTotal();
		this.setAverage();
	}
	void setEnglish(int english) {
		if(english < 0 || english > 100) {
			return;
		}
		this.english = english;
		this.setTotal();
		this.setAverage();
	}
	void setMath(int math) {
		if(!(math>=0 && math <=100)) {
			return;
		}
		this.math = math;
		this.setTotal();
		this.setAverage();
	}
	void setTotal() {
		this.total = this.korean + this.english + this.math;
	}
	void setAverage() { 
		this.average = this.total / 3.0;
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
	int getTotal() {
		return this.total;
	}
	double getAverage() {
		return this.average;
	}
	
	Student(String name, int korean, int english, int math) {
		this.setName(name);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
		this.setTotal();
		this.setAverage();
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






