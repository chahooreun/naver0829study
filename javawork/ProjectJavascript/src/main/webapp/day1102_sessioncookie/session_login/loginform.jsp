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

    .login-form {
       
        width: 1000px; /* 폼의 너비를 설정합니다. */
        height : 500px;
        margin: 0 auto; /* 폼을 수평으로 가운데 정렬합니다. */
        text-align: center; /* 폼 내의 내용을 가운데 정렬합니다. */
    }
</style>


</head>
<%
	//세션으로부터 아이디와 체크저장값을 얻는다
	String loginid=(String)session.getAttribute("loginid");
	String savestatus=(String)session.getAttribute("savestatus");
	boolean bCheck;
	if(savestatus==null || savestatus.equals("no")){
		bCheck=false;//체크를 안했을경우
	}else{
		bCheck=true;//체크를 했을경우
	}
	
	//체크를 안했을경우는 아이디를 없앤다
	
	if(!bCheck) loginid="";
%>
<body>

<div>
 
 <form class="login-form" action="loginaction.jsp" method="post">

	<table class="table table-bordered" style="width:1000px; height : 500px; border:5px groove green;">
		<caption align="top">
			<label><input type="checkbox" name="saveid"
			 <%=bCheck?"checked":""%>>아이디저장</label>
		</caption>
		<tr>
			<td width=150>
				<input type="text" class="form-control" autofocus required
				placeholder="아이디" name="loginid" value="<%=loginid%>">
			</td>
			<td rowspan="2" width=100>
				<button type="submit" style="width:100%;height:100px">로그인</button>
			</td>
		</tr>
		<tr>
			<td width=150>
				<input type="password" class="form-control"  required
				placeholder="비밀번호" name="loginpass">
			</td>
		</tr>
	</table>
 </form>
</div>
</body>
</html>