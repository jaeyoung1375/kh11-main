package array2d;

public class Test03_2 {
	public static void main(String[] args) {
//		목표 : Test02를 2차원 배열로 변경
		
//		int[][] data = new int[2개][3칸];
		int[][] data = new int[][] {
			{10, 20, 30},
			{40, 50, 60}
		};
		
//		구조
//		data	--->	data[0]	--->	[10][20][30]
//						data[1]	--->	[40][50][60]
		System.out.println(data);//리모컨 대장(2차원)
		System.out.println(data[0]);//리모컨 부대장(1차원)
		System.out.println(data[1]);//리모컨 부대장(1차원)
		
		System.out.println(data.length);
		System.out.println(data[0].length);
		System.out.println(data[1].length);
		
		for(int i=0; i<data.length; i++) {
			for(int k=0; k<data[i].length; k++) {
				System.out.print(data[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
}








