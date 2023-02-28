package api.lang.string;

public class Test06_2 {
	public static void main(String[] args) {
		
		String[] filter = new String[] {
			"신발", "수박", "십장생", "변신", "주옥", "시베리아", "개나리", "잣"
		};
		String line = "이런 신발끈 개나리 십장생 주옥같은 경우를 보았나!";
		
		line = line.replace(filter[0], "***");
		line = line.replace(filter[1], "***");
		line = line.replace(filter[2], "***");
		line = line.replace(filter[3], "***");
		line = line.replace(filter[4], "***");
		line = line.replace(filter[5], "***");
		line = line.replace(filter[6], "***");
		line = line.replace(filter[7], "***");
		
		System.out.println(line);
		
	}
}
