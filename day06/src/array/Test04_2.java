package array;

public class Test04_2 {
	public static void main(String[] args) {
		//배열 준비
		int[] score = new int[] {
			90, 85, 51, 63, 77, 71, 77, 85, 99, 70
		};
		
		//3. 재평가자(60점 미만) 인원 수 출력
		int count = 0;
		for(int i=0; i < score.length; i++) {
			if(score[i] < 60) {
				count++;
				//System.out.println(score[i]);
			}
		}
		System.out.println("재평가자 수 = " + count + "명");
	}
}





