<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
				<form id="search_form" action="" method="post">
					<input type="text" id="kwd" name="kwd" value="">
					<input type="submit" value="ì°¾ê¸°">
				</form>
				<table class="tbl-ex">
					<tr>
						<th>ë²í¸</th>
						<th>ì ëª©</th>
						<th>ê¸ì´ì´</th>
						<th>ì¡°íì</th>
						<th>ìì±ì¼</th>
						<th>&nbsp;</th>
					</tr>				
					<tr>
						<td>3</td>
						<td><a href="">ì¸ ë²ì§¸ ê¸ìëë¤.</a></td>
						<td>ìëí</td>
						<td>3</td>
						<td>2015-10-11 12:04:20</td>
						<td><a href="" class="del">ì­ì </a></td>
					</tr>
					<tr>
						<td>2</td>
						<td><a href="">ë ë²ì§¸ ê¸ìëë¤.</a></td>
						<td>ìëí</td>
						<td>3</td>
						<td>2015-10-02 12:04:12</td>
						<td><a href="" class="del">ì­ì </a></td>
					</tr>
					<tr>
						<td>1</td>
						<td><a href="">ì²« ë²ì§¸ ê¸ìëë¤.</a></td>
						<td>ìëí</td>
						<td>3</td>
						<td>2015-09-25 07:24:32</td>
						<td><a href="" class="del">ì­ì </a></td>
					</tr>
				</table>
				<div class="bottom">
					<a href="" id="new-book">ê¸ì°ê¸°</a>
				</div>				
			</div>
		</div>
		<jsp:include page="/WEB-INF/views/includes/navigation.jsp"></jsp:include>
	<jsp:include page="/WEB-INF/views/includes/footer.jsp"></jsp:include>
	</div>
</body>
</html>