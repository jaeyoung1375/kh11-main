package array2;

public class Test05 {
	public static void main(String[] args) {
		//보여주기식 방법
		
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		for(int i=data.length-1; i>=0; i--) {
			System.out.println(data[i]);
		}
	}
}
