package oop.test3;

public class Test01 {
	public static void main(String[] args) {
		PocketMonster a = new PocketMonster();
		PocketMonster b = new PocketMonster();
		PocketMonster c = new PocketMonster();
		PocketMonster d = new PocketMonster();
		
		a.no = 1;
		a.name = "이상해씨";
		a.type = "풀,독";
		
		b.no = 4;
		b.name = "파이리";
		b.type = "불꽃";
		
		c.no = 7;
		c.name = "꼬부기";
		c.type = "물";
		
		d.no = 25;
		d.name = "피카츄";
		d.type = "전기";
		
		System.out.println(a.no);
		System.out.println(a.name);
		System.out.println(a.type);

		System.out.println(b.no);
		System.out.println(b.name);
		System.out.println(b.type);
		
		System.out.println(c.no);
		System.out.println(c.name);
		System.out.println(c.type);
		
		System.out.println(d.no);
		System.out.println(d.name);
		System.out.println(d.type);
	}
}



