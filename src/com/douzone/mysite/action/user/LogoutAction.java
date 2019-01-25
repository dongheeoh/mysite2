package com.douzone.mysite.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.douzone.mvc.action.Action;
import com.douzone.mvc.util.WebUtils;

public class LogoutAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respnonse)
			throws IOException, ServletException {
		HttpSession session=request.getSession(); //꺼낼떄는 true.false
		
		if(session!=null &&session.getAttribute("authuser")!=null ) {
			session.removeAttribute("authuser");
			session.invalidate();
		}
		
		WebUtils.redirect(request, respnonse, request.getContextPath());

		
		//logout 처리
		
		
		
		
	}

}
