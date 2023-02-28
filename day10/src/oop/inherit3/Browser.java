package oop.inherit3;

//상위 클래스, 슈퍼 클래스, 부모 클래스
public class Browser {
	//공통 필드
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	//공통 메소드
	public void refresh() {
		System.out.println("새로고침 실행");
	}
	public void move() {
		System.out.println("페이지 이동");
	}
}
