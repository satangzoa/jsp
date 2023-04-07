<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>movie 목록</title>
<link rel="stylesheet" href="main.css">
</head>
<body>
	<h2>영화 목록</h2>
	<form action="" method="get"> <!-- action은 비워두면 servlet 된다 -->
		<input type="hidden" name="action" value="search">
		영화제목: <input type="text" name="title">
		<input type="submit" value="조회">
	</form>
	<br><br>
	등록된 영화수: ${fn:length(movieList)}편
	<br><br>
	<a href="/movie/MovieServlet?action=write">영화등록</a><br><br>
	<div id="movieList">
	<c:forEach var="m" items="${movieList}">
		<div style="margin:5px" class="a">
		<a href="/movie/MovieServlet?action=detail">
		영화명: ${m.title}<br>
		가격:  ${m.price}원<br>
		
		</a>
		</div>
	</c:forEach>
	</div>


</body>
</html>



















