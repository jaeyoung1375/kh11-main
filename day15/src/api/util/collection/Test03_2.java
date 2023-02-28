package api.util.collection;

import java.util.Random;

public class Test03_2 {
	public static void main(String[] args) {
		Random r = new Random();

		int[] numbers = new int[6];
		
		for(int i=0; i < 6; i++) {
			numbers[i] = r.nextInt(45) + 1;
			System.out.println("lotto = " + numbers[i]);
		}
	}
}
