<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>진짜??? </h1>

<form action="">
	<div>
		<label for="userId">아이디</label>
		<input type="text" name="userId" id="userId" />
	</div>
	<div>
		<label for="userPw">비밀번호</label>
		<input type="password" name="userPw" id="userPw" />
	</div>
	<div>
		<label for="checkPw">비밀번호 확인</label>
		<input type="password" name="checkPw" id="checkPw" />
	</div>
	<div>	
		<label for="HpNum1">핸드폰 번호</label>
		<input type="text" name="HpNum1" id="HpNum1"/>
		<span>-</span>
		<input type="text" name="HpNum2" id="HpNum2"/>
		<span>-</span>
		<input type="text" name="HpNum3" id="HpNum3"/>
	</div>	
	<div>
		<label for="mailId">이메일</label>
		<input type="text" name="mailId" id="mailId"/>
		<span>@</span>
		<input type="text" name="mailDomain" id="mailDomain"/>
	</div>	
	<button>제출</button>
</form>
</body>
</html>