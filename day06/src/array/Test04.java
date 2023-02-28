package array;

public class Test04 {
	public static void main(String[] args) {
		//배열 준비
		int[] score = new int[] {
			90, 85, 51, 63, 77, 71, 77, 85, 99, 70
		};
		
		//1. 전체 출력
		for(int i=0; i < score.length; i++) {
			System.out.print(score[i]);
			if(i < score.length-1) {
				System.out.print(",");
			}
		}
	}
}





