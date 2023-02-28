package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test06_2 {
	public static void main(String[] args) throws IOException {
		File target = new File("temp", "note.kh");
		BufferedReader br = new BufferedReader(new FileReader(target));

		StringBuffer buffer = new StringBuffer();
		
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			buffer.append(line);
			buffer.append('\n');
		}
		
		br.close();
		
		System.out.println(buffer.toString());
	}
}










