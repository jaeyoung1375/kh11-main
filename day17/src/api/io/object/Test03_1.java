package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test03_1 {
	public static void main(String[] args) throws IOException {
		List<String> list = new ArrayList<>();
		list.add("테스트");
		list.add("문자열");
		list.add("안녕하세요");
		
		File target = new File("temp", "input.kh");
		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		ObjectOutputStream mixer = new ObjectOutputStream(buffer);
		
		mixer.writeObject(list);
		
		mixer.close();
	}
}







