package loop;

public class Test07 {
	public static void main(String[] args) {
		
//		어렵게 풀기 - 공식을 생성
//		1일차	5			5+2*0
//		2일차	5+2			5+2*1
//		3일차	5+2+2		5+2*2
//		4일차	5+2+2+2		5+2*3
//		5일차	5+2+2+2+2	5+2*4
//		6일차	5+2+2+2+2+2	5+2*5
//		...
//		n일차				5+2*(n-1)
		
		for(int day=1; day<=30; day++) {
			int pushup = 5 + 2 * (day-1);
			System.out.println(day+"일차 - "+pushup+"개");
		}
		
	}
}



