package array2;

public class Test08_2 {
	public static void main(String[] args) {
		
		//데이터 준비
		double[] data = new double[] {
			150.8, 180.2, 175.9, 162.7, 170.3
		};
		
		//최대값과 최대값의 위치(index) 찾기
		//- 기대하는 결과 : index = 1 , max = 180.2
		
		int index = 0;
		
		for(int i=1; i < data.length; i++) {
			if(data[index] < data[i]) {
				index = i;//위치 수정
			}
		}
		System.out.println("index = " + index);
		System.out.println("max = " + data[index]);
		
		//출력
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("  ");
		}
		System.out.println();
		
	}
}
