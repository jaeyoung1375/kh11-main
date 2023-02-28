package input;

import java.io.IOException;

//import java.lang.*;
public class Test01 {
	public static void main(String[] args) throws IOException {
		//표준 입력 
		//- 표준 입력 통로(System.in)에서 데이터를 가져오는 행위 
		//- 내용이 정해져있는 출력과 달리 시기와 내용이 불확실하다 
		//- ASCII 코드값을 읽어온다
		
		int n1 = System.in.read();	
		System.out.println("n = " + n1);
		
		int n2 = System.in.read();	
		System.out.println("n = " + n2);
		
		int n3 = System.in.read();	
		System.out.println("n = " + n3);
		
		int n4 = System.in.read();	
		System.out.println("n = " + n4);
		
		int n5 = System.in.read();	
		System.out.println("n = " + n5);
		
	}
}
