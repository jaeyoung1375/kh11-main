package array2d;

import java.util.Random;

public class Test06_1 {
	public static void main(String[] args) {
		
		//설정값 준비
		int row = 5;//줄 수
		int col = 5;//칸 수
		int bomb = 10;//폭탄 개수
		
		//지도 생성
		int[][] map = new int[row][col];
		
		//폭탄 배치
		Random r = new Random();
		for(int i=0; i < bomb; i++) {
			int x = r.nextInt(row);
			int y = r.nextInt(col);
			if(map[x][y] == 0) {
				map[x][y] = 9;
			}
			else {
				i--;
			}
		}
		
		//출력
		for(int i=0; i < row; i++) {
			for(int k=0; k < col; k++) {
				if(map[i][k] > 0) {
					System.out.print(map[i][k]);
				}
				else {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
