<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "param3.do" method = "get">
	장바구니 번호 : <input type="text" name="myCartNum" value=""><br>
	회원이름 : <input type="text" name="memberName" value=""><br>
	상품코드 : <input type="text" name="goodsCode" value=""><br>
	가격 : <input type="text" name="goodsPrice" value=""><br>
	수량 : <input type="text" name="goodsAmount" value=""><br>
	<input type="submit" value="전송">
	
</form>
</body>
</html>