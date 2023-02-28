package array2d;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		//데이터 저장
		int[][] data = new int[][] {
			{90,80,85,77},
			{60,85,73,92},
			{50,70,70,80}
		};
		
		//1.데이터 출력
		for(int i=0; i < data.length; i++) {
			for(int k=0; k < data[i].length; k++) {
				System.out.print(data[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		//2.평균 출력
		int total = 0;
		int count = 0;
		for(int i=0; i<data.length; i++) {
			for(int k=0; k<data[i].length; k++) {
				total += data[i][k];
				count++;
			}
		}
		
		//double average = total / (data.length * data[0].length);
		double average = (double)total / count;
		System.out.println("평균 : " + average);
		
		//3. 랜덤으로 값 1개를 배열 중에서 출력
		Random r = new Random();
		int row = r.nextInt(data.length);
		int col = r.nextInt(data[row].length);
		
		int choice = data[row][col]; 
		System.out.println("choice = " + choice);
		
	}
}














