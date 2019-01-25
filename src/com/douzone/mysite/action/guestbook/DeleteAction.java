package com.douzone.mysite.action.guestbook;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.douzone.mvc.action.Action;
import com.douzone.mvc.util.WebUtils;
import com.douzone.mysite.repository.GuestBookDao;
import com.douzone.mysite.vo.GuestBookVo;


public class DeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respnonse)
			throws IOException, ServletException {
		
			String no= request.getParameter("no");
		   String password= request.getParameter("password");
		   
		   
		   GuestBookVo vo=new GuestBookVo();
		   vo.setNo(Integer.parseInt(no));
		   vo.setPassword(password);
		   
		   new GuestBookDao().delete(vo);
		   
		   WebUtils.redirect(request, respnonse, request.getContextPath()+"/guest?a=select");

	}

}
