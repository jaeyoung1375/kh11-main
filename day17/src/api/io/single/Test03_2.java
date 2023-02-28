package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.Format;

public class Test03_2 {
	public static void main(String[] args) throws IOException {
//		파일 복사
//		원본 : temp/single.kh
//		대상 : temp/copy.kh
		
//		준비물 : 파일 2개, 스트림 2개(입력/출력)
		File origin = new File("temp", "single.kh");
		File target = new File("temp", "copy.kh");
		
		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(target);
		
//		[single.kh] → in → [프로그램] → out → [copy.kh]
		
//		count를 통해 진행상황 파악이 가능하도록 처리
		long total = origin.length();
		long count = 0L;
		Format f = new DecimalFormat("#,##0.00");
		
		while(true) {
			int n = in.read();
			if(n == -1) break;
			
			out.write(n);
			count++;
			double percent = count * 100.0 / total;
			System.out.println("("+count+"/"+total+", "+f.format(percent)+"%)");
		}
	
		
//		사용한 스트림 정리
		in.close();
		out.close();
	}
}














