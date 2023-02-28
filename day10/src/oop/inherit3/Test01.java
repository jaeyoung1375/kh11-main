package oop.inherit3;

public class Test01 {
	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.setUrl("https://www.google.com");
		c.refresh();
		c.move();
		c.develop();
		c.chromeStore();
		
		System.out.println("-----------------");
		Edge e = new Edge();
		e.setUrl("https://www.kakao.com");
		e.refresh();
		e.move();
		e.fullScreen();
		
		System.out.println("-----------------");
		Whale w = new Whale();
		w.setUrl("https://www.naver.com");
		w.refresh();
		w.move();
		w.papago();
		w.naverSearch();
	}
}








