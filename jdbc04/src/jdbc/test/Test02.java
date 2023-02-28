package jdbc.test;

import jdbc.dao.SubjectDao;
import jdbc.dto.SubjectDto;

public class Test02 {
	public static void main(String[] args) {
		SubjectDto dto = new SubjectDto();
		dto.setNo(4);
		dto.setName("바꾼과정");
		dto.setPeriod(300);
		dto.setPrice(300);
		dto.setType("혼합");
		
		SubjectDao dao = new SubjectDao();
		boolean result = dao.update(dto);

		if(result) {
			System.out.println("변경 완료");
		}
		else {
			System.out.println("대상 없음");
		}
	}
}







