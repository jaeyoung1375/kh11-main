package array2;

public class Test10_1 {
	public static void main(String[] args) {
		
		//데이터 준비
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		//1회차 정렬
		//- [0] vs [1]
		//- [1] vs [2]
		//- [2] vs [3]
		//- [3] vs [4]
		
		//회차가 변할 때마다 마지막 숫자가 3, 2, 1, 0으로 줄어든다
		
		for(int k=4; k>0; k--) {
			for(int i=0; i<k; i++) {
				//System.out.println("i = " + i + ", i+1 = " + (i+1));
				if(data[i] > data[i+1]) {//앞 데이터가 더 크다면
					//앞과 뒤를 교체
					int backup = data[i];
					data[i] = data[i+1];
					data[i+1] = backup;
				}
			}
		}
		
		//출력
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
