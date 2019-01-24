<%@page import="java.util.List"%>
<%@page import="com.douzone.mysite.vo.GuestBookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	List<GuestBookVo> list = (List)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="<%=request.getContextPath() %>/assets/css/guestbook.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
			<jsp:include page="/WEB-INF/views/includes/header.jsp"></jsp:include>
		<div id="content">
			<div id="guestbook">
				<form action="<%=request.getContextPath() %>/guest?a=insert" method="post">
					<input type="hidden" name="a" value="insert">
					<table>
						<tr>
							<td>이름</td><td><input type="text" name="name"></td>
							<td>비밀번호</td><td><input type="password" name="pass"></td>
						</tr>
						<tr>
							<td colspan=4><textarea name="content" id="content"></textarea></td>
						</tr>
						<tr>
							<td colspan=4 align=right><input type="submit" VALUE="확인"></td>
						</tr>
					</table>
				</form>
				<ul>
					<li>
						<%
							int totalCount=list.size();
							int index=0;
							for(GuestBookVo vo:list){
						%>
						<table>
							<tr>
								<td>[<%=totalCount - index++ %>]</td>
								<td><%=vo.getName() %></td>
								<td><%=vo.getRegDate() %></td>
								<td><a href="<%=request.getContextPath() %>/guest?a=deleteform&no=<%=vo.getNo() %>">삭제</a></td>
							</tr>
							<tr>
									<td colspan=4>
								<%=vo.getText().replaceAll("\n", "<br/>") %>
								</td>
							</tr>
						</table>
						<br>
						<%
							}
						%>
					</li>
				</ul>
			</div>
		</div>
		<jsp:include page="/WEB-INF/views/includes/navigation.jsp"></jsp:include>
	<jsp:include page="/WEB-INF/views/includes/footer.jsp"></jsp:include>
	</div>
</body>
</html>