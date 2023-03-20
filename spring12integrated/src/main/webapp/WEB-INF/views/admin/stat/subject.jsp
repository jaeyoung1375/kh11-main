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
            url:"http://localhost:8080/rest/admin/subject",
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
                  label: '과목 수',
                  data: [
                	  response.data,
                	  response.avg
                	  ],
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




<h1>과정 현황</h1>

<table border="1" width="500">
	<thead>
		<tr>
			<th>유형</th>
			<th>평균</th>
			<th>과정수</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="subjectStatDto" items="${list}">
		<tr>
			<td>${subjectStatDto.type}</td>
			<td align="right">
				<fmt:formatNumber value="${subjectStatDto.average}" 
								pattern="#,##0.00"></fmt:formatNumber>
			</td>
			<td>${subjectStatDto.cnt}</td>
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