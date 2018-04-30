<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>USER LIST</title>
</head>

<body>
	<% 
	List<HashMap<String, Object>> LIST = (List<HashMap<String, Object>>) request.getAttribute("LIST");
	String HTML = "";
	for (int i = 0; i < LIST.size(); i++) {
		HTML += "<a href='Insert.jsp?userNo=" + LIST.get(i).get("사용자번호") + "' >" + LIST.get(i).get("이름") + "<br>";
	}
	%>
	<%=HTML%>
</body>

</html>