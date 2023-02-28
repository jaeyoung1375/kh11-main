package oop.abstract1;

public class Test01 {
	public static void main(String[] args) {
		//Mobile m = new Mobile();
		//Galaxy g = new Galaxy();
		//IPhone i = new IPhone();
		
		IPhone13 a = new IPhone13("black");
		a.call();
		a.sms();
		a.siri();
		a.itunes();
		
		IPhone14 b = new IPhone14("silver");
		b.call();
		b.sms();
		b.siri();
		b.faceTime();
		
		Galaxy22s c = new Galaxy22s("wine");
		c.call();
		c.sms();
		c.samsungPay();
		c.bixby();
		
		GalaxyFold4 d = new GalaxyFold4("brown");
		d.call();
		d.sms();
		d.samsungPay();
		d.iris();
	}
}
