<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 정보 등록</title>
</head>
<body>
	<h2>영화 정보 등록</h2>
	
	<form action="" method="post">
		<input type="hidden" name="action" value="write"/>
		<table>
			<tbody>
				<tr>
					<td>영화명</td>
					<td><input type="text" name="title"></td>
				</tr>
				<tr>
					<td>가격</td>
					<td><input type="number" name="price"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" name="확인" value="등록"/>
					</td>
			</tbody>
		</table>
	</form>
	
	
</body>
</html>







