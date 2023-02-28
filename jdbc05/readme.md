# 회원 테이블 및 프로그램 구상

- 테이블명 : member

- 테이블 컬럼 :
	- 아이디(member_id) - 5~20자 영문 소문자, 숫자, 대시(-), 언더바(_)(중복 불가), 대표 항목
	- 비밀번호(member_pw) - 8~16자 영문 대 소문자, 숫자, 특수문자를 사용
	- 닉네임(membmer_nick) - 2~10자 한글 또는 숫자를 사용(중복 불가)
	- 전화번호(member_tel) - 휴대폰 번호만 가능(010XXXㅠXXXXX), 대시 제외
	- 이메일(member_email) - 넉넉하게 다합쳐서 100byte(선택 항목)
	- 생년월일(member_birth) - 문자열(YYYY-MM-DD)
	- 주소
		- 우편번호(member_post) - 5~6자리 숫자만 가능
		- 기본주소(member_basic_addr) - 한글 100자 이내
		- 상세주소(member_detail_addr) - 한글 100자 이내
	- 회원등급(member_level) - (준회원/일반회원/우수회원/관리자)중 하나(가입 시 준회원)
	- 포인트(member_point) - 0이상 숫자만 가능
	- 가입일(member_join) - 가입 당시의 현재시각으로 설정
	- 마지막 로그인일시(member_login) - 로그인 당시의 현재시각으로 설정(가입 시 미설정)