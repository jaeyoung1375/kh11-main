package array2d;

import java.util.Random;

public class Test05_2 {
	public static void main(String[] args) {
		
		//빙고판 만들기
		int size = 3;
		int[][] bingo = new int[size][size];
		
		//초기화(1부터 25까지)
		Random r = new Random();
		for(int i=1; i <= size*size; i++) {
			int row = r.nextInt(size);
			int col = r.nextInt(size);
			//System.out.println("("+row+", "+col+") 위치에 "+i+"을 넣습니다");
			if(bingo[row][col] == 0) {//한번도 데이터를 넣은적이 없는 칸일 경우
				bingo[row][col] = i;
			}
			else {
				i--;//반복 무효화(재추첨)
			}
		}
		
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
