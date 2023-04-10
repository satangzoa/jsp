<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
.c{
text-align: center;
}
.b{
display:flex;
justify-content: center;
  align-items: center;
 justify-content: center;
  align-items: center;
}

</style>
<title>영화 정보 등록</title>
<link rel="stylesheet" href="main.css">
<link rel="stylesheet" href="/css/bootstrap.css">
<link rel="stylesheet" href="/js/bootstrap.js">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
<body>
	<h2 class="c">영화 정보 등록</h2>
	
	<form action="" method="post">
		<input type="hidden" name="action" value="write"/>
		<table  class="b">
			<tbody>
				<tr class="container">
					<td class="mb-3">영화명</td>
					<td class="mb-3"><input type="text" name="title"></td>
				</tr>
				<tr class="container">
					<td class="mb-3">가격</td>
					<td class="mb-3"><input type="number" name="price"></td>
				</tr>
				<tr class="container">
					<td colspan="2">
						<input type="submit" name="확인" value="등록" class="btn btn-primary"/>
					<input type="button" value="목록" onclick="location.href='MovieServlet'"
				 class="btn btn-primary"/>
					</td>
					
					</tr>
			</tbody>
		</table>
	</form>
	
	
</body>
</html>







