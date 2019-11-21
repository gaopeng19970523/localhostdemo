package com.tedu.req;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		System.out.println("RequestDemo2.doGet()...");
		
		//往request对象中的map集合存入到一个属性
		request.setAttribute("name", "陈子书");
		
		//将请求从ResquestDemo2转发到index.jsp
		//相对访问路劲
		request.getRequestDispatcher("index.jsp").forward(request, response);
		//request.getRequestDispatcher("day09/index.jsp").forward(request, response);//失败
		
		//response.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}

