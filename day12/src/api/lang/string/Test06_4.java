package api.lang.string;

public class Test06_4 {
	public static void main(String[] args) {
		
		String[] filter = new String[] {
			"신발", "수박", "십장생", "변신", "주옥", "시베리아", "개나리", "잣"
		};
		String line = "이런 신발끈 개나리 십장생 주옥같은 경우를 보았나!";
		
		for(int i=0; i < filter.length; i++) {
			int size = filter[i].length();
			String star = "*".repeat(size);//Java 11+
			line = line.replace(filter[i], star);
		}
		
		System.out.println(line);
		
	}
}
