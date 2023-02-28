package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) throws IOException {
		
		File target = new File("temp", "note.kh");
		FileWriter fw = new FileWriter(target);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String line = sc.nextLine();
		pw.println(line);
		
		sc.close();
		pw.close();
		
		
	}
}
