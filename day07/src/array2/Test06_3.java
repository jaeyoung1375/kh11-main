package array2;

public class Test06_3 {
	public static void main(String[] args) {
		//난이도(어려움) - 메모리는 많이 사용하지만 속도가 비교적 빠른 코드
		
		int[] data = new int[] {30, 50, 20, 10, 40};

		//동일한 크기의 배열을 생성
		int[] copy = new int[data.length];
		
		for(int i=0; i < data.length; i++) {
			//int p = (i + 2) % 5;
			int p = (i + 2) % data.length;
			//System.out.println("i = " + i + ", p = " + p);
			copy[p] = data[i];
		}
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]);
			System.out.print(" ");
		}
		System.out.println();
		
	}
}
