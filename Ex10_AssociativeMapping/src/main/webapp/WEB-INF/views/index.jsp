<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JPA</title>
<style>
	a {
		text-decoration: none;
		color : black;
		cursor : pointer;
	}
	a:hover {
		color : green;
	}
</style>
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
		<input type="hidden" name="id" value="user01">
		<input type="submit" value="게시글 작성">
	</form>
	<p/>
	<hr>
	
	<form action="mupdate">
		ID : <input name="id"><p/>
		NAME : <input name="name"><p/>
		<input type="submit" value="회원 이름 수정">
	</form>
</body>
</html>