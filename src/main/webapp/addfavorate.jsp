<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
新增一筆資料
<form action="addfavorateAct.jsp">
name:<input type="text" name="name" /><br>
location:<input type="text" name="location" /><br>
address:<input type="text" name="address" /><br>
tel:<input type="text" name="tel" /><br>
url:<input type="text" name="url" /><br>
<input type="submit" value="submit"/>
</form>
檢視條列清單:<form action="favorate_lp.jsp"><input type="submit" value="檢視"></input></form>
</body>
</html>