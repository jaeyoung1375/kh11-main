package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) throws IOException {
//		한 번에 여러 개의 바이트를 입력받는 예제(Test02번을 개선)
		File target = new File("temp", "single.kh");
		FileInputStream stream = new FileInputStream(target);
		
//		여러 개의 바이트를 한 번에 입력받기 위해 바이트 배열을 준비
		byte[] cart = new byte[5];
		
//		옮겨야 하는 파일은 21byte이며, 카트는 5byte이므로
//		- 1회차 : (5/21)
//		- 2회차 : (10/21)
//		- 3회차 : (15/21)
//		- 4회차 : (20/21)
//		- 5회차 : (25/21)
		
		int size = stream.read(cart);//읽은 내용을 cart에 담아라
		System.out.println(size+", " + Arrays.toString(cart));
		
		size = stream.read(cart);//읽은 내용을 cart에 담아라
		System.out.println(size+", " + Arrays.toString(cart));
		
		size = stream.read(cart);//읽은 내용을 cart에 담아라
		System.out.println(size+", " + Arrays.toString(cart));
		
		size = stream.read(cart);//읽은 내용을 cart에 담아라
		System.out.println(size+", " + Arrays.toString(cart));
		
		size = stream.read(cart);//읽은 내용을 cart에 담아라
		System.out.println(size+", " + Arrays.toString(cart));
		
		size = stream.read(cart);//읽은 내용을 cart에 담아라
		System.out.println(size+", " + Arrays.toString(cart));
		
		size = stream.read(cart);//읽은 내용을 cart에 담아라
		System.out.println(size+", " + Arrays.toString(cart));
		
		size = stream.read(cart);//읽은 내용을 cart에 담아라
		System.out.println(size+", " + Arrays.toString(cart));
		
		
//		stream.close();
	}
}








