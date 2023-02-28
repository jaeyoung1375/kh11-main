package api.lang.string;

public class Test07_2 {
	public static void main(String[] args) {
		String name = "피카츄";
//		String name = "hello";
//		String name = "안녕123";
//		String name = "ㅋㅋㅋ";
//		String name = "동해물과백두산이";
		
//		계산 : 총 글자 수, 한글 글자 수
		int total = name.length();
		if(total >= 2 && total <= 7) {//글자수가 요구사항에 맞다면
			int korean = 0;
			for(int i=0; i < total; i++) {
				char ch = name.charAt(i);
				if(ch >= '가' && ch <= '힣') {//ch가 한글이라면
					korean++;
				}
			}
			//System.out.println("한글 : "+korean+"글자, 총 "+total+"글자");
			
			if(korean == total) {//모든 글자가 한글이라면
				System.out.println("이름 설정이 완료되었습니다");
			}
			else {
				System.out.println("한글 2~7글자로 작성하세요");
			}
		}
		else {
			System.out.println("한글 2~7글자로 작성하세요");
		}
		
	}
}











