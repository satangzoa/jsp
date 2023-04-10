<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<!-- //http://localhost:8090/movie/MovieServlet?action=list  -->
<meta charset="UTF-8">
<title>movie 목록</title>
<style>
 .list { 
 
 	text-align: center; 
 } 
.card {

width: 200px;

}
.a{
border:3px;
position: absolute;

	  top: 35%;

	  left: 25%;

	  margin: -50px 0 0 -50px;
	display: grid;
	grid-template-columns: 1fr 1fr 1fr;
}
</style>
<link rel="stylesheet" href="main.css">
<link rel="stylesheet" href="/css/bootstrap.css">
<link rel="stylesheet" href="/js/bootstrap.js">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
 

</head>
<body>
	<h2 class="list">영화 목록</h2>
	<form action="" method="get" class="list"> <!-- action은 비워두면 servlet 된다 -->
		<input type="hidden" name="action" value="search">
		영화제목: <input type="text" name="title">
		<input type="submit" value="조회">
	</form>
	<br><br>
	<div class="list">
	등록된 영화수: ${fn:length(movieList)}편
	<br><br>
	<a href="/movie/MovieServlet?action=write" >영화등록</a><br><br>
	</div>
	<div class="a" style=" height: 300px" >
	 
	<c:forEach var="m" items="${movieList}">
	
		<div class="card" style="width: 18rem">
		
		<a href="/movie/MovieServlet?action=detail&id=${m.movie_id }">
			<img alt="${m.title}사진" src="/movie/images/${m.movie_id}.png" width="100px" class="card-img-top" height="250px"><br>
			<div class="card-body">
		 <h5 class="card-title">	영화명: ${m.title}</h5>
		<h5 class="card-text">	가격:  ${m.price}원</h5>
		<h5 class="card-text">	줄거리:  ${m.synopsis}</h5>
			
		</a>
		 
		</div>
		 </div>
		 
	</c:forEach>
	</div>

</body>
</html>



















