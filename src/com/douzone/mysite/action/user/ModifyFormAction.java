package com.douzone.mysite.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.douzone.mvc.action.Action;
import com.douzone.mvc.util.WebUtils;
import com.douzone.mysite.repository.UserDao;
import com.douzone.mysite.vo.UserVo;

public class ModifyFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respnonse)
			throws IOException, ServletException {
	
		/* 접근제어*/
		UserVo authUser=null;
		
		HttpSession session= request.getSession();
		if(session!=null) {
			authUser=(UserVo)session.getAttribute("authuser");
		}
		
		if(authUser ==null) {
			WebUtils.redirect(request, respnonse, request.getContextPath());
			return;
		}
		
		//UserVo vo=new UserDao().get(authUser.getNo()); JSP로 넘거여야함
		UserVo vo=new UserDao().get(authUser.getNo());
		request.setAttribute("vo", vo);
		WebUtils.forward(request, respnonse, "/WEB-INF/views/user/modifyform.jsp");

	}

}
