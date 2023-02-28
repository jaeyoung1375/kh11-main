package loop;

public class Test05_1 {
	public static void main(String[] args) {
		
		int minute = 2;
		int second = 30;
		
		int time = minute * 60 + second;
		System.out.println("time = " + time);
		
		for(int i=time; i>0; i--) {
			int min = i / 60;
			int sec = i % 60;
			System.out.println(min+"분 "+sec+"초 후 알람이 울립니다");
		}
		
		System.out.println("시간이 다 되었습니다!");
		
	}
}
