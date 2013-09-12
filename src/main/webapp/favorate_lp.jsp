<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.kai.mavenspring.idao.IFavorateDAO" %>
<%@ page import="com.kai.mavenspring.bean.Favorate" %>
<%@ page import="com.kai.mavenspring.mybatis.dao.FavorateMapper" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	WebApplicationContext ctx = WebApplicationContextUtils
		.getRequiredWebApplicationContext(this.getServletContext());
	//IFavorateDAO ifDao = (IFavorateDAO)ctx.getBean("JDBCFavorateDAO");
	//List<Favorate> list = ifDao.findAll(10, 1);
	
	FavorateMapper favorateMapper = (FavorateMapper)ctx.getBean("favorateMapper");
	List<Favorate> list = favorateMapper.getFavorates();

	
	System.out.println("jsp list size:"+list.size());
	request.setAttribute("favorateList", list);
	
	System.out.println("url:" + list.get(1).getUrl());
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table style="width: 95%" class="listTb">
	<tr>
		<th>序號</th>
		<th>名稱</th>
		<th>位置</th>
		<th>地址</th>
		<th>電話</th>
		<th>URL</th>
	</tr>
	<c:forEach var="favorate" items="${favorateList}">
	<tr>
		<td style="height: 23px"><c:out value="${favorate.id }" /></td>
		<td style="height: 23px"><c:out value="${favorate.name }" /></td>
		<td style="height: 23px"><c:out value="${favorate.location }" /></td>
		<td style="height: 23px"><c:out value="${favorate.address }" /></td>
		<td style="height: 23px"><c:out value="${favorate.tel }" /></td>
		<td style="height: 23px"><c:out value="${favorate.url }" /></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>