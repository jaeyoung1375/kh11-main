package array;

public class Test04_1 {
	public static void main(String[] args) {
		//배열 준비
		int[] score = new int[] {
			90, 85, 51, 63, 77, 71, 77, 85, 99, 70
		};
		
		//2. 모든 학생의 평균 점수 출력
		int total = 0;
		for(int i=0; i < score.length; i++) {
			total += score[i];
		}
		
		double average = (double)total / 10;
		System.out.println("평균 = " + average + "점");
	}
}





