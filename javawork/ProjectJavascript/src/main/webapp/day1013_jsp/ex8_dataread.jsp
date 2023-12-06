<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Data Processing</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body * {
            font-family: 'Jua';
        }
    </style>
</head>
<body>
<%
    // Retrieve form data
    String name = request.getParameter("name");
    int javaScore = Integer.parseInt(request.getParameter("java"));
    int jspScore = Integer.parseInt(request.getParameter("jsp"));
    int springScore = Integer.parseInt(request.getParameter("spring"));
    String hp1 = request.getParameter("hp1");
    String hp2 = request.getParameter("hp2");
    String tcolor = request.getParameter("tcolor");
    String bcolor = request.getParameter("bcolor");
%>

<h5>결과</h5>
<table class="table table-bordered" style="width: 400px;">
    <tr>
        <th width="100">이름</th>
        <td><%= name %></td>
    </tr>
    <tr>
        <th width="100">점수</th>
        <td><%= "Java: " + javaScore + ", JSP: " + jspScore + ", Spring: " + springScore %></td>
    </tr>
    <tr>
        <th width="100">핸드폰</th>
        <td><%= hp1 + "-" + hp2 %></td>
    </tr>
    <tr>
        <th width="100">색상</th>
        <td>
            <b>글자색</b> <div style="color: <%= tcolor %>;">Text Color</div>
            <b>배경색</b> <div style="background-color: <%= bcolor %>;">Background Color</div>
        </td>
    </tr>
</table>

</body>
</html>
