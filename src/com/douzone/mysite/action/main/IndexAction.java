package com.douzone.mysite.action.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.mvc.action.Action;
import com.douzone.mvc.util.WebUtils;

public class IndexAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respnonse)
			throws IOException, ServletException {
		
		int count=0;
		 Cookie[] cookies= request.getCookies();
		 if(cookies!=null && cookies.length > 0) {
			 for(Cookie c : cookies) {
				 if("vistiCount".equals(c.getName())) {
					 count =Integer.parseInt( c.getValue());
					 break;
				 }
			 }
		 }
		
		count++;
		Cookie cookie=new Cookie("visitCount",""+count);
		cookie.setMaxAge(24*60*60);
		cookie.setPath(request.getContextPath());
		respnonse.addCookie(cookie);
		
		WebUtils.forward(request, respnonse, "/WEB-INF/views/main/index.jsp");

	}

}
