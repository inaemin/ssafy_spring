<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시글 목록</title>
<%@ include file="../common/bootstrap.jsp" %>
</head>
<body>
	<div class="container">
		<h2>게시글 목록</h2>
		<hr />
		<table class="table text-center">
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>쓰니</th>
				<th>조회수</th>
				<th>날짜</th>
			</tr>
			<c:forEach items="${boards}" var="board">
				<tr>
					<td>${board.id}</td>
					<td>${board.title}</td>
					<td>${board.writer}</td>
					<td>${board.viewCnt}</td>
					<td>${board.regDate}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>