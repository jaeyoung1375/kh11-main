package api.io.file;

import java.io.File;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.nextLine();
		sc.close();
		
		File target = new File(input);
		
		if(!target.exists()) {//아무것도 아닌 경우라면
			System.out.println("존재하지 않는 파일 또는 폴더입니다");
		}
		else if(target.isFile()) {//파일
			System.out.println("<파일 정보>");
			System.out.println("이름 : " + target.getName());
			System.out.println("크기 : " + target.length() + "bytes");
		}
		else {//디렉터리
			System.out.println("<디렉터리 정보>");
			System.out.println("이름 : " + target.getName());
			File[] files = target.listFiles();
			System.out.println("파일 : " + files.length + "개");
			for(File file : files) {
				System.out.print("→ ");
				System.out.print(file.getName());
				System.out.print("\t");
				if(file.isFile()) {
					System.out.print("[파일]");
				}
				else if(file.isDirectory()) {
					System.out.print("[폴더]");
				}
				System.out.println();
			}
		}
		
	}
}







