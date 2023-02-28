package array;

public class Test03 {
	public static void main(String[] args) {
		
		//배열 생성
		int[] number = new int[] {33, 45, 31, 54, 67, 36, 39};
		//int number[] = new int[] {33, 45, 31, 54, 67, 36, 39};
		//int[] number = {33, 45, 31, 54, 67, 36, 39};
		
		//전체 출력
		//for(int i=0; i <= 6; i++) {
		//for(int i=0; i < 7; i++) {
		for(int i=0; i < number.length; i++) {
			System.out.println("전체출력 = " + number[i]);
		}
		
		System.out.println();
		
		//짝수 출력
		for(int i=0; i < number.length; i++) {
			//if(지금 위치의 데이터가 짝수라면) {
			if(number[i] % 2 == 0) {
				System.out.println("짝수출력 = " + number[i]);
			}
		}
		
		System.out.println();
		
		//50이 넘는 데이터 개수
		int count = 0;
		for(int i=0; i < number.length; i++) {
			//if(50이 넘는 데이터라면) {
			if(number[i] >= 50) {
				//System.out.println("50이 넘는데이터 = " + number[i]);
				count++;
			}
		}
		System.out.println("50이 넘는 데이터 개수 : " + count);
		
		System.out.println();
		
		//모든 데이터 합계
		//int total = number[0] + ... + number[6];
		int total = 0;
		
		for(int i=0; i < number.length; i++) {
			total += number[i];
		}
		
		System.out.println("모든 데이터 합계 : " + total);
		
		//모든 데이터 평균
		//평균 = 합계 / 개수
		double average = (double)total / number.length;
		System.out.println("모든 데이터 평균 : " + average);
		
	}
}








