package com.douzone.mysite.action.guestbook;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.mvc.action.Action;
import com.douzone.mvc.util.WebUtils;
import com.douzone.mysite.repository.GuestBookDao;
import com.douzone.mysite.vo.GuestBookVo;

public class SelectListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respnonse)
			throws IOException, ServletException {
		GuestBookDao dao=new GuestBookDao();
		List<GuestBookVo> list=dao.getList();
		
		//데이터를 request 범위에 저장 
		request.setAttribute("list", list);
		
		WebUtils.forward(request, respnonse, "/WEB-INF/views/guestbook/list.jsp");

	}

}
