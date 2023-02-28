package array;

public class Test04_4 {
	public static void main(String[] args) {
		//배열 준비
		int[] score = new int[] {
			90, 85, 51, 63, 77, 71, 77, 85, 99, 70
		};
		
		//5.전학생이 있을 때 전학생의 예상등수를 출력
		//- 등수 = 1 + 나보다 점수가 높은 인원수
		
		int student = 80;
		int rank = 1;
		for(int i=0; i<score.length; i++) {
			if(score[i] > student) {
				//System.out.println("나보다 잘난놈 = " + score[i]);
				rank++;
			}
		}
		System.out.println("내 등수 = " + rank);
	}
}





