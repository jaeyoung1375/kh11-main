package loop;

public class Test03 {
	public static void main(String[] args) {
		//[1] 1부터 100까지 출력
		for(int i=1; i<=100; i++) {
			System.out.println("문제1 = " + i);
		}
		
		System.out.println();
		//[2] 1부터 100 사이의 홀수를 출력
		//- 1, 3, 5, 7, 9, ..., 93, 95, 97, 99
		//- 1부터 99까지 2씩 증가
		for(int i=1; i<=99; i+=2) {
			System.out.println("문제2 = " + i);
		}
		
		for(int i=1; i<=100; i++) {//1부터 100까지
			if(i % 2 != 0) {//홀수라면
				System.out.println("문제2 = " + i);
			}
		}
		
		System.out.println();
		//[3] 1부터 100 사이의 5의 배수를 출력
		//- 5부터 100까지 5씩 증가
		for(int i=5; i<=100; i+=5) {
			System.out.println("문제3 = " + i);
		}
		
		for(int i=1; i<=100; i++) {
			if(i % 5 == 0) {//5의 배수라면
				System.out.println("문제3 = " + i);
			}
		}
		
		//[4] 10부터 1까지 화면에 출력
		for(int i=10; i >= 1; i--) {
			System.out.println("문제4 = " + i);
		}
	}
}









