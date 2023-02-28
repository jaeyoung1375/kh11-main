package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06_1 {
	public static void main(String[] args) {
		List<String> record = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("나라이름 입력 : ");
			String name = sc.nextLine();
			
			if(record.contains(name)) {//이미 존재한다면
				System.out.println("게임 오버!");
				break;
			}
			else {//입력한 적이 없는 이름이라면
				record.add(name);
				System.out.println(record);
			}
			
		}
		
		sc.close();
		
	}
}
