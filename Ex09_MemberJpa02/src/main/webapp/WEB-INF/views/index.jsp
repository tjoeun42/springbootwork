<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="minsert" method="post">
		ID : <input name="id"><p/>
		NAME : <input name="name"><p/>
		PASSWORD : <input type="password" name="password"><p/>
		<input type="submit" value="회원가입">
	</form>
	<p/>
	<hr>
	<form action="binsert" method="post">
		TITLE : <input name="title"><p/>
		CONTENT : <input name="content"><p/>
		<input type="submit" value="게시글 작성">
	</form>
</body>
</html>