<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h3>day10...index.jsp...</h3>
	<!-- 执行代码 -->
	<%
		String name=(String)request.getAttribute("name");
	%>
	<!-- 输出结果 -->
	<%=name %>
</body>
</html>