package api.util.scanner;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		String song = "떳다떳다 비행기 날아라 날아라\n높이높이 날아라 우리비행기";
		//System.out.println(song);
		
		//Scanner는 단어나 줄 단위로 끊어서 읽는 것이 가능하다
		//단어 - .next()
		//- 단어는 띄어쓰기, 개행, 탭, null 등이 해당된다
		//- .hasNext()를 사용하면 읽을 수 있는 단어가 남았는지 확인해준다
		//줄 - .nextLine()
		//- 줄은 개행(\n)만이 의미가 있다
		//- .hasNextLine() 메소드로 더 읽을 수 있는 줄이 남았는지 확인한다
		
		Scanner sc = new Scanner(song);
		
		while(sc.hasNextLine()) {
			String word = sc.nextLine();
			System.out.println(word);
		}
		
		sc.close(); 
		
		
	}
}





