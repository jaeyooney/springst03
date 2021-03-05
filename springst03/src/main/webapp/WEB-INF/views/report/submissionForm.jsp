<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="submitReport1.do" method="post" enctype="multipart/form-data">
		학번 : <input type="text" name="studentNumber"/><br/>
		사진 : <input type="file" name="report"/><br/>
		<input type="submit" value="전송">
	</form>
</body>
</html>