package jdbc.test;

import jdbc.dao.SubjectDao;
import jdbc.dto.SubjectDto;

public class Test01 {
	public static void main(String[] args) {
		
		SubjectDto dto = new SubjectDto();
		dto.setName("풀스택마스터과정");
		dto.setPeriod(30);
		dto.setPrice(10000000);
		dto.setType("오프라인");
		
		SubjectDao dao = new SubjectDao();
		dao.insert(dto);
		
		System.out.println("등록 완료");
		
	}
}
