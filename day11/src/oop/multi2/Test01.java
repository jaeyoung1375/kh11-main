package oop.multi2;

public class Test01 {
	public static void main(String[] args) {
		Drone drone = new Drone();
		drone.on();
		drone.move();
		drone.fly();
		drone.off();
		
		Airplane airplane = new Airplane();
		airplane.move();
		airplane.fly();
		airplane.reservation();
		
		Train train = new Train();
		train.move();
		train.reservation();
		
		Bus bus = new Bus();
		bus.move();
		
		Kickboard kickboard = new Kickboard();
		kickboard.on();
		kickboard.move();
		kickboard.off();
		
		test(drone);
		test(airplane);
		//test(train);
		//test(bus);
		//test(kickboard);
		
		test2(drone);
		//test2(airplane);
		//test2(train);
		//test2(bus);
		test2(kickboard);
	}
	
	//이 메소드는 Flyable을 상속받은 클래스만 사용이 가능
	public static void test(Flyable flyable) {}
	//이 메소드는 Electronic을 상속받은 클래스만 사용이 가능
	public static void test2(Electronic electronic) {}
}











