package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		List<String> record = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나라이름 입력 : ");
		String name = sc.nextLine();
		
		record.add(name);
		
		sc.close();
		
		System.out.println(record);
	}
}
