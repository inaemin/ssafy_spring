<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- �α��� O (�α׾ƿ�) -->
	<c:if test="${ not empty loginUser }">
		<span>${ loginUser }�� �ݰ����ϴ�.</span>
		<a href="/logout">�α׾ƿ�</a>
	</c:if>
	<h2>����ϴ� ȭ��</h2>
</body>
</html>