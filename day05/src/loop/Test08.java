package loop;

public class Test08 {
	public static void main(String[] args) {
		//현명한 노인 문제
		
		int money = 1;
		
		for(int day=1; day<=30; day++) {
			System.out.println(day+"일차 : "+money+"원");
			//money = money * 2;
			money *= 2;
		}
		
	}
}
