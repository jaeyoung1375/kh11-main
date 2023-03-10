# 1일차 요약
- 이후부터는 Github에 업로드할 계획입니다

# 프로그래밍 언어의 구분
- 컴파일 방식의 언어 : 소스코드를 미리 번역해두고 나중에 실행하는 방식(사전 번역)
	- 장점 : 사전 번역을 하기 때문에 대략적인 메모리 사용량 계산이 가능, 문법 검사가 가능
	- 단점 : 사전 번역을 해야 하므로 절차가 복잡해짐. 오류가 발생할 경우 실행이 불가
- 인터프리터 방식의 언어 : 소스코드를 번역하면서 실행하는 방식(실시간 번역)
	- 장점 : 실시간 번역을 하므로 데이터에 대해 유연하며, 오류 발생 지점까지는 실행이 가능
	- 단점 : 메모리 사용량 계산이 어려우며, 문법 검사가 불가능

# JDK(Java Development Kit, 자바 개발자용 도구)
- 자바 프로그램을 개발하기 위해서 설치하는 프로그램
- 실행환경(JRE, Java Runtime Environment)을 내장하고 있음
- 컴파일러를 가지고 있음
- 8, 11, 17버전이 LTS(Long Term Service, 장기 지원)로 관리되며 실무에서 8, 11을 가장 많이 사용
- Oracle, OpenJDK, Amazon Corretto 등 다양한 배포사가 존재하며 Amazon Coretto 제품을 사용(개인무료)
- 설치 후 확인은 터미널에서 다음 명령을 실행한다
	java -version
	javac -version

# Eclipse
- 프로그래밍을 쉽게 하도록 도와주는 편집기(성능이 아주 좋은 메모장)
- 이와 같은 프로그램들을 IDE(Integrated Development Environment, 통합 개발 환경)이라고 함
- IntelliJ, Visual studio code 등 다양한 프로그램들이 있으며 그 중 하나

# 프로젝트 생성
- 프로젝트 이름 설정
- module 사용 안함 체크
- 생성