package loop;

public class Test05 {
	public static void main(String[] args) {
		
		int minute = 2;
		int second = 30;
		
		int time = minute * 60 + second;
		System.out.println("time = " + time);
		
		for(int i=time; i>0; i--) {
			System.out.println(i);
			//System.out.println("?분 ?초 후 알람이 울립니다");
		}
		
		System.out.println("시간이 다 되었습니다!");
		
	}
}
