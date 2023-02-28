package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test05_4 {
	public static void main(String[] args) throws IOException {
		
		File dir = new File("temp");
		File temp = File.createTempFile("dummy", ".tmp", dir);
		FileWriter tempFw = new FileWriter(temp);
		BufferedWriter tempBw = new BufferedWriter(tempFw);
		PrintWriter tempPw = new PrintWriter(tempBw);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력 : ");
			String line = sc.nextLine();
			if(line.equals("종료")) break;
			
			tempPw.println(line);
			tempPw.flush();
		}
		
		tempPw.close();
		sc.close();

		//임시파일을 note.kh에 복사
		
	}
}
