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

public class ModifyAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respnonse)
			throws IOException, ServletException {
		String stringNo=request.getParameter("no");
		long no=Long.parseLong(stringNo);
		String name= request.getParameter("name");
		String gender=request.getParameter("gender");
		
		UserVo vo=new UserVo();
		vo.setNo(no);
		vo.setName(name);
		vo.setGender(gender);
		
		UserVo authUser= new UserDao().update(vo);
		
		HttpSession session = request.getSession();
		session.setAttribute("authuser", authUser);
		
		WebUtils.redirect(request, respnonse, request.getContextPath());
	}

}
