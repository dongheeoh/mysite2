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
		
		
				List<BoardVo> totalCountList = new BoardDao().getList();
				
			
				long totalCount = totalCountList.get(0).getTotalCount();
				
				
			
				int listCount = 5;
				
				
				long totalPage = (totalCount % listCount > 0) ?(totalCount / listCount) + 1 :totalCount / listCount;

				int pageCount = 5; //size
				
			
				int getPage = (request.getParameter("page") != null) ? Integer.parseInt(request.getParameter("page")) : 1;
				int page = (int) ((getPage > totalPage) ? totalPage : getPage);
				

				int startPage = (( (page-1) / pageCount) * pageCount) + 1;
				

				int endPage = startPage + pageCount - 1;
				
				List<BoardVo> list = null;
				//찾기
				if (request.getParameter("kwd") == null)
					list = new BoardDao().getList("", ((page-1) * listCount) + 1, listCount);
				
				else
					list = new BoardDao().getList(request.getParameter("kwd").replaceAll(" ", ""), startPage, listCount);
				
				HttpSession session = request.getSession();
				request.setAttribute("list", list);
				request.setAttribute("session", session.getAttribute("authuser"));
				request.setAttribute("startPage", startPage);
				request.setAttribute("endPage", endPage);
				request.setAttribute("totalPage", totalPage);
				request.setAttribute("listCount", listCount);
				request.setAttribute("page", page);
				
				WebUtils.forward(request, respnonse, "/WEB-INF/views/board/list.jsp");

	}

}
