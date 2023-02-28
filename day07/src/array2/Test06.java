package array2;

public class Test06 {
	public static void main(String[] args) {
		
		int[] data = new int[] {30, 50, 20, 10, 40};

		//1바퀴 회전
		int backup = data[4];
		data[4] = data[3];
		data[3] = data[2];
		data[2] = data[1];
		data[1] = data[0];
		data[0] = backup;
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
		System.out.println();
		
	}
}
