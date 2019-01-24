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
			<div id="board" class="board-form">
				<table class="tbl-ex">
					<tr>
						<th colspan="2">ê¸ë³´ê¸°</th>
					</tr>
					<tr>
						<td class="label">ì ëª©</td>
						<td>ì ëª©ìëë¤.</td>
					</tr>
					<tr>
						<td class="label">ë´ì©</td>
						<td>
							<div class="view-content">
								ë´ì© 1ìëë¤.<br>
								ë´ì© 2ìëë¤.<br>
								ë´ì© 3ìëë¤.
							</div>
						</td>
					</tr>
				</table>
				<div class="bottom">
					<a href="">ê¸ëª©ë¡</a>
					<a href="">ê¸ìì </a>
				</div>
			</div>
		</div>
		<jsp:include page="/WEB-INF/views/includes/navigation.jsp"></jsp:include>
	<jsp:include page="/WEB-INF/views/includes/footer.jsp"></jsp:include>
	</div>
</body>
</html>