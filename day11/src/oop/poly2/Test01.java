package oop.poly2;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//다형성 사용해서 풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("(1:전사,2:마법사,3:궁수) 선택 : ");
		int job = sc.nextInt();
		
		System.out.print("(1:공격,2:이동,3:상점,4:정보) 선택 : ");
		int action = sc.nextInt();
		
		sc.close();
		
		//다형성의 특징을 사용하지 않겠다는것 = 자료형을 통합해서 쓰겠다는것(업캐스팅)
		//Player player = 전사객체 or 마법사객체 or 궁수객체;
		Player player;
		if(job == 1) {
			player = new Warrior("테스트유저");//Warrior→Player(업캐스팅)
		}
		else if(job == 2) {
			player = new Magician("테스트유저");//Magician→Player(업캐스팅)
		}
		else {
			player = new Archer("테스트유저");//Archer→Player(업캐스팅)
		}
		
		//System.out.println(player);
		if(action == 1) {
			player.attack();
		}
		else if(action == 2) {
			player.move();
		}
		else if(action == 3) {
			player.store();
		}
		else {
			player.output();
		}
	}
}






