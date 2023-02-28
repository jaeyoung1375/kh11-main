package api.lang.string;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
//		닉네임 검사
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용하실 닉네임을 입력하세요");
		String nickname = sc.next();
		
		sc.close();
		
//		if(글자수가 2~10글자 사이가 아니라면) {
		if(!(nickname.length() >= 2 && nickname.length() <= 10)) {
			System.out.println("닉네임을 2~10글자로 작성해주세요");
		}
//		else if(닉네임에 운영자가 포함되어 있다면) {
		else if(nickname.contains("운영자")) {
//		else if(nickname.indexOf("운영자") >= 0) {
			System.out.println("운영자라는 단어는 포함하실 수 없습니다");
		}
		else {//성공
			System.out.println("올바른 닉네임입니다");
		}
	}
}
