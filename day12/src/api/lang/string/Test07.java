package api.lang.string;

public class Test07 {
	public static void main(String[] args) {
		String name = "피카츄";
//		String name = "hello";
//		String name = "안녕123";
//		String name = "ㅋㅋㅋ";
//		String name = "동해물과백두산이";
		
//		계산 : 총 글자 수, 한글 글자 수
		int total = name.length();
		int korean = 0;
		
		for(int i=0; i < total; i++) {
			char ch = name.charAt(i);
			if(ch >= '가' && ch <= '힣') {//ch가 한글이라면
				korean++;
			}
		}
		
		System.out.println("한글 : "+korean+"글자, 총 "+total+"글자");
	}
}











