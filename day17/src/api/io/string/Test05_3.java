package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test05_3 {
	public static void main(String[] args) throws IOException {
		
		StringBuffer buffer = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력 : ");
			String line = sc.nextLine();
			if(line.equals("종료")) break;
			
			buffer.append(line);
			buffer.append("\n");
		}
		
		File target = new File("temp", "note.kh");
		FileWriter fw = new FileWriter(target);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.write(buffer.toString());
		
		sc.close();
		pw.close();
		
		
	}
}
