package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
		Galaxy22s a = new Galaxy22s("010-1010-2020", "레드");
		a.call();
		a.sms();
		a.samsungPay();
		a.bixby();
		
		GalaxyFold4 b = new GalaxyFold4("010-2020-3030", "퍼플");
		b.call();
		b.sms();
		b.samsungPay();
		b.iris();
		
		IPhone13 c = new IPhone13("010-3030-4040", "실버");
		c.call();
		c.sms();
		c.siri();
		c.itunes();
		
		IPhone14 d = new IPhone14("010-4040-5050", "블랙");
		d.call();
		d.sms();
		d.siri();
		d.faceTime();
	}
}
