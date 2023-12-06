<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Jua&family=Lobster&family=Nanum+Pen+Script&family=Permanent+Marker&family=Single+Day&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<style>
    body * {
        font-family: 'Jua';
    }

    .content-container {
        margin: 0 auto; /* 요소를 수평으로 가운데 정렬합니다. */
        text-align: center; /* 요소 내의 내용을 가운데 정렬합니다. */
    }
</style>

</head>
<%
	//로그인 상태인지 세션값을 얻는다
	String loginok=(String)session.getAttribute("loginok");
%>
<body>
<div class="content-container">

	<%
	if(loginok==null){%>
		<jsp:include page="loginform.jsp"/>
		<br><br>
		<h3><b>쇼핑몰 정보를 확인하려면 먼저 로그인을 해주세요</b></h3>
	<%}else{%>
		<jsp:include page="logoutform.jsp"/>
		<br><br>
		<img src="mainpage.png">
	<%}
	%>
</div>
</body>
</html>