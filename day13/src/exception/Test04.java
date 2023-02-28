package exception;

public class Test04 {
	public static void main(String[] args) {
		String date = "2022-03-aa";
		
		String year = date.substring(0, 4);
		String month = date.substring(5, 7);
//		String day = date.substring(8, 10);
		String day = date.substring(8);
		
		int yearValue = Integer.parseInt(year);
		int monthValue = Integer.parseInt(month);
		int dayValue = Integer.parseInt(day);
		
		System.out.println("연도 : " + yearValue);
		System.out.println("월 : " + monthValue);
		System.out.println("일 : " + dayValue);
	}
}
