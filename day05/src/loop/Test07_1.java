package loop;

public class Test07_1 {
	public static void main(String[] args) {
		
//		권장하는 방법
//		- pushup 개수를 누적시킬 변수를 지정하고 누적 연산
		
		int pushup = 5;
		
		for(int day=1; day<=30; day++) {
			System.out.println(day+"일차 - "+pushup+"개");
			pushup += 2;
		}
		
//		for(int p=5, day=1; day <= 30; day++, p+=2) {
//			System.out.println(day+"일차 - "+p+"개");
//		}
		
	}
}



