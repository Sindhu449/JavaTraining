<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beanDao" class="com.infinite.canteen.RestaurantDAO"/>
	<table border="3" align="center">
	<tr>
		
		<th>Restaurant Name</th>
		
	</tr>
	<c:forEach var="rest" items="${beanDao.showRest()}">
	
	<tr>
			
			<td>${rest.name}</td>
	</tr>
	</c:forEach>
	</table>
	
</body>
</html>