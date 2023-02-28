package array2d;

public class Test05 {
	public static void main(String[] args) {
		
		//빙고판 만들기
		int[][] bingo = new int[5][5];
		
		
		//출력
		for(int i=0; i < bingo.length; i++) {
			for(int k=0; k < bingo[i].length; k++) {
				System.out.print(bingo[i][k]);
				System.out.print("\t");
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
	}
}
