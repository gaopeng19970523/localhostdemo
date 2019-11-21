package com.tedu.req;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//针对POST提交时的中文乱码问题
		request.setCharacterEncoding("utf-8");
		
		//getParamter、getParamterValues
		//获取用户名（username）
		String username = request.getParameter("username");
		System.out.println("username="+username);
		//获取爱好（like）
		String[] likes = request.getParameterValues("like");
		System.out.println(Arrays.toString(likes));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}

