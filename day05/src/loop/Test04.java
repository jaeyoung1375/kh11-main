package loop;

public class Test04 {
	public static void main(String[] args) {
		//두 자리 정수 중 3,6,9 게임에서 박수치는 숫자 출력
		// -> 10부터 99까지의 범위
		
		for(int i=10; i<=99; i++) {
			int ten = i / 10;
			int one = i % 10;
			boolean hasTen = ten == 3 || ten == 6 || ten == 9;
			boolean hasOne = one == 3 || one == 6 || one == 9;
			boolean has369 = hasTen || hasOne;
			if(has369) {
				System.out.println(i);
			}
		}
	}
}
