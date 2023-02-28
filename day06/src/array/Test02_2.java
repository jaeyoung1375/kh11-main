package array;

public class Test02_2 {
	public static void main(String[] args) {
		
//		배열 생성
		int[] data = new int[] {10, 20, 30, 40, 50};
//		data -----> [10][20][30][40][50] 
		
		for(int i=0; i<=4; i++) {
			System.out.println(data[i]);//시작점+i칸
		}
		
		int total = 0;
		for(int i=0; i<=4; i++) {
			total += data[i];
		}
		System.out.println(total);
	}
}





