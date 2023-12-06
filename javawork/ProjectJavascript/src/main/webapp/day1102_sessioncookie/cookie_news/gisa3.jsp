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
	(엑스포츠뉴스 김예나 기자) 마약 혐의를 부인 중인 가수 지드래곤의 담당 변호사로부터 메일을 받았다는 유튜버가 불쾌한 반응을 보였다. 

최근 온라인 커뮤니티를 통해 한 유튜버가 올린 지드래곤 마약 관련 영상이 화제를 모으고 있다. 해당 유튜버는 지드래곤의 담당 변호사에게 메일을 받았다고 주장해 많은 관심을 모았다. 

앞서 지드래곤의 마약 투약 혐의 관련 진행 상황을 담은 유튜브 영상으로 이목을 집중시킨 이 유튜버는 "지드래곤 변호사가 저한테 메일을 보냈다. 3차에 걸쳐 보냈다"며 내용을 읽었다. 

메일 내용은 지드래곤이 법률대리인을 통해 공개한 첫 공식입장과 같이 "마약을 투약한 사실이 없다"  "경찰에 자진출석의향서를 제출했다" "적극적으로 수사 협조를 하겠다고 강력하게 의사 피력했다" 등이 담겼다. 
내용을 다 읽은 해당 유튜버는 "저는 사실 변호인이 누군지 잘 몰랐다. 거액 줬는지 안 줬는지 저는 관심 없다"라면서 "자고 일어났더니 메일이 또 왔더라. '근거 없는 추측성 보도를 할 경우 끝까지 초강경 대응하겠다'를 보는 순간 기분이 엄청 상했다. 협박하는 거냐"고 불쾌한 반응을 보였다.

이어 "K팝을 대표하는 아티스트가 왜 이런 구설수에 휘말려야 되냐. 자체가 자기 관리를 못하고 있다는 증거 아니냐. K팝 아티스트면 대중의 관심을 받는 거고 지드래곤은 마약을 하지 않았다고 하지만 경찰에서는 확실한 증거를 갖고 있다는 발표를 했다. 둘 중 하나는 거짓말을 하는 건데 이건 국민들이 생각할 문제"라 덧붙였다. 
해당 영상이 공개된 후 누리꾼들은 "지드래곤 강경 대응한다더니 변호사 일 열심히 하네" "경고를 보냈는데 이걸 영상으로 또 올리네" "다른 유튜버들도 메일 많이 받았겠다" 등 다양한 의견을 보이고 있다.

한편 지드래곤은 법무법인 케이원챔버 김수현 변호사를 통해 마약 혐의를 재차 부인했으며, 이번달 6일 경찰에 자진 출석하겠다고 예고했다. 

사진=엑스포츠뉴스 DB 
	
	</pre>
	<br><br>
	<a href="loginmain.jsp">메인페이지로 이동</a>
	

	<%}


%>

</body>
</html>