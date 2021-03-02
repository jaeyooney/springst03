<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- jstl 사용하기 위한 선언부 -->
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>CODE</th>
			<th>NAME</th>
			<th>PRICE</th>
			<th>COLOR</th>
			<th>DATE</th>
			<th>DELETE</th>
		</tr>
<!-- goods 변수를 선언해서 Goods 컨트롤러에서 넘겨준 데이터를 저장 -->
<c:forEach var="goods" items="${goodsList }">
		<tr>
			<td>${goods.code }</td>
			<td>${goods.name }</td>
			<td>${goods.price }</td>
			<td>${goods.color }</td>
			<td>${goods.regDate }</td>
			<td>삭제</td>
		</tr>
</c:forEach>
		<tr>
		<td><a href="goodsIns.do">등록</a></td>
	</tr>
	</table>
</body>
</html>