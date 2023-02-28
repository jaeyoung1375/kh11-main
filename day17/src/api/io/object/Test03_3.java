package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03_3 {
	public static void main(String[] args) throws IOException {
		List<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력 : ");
			String word = sc.nextLine();
			if(word.equals("종료")) break;
			list.add(word);
		}
		
		sc.close();
		
		File target = new File("temp", "input.kh");
		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		ObjectOutputStream mixer = new ObjectOutputStream(buffer);
		
		mixer.writeObject(list);
		
		mixer.close();
	}
}







