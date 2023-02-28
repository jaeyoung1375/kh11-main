package input;

public class Test05 {
	public static void main(String[] args) {
		//입력
		int korean = 30;
		int english = 60;
		int math = 90;
		
		//처리
		int total = korean + english + math;
		//double average = total / 3.0;
		double average = (double)total / 3;
		//double average = total / 3d;
		
		//boolean pass = 국어40이상 && 영어40이상 && 수학40이상 && 평균60이상;
		boolean pass = korean >= 40 
						&& english >= 40 
						&& math >= 40 
						&& average >= 60;
		
		
		//출력
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		if(pass) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}
}
