<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 상세 화면</title>
<link rel="stylesheet" href="main.css">
<link rel="stylesheet" href="/css/bootstrap.css">
<link rel="stylesheet" href="/js/bootstrap.js">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
<body>

<h2 class="text-center"> 영화 상세 화면</h2>
<form action="/movie/MovieServlet" method="post">
		<input type="hidden" name="action" value="update"/>
		<input type="hidden" name="movie_id" value="${movie.movie_id }"/>
 	<table class= "table table-hover table-striped text-center" >
	 	<tbody>
	 		<tr class= "">
	 			<td class= ""> 영화명</td>
	 			<td class= ""><input type="text" name="title" value="${movie.title }"/></td>
	 		</tr>
	 		<tr class= "">
	 			<td class= ""> 가격</td>
	 			<td class= ""> <input type="number" name="price" value="${movie.price }"/>원</td>
	 		</tr>
	 		<tr class= "">
	 			<td class= ""> 줄거리</td>
	 		    <td class= ""><textarea rows="5" cols="60" name="synopsis">${movie.synopsis}</textarea></td>
	 		</tr>
	 		<tr>
	 			<td colspan="2">
				<input type="submit" name="update" value="수정" class="btn btn-primary"/>
				<input type="reset" value="취소" class="btn btn-primary">
				<input type="submit" name="delete" value="삭제" class="btn btn-primary"/>
					<input type="button" value="목록" onclick="location.href='MovieServlet'"
				 class="btn btn-primary"/>
		   </td>
		  </tr>
	 	</tbody>
 </form>
</body>
</html>







