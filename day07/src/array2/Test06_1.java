package array2;

public class Test06_1 {
	public static void main(String[] args) {
		
		int[] data = new int[] {30, 50, 20, 10, 40};

		//1바퀴 회전
		int backup = data[data.length-1];//마지막 데이터(개수-1)
		for(int i=data.length-1; i>0; i--) {//마지막부터 1까지
			data[i] = data[i-1];
		}
		data[0] = backup;
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
		System.out.println();
		
	}
}
