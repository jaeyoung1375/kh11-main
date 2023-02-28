package jdbc.test;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test01 {
	public static void main(String[] args) {
		//Pocketmon 등록
		
		//데이터 준비
		PocketmonDto dto = new PocketmonDto();
		dto.setNo(31);
		dto.setName("테스트");
		dto.setType("무속성");
		
		//JDBC - 직접 하지 않고 PocketmonDao를 만들어서 위탁
		PocketmonDao dao = new PocketmonDao();
		dao.insert(dto);
		
		System.out.println("실행 완료");
	}
}





