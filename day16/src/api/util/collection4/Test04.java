package api.util.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test04 {
	public static void main(String[] args) {
		//그래도 Map에 있는 데이터를 모두 반복해서 확인하고 싶다면?
		Map<String, Integer> items = new HashMap<>();
		
		items.put("신라면", 1200);
		items.put("라면득템", 380);
		items.put("불닭볶음면", 1600);
		items.put("팔도비빔면", 1400);
		
		//Map에서 모든 데이터를 꺼내는 직접적인 방법은 없다
		//다른 저장소나 형태로 변환하여 꺼내는 방법은 있다
		//1. Set으로 변환해서 출력하는 방법
		//2. Map에 있는 내부 클래스인 Entry 형태로 출력하는 방법
		
//		1.
//		- Map<K,V>에서 K만 보면 Set<K>과 같다
		Set<String> names = items.keySet();
		for(String name : names) {
			int price = items.get(name);
			System.out.println(name + " , " + price);
		}
		
		System.out.println("-----");
		
//		2.
//		Set<Map.Entry<String, Integer>> entries = items.entrySet();
//		for(Map.Entry<String, Integer> entry : entries) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
		
//		for(Entry<String, Integer> entry : items.entrySet()) {
		for(Entry entry : items.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}








