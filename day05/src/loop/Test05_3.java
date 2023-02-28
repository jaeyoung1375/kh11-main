package loop;

import java.util.Scanner;

public class Test05_3 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분 입력");
		int minute = sc.nextInt();
		
		System.out.println("초 입력");
		int second = sc.nextInt();
		
		sc.close();
		
		
		int time = minute * 60 + second;
		//System.out.println("time = " + time);
		
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
