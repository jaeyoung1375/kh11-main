package array2;

public class Test09 {
	public static void main(String[] args) {
		
		//데이터 준비
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		//처리
		//- 선택정렬 1회차 : 전체 범위에서 가장 작은 값을 찾아 맨 앞의 데이터와 교체
		
		int index = 0;//0번 위치가 가장 작은 데이터라고 가정
		for(int i=1; i < data.length; i++) {
			if(data[index] > data[i]) {//index위치보다 더 작은 데이터가 i에 존재한다면
				index = i;//index를 i로 변경해라!
			}
		}
		System.out.println("index = " + index);
		
		int backup = data[0];
		data[0] = data[index];
		data[index] = backup;
		
		//출력
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
		System.out.println();
		
	}
}
