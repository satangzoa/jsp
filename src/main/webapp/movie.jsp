<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<%@ page import="com.oraclejava.project.dao.* ,com.oraclejava.project.dto.*" %>
<%
	MovieDAO movieDAO = new MovieDAOImpl();
	List<Movie> movieList = movieDAO.selectMovieAll();
%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>movie 목록</title>
<link rel="stylesheet" href="main.css">
</head>
<body>
	<a href="https://www.naver.com">네이버</a> <br>
	<h2>영화 목록</h2>
	등록된 영화수: <%= movieList.size() %>편
	<br><br>
	<div id="movieList">
	<% 
		for (Movie m : movieList) {
	%>
		<div style="margin:5px " class="a">
		영화명: <%= m.getTitle() %><br>
		가격: <%= m.getPrice() %> 원<br>
		</div>
	<% 
		}
	%>
	
	</div>


</body>
</html>



















