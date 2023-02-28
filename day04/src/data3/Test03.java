package data3;
//import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		//이스케이프 문자(Escape sequence)
		//- 탭, 엔터 등 표시를 해야하지만 사용할만한 글자가 없는 경우
		//- 역슬래시(\)와 알파벳을 조합하여 명령을 만듦
		//- \t (tab) , \n (new-line, enter)
		//- 출력이 불가능한 글자와 조합하여 출력 가능하도록 변경할 수 있다
		
		String a = "1\t이상해씨\t풀";
		String b = "4\t파이리\t불";
		System.out.println(a);
		System.out.println(b);
		
		String c = "안\n녕\n하\n세\n요";
		System.out.println(c);
		
		//나는 오늘 저녁에 "피자"를 먹을거에요
		//System.out.println("나는 오늘 저녁에 "피자"를 먹을거에요");
		System.out.println("나는 오늘 저녁에 \"피자\"를 먹을거에요");
		
		//수업용 폴더는 D:\study 입니다
		System.out.println("수업용 폴더는 D:\\study 입니다");
	}
}







