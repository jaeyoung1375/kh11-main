package api.lang.string;

import java.util.Scanner;

public class Test06_5 {
	public static void main(String[] args) {
		
		String[] filter = new String[] {
			"신발", "수박", "십장생", "변신", "주옥", "시베리아", "개나리", "잣"
		};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 -> ");
		String line = sc.nextLine();
		
		sc.close();
		
		for(int i=0; i < filter.length; i++) {
			int size = filter[i].length();
			String star = "*".repeat(size);//Java 11+
			line = line.replace(filter[i], star);
		}
		
		System.out.println("출력 -> " + line);

	}
}
