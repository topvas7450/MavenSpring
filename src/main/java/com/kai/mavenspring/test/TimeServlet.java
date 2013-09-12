package com.kai.mavenspring.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class TimeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		WebApplicationContext ctx = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());

		PrintWriter out = res.getWriter();
		out.println(ctx.getBean("dateBean"));
	}
}
