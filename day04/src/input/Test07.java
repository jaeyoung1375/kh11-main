package input;

public class Test07 {
	public static void main(String[] args) {
		
		//입력 : 이름, 인원수, 예상기간(일), 여행갈 년도와 월 정보
		String name = "피카츄";
		int people = 1;
		int day = 1;
		int year = 2023;
		int month = 1;
		
		int pricePerUnit = 100000;
		
		//처리
		int total = people * day * pricePerUnit;
		
		//출력
		System.out.println(name+"님의 예상 견적서는 다음과 같습니다");
		System.out.println();
		System.out.println("여행 예정 : "+year+"년 "+month+"월");
		System.out.println("여행 인원수 : "+people+"명");
		System.out.println("여행 기간 : "+day+"일");
		System.out.println();
		System.out.println("계절 할인 : 20%");
		System.out.println("윤년 할인 : 5%");
		System.out.println();
		System.out.println("총 금액 : "+total+"원");
		System.out.println("할인 금액 : 750000원");
		System.out.println("견적 금액 : 2250000원");
		System.out.println();
		System.out.println("<버튼을 눌러 예약 사이트로 이동해주세요>");
		
		
	}
}
