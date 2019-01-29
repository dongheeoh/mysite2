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

public class WritingAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respnonse)
			throws IOException, ServletException {
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		HttpSession hs = request.getSession();
		
		
		UserVo uVo = (UserVo) hs.getAttribute("authuser");
		
		new BoardDao().insert(title, content, uVo.getNo());
		
		WebUtils.redirect(request, respnonse, request.getContextPath()+"/board?a=boardselect");

	}

}
