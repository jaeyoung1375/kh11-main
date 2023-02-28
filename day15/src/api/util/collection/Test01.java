package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
		//ex : 전화번호부 vs 방명록
		//- 전화번호부는 데이터 저장 시 오름차순 정렬 처리가 이루어진다(순서가 무시)
		//- 방명록은 작성 순서대로 저장된다(순서가 보장)
		//- 순서가 보장되는 저장소를 List라고 부르고, 무시되는 저장소를 Set이라고 부름
		
		//TreeSet a = new TreeSet();
		//ArrayList b = new ArrayList();
		
		//Set a = new TreeSet();
		//List b = new ArrayList();
		
		Set<String> a = new TreeSet<String>();
		List<String> b = new ArrayList<String>();
		
		a.add("피카츄");	b.add("피카츄");
		a.add("라이츄");	b.add("라이츄");
		a.add("파이리");	b.add("파이리");
		a.add("꼬부기");	b.add("꼬부기");
		a.add("버터플");	b.add("버터플");
		a.add("야도란");	b.add("야도란");
		a.add("또가스");	b.add("또가스");
		
		System.out.println(a.size());//a의 데이터 개수
		System.out.println(b.size());//b의 데이터 개수
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
}
