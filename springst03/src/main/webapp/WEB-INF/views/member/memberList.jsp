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
		<th>아이디</th>
		<th>이름</th>
		<th>이메일</th>
		<th>성별</th>
		<th>나이</th>
		<th>전화번호</th>
		<th>주소</th>
		<th>날짜</th>
		<th>삭제</th>
	</tr>
<c:forEach var="member" items="${memberList }">
	<!-- member 변수를 선언해서 컨트롤러에서 넘겨준 Member 데이터를 저장 -->
	<tr>
		<td><a href="memberView.do?id=${member.id}">${member.id}</a></td>
		<td>${member.name}</td>
		<td>${member.email}</td>
		<td>${member.gender}</td>
		<td>${member.age}</td>
		<td>${member.phone}</td>
		<td>${member.address}</td>
		<td>${member.enrollDate}</td>
		<td><a href="memberDel.do?id=${member.id }">삭제</a></td>
	</tr>
</c:forEach>
	<tr>
		<td><a href="memberIns.do">등록</a></td>
	</tr>
</table>
</body>
</html>