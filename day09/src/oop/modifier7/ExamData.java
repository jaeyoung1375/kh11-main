package oop.modifier7;

//시험 데이터 클래스
public class ExamData {
	//field
	private String name;
	private int level;
	private int korean, english, math;
	
	//method, setter&getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(!(level >= 1 && level <= 6)) return;
		this.level = level;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		if(!(korean >= 0 && korean <= 100)) return;
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		if(!(english >= 0 && english <= 100)) return;
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(!(math >= 0 && math <= 100)) return;
		this.math = math;
	}
	
	public int getTotal() {
		return korean + english + math;
	}
	public double getAverage() {
		return (double)getTotal() / 3;
	}
	public String getGrade() {
		double avg = getAverage();
		if(avg >= 90) return "A";
		else if(avg >= 80) return "B";
		else if(avg >= 70) return "C";
		else return "F";
	}
//	public String getGrade() {
//		int avg = (int)getAverage();
//		switch(avg/10) {
//		case 9,10: return "A";
//		case 8: return "B";
//		case 7: return "C";
//		default: return "F";
//		}
//	}
	
	public void output() {
		System.out.println("<시험성적정보>");
		System.out.println("이름 : "+this.getName());
		System.out.println("학년 : "+this.getLevel());
		System.out.println("-----------");
		System.out.println("국어 : "+this.getKorean()+"점");
		System.out.println("영어 : "+this.getEnglish()+"점");
		System.out.println("수학 : "+this.getMath()+"점");
		System.out.println("-----------");
		System.out.println("총점 : "+this.getTotal()+"점");
		System.out.println("평균 : "+this.getAverage()+"점");
		System.out.println("등급 : "+this.getGrade());
	}
	
	//constructor
	public ExamData(String name, int level, int korean, int english, int math) {
		this.setName(name);
		this.setLevel(level);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}
}








