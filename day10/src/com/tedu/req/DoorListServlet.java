package com.tedu.req;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * request作为域对象的使用
 * 案例：模拟查询所有门店信息
 * 
 */

public class DoorListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//1.模拟jdbc访问数据查询所有门店信息
		List<String> doorList=new ArrayList<String>();
		doorList.add("1,永和北三环西路店,010-676767");
		doorList.add("2,永和北门直店,010-678967");
		doorList.add("3,永和东门直店,010-6767547");
		
		//2.将门店信息集合存入到request域中（map集合）
		request.setAttribute("list", doorList);
		
		//3.通过转发将请求以及域对象中的数据转向jsp
		request.getRequestDispatcher("doorList.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
