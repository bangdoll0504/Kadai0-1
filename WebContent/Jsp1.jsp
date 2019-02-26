<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>結果画面(JSP版)</title>
<jsp:useBean id="userInfoBean" class="beans.UserInfoBean" scope="session" />
</head>
<body>
<h1>結果画面(JSP版)</h1>
	<table>
		<%
		out.println("氏名　：" + userInfoBean.getName() + "<br />");
		out.println("年齢　：" + userInfoBean.getAge() + "<br />");
		out.println("趣味　：" + userInfoBean.getHobbyCon() + "<br />");
		%>
	</table>
	<a href="input.html">入力画面へ</a>
</body>
</html>