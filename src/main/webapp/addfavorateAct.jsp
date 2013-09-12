<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.kai.mavenspring.bean.Favorate" %>
<%@ page import="com.kai.mavenspring.idao.IFavorateDAO" %>
<%@ page import="com.kai.mavenspring.dao.JDBCFavorateDAO" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.kai.mavenspring.mybatis.dao.FavorateMapper" %>
<%
request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String location = request.getParameter("location");
	String address = request.getParameter("address");
	String tel = request.getParameter("tel");
	String url = request.getParameter("url");
	
	Favorate favorate = new Favorate();
	favorate.setName(name);
	favorate.setLocation(location);
	favorate.setAddress(address);
	favorate.setTel(tel);
	favorate.setUrl(url);
	
	WebApplicationContext ctx = WebApplicationContextUtils
		.getRequiredWebApplicationContext(this.getServletContext());
	//IFavorateDAO ifDao = (IFavorateDAO)ctx.getBean("JDBCFavorateDAO");
	//ifDao.insert(favorate);
	
	FavorateMapper favorateMapper = (FavorateMapper)ctx.getBean("favorateMapper");
	favorateMapper.insert(favorate);
	
	response.sendRedirect("addfavorate.jsp");
%>