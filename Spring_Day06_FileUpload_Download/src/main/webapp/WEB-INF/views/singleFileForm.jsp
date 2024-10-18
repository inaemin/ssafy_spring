<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>Single File Form</h2>
	<form action="singleFileUpload" method="POST" enctype="multipart/form-data">
		<input type="file" name="file"/>
		<button>파일등록</button>
	</form>
</body>
</html>