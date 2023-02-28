package api.util.collection;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int lotto = r.nextInt(45) + 1;
		System.out.println("lotto = " + lotto);
	}
}
