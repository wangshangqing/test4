<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  		
  		<a href="add.jsp">添加商品</a>
  		<table>
  			<tr>
  				<td>编号</td>
  				<td>名称</td>
  				<td>价格</td>
  				<td>操作</td>
  			</tr>
  			
  			<c:forEach var="li" items="${list}">
	  			<tr>
	  				<td>编号</td>
	  				<td>${li.sname}</td>
	  				<td>价格</td>
	  				<td><a href="ToUpdateServlet?id=${li.id}">修改</a></td>
	  			</tr>
  			</c:forEach>
  		</table>
  		 
  </body>
</html>
