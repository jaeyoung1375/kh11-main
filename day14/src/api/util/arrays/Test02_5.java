package api.util.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Test02_5 {
	public static void main(String[] args) {
		//배열 정렬
		//- Arrays는 원시형과 문자열은 오름차순 정렬이 가능
		//- 다른 방식이나 객체일 경우는 정렬 기준을 따로 구현해야 한다
		//- java.util.Comparator를 사용하여 정렬 기준을 생성
		
		String[] data = new String[] {
			"피카츄", "라이츄", "파이리", "꼬부기", "버터플", "야도란"
		};
		
		//Arrays.sort(data);//무조건 오름차순
		//Arrays.sort(data, (o1, o2)->o2-o1);//우측에 정의된 기준에 따라 정렬
		Arrays.sort(data, (o1, o2)->o2.compareTo(o1));//우측에 정의된 기준에 따라 정렬
		
		System.out.println(Arrays.toString(data));
	}
}





