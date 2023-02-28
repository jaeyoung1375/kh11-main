package oop.inner1;

public class Test01 {
	public static void main(String[] args) {
		//경찰 생성
		Police p = new Police();
		
		String name = "포돌이";
		p.setName(name);
		
		Gun gun = new Gun();
		p.setGun(gun);
	}
}
