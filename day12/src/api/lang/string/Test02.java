package api.lang.string;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID : ");
		String id = sc.next();
		
		System.out.print("PW : ");
		String pw = sc.next();
		
		sc.close();
		
//		if(id가 khacademy라면 && 비밀번호가 student1234라면) {
//		if(id == "khacademy" && pw == "student1234") {
		if(id.equalsIgnoreCase("khacademy") && pw.equals("student1234")) {
			System.out.println("로그인 성공!");
		}
		else {
			System.out.println("로그인 정보가 일치하지 않습니다");
		}
		
	}
}






