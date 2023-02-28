package oop.test4;

public class Test02 {
	public static void main(String[] args) {
		//선수 객체 생성
		Record r1 = new Record();
		Record r2 = new Record();
		Record r3 = new Record();
		
		//데이터 초기화
		r1.setting("진종오", "사격", "하계", 4, 2, 0);
		r2.setting("김수녕", "양궁", "하계", 4, 1, 1);
		r3.setting("전이경", "쇼트트랙", "동계", 4, 0, 1);
		
		//출력
		r1.output();//r1을 주인공으로 해서 output의 코드를 실행하라(this→r1)
		r2.output();//r2을 주인공으로 해서 output의 코드를 실행하라(this→r2)
		r3.output();//r3을 주인공으로 해서 output의 코드를 실행하라(this→r3)
	}
}




