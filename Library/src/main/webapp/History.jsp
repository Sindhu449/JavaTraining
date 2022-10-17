<%@page import="com.Infinite.library.LibraryDAO"%>
<%@page import="com.Infinite.library.TransReturn"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Menu.jsp"></jsp:include>
	
	<%
	String user = (String)session.getAttribute("user");
	List<TransReturn> transReturnlist = new LibraryDAO().history(user);
	%>
	<table border="3">
	<tr>
	<th>Book Id</th>
	<th>User Name</th>
	<th>Issues On </th>
	<th>Return date</th>
	</tr>
	<%
	for(TransReturn treturn : transReturnlist){
	%>
	<tr>
	<td><%=treturn.getBookId() %></td>
	<td><%=treturn.getUserName()  %></td>
	<td><%=treturn.getFromdate() %> </td>
	<td><%=treturn.getToDate() %> </td>
	</tr>
	<%
	}
	%>
	</table>
</body>
</html>