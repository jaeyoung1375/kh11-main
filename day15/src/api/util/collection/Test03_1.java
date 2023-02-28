package api.util.collection;

import java.util.Random;

public class Test03_1 {
	public static void main(String[] args) {
		Random r = new Random();
		
		for(int i=0; i < 6; i++) {
			int lotto = r.nextInt(45) + 1;
			System.out.println("lotto = " + lotto);
		}
	}
}
