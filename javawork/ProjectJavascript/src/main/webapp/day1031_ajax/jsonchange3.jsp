<%@page import="org.json.simple.JSONArray"%>
<%@page import="com.mysql.cj.xdevapi.JsonArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <% 
    String name1="q";
    String addr1="w";
    String name2="e";
    String addr2="r";
    String name3="d";
    String addr3="f";
    
    JSONObject ob1=new JSONObject();
    ob1.put("name",name1);
    ob1.put("addr",addr1);
    
    JSONObject ob2=new JSONObject();
    ob1.put("name",name2);
    ob1.put("addr",addr2);
    
    JSONObject ob3=new JSONObject();
    ob1.put("name",name3);
    ob1.put("addr",addr3);
    
    JSONArray arr=new JSONArray();
    arr.add(ob1);
    arr.add(ob2);
    arr.add(ob3);
    
    
%>

<%=arr.toString() %>