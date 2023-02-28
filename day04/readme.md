# 다중 조건

# Test03

지하철 이용요금 계산기

지하철은 나이에 따라 요금을 다음과 같이 다르게 받습니다

- 어르신(65세~) - 무료
- 성인(20세~64세) - 1250원
- 청소년(14세~19세) - 720원
- 어린이(8세~13세) - 450원
- 영유아(~7세) - 무료

카드 보증금이 500원일 때, 출생년도 4자리에 따라 지하철 이용요금을 구하여 출력

# Test04

SNS와 같은 게시글(피드) 위주의 사이트에서는 요즘 시간을 다음과 같이 표시합니다

- 예전 : 2023-01-02 12:50:30
- 최근 : 방금 전, 30초 전, 1일 전, 오래 전

최근 방식으로 보여주기 위해서는 현재 시각과 작성 시각의 차이를 알아야 합니다

작성 시각과 현재 시각의 차이가 초단위로 주어졌을 때 다음 규칙에 맞게 시간 메세지를 출력

- 10초 미만이면 `방금 전`이라고 출력
- 1분 미만이면 `?초 전`이라고 출력
- 1시간 미만이면 `?분 전`이라고 출력
- 1일 미만이면 `?시간 전`이라고 출력
- 1일이 넘어가면 `오래 전`이라고 출력

참고로 숫자(변수)와 따옴표로 감싸진 문자를 더하면 두 값이 붙어서 출력됩니다
```
int a = 10;
System.out.println("a = " + a);
```

# 입출력

과거에 풀었던 BMI 계산기를 사용자 정보를 입력받아서 계산하도록 변경

- 입력 항목 : 신장(cm), 체중(kg)

BMI 지수가 24.5 이상이라면 과체중, 이하라면 정상으로 출력

```
               체중(kg)
계산공식 = ───────────────────
               키²(m²)
```

# Test05

사용자에게 국어, 영어, 수학점수를 입력받고 총점과 평균, 합격여부를 계산하여 출력

- 합격이란 각 과목이 40점 이상이고, 평균이 60점 이상인 경우를 말합니다

# Test07

이전에 만들었던 KH 여행사 프로모션 프로그램의 기능을 개선할 계획입니다.

- 모든 계절에 따른 할인율은 다음과 같습니다
	- 봄 : 10%
	- 여름 : 5%
	- 가을 : 30%
	- 겨울 : 20%
- 윤년일 경우 5% 추가 할인을 받습니다

사용자에게 이름, 인원수, 예상기간(일), 여행갈 년도와 월 정보를 각각 입력받아 다음과 같은 출력 결과가 나올 수 있도록 구현하세요

> 무조건 1인 1일 10만원 규칙은 그대로 적용됩니다

```
홍길동님의 예상 견적서는 다음과 같습니다

여행 예정 : 2024년 1월
여행 인원수 : 3명
여행 기간 : 10일
계절 할인 : 20%
윤년 할인 : 5%

총 금액 : 3000000원
할인 금액 : 750000원
견적 금액 : 2250000원

<버튼을 눌러 예약 사이트로 이동해주세요>
```














