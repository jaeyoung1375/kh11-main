package array2;

public class Test11_1 {
	public static void main(String[] args) {
		//데이터 준비
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		//삽입 정렬
		for(int k=0; k <= 4; k++) {
			int index = k;
			int backup = data[index];
			//System.out.println("backup = " + backup);
			
			for(int i=index-1; i>=0; i--) {
				//System.out.println("i = " + i + ", backup = " + backup + ", data[i] = " + data[i]);
				if(backup < data[i]) {//backup보다 큰 데이터가 발견되었다면
					data[i+1] = data[i];//해당 데이터를 오른쪽으로 한 칸 이동시키세요
					index--;//index 위치를 왼쪽으로 한 칸 이동합니다
				}
			}
			
			//index가 삽입될 위치
			//System.out.println("index = " + index);
			data[index] = backup;
		}
		
		//데이터 출력
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
