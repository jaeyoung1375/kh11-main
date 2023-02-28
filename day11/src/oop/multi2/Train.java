package oop.multi2;

public class Train implements Transportation, Reserve {
	@Override
	public void move() {
		System.out.println("기차가 이동합니다");
	}
	@Override
	public void reservation() {
		System.out.println("기차 좌석을 예약합니다");
	}
}
