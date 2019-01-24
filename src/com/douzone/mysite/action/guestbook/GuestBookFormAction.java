package com.douzone.mysite.action.guestbook;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.mvc.action.Action;
import com.douzone.mvc.util.WebUtils;

public class GuestBookFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respnonse)
			throws IOException, ServletException {
		
		WebUtils.redirect(request, respnonse, request.getContextPath()+"/guest?a=select");

	}

}
