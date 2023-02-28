package array2d;

public class Test06 {
	public static void main(String[] args) {
		
		//설정값 준비
		int row = 9;//줄 수
		int col = 9;//칸 수
		int bomb = 10;//폭탄 개수
		
		//지도 생성
		int[][] map = new int[row][col];
		
		
		//출력
		for(int i=0; i < row; i++) {
			for(int k=0; k < col; k++) {
				System.out.print(map[i][k]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
