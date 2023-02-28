package loop;

public class Test06 {
	public static void main(String[] args) {
		//반복문의 활용 - 카운트, 누적합계
		
		//(Q) 1부터 100 사이의 짝수 개수는?
		//미리 카운트 측정을 위한 변수를 0으로 설정
		int count = 0;
		
		for(int i=1; i<=100; i++) { 
			if(i % 2 == 0) {
				//System.out.println(i);
				count++;
			}
		}
		
		System.out.println("count = " + count);
		
		//(Q) 1부터 100 까지의 합계는?
		
		//int total = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		
		int total = 0;
		for(int i=1; i<=100; i++) {
			total += i;
		}
		System.out.println("total = " + total);
	}
}
















