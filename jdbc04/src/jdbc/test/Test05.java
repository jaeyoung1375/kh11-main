package jdbc.test;

import jdbc.dao.SubjectDao;
import jdbc.dto.SubjectDto;

public class Test05 {
	public static void main(String[] args) {
		int no = 11;
		
		SubjectDao dao = new SubjectDao();
		SubjectDto dto = dao.selectOne(no);
		
		if(dto == null) {
			System.out.println("없어요");
		}
		else {
			System.out.println(dto);
		}
	}
}
