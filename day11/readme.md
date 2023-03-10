# 상속

# oop.inherit6

다음 요구사항에 맞게 클래스 구조 구현 및 객체 생성 후 기능 실행해보세요

요구사항

- Galaxy22s
	- 전화번호 설정 가능
	- 색상 설정 가능
	- 전화(call) 기능을 실행하면 "갤럭시22s 전화 기능 실행" 출력
	- 문자(sms) 기능을 실행하면 "갤럭시22s 문자 기능 실행" 출력
	- 삼성페이(samsungPay) 기능을 실행하면 "갤럭시22s 삼성페이 기능 실행" 출력
	- 빅스비(bixby) 기능을 실행하면 "갤럭시22s 음성인식 기능 실행" 출력
- GalaxyFold4
	- 전화번호 설정 가능
	- 색상 설정 가능
	- 전화(call) 기능을 실행하면 "갤럭시폴드4 전화 기능 실행" 출력
	- 문자(sms) 기능을 실행하면 "갤럭시폴드4 문자 기능 실행" 출력
	- 삼성페이(samsungPay) 기능을 실행하면 "갤럭시폴드4 삼성페이 기능 실행" 출력
	- 홍채인식(iris) 기능을 실행하면 "갤럭시폴드4 홍채인식 기능 실행" 출력
- IPhone13
	- 전화번호 설정 가능
	- 색상 설정 가능
	- 전화(call) 기능을 실행하면 "IPhone13 전화 기능 실행" 출력
	- 문자(sms) 기능을 실행하면 "IPhone13 문자 기능 실행" 출력
	- 아이튠즈(itunes) 기능을 실행하면 "IPhone13 아이튠즈 기능 실행" 출력
	- 시리(siri) 기능을 실행하면 "IPhone13 음성인식 기능 실행" 출력
- IPhone14
	- 전화번호 설정 가능
	- 색상 설정 가능
	- 전화(call) 기능을 실행하면 "IPhone14 전화 기능 실행" 출력
	- 문자(sms) 기능을 실행하면 "IPhone14 문자 기능 실행" 출력
	- 페이스타임(faceTime) 기능을 실행하면 "IPhone14 영상통화 기능 실행" 출력
	- 시리(siri) 기능을 실행하면 "IPhone14 음성인식 기능 실행" 출력
	
# 다형성

다형성의 필수 조건
- 사용하려는 클래스간의 상속 관계가 설정되어 있어야 한다
- 공통 기능에 대한 메소드 재정의가 이루어져 있어야 한다

# oop.poly2

다음 요구사항에 맞게 프로그램을 구현하세요

- 전사(Warrior) 클래스 구현
	- 아이디, 레벨 정보를 가질 수 있다
	- 생성 시 반드시 아이디가 필요하며, 레벨은 1로 설정된다
	- 공격 기능이 있어야 한다(`전사가 칼로 공격합니다!` 출력)
	- 이동 기능이 있어야 한다(`전사가 뛰어서 이동합니다!` 출력)
	- 상점 기능이 있어야 한다(`전사가 상점을 개설합니다!` 출력)
	- 정보 출력 기능이 있어야 한다(아이디와 레벨을 출력)
- 마법사(Magician) 클래스 구현
	- 아이디, 레벨 정보를 가질 수 있다
	- 생성 시 반드시 아이디가 필요하며, 레벨은 1로 설정된다
	- 공격 기능이 있어야 한다(`마법사가 마법으로 공격합니다!` 출력)
	- 이동 기능이 있어야 한다(`마법사가 텔레포트로 이동합니다!` 출력)
	- 상점 기능이 있어야 한다(`마법사가 상점을 개설합니다!` 출력)
	- 정보 출력 기능이 있어야 한다(아이디와 레벨을 출력)
- 궁수(Archer) 클래스 구현
	- 아이디, 레벨 정보를 가질 수 있다
	- 생성 시 반드시 아이디가 필요하며, 레벨은 1로 설정된다
	- 공격 기능이 있어야 한다(`궁수가 활로 공격합니다!` 출력)
	- 이동 기능이 있어야 한다(`궁수가 숨어서 이동합니다!` 출력)
	- 상점 기능이 있어야 한다(`궁수가 상점을 개설합니다!` 출력)
	- 정보 출력 기능이 있어야 한다(아이디와 레벨을 출력)
- 객체 생성은 다음 규칙을 따른다
	- 사용자에게 1, 2, 3중에 하나를 입력받아 해당하는 클래스 객체를 생성한다
		- 1번을 입력하면 전사를 생성한다
		- 2번을 입력하면 마법사를 생성한다
		- 3번을 입력하면 궁수를 생성한다
	- 사용자에게 1, 2, 3, 4중에 하나를 입력받아 해당하는 작업을 지시한다
		- 1번을 입력하면 공격 기능을 실행한다
		- 2번을 입력하면 이동 기능을 실행한다
		- 3번을 입력하면 상점 기능을 실행한다
		- 4번을 입력하면 정보를 출력한다

# oop.multi2

다음 요구사항에 맞게 프로그램을 구현

요구사항

- 드론(Drone), 비행기(Airplane), 기차(Train), 버스(Bus), 전동킥보드(Kickboard) 클래스를 준비
- 드론과 전동킥보드는 전기로 움직이는 전자제품(Electronic) 입니다.
	- 전자제품은 반드시 전원을 켜고(on) 끄는(off) 기능이 있어야 합니다.
	- 메세지는 단순 텍스트 메세지로 출력하도록 구현합니다(ex : OOO의 전원을 켭니다 / 끕니다)
- 드론, 버스, 비행기, 기차, 전동킥보드는 이동수단(Transportation) 입니다.
	- 이동수단은 반드시 이동(move) 기능이 있어야 합니다.
	- 메세지는 단순 텍스트 메세지로 출력하도록 구현합니다(ex : OOO가 이동합니다)
- 드론과 비행기는 비행이 가능(Flyable)한 공통점이 있습니다
	- 비행이 가능한 물체들은 반드시 비행(fly) 기능이 있어야 합니다.
	- 메세지는 단순 텍스트 메세지로 출력하도록 구현합니다(ex : OOO가 비행합니다)
- 비행기, 기차는 예약이 가능한(Reserve) 공통점이 있습니다
	- 예약이 가능한 객체들에는 반드시 예약(reservation)이라는 기능이 있어야 합니다
	- 메세지는 단순 텍스트 메세지로 출력하도록 구현합니다(ex : OOO를 예약합니다)
- 모든 일반 클래스의 객체를 만들어서 이용 가능한 기능을 호출해보세요















