package oop.modifier6;

public class Test01 {
	public static void main(String[] args) {
		NcsRecord n1 = new NcsRecord("피카츄", "응용SW기초기술활용", 50, 60);
		NcsRecord n2 = new NcsRecord("라이츄", "응용SW기초기술활용", 40, 80);
		NcsRecord n3 = new NcsRecord("파이리", "프로그래밍언어활용", 60, 65);
		
		n1.output();
		n2.output();
		n3.output();
	}
}
