package array2d;

import java.util.Random;

public class Test06_2 {
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
		
//		숫자 계산
//		- 한 자리를 임의로 정해서 해당 자리 주변의 폭탄 개수를 세어 설정하도록 구현
//		- 모든 자리로 확대해서 적용한다
		int x=1, y=1;
		if(map[x][y] != 9) {
			//int xmin=x-1 or 0, xmax=x+1 or row-1;
			//int ymin=y-1 or 0, ymax=y+1 or col-1;
			int xmin, ymin, xmax, ymax;
			if(x == 0) xmin = 0; else xmin = x-1;
			if(y == 0) ymin = 0; else ymin = y-1;
			if(x == row-1) xmax = row-1; else xmax = x+1;
			if(y == col-1) ymax = col-1; else ymax = y+1;
			//System.out.println("xmin = " +xmin+", xmax = " + xmax);
			//System.out.println("ymin = " +ymin+", ymax = " + ymax);
			
			int count = 0;
			for(int i=xmin; i<=xmax; i++) {
				for(int k=ymin; k<=ymax; k++) {
					if(map[i][k] == 9) {//폭탄이면
						count++;
					}
				}
			}
			map[x][y] = count;
		}
		
		
		//출력
		for(int i=0; i < row; i++) {
			for(int k=0; k < col; k++) {
//				if(map[i][k] > 0) {
					System.out.print(map[i][k]);
//				}
//				else {
//					System.out.print(" ");
//				}
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
