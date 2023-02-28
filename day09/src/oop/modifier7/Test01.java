package oop.modifier7;

public class Test01 {
	public static void main(String[] args) {
		ExamData a = new ExamData("마리오", 1, 90, 80, 70);
		ExamData b = new ExamData("루이지", 1, 85, 85, 83);
		ExamData c = new ExamData("쿠파", 3, 70, 60, 55);
		
		a.output();
		b.output();
		c.output();
	}
}
