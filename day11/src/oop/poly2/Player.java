package oop.poly2;

public abstract class Player {
	//공통 필드
	private final String id;
	private int level;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level < 1) return;
		this.level = level;
	}
	public String getId() {
		return id;
	}
	
	public Player(String id) {
		this.id = id;
		this.setLevel(1);
	}
	
	public abstract void attack();
	public abstract void move();
	public abstract void store();
	public final void output() {
		System.out.println("<캐릭터 정보>");
		System.out.println("아이디 : " + this.id);
		System.out.println("레 벨 : " + this.level);
	}
}










