package oop.test3_1;

public class Test01 {
	public static void main(String[] args) {
		PocketMonster a = new PocketMonster();
		PocketMonster b = new PocketMonster();
		PocketMonster c = new PocketMonster();
		PocketMonster d = new PocketMonster();
		
		a.no = 1;
		a.name = "이상해씨";
		a.type = new String[] {"풀", "독"};
		
		b.no = 4;
		b.name = "파이리";
		b.type = new String[] {"불꽃"};
		
		c.no = 7;
		c.name = "꼬부기";
		c.type = new String[] {"물"};
		
		d.no = 25;
		d.name = "피카츄";
		d.type = new String[] {"전기"};
		
		System.out.println(a.no);
		System.out.println(a.name);
		for(int i=0; i < a.type.length; i++) {
			System.out.println(a.type[i]);
		}

		System.out.println(b.no);
		System.out.println(b.name);
		for(int i=0; i < b.type.length; i++) {
			System.out.println(b.type[i]);
		}
		
		System.out.println(c.no);
		System.out.println(c.name);
		for(int i=0; i < c.type.length; i++) {
			System.out.println(c.type[i]);
		}
		
		System.out.println(d.no);
		System.out.println(d.name);
		for(int i=0; i < d.type.length; i++) {
			System.out.println(d.type[i]);
		}
	}
}



