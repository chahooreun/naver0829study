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
</style>
</head>
<%
	Cookie []cookies=request.getCookies();
	boolean find=false;
	if(cookies!=null)
	{
		for(Cookie ck:cookies)
		{
			//저장된 쿠키이름을 얻기
			String name=ck.getName();
			if(name.equals("loginok")){
				find=true;//해당 쿠키가 존재하면 true
			}
		}
	}


%>
<body>
<%
	if(!find){%>
	<script type="text/javascript">
	alert("먼저 로그인 해주세요")
	history.back();
	</script>
	
	
	<%}else{%>
	<pre style="width:500px;">
	넷플릭스가 마동석, 이희준, 이준영, 노정의 주연, '범죄도시' 시리즈의 무술감독 허명행 감독의 첫 연출작 영화 '황야'를 전 세계 190여 개국에 공개한다.

폐허가 된 세상, 오직 힘이 지배하는 무법천지 속에서 살아가는 자들이 생존을 위해 벌이는 최후의 사투를 그린 액션 블록버스터 '황야'가 넷플릭스를 통해 전 세계 시청자들과 만날 예정이다.

세계 멸망 이후의 이야기를 담은 포스트 아포칼립스 소재로 흥미를 자극하는 '황야'는 '범죄도시', '유령' 등 다수의 작품에서 무술 감독을 맡아 실감 나는 액션을 선보여 온 허명행 감독의 첫 연출작으로 화제를 모은다.
특히 '황야'는 '범죄도시'에서 빈틈없는 호흡을 맞춰 온 허명행 감독과 마동석의 만남으로 더욱 기대를 모으고 있다. 시원하고 타격감 있는 액션으로 영화 팬들의 마음을 사로잡아 온 허명행 감독과 국내외를 넘나들며 ‘장르가 마동석’이라는 신조어까지 탄생시킨 마동석이 '황야'에서 어떤 시너지를 빚어낼지 궁금증이 높아진다.

여기에 영화 선악을 가리지 않는 강렬하고 탄탄한 연기로 사랑받은 이희준, 인상깊은 연기를 선보이고 있는 이준영, 노정의의 캐스팅은 넷플릭스가 선보일 새로운 액션 블록버스터에 대한 기대를 더욱 끌어올린다.
	
	</pre>
	<br><br>
	<a href="loginmain.jsp">메인페이지로 이동</a>
	

	<%}


%>

</body>
</html>