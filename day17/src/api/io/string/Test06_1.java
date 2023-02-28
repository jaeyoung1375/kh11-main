package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test06_1 {
	public static void main(String[] args) throws IOException {
		File target = new File("temp", "note.kh");
//		FileReader fr = new FileReader(target);
//		BufferedReader br = new BufferedReader(fr);
		BufferedReader br = new BufferedReader(new FileReader(target));
		
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
	}
}










