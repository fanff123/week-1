<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	
	<table>
		<tr>
			<td>ID</td>
			<td>英雄</td>
			<td>阵营</td>
			<td>价格</td>
			<td>状态</td>
			<td>上线时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="h">
			<td>${h.id }</td>
			<td>${h.hname }</td>
			<td>${h.cname }</td>
			<td>${h.price }</td>
			<td>${h.status }</td>
			<td>${h.uptime }</td>
			<td>详情 购买</td>
		</c:forEach>
		<tr>
			<td colspan="10">
				<a href="?pageNum">首页</a>
				<a href="?pageNum=${page.pageNum-1 
				<1?page.pageNum:page.pageNum-1>}">上一页</a>
				<a href="?pageNum=${page.pageNum+1 
				page.pages?page.pageNum:page.pageNum+1}">下一页</a>
				<a href="?pageNum=${page.pages }">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>