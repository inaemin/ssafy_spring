<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>Multi File Form</h2>
	<form action="multiFileUpload" method="POST" enctype="multipart/form-data">
		<input type="file" name="files" multiple="multiple"/>
		<button>파일등록</button>
	</form>
</body>
</html>