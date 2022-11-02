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
<jsp:useBean id="beanDao" class="com.infinite.hib.EmployDAO"/>
	<table border="3" align="center">
	<tr>
		<th>Employ ID</th>
		<th>Employ Name</th>
		<th>Employ Mail</th>
		<th>Employ Mobile no</th>
		<th>Employ Date of join</th>
		<th>Employ Department</th>
		<th>Employ Manager Id</th>
		<th>Employ Leave Available</th>
	</tr>
	<c:forEach var="employ" items="${beanDao.showEmploy()}">
	
	<tr>
	
			<td>${employ.EMP_ID}</td>
			<td>${employ.EMP_NAME}</td>
			<td>${employ.EMP_MAIL}</td>
			<td>${employ.EMP_MOB_NO}</td>
			<td>${employ.EMP_DT_JOIN}</td>
			<td>${employ.EMP_DEPT}</td>
			<td>${employ.EMP_MANAGER_ID}</td>
			<td>${employ.EMP_AVAIL_LEAVE_BAL}</td>
			<td><a href="Search.jsp?id=${employ.EMP_ID }&Manager_Id=${employ.EMP_MANAGER_ID}">Search Items </a></td>
	</tr>
	</c:forEach>
	</table>
	
</body>
</html>