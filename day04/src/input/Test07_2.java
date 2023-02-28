package input;

public class Test07_2 {
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
		
		//윤년 할인
		//boolean leap = 4의 배수 && !100의 배수 || 400의 배수;
		boolean leap = year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0;
		
		//int leapRate = 0 or 5;
		int leapRate;
		if(leap) {
			leapRate = 5;
		}
		else {
			leapRate = 0;
		}
		
		//계절별 할인
		//int seasonRate = 10% or 5% or 30% or 20%;
		int seasonRate;
		if(month == 3 || month == 4 || month == 5) {//봄
			seasonRate = 10;
		}
		else if(month == 6 || month == 7 || month == 8) {//여름
			seasonRate = 5;
		}
		else if(month == 9 || month == 10 || month == 11) {//가을
			seasonRate = 30;
		}
		else {
			seasonRate = 20;
		}
		
		//출력
		System.out.println(name+"님의 예상 견적서는 다음과 같습니다");
		System.out.println();
		System.out.println("여행 예정 : "+year+"년 "+month+"월");
		System.out.println("여행 인원수 : "+people+"명");
		System.out.println("여행 기간 : "+day+"일");
		System.out.println();
		System.out.println("계절 할인 : "+seasonRate+"%");
		System.out.println("윤년 할인 : "+leapRate+"%");
		System.out.println();
		System.out.println("총 금액 : "+total+"원");
		System.out.println("할인 금액 : 750000원");
		System.out.println("견적 금액 : 2250000원");
		System.out.println();
		System.out.println("<버튼을 눌러 예약 사이트로 이동해주세요>");
		
		
	}
}
