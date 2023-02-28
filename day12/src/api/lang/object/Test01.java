package api.lang.object;

//java.lang 패키지는 import를 하지 않아도 기본 제공된다
//import java.lang.Object;

public class Test01 {
	public static void main(String[] args) {
		//java.lang.Object 클래스 분석
		
		//[1] 객체 생성
		Object a = new Object();
		Object b = new Object();
		
		//[2] 객체 사용
		//a.clone();
		//a.finalize();
		
		//(1) 객체는 일련번호로 관리한다.
		//(2) 객체는 요약정보 확인 명령이 존재한다.
		
		System.out.println(a.hashCode());//일련번호
		System.out.println(a);
		System.out.println(a.toString());//자료형@일련번호
		
		System.out.println(b.hashCode());
		System.out.println(b.toString());
	}
}






