package array;

public class Test04_3 {
	public static void main(String[] args) {
		//배열 준비
		int[] score = new int[] {
			90, 85, 51, 63, 77, 71, 77, 85, 99, 70
		};
		
		//4.성적 우수자(90점 이상) 인원 수 출력
		int count = 0;
		for(int i=0; i < score.length; i++) {
			if(score[i] >= 90) {
				count++;
				//System.out.println(score[i]);
			}
		}
		System.out.println("성적 우수자 인원수 = " + count + "명");
	}
}





