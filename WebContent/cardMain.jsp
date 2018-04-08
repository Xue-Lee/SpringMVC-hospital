<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>挂号</h2>
<hr>
<form action="cardLogin.do" method="post">
<table align="center">
	<tr><td>卡号</td><td><input type="text" name="cardId" value="${card.cardId }" readonly="readonly"/></td></tr>
	<tr>
		<td>医生</td>
		<td>
		<select name="doctorId">
			<option>请选择医生...</option>
			<c:forEach items="${docList }" var="doc">
			<option value="${doc.doctorId }">${doc.doctorName }</option>
			</c:forEach>
		</select>
		</td>
	</tr>
	<tr><td>挂号费</td><td><input type="text" name="clinicMoney" value="0"/></td></tr>
	<tr><td colspan="2"><input type="submit" value="登录"/></td></tr>
</table>
</form>

</body>
</html>