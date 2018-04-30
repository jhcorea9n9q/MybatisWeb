<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글작성</title>
</head>

<body>
		<%
				String UserNumber = request.getParameter("userNo");
		%>
		<form action="BoardInsert" method="post">
				<input type="text" name="title" placeholder="제목을 작성해 주십시오."><br>
				<input type="text" name="content" placeholder="내용을 작성해 주십시오."><br>
				<input type="hidden" name="regUser" value="<%=UserNumber%>">
				<input type="submit" value="작성">
		</form>
		
</body>

</html>