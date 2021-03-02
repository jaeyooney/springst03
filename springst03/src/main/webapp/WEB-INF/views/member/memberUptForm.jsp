<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="memberUpt.do" method="post">
	아이디 : <input type="text" name="id" readonly value="${member.id }"/><br/>
	암호 : <input type="password" name="passwd" value="${member.passwd }"/><br/>
	이름 : <input type="text" name="name" value="${member.name }"/><br/>
	이메일 : <input type="text" name="email" value="${member.email }"/><br/>
	성별 : 남<input type="radio" name="gender" value="M" ${member.gender == 'M'? 'checked':''}/> 
		  여<input type="radio" name="gender" value="F" ${member.gender == 'F'? 'checked':'' }/><br/>
	나이 : <input type="text" name="age" value="${member.age}"/><br/>
	휴대폰 : <input type="text" name="phone" value="${member.phone }"/><br/>
	주소 : <input type="text" name="address" value="${member.address}"/><br/>
	<input type="submit" value="수정">
</form>
</body>
</html>