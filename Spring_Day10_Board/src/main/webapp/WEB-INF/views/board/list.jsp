<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ include file="../common/bootstrap.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խñ� ���</title>
</head>
<body>
	<div class="container">
		<h2>�Խñ� ���</h2>
		<hr />
		<%@ include file="../common/searchForm.jsp" %>
		<table class="table text-center">
			<tr>
				<th>�۹�ȣ</th>
				<th>����</th>
				<th>����</th>
				<th>��ȸ��</th>
				<th>��¥</th>
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
			<a class="btn btn-primary" href="/writeform">�۵��</a>		
		</div>
	</div>
</body>
</html>