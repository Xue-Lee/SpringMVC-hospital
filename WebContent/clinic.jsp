<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${card.personName }开始挂号</h1>
	<form action="login.do" method="post">
		<table>
			<tr><td>用户ID</td><td><input type="text" name="carId"></td></tr>
			<tr><td>密码</td><td><input type="text" name="pwd"></td></tr>
			<tr><td><input type="submit" value="登录"></td></tr>
		</table>
	
	</form>
</body>
</html>