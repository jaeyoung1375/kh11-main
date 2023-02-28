package condition;
import java.lang.*;
public class Test07 {
	public static void main(String[] args) {
		//과속단속 카메라 프로그램
		
		//입력
		int speed = 70;
		
		//처리
		//int fine = 0 or 계산된 벌금;
		int fine;
		
		if(speed <= 50) {//과속이 아니면
			fine = 0;
		}
		else {//과속이라면
			//int advance = 10km당 10000원;
			int advance = (speed - 50) / 10 * 10000;
			fine = 30000 + advance;
		}
		
		//출력
		System.out.println("지금 지나간 차의 벌금");
		System.out.println(fine);
		
	}
}
