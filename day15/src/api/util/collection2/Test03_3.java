package api.util.collection2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test03_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> memory = new TreeSet<>();
		
		while(true) {
			System.out.print("글번호 : ");
			int no = sc.nextInt();
			
			if(no == 0) break;//탈출조건 : 0을 입력하면 탈출
			
			if(memory.contains(no)) {//no가 memory에 있으면
				memory.remove(no);
				System.out.println(no+"번 글에 좋아요를 취소했습니다");
			}
			else {
				memory.add(no);
				System.out.println(no+"번 글에 좋아요를 눌렀습니다");
			}
			
			System.out.println(memory);
		}
		
		sc.close();
		
	}
}






