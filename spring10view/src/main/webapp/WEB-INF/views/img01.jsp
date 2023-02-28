<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>이미지 태그 사용법</title>
	</head>
	<body>
	
		<!-- 
			img 태그는 이미지를 화면에 표시하는 역할
			- 종료 태그를 사용하지 않는다
			- 태그만으로는 이미지를 표시할 수 없다
			- 태그에 속성(attribute)을 추가하여 정보를 제공해야 한다
				- src는 이미지의 위치
				- 이미지의 크기를 폭(width)과 높이(height)로 설정할 수 있다
					- 기본 단위는 픽셀(px)로 설정이 된다
					- 비율(%)로 설정도 가능
			- 내가 가진 이미지를 src에 경로로 작성할 수 있다
			- 이미지의 위치는 src/main/resources/static에 넣어 두어야 한다
		 -->
		<img width="300" height="200" src="https://downloadwap.com/thumbs2/wallpapers/p2ls/2019/spiritual/52/7ecda89613213527.jpg">
	
		<br>
		
		<img width="50%" src="https://downloadwap.com/thumbs2/wallpapers/p2ls/2019/spiritual/52/7ecda89613213527.jpg">
	
		<br>
		
		<img width="200" src="http://localhost:8080/lion.gif"><br>
		<img width="200" src="//localhost:8080/lion.gif"><br>
		<img width="200" src="/lion.gif"><br>
	
	</body>
</html>


