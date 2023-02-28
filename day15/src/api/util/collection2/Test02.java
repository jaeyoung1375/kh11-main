package api.util.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {
		//Lotto 문제를 Set으로 구현
		
		Random r = new Random();
		
		Set<Integer> numbers = new TreeSet<>();
		
		while(numbers.size() < 6) {
			int lotto = r.nextInt(45) + 1;
			numbers.add(lotto);
		}
		
//		System.out.println(numbers);
		for(int lotto : numbers) {
			System.out.println(lotto);
		}
		
	}
}










