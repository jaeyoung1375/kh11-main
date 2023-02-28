package api.lang.string;

public class Test06_1 {
	public static void main(String[] args) {
		
		String line = "이런 신발끈 개나리 십장생 주옥같은 경우를 보았나!";
		
		line = line.replace("신발", "***");
		line = line.replace("수박", "***");
		line = line.replace("십장생", "***");
		line = line.replace("변신", "***");
		line = line.replace("주옥", "***");
		line = line.replace("시베리아", "***");
		line = line.replace("개나리", "***");
		line = line.replace("잣", "***");
		
		System.out.println(line);
		
	}
}
