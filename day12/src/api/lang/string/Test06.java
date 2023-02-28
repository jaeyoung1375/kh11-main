package api.lang.string;

public class Test06 {
	public static void main(String[] args) {
		
		String line = "이런 신발끈 개나리 십장생 주옥같은 경우를 보았나!";
		
		//ex : 신발 하나만 욕설로 처리
		line = line.replace("신발", "**");
		
		System.out.println(line);
		
	}
}
