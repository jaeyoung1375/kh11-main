package array2;

import java.util.Arrays;

public class Test12 {
	public static void main(String[] args) {
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		Arrays.sort(data);
		
		//데이터 출력
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
