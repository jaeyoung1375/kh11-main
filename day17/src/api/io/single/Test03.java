package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
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
		
//		1글자 복사 = 1글자 입력 + 1글자 출력
		int n = in.read();
		out.write(n);
		
//		사용한 스트림 정리
		in.close();
		out.close();
	}
}














