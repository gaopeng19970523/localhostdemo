package com.tedu.res;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*1.通知服务器使用utf-8发数据给浏览器
		 *2.还要通知浏览器使用utf-8接收服务器发送过来的数据*/
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//out.write("Hello");
		out.write("您好！！！");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
