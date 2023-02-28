package condition3;

public class Test03 {
	public static void main(String[] args) {
		//입력한 연/월에 해당하는 달의 일자수 구하기
		
		//입력
		int year = 2024;
		int month = 2;
		
		//처리
		//int day = 31 or 30 or 29 or 28;
		int day;
		if(month == 1 || month == 3 || month == 5 ||
			month == 7 || month == 8 || month == 10 || month == 12) {
			day = 31;
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;
		}
		else {
			//day = 28 or 29;
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				day = 29;
			}
			else {
				day = 28;
			}
		}
		
		//출력
		System.out.println(year+"년 "+month+"월은 "+day+"일까지 있어요");
		
	}
}
