package array2;

public class Test05_1 {
	public static void main(String[] args) {
		//데이터가 5개일 때만 사용 가능한 방법
		
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		int backup = data[0];
		data[0] = data[4];
		data[4] = backup;
		
		backup = data[1];
		data[1] = data[3];
		data[3] = backup;
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
