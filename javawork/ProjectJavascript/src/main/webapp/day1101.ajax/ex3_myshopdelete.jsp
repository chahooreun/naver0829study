<%@page import="myshop.data.MyShopDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 




String num=request.getParameter("num");

MyShopDao dao=new MyShopDao();

dao.deleteShop(num);



%>
