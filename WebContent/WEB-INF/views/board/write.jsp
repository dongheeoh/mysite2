<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="/assets/css/board.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
			<jsp:include page="/WEB-INF/views/includes/header.jsp"></jsp:include>
		<div id="content">
			<div id="board">
				<form class="board-form" method="post" action="/board">
					<input type = "hidden" name = "a" value="write">
					<table class="tbl-ex">
						<tr>
							<th colspan="2">ê¸ì°ê¸°</th>
						</tr>
						<tr>
							<td class="label">ì ëª©</td>
							<td><input type="text" name="title" value=""></td>
						</tr>
						<tr>
							<td class="label">ë´ì©</td>
							<td>
								<textarea id="content" name="content"></textarea>
							</td>
						</tr>
					</table>
					<div class="bottom">
						<a href="/board">ì·¨ì</a>
						<input type="submit" value="ë±ë¡">
					</div>
				</form>				
			</div>
		</div>
		<jsp:include page="/WEB-INF/views/includes/navigation.jsp"></jsp:include>
	<jsp:include page="/WEB-INF/views/includes/footer.jsp"></jsp:include>
	</div>
</body>
</html>