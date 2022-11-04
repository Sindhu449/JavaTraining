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

<jsp:useBean id="beanDao" class="com.infinite.canteen.MainProg"/>
	<c:set var="menu" value="${param.id}"></c:set>
	<c:if test="${menu_id!=null}">
		<c:set var="menu" value="${beanDao.searchMenu(menu_id)}"/>
		<c:if test="${rest_id!=null}">
		Menu Id    : <b>
			<c:out value="${menu.menu_id}"/></b> <br/>
		Rest Id    : <b>
			<c:out value="${menu.rest_id}"/></b> <br/>
		Menu Item  : <b>
			<c:out value="${menu.menu_item}"/></b> <br/>
		Menu Price : <b>
			<c:out value="${menu.menu_price}"/></b> <br/>
		Menu Type  : <b>
			<c:out value="${menu.menu_type}"/></b> <br/>
			</c:if>
			</c:if>	<table border="3" align="center">
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
		<td><a href="Search.jsp?id=${menu.menu_id}"> Restaurant </a></td>
	</tr>
	</c:forEach>
	</table>
	
</body>
</html>