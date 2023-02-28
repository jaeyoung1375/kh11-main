package array2;

public class Test10_2 {
	public static void main(String[] args) {
		
		//데이터 준비
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		//모든 데이터를 처리할 수 있도록 숫자를 길이와 연동
		
		for(int k=data.length-1; k>0; k--) {
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
