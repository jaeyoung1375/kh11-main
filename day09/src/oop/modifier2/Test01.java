package oop.modifier2;

public class Test01 {
	public static void main(String[] args) {
		Student s1 = new Student("피카츄", 100, 90, 80);
		Student s2 = new Student("라이츄", 95, 92, 93);
		Student s3 = new Student("파이리", 70, 95, 95);
		
		//s1.output();
		//s2.output();
		//s3.output();
		
		s1.setEnglish(100);
		
		s1.output();
	}
}
