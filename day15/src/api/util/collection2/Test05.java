package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test05 {
	public static void main(String[] args) {
		
		//저장소 구현
		Set<String> a = Set.of("아바타:물의 길", "더 퍼스트 슬램덩크", "영웅");
		Set<String> b = Set.of("영웅", "올빼미", "스위치", "신비아파트");
		
		System.out.println("철수 = " + a);
		System.out.println("영희 = " + b);
		
		//1. 둘 다 본 영화 출력
		Set<String> q1 = new TreeSet<>(a);
		q1.retainAll(b);
		System.out.println(q1);
		
		//2. 둘 중 한 명만 본 영화 출력
		Set<String> m1 = new TreeSet<>(a);
		m1.removeAll(b);
		Set<String> m2 = new TreeSet<>(b);
		m2.removeAll(a);
		Set<String> q2 = new TreeSet<>(m1);
		q2.addAll(m2);
		System.out.println(q2);
		
		Set<String> union = new TreeSet<>(a);
		union.addAll(b);
		union.removeAll(q1);
		System.out.println(union);
		
	}
}







