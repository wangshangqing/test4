<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
       <form action="AddServlet" method="post">
       		商品名称：<input type="text" name="sname"><br>
       		商品类别：
       		<select name="typeid">
       			<option value="-1">请选择</option>
       			<c:forEach var="typelist" items="${list}">
       				<option value="${typelist.id}">${typelist.typeName}</option>
       			</c:forEach>
       		</select><br>
       		商品价格：<input type="text" name="price"><br>
       		库存：<input type="text" name="count"><br>
       		不能卖：<input type="radio" name="notsell" value="0">
       		可以卖：<input type="radio" name="notsell" value="1"><br>
       		<input type="submit" value="保存">
       </form>
  </body>
</html>
