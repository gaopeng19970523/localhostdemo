package com.tedu.res;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		System.out.println("ResponseDemo2.doGet()...");
		//1.同一个Web应用内的资源进行重定向
		//从day10/ResponseDemo2-->day10/index.jsp
		//从day10/ResponseDemo2-->day10/index.jsp
		
		//2.不同的Web应用内的资源进行重定向
		//从day10/ResponseDemo2-->day09/index.jsp
		//response.sendRedirect("/day09/index.jsp");
		
		//3.不同的虚拟主机内的资源进行重定向
		//从day10/ResponseDemo2-->http://tmooc.cn
		response.sendRedirect("http://tmooc.cn");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
