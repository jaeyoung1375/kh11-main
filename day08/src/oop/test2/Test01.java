package oop.test2;

public class Test01 {
	public static void main(String[] args) {
		//객체 생성
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		
		//정보 초기화
		p1.rank = 1;
		p1.name = "킬리안 음바페";
		p1.country = "프랑스";
		p1.goal = 8;
		
		p2.rank = 2;
		p2.name = "리오넬 메시";
		p2.country = "아르헨티나";
		p2.goal = 7;
		
		p3.rank = 3;
		p3.name = "올리비에 지루";
		p3.country = "프랑스";
		p3.goal = 4;
		
		p4.rank = 4;
		p4.name = "훌리안 알바레스";
		p4.country = "아르헨티나";
		p4.goal = 4;
		
		//정보 출력
		System.out.println(p1.rank);
		System.out.println(p1.name);
		System.out.println(p1.country);
		System.out.println(p1.goal);
		
		System.out.println(p2.rank);
		System.out.println(p2.name);
		System.out.println(p2.country);
		System.out.println(p2.goal);
		
		System.out.println(p3.rank);
		System.out.println(p3.name);
		System.out.println(p3.country);
		System.out.println(p3.goal);
		
		System.out.println(p4.rank);
		System.out.println(p4.name);
		System.out.println(p4.country);
		System.out.println(p4.goal);
	}
}














