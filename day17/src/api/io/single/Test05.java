package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {
	public static void main(String[] args) throws IOException {
		//Test03 프로그램의 성능 개선
		//- 버퍼(buffer)를 사용한 대량 복사
		File origin = new File("temp", "single.kh");
		File target = new File("temp", "copy.kh");
		
		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(target);
		
		byte[] buffer = new byte[5];
		
		while(true) {
			int size = in.read(buffer);
			if(size == -1) break;
			out.write(buffer, 0, size);
		}
		
		in.close();
		out.close();
	}
}










