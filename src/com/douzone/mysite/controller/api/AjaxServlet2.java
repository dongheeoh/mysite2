package com.douzone.mysite.controller.api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.mysite.vo.UserVo;

import net.sf.json.JSONObject;


@WebServlet("/ajax2")
public class AjaxServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		// java object -> json String 변환
		UserVo vo=new UserVo();
		vo.setNo(10);
		vo.setName("둘리");
		vo.setEmail("dooly@gmial.com");
		vo.setGender("male");
		
		JSONObject jsonObject= JSONObject.fromObject(vo);
		String jsonString=jsonObject.toString(); //Vo에서 가져와 사용한다
		
		response.setContentType("application/json; charset=utf-8");
		PrintWriter pw=response.getWriter();
		pw.println(jsonString);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
