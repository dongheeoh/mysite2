package com.douzone.mysite.action.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.douzone.mvc.action.Action;
import com.douzone.mvc.util.WebUtils;
import com.douzone.mysite.repository.BoardDao;
import com.douzone.mysite.vo.BoardVo;

public class SelectBoardListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respnonse)
			throws IOException, ServletException {
		
		HttpSession session = request.getSession();
		BoardDao dao=new BoardDao();
		List<BoardVo> list=dao.getList();
		
		//데이터를 request 범위에 저장 
		request.setAttribute("list", list);
		request.setAttribute("session", session.getAttribute("authuser"));
		
		
		WebUtils.forward(request, respnonse, "/WEB-INF/views/board/list.jsp");

	}

}
