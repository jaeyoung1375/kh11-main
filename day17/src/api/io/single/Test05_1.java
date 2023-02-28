package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.Format;

public class Test05_1 {
	public static void main(String[] args) throws IOException {
		//Test03 프로그램의 성능 개선
		//- 버퍼(buffer)를 사용한 대량 복사
		File origin = new File("temp", "single.kh");
		File target = new File("temp", "copy.kh");
		
		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(target);
		
		byte[] buffer = new byte[5];
		
		long total = origin.length();
		long count = 0L;
		Format f = new DecimalFormat("#,##0.00");
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int size = in.read(buffer);
			if(size == -1) break;
			out.write(buffer, 0, size);
			count += size;
			double percent = count * 100.0 / total;
			System.out.println("("+count+"/"+total+", "+f.format(percent)+"%)");
		}
		
		long finish = System.currentTimeMillis();
		System.out.println("시간 : " + (finish - start));
		
		in.close();
		out.close();
	}
}










