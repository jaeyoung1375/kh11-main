package jdbc.test;

import java.util.List;
import java.util.Scanner;

import jdbc.dao.SubjectDao;
import jdbc.dto.SubjectDto;

public class Test04_1 {
	public static void main(String[] args) {
		
		//Data
		//(주의) Scanner를 사용하면 null이 입력되지 않는다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색분류 : ");
		String type = sc.nextLine();
		
		System.out.print("검색어 : ");
		String keyword = sc.nextLine();
		
		sc.close();
		
		//JDBC
		List<SubjectDto> list;
		SubjectDao dao = new SubjectDao();
		if(type != null && !type.equals("") 
			&& keyword != null && !keyword.equals("")) {
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
