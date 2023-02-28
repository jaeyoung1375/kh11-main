package oop.modifier6;

public class NcsRecord {
	//field - private
	private String name;
	private String subject;
	private int essay;//서술형
	private int scenario;//문제해결 시나리오
	
	//etc - public
	public NcsRecord(String name, String subject, int essay, int scenario) {
		this.setName(name);
		this.setSubject(subject);
		this.setEssay(essay);
		this.setScenario(scenario);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getEssay() {
		return essay;
	}
	public void setEssay(int essay) {
		if(essay < 0 || essay > 100) return;
		this.essay = essay;
	}
	public int getScenario() {
		return scenario;
	}
	public void setScenario(int scenario) {
		if(scenario < 0 || scenario > 100) return;
		this.scenario = scenario;
	}
	
	//getter 추가 : 총점, 평균, 통과여부
	public int getTotal() {
		return essay + scenario;
	}
	public double getAverage() {
		return (double)getTotal() / 2;
	}
	public boolean getPass() {//과목별 40점 이상 and 평균 60 이상
		return getEssay() >= 40 && getScenario() >= 40 
									&& getAverage() >= 60;
	}
	
	public void output() {
		System.out.println("<NCS 평가정보>");
		System.out.println("이름 : " + this.getName());
		System.out.println("과목 : " + this.getSubject());
		System.out.println("서술형 : " + this.getEssay() + "점");
		System.out.println("문제해결 시나리오 : " + this.getScenario() + "점");
		System.out.println("총점 : " + this.getTotal() + "점");
		System.out.println("평균 : " + this.getAverage() + "점");
		if(this.getPass()) {
			System.out.println("처리 결과 : 통과");
		}
		else {
			System.out.println("처리 결과 : 재평가");
		}
	}
	
}



