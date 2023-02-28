package array2;

public class Test09_2 {
	public static void main(String[] args) {
		
		//데이터 준비
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		//처리
		//- 선택정렬 1회차 : 0~4 에서 가장 작은 값을 찾아 맨 앞의 데이터와 교체
		//- 선택정렬 2회차 : 1~4 에서 가장 작은 값을 찾아 맨 앞의 데이터와 교체
		//- 선택정렬 3회차 : 2~4 에서 가장 작은 값을 찾아 맨 앞의 데이터와 교체
		//- 선택정렬 4회차 : 3~4 에서 가장 작은 값을 찾아 맨 앞의 데이터와 교체
		for(int k=0; k < data.length-1; k++) {//회차
			int index = k;
			for(int i=k+1; i < data.length; i++) {//정렬
				if(data[index] > data[i]) {//index위치보다 더 작은 데이터가 i에 존재한다면
					index = i;//index를 i로 변경해라!
				}
			}
			//System.out.println("index = " + index);
			
			int backup = data[k];
			data[k] = data[index];
			data[index] = backup;
		}
		
		//출력
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
		System.out.println();
		
	}
}
