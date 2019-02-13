package com.douzone.mysite.controller.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.mysite.vo.UserVo;

import net.sf.json.JSONArray;


@WebServlet("/ajax3")
public class AjaxServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//java Collection(List) -> JSON
		List<UserVo> list=new ArrayList<UserVo>();
		//List를 UserVO를 이용해 생성해준다.
		
		
		UserVo vo1=new UserVo();
		vo1.setNo(10);
		vo1.setName("둘리");
		vo1.setEmail("dooly@gmial.com");
		vo1.setGender("male");
		//v1에 저장된 내용들을 가지고 list에 add시켜준다.
		list.add(vo1);
		
		UserVo vo2=new UserVo();
		vo2.setNo(20);
		vo2.setName("마이콜");
		vo2.setEmail("mycall@gmial.com");
		vo2.setGender("male");
		//v1과 마찬가지로 list에 add시켜준다.
		list.add(vo2);
		
		//Json내용을 Array시켜주기 때문에 JSONArray로 list를 만들어 jsonArray에 저장
		JSONArray jsonArray=JSONArray.fromObject(list);
		//json내용을 String으로 변환
		String jsonString=jsonArray.toString();
		
		response.setContentType("application/json; charset=utf-8");
		PrintWriter pw=response.getWriter();
		pw.println(jsonString); //json내용을 print해준다.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
