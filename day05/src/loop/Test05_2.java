package loop;

public class Test05_2 {
	public static void main(String[] args) throws InterruptedException {
		
		int minute = 2;
		int second = 30;
		
		int time = minute * 60 + second;
		System.out.println("time = " + time);
		
		for(int i=time; i>0; i--) {
			int min = i / 60;
			int sec = i % 60;
			System.out.println(min+"분 "+sec+"초 후 알람이 울립니다");
			
			// 1초간 중지시킨다.(단위 : 밀리세컨드)
			// Thread.sleep(1000);
		}
		
		System.out.println("시간이 다 되었습니다!");
		
	}
}
