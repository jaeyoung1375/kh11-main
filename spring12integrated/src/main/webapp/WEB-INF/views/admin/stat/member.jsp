<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/adminHeader.jsp"></jsp:include>


  <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
    <!-- chartjs cdn-->
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

  <script>
        $(function(){

          // 시작하자마자 서버에 비동기 통신으로 데이터를 요청
          // 요청 주소 - http://localhost:8080/rest/admin/pocketmon
          // 요청이 성공하면 차트를 생성
          $.ajax({
            url:"http://localhost:8080/rest/admin/member",
            method:"get",
            success:function(response){
              var ctx = document.querySelector('#myChart');
  
            // new Chart(캔버스객체,옵션)
            new Chart(ctx, {
                // type : 차트의 형태(bar/line/pie/doughnut)
              type: 'bar',
              // data : 차트의 구성 데이터 정보
              // - labels : 항목명(x축)
              // - datasets : 차트 데이터
                // - label : 데이터의 이름
                // - data : 항목 별 실제 데이터(labels의 개수가 일치해야 한다)
              data: {
                labels: response.label,
                datasets: [{
                  label: '멤버 수',
                  data: response.data,
                  borderWidth: 1,
                  backgroundColor : ["red","orange","yellow","green","blue","purple"],
                  borderColor : ["red"],
                }]
              },
              options: {
                scales: {
                  y: {
                    beginAtZero: true
                  }
                }
              }
            });
            },
            error:function(){
              alert("통신 오류");
            },
          });

           
    
   
        });
    </script>



<h1>회원 현황</h1>

<!-- 각종 정렬과 관련된 링크 -->
<a href="member">등급순</a>
<a href="member?sort=cnt desc">인원많은순</a>
<a href="member?sort=cnt asc">인원적은순</a>
<a href="member?sort=total desc">포인트합계↓</a>

<br>

<table border="1" width="600">
	<thead>
		<tr>
			<th>등급</th>
			<th>인원수</th>
			<th>포인트합계</th>
			<th>포인트평균</th>
			<th>최대포인트</th>
			<th>최소포인트</th>
		</tr>
	</thead>
	<tbody align="right">
		<c:forEach var="memberStatDto" items="${list}">
		<tr>
			<td align="center">${memberStatDto.memberLevel}</td>
			<td>
				<fmt:formatNumber value="${memberStatDto.cnt}" pattern="#,##0"></fmt:formatNumber>
			</td>
			<td>
				<fmt:formatNumber value="${memberStatDto.total}" pattern="#,##0"></fmt:formatNumber>
			</td>
			<td>
				<fmt:formatNumber value="${memberStatDto.average}" pattern="#,##0.00"></fmt:formatNumber>
			</td>
			<td>
				<fmt:formatNumber value="${memberStatDto.max}" pattern="#,##0"></fmt:formatNumber>
			</td>
			<td>
				<fmt:formatNumber value="${memberStatDto.min}" pattern="#,##0"></fmt:formatNumber>
			</td>
		</tr>
		</c:forEach>
	</tbody>
</table>

<div class="container-600">
        <div class="row center">
            <h1>차트 예제</h1>
        </div>
        <div class="row">
            <canvas id="myChart"></canvas>
        </div>
    </div>

<jsp:include page="/WEB-INF/views/template/adminFooter.jsp"></jsp:include>