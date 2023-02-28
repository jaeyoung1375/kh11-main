package condition3;
//import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		//목표 : if문의 문제점과 해결책
		
		char key = 'd';
		
		if(key == 'w') {
			System.out.println("앞으로 이동");
		}
		else if(key == 'a') {
			System.out.println("왼쪽으로 이동");
		}
		else if(key == 's') {
			System.out.println("뒤로 이동");
		}
		else {
			System.out.println("오른쪽으로 이동");
		}
		
	}
}
