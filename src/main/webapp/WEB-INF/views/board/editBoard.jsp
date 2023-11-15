<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시판</h1>

<form action="">
	<div>
		<label for="title">제목</label>
		<input type="text" name="title" id="title" />
	</div>
	<div>
		<label for="content">내용</label>
		<textarea name="content" id="content"></textarea>
	</div>
	<button name="saveBoard" id="saveBoard">저장</button>
	<button name="editBoard" id="editBoard">수정</button>
	<button name="delBoard" id="delBoard">삭제</button>
</form>
</body>
</html>