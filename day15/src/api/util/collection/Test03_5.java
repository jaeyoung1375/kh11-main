package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test03_5 {
	public static void main(String[] args) {
		Random r = new Random();

		List<Integer> numbers = new ArrayList<>();
		
		while(numbers.size() < 6) {
			int lotto = r.nextInt(45) + 1;
			if(!numbers.contains(lotto)) {//똑같은 숫자가 없다면
				numbers.add(lotto);
			}
		}
		
		System.out.println(numbers);
	}
}
