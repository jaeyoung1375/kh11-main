package api.util.collection4;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		//Map<K,V>
		//- (K)ey 와 (V)alue 가 세트로 저장되는 저장소
		//- (K)ey만 보면 Set과 구조가 같음(중복이 불가)
		//- (V)alue는 중복이 가능
		//- (K)ey로 (V)alue를 부를 수 있지만 반대는 안된다
		
		Map<String, Integer> data = new HashMap<>();
		
		//데이터 추가
		// - .add()는 한 개 추가하는 명령
		// - .put()은 두 개를 세트로 추가하는 명령
		data.put("허니버터칩", 3000);
		data.put("참이슬후레시", 1500);
		data.put("처음처럼", 1400);
		data.put("카스", 2500);
		data.put("신라면", 1400);
		
		data.put("허니버터칩", 4000);//같은 이름이 들어가면 value가 수정됨
		
		System.out.println(data);
		System.out.println(data.size());
		
		//검색 - (K)ey와 (V)alue를 따로 검색하도록 메소드 제공
		System.out.println(data.containsKey("허니버터칩"));
		System.out.println(data.containsValue(2000));
		
		//추출 - (K)ey로 (V)alue를 추출 (없으면 null이므로 주의할 것)
		//System.out.println(data.get("신라면"));
		//System.out.println(data.get("짜파게티"));
		
		Integer price = data.get("짜파게티");
		System.out.println("price = " + price);
		
		//삭제 - (K)ey를 이용하여 데이터를 삭제
		data.remove("허니버터칩");
		System.out.println(data);
		System.out.println(data.size());
	}
}











