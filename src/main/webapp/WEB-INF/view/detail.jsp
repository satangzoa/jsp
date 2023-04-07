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
</head>
<body>

 <table>
 	<tbody>
 		<tr>
 			<td> 영화명</td>
 			<td><input type="text" name="title" value="${movie.title }"/></td>
 		</tr>
 		<tr>
 			<td> 가격</td>
 			<td> <input type="number" name="number" value="${movie.price }"/></td>
 		</tr>
 		<tr>
 			<td> 줄거리</td>
 		    <td><textarea rows="5" cols="60">${movie.synopsis}</textarea></td>
 		</tr>
 		
 	</tbody>
 
 </table>
</body>
</html>







