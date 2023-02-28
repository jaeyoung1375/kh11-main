package loop;

public class Test08_1 {
	public static void main(String[] args) {
		//현명한 노인 문제
		
		int money = 1;
		int total = 0;
		
		for(int day=1; day<=30; day++) {
			System.out.println(day+"일차 : "+money+"원");
			
			total += money;
			
			//money = money * 2;
			money *= 2;
		}
		
		System.out.println("총 받는 금액 : " + total + "원");
		
	}
}
