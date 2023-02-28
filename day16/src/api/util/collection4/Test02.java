package api.util.collection4;

import java.util.HashMap;
import java.util.Map;

public class Test02 {
	public static void main(String[] args) {
//		저장소 생성 및 데이터 추가
		Map<String, String> database = new HashMap<>();
		database.put("khacademy", "master1234");
		database.put("khstudent", "study1234");
		database.put("khmanager", "admin1234");
		
//		참고 : 불변 저장소 생성
//		Map<String, String> database = Map.of(
//				"khacademy", "master1234", 
//				"khstudent", "study1234", 
//				"khmanager", "admin1234"
//		);
		
		String id = "khmanager";
		String pw = "admin1234";
		
//		if(database.containsKey(id) && database.containsValue(pw)) {
		if(database.containsKey(id) && database.get(id).equals(pw)) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}
}






