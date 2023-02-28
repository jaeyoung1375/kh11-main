package array2d;

public class Test05_1 {
	public static void main(String[] args) {
		
		//빙고판 만들기
		int size = 5;
		int[][] bingo = new int[size][size];
		
		
		//출력
		for(int i=0; i < size; i++) {
			for(int k=0; k < size; k++) {
				System.out.print(bingo[i][k]);
				System.out.print("\t");
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
	}
}
