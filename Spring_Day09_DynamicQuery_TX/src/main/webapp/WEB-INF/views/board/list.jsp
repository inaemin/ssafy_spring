<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ include file="../common/bootstrap.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시글 목록</title>
</head>
<body>
	<div class="container">
		<h2>게시글 목록</h2>
		<%@ include file="../common/header.jsp" %>
		<hr />
		<%@ include file="../common/searchForm.jsp" %>
		<table class="table text-center">
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>쓰니</th>
				<th>조회수</th>
				<th>날짜</th>
			</tr>
			<c:forEach items="${ boards }" var="board">
				<tr>
					<td>${ board.id }</td>
					<td>
						<a href="detail?id=${board.id}">
						${ board.title }
						</a>
					</td>
					<td>${ board.writer }</td>
					<td>${ board.viewCnt }</td>
					<td>${ board.regDate }</td>
				</tr>
			</c:forEach>
		</table>
		<div class="d-flex justify-content-end">
			<a class="btn btn-primary" href="/writeform">글등록</a>		
		</div>
	</div>
</body>
</html>