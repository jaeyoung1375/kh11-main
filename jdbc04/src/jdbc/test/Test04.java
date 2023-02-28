package jdbc.test;

import java.util.List;

import jdbc.dao.SubjectDao;
import jdbc.dto.SubjectDto;

public class Test04 {
	public static void main(String[] args) {
		
		//Data
		String type = null;
		String keyword = "풀스택";
		
		//JDBC
		List<SubjectDto> list;
		SubjectDao dao = new SubjectDao();
		if(type != null && keyword != null) {
			list = dao.selectList(type, keyword);
		}
		else {
			list = dao.selectList();
		}
		
		//출력
		if(list.isEmpty()) {
			System.out.println("데이터가 없습니다");
		}
		else {
			for(SubjectDto dto : list) {
				System.out.println(dto);
			}
		}
		
	}
}
