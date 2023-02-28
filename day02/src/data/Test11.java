package data;
import java.lang.*;
public class Test11 {
	public static void main(String[] args) {
		//입력
		double cm = 180;
		double kg = 80;
		
		//처리
		double m = cm / 100;
		//System.out.println(m);
		
		//double bmi = kg/m²;
		//double bmi = kg/m^2;//error
		//double bmi = kg/m*m;//값이 달라짐
		double bmi = kg/(m*m);
		
		//출력
		System.out.println(bmi);
		
		//만약 소수점 2자리만 살리고 싶다면?
		double bmi2 = bmi * 100;
		System.out.println(bmi2);
		int bmi3 = (int)bmi2;
		System.out.println(bmi3);
		double bmi4 = bmi3;
		System.out.println(bmi4);
		double bmi5 = bmi4 / 100;
		System.out.println(bmi5);
		
		//System.out.println(((double)(int)(bmi*100))/100);//비추천
	}
}









