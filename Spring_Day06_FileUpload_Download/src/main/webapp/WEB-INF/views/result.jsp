<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="/img/${ fileName }">${ fileName }</a>
	<img src="/img/${ fileName }" style="width:200px;"/>
	<a href="/download?fileName=${ fileName }">이미지다운로드</a>
</body>
</html>