package jdbc.test;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test01 {
	public static void main(String[] args) {
		//회원 가입
		
		MemberDto dto = new MemberDto();
		dto.setMemberId("khacademy");
		dto.setMemberPw("KHacademy1!");
		dto.setMemberNick("케이에이치");
		dto.setMemberTel("01012345678");
		dto.setMemberEmail("");
		dto.setMemberBirth("2023-01-30");
		dto.setMemberPost("");
		dto.setMemberBasicAddr("");
		dto.setMemberDetailAddr("");
		
		MemberDao dao = new MemberDao();
		dao.insert(dto);
		
		System.out.println("가입이 완료되었습니다");
	}
}
