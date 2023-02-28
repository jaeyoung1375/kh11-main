package oop.test1;

public class Test01 {
	public static void main(String[] args) {
		//카톡 메세지 2개
		//- 낱개 데이터가 아니라 미리 만들어둔 Message 클래스의 객체를 생성
		Message m1 = new Message();
		//m1 --------> { writer:null , content:null, time=null, remain=0 }
		
		m1.writer = "초롱초롱 라이언";
		m1.content = "언제와?";
		m1.time = "오후 3:02";
		m1.remain = 1;
		
		//System.out.println(m1);//리모컨정보
		System.out.println(m1.writer);//m1 대상에 있는 writer 접근 후 출력
		System.out.println(m1.content);//m1 대상에 있는 content 접근 후 출력
		System.out.println(m1.time);//m1 대상에 있는 time 접근 후 출력
		System.out.println(m1.remain);//m1 대상에 있는 remain 접근 후 출력
		
		Message m2 = new Message();
		
		System.out.println(m2.writer);
		System.out.println(m2.content);
		System.out.println(m2.time);
		System.out.println(m2.remain);
	}
}










