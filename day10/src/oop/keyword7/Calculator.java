package oop.keyword7;

public class Calculator {
//	1. 11의 제곱
	public static int square(int origin) {
		return origin * origin;
	}
	public static int square(int origin, int value) {
		int result = 1;
		for(int i=0; i < value; i++) {
			result *= origin;
		}
		return result;
	}
	
//	2. 신장 180cm, 체중 80kg인 사람의 BMI
	public static double bmi(double height, double weight) {
		double heightMeter = height / 100;
		return weight / (heightMeter * heightMeter);
	}
	
//	3. 1999년생의 지하철 요금(이전 문제와 동일한 요금표)
	public static int subway(int birth) {
		int year = 2023;
		int age = year - birth + 1;
		if(age < 8 || age >= 65) return 0;
		else if(age >= 20) return 1250;
		else if(age >= 14) return 720;
		else return 450;
	}
	
//	4. 밑변 5, 높이 7인 삼각형의 넓이
	public static double triangle(double width, double height) {
		return width * height / 2;
	}
	
//	5. 반지름 7인 원의 넓이
//	= 반지름² * 원주율(=3.14)
	public static double circle(double radius) {
		return radius * radius * 3.14;
	}
}













