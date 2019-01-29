package com.douzone.mysite.action.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.douzone.mvc.action.Action;
import com.douzone.mvc.util.WebUtils;
import com.douzone.mysite.repository.BoardDao;
import com.douzone.mysite.vo.UserVo;

public class DeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respnonse)
			throws IOException, ServletException {
		
		String no = request.getParameter("no");
		String userNo = request.getParameter("userNo");
		HttpSession session = request.getSession();
		UserVo vo = null;
		
		if (session.getAttribute("authuser") != null)
			vo = (UserVo)session.getAttribute("authuser");
		else
		{
			WebUtils.redirect(request, respnonse, request.getContextPath() + "/board?a=list");
			return;
		}
		
		
		new BoardDao().delete(Long.parseLong(no), Long.parseLong(userNo), vo.getNo());
		
		WebUtils.redirect(request, respnonse, request.getContextPath() + "/board?a=list");

	}

}
