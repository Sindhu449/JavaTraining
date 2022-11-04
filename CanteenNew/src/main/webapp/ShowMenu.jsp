<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  background-color: ;
}

h1 {
  color: white;
  text-align: center;
}

p {
  font-family: Italic;
  font-size: 20px;
}
</style>

</head>
<body>
<form action="get" action="ShowMenu.jsp">
<center>
<h1> Menu Details </h1>
</center>
</form>
<jsp:useBean id="beanDao" class="com.infinite.canteen.MainProg"/>
	<table border="3" align="center">
	<tr>
		<th>Menu Id</th>
		<th>Rest Id</th>
		<th>Menu Item</th>
		<th>Menu Price</th>
		<th>Menu Type</th>
	</tr>
	<c:forEach var="menu" items="${beanDao.showMenu()}">
	
	<tr>
		<td>${menu.menu_id}</td>
		<td>${menu.rest_id}</td>
		<td>${menu.menu_item}</td>
		<td>${menu.menu_price}</td>
		<td>${menu.menu_type}</td>
		<td><a href="Search.jsp?id=${menu.rest_id }">Search Items </a></td>
		
	</tr>
	</c:forEach>
	</table>
	
</body>
</html>