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
				<form class="board-form" method="post" action="">
					<table class="tbl-ex">
						<tr>
							<th colspan="2">ê¸ìì </th>
						</tr>
						<tr>
							<td class="label">ì ëª©</td>
							<td><input type="text" name="title" value=""></td>
						</tr>
						<tr>
							<td class="label">ë´ì©</td>
							<td>
								<textarea id="content" name="content">ìì í´ì¼ í  ê¸ì ê³ ëë¡ 
ì´ë ê² textareaì ë¿ë ¤ì¼ í©ëë¤.
ê°íë¬¸ì ë³ê²½ë íì§ë§ì¸ì.
ííííí
ì¦ê±´ ì½ë© ëì¸ì~~~~</textarea>
							</td>
						</tr>
					</table>
					<div class="bottom">
						<a href="">ì·¨ì</a>
						<input type="submit" value="ìì ">
					</div>
				</form>				
			</div>
		</div>
		<jsp:include page="/WEB-INF/views/includes/navigation.jsp"></jsp:include>
	<jsp:include page="/WEB-INF/views/includes/footer.jsp"></jsp:include>
	</div>
</body>
</html>