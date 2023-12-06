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
	영국 '팀 토크'는 2일(한국시간) 독일 '트랜스퍼마크드'를 인용해서 토트넘 팀내 선수 가치를 공개했다. 문제는 팀 최고 에이스인 손흥민이 공동 3위에 그쳤다는 것이다.

토트넘은 지난 10월 영국 런던 셀허스트 파크에서 열린 2023-2024 프리미어리그 10라운드 크리스탈 팰리스와 맞대결서 손흥민의 득점포를 앞세워 2-1로 승리했다. 8승 2무의 토트넘은 리그 선두를 굳게 지켰다. 2위 라이벌 아스날과 3위 맨체스터 시티 모두 승점 24로 바짝 추격하고 있다.
이날 손흥민은 후반 1-0으로 앞선 상황에서 결승골을 터트렸다. 손흥민은 지난 24일 풀럼전 득점에 이어 2경기 연속 골맛을 봤다. 이골로 손흥민은 리그 8호골을 성공시키며 리그 득점 부문에서 엘링 홀란(맨시티, 11골)에 이어 단독 2위에 올랐다
이번 시즌 팀을 떠난 해리 케인을 대신해서 주전 공격수로 나서고 있는 손흥민은 토트넘 팀내에서 절대적인 존재감을 과시했다. 공격의 중심이기도 하지만 팀내 주장으로 엄청난 영향력을 보여서 팀내 최고의 주장이라는 극찬을 듣고 있다.

실력과 리더십을 모두 겸비한 주장 손흥민이지만 트랜스포마크드의 평가는 다소, 아니 많이 박했다. 이 매체는 손흥민의 팀내 가치에 대해서 데얀 쿨루셉스키와 함께 5000만 유로(약 715억 원)으로 공동 3위로 책정했다. 어떻게 보면 말도 안 되는 가치 책정.
팀토크는 트랜스퍼마크드의 순위를 소개하면서 '손흥민은 PL 최고의 선수 중 한 명이다. 그는 세 차례에 걸쳐 토트넘 올해의 선수상을 수상한데다가 2021-2022 시즌 PL 득점왕에 오르기도 했다"라면서 "그래도 지난 시즌 부진했기 때문에 가치가 7500만 유로(약 1073억 원)서 5000만 유로로 급락한 것"이라고 설명했다.
이 매체는 "손흥민은 그래도 엔지 포스테코글루 감독 밑에서는 자신의 본 모습을 제대로 보여주고 있다. 토트넘과 손흥민의 기존 계약은 2025년에 종료된다. 아마 그들은 팀 주장에게 연봉 인상을 포함한 재계약으로 보상할 것"이라고 강조했다.

한편 토트넘 내에서 손흥민보다 고평가를 받은 선수는 대체 누굴까? 그래도 이름을 들으면 어느 정도 납득이 간다. 먼저 토트넘 수비의 핵심인 크리시티안 로메로가 6000만 유로(약 858억 원)로 2위, 손흥민과 함께 새로운 콤비를 구성한 신입생 제임스 메디슨이 7000만 유로(약 1001억 원)로 1위에 위치했다.
	
	
	</pre>
	<br><br>
	<a href="loginmain.jsp">메인페이지로 이동</a>
	

	<%}


%>

</body>
</html>