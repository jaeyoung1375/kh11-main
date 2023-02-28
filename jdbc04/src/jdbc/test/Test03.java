package jdbc.test;

import jdbc.dao.SubjectDao;

public class Test03 {
	public static void main(String[] args) {
		int no = 22;
		
		SubjectDao dao = new SubjectDao();
		boolean result = dao.delete(no);
		
		if(result) {
			System.out.println("삭제 완료");
		}
		else {
			System.out.println("대상 없음");
		}
	}
}
