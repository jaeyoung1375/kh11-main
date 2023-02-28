package array;

public class Test02_3 {
	public static void main(String[] args) {
		
//		배열 생성
		int[] data = new int[] {10, 20, 30, 40, 50};
//		data -----> [10][20][30][40][50] 
//		            <--- data.length --->
//		System.out.println(data.length);
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);//시작점+i칸
		}
		
		int total = 0;
		for(int i=0; i<data.length; i++) {
			total += data[i];
		}
		System.out.println(total);
	}
}





