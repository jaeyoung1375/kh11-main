package loop;

public class Test07_2 {
	public static void main(String[] args) {
		
//		30일간 하게되는 푸시업의 합계를 구하여 출력
		
		int pushup = 5;
		int total = 0;
		
		for(int day=1; day<=30; day++) {
			System.out.println(day+"일차 - "+pushup+"개");
			total += pushup;
			pushup += 2;
		}
		
		System.out.println("총 개수 : " + total);
		
		
	}
}



