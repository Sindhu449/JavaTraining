<%@page import="com.Infinite.library.UserCr"%>
<%@page import="com.Infinite.library.LibraryDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		  <form method="get" action="User.jsp">
		<center>
			UserName : 
			<input type='text' name='userName' /> <br/><br/> 
			Password  : 
			<input type="text" name="passWord" /> <br/><Br/> 
			<input type="submit" value="Add User" /> 
		</center>
	</form>
	
		<%
	if (request.getParameter("userName")!=null && request.getParameter("passWord") != null) {
		LibraryDAO dao = new LibraryDAO();
		UserCr user = new UserCr();
		user.setUserName(request.getParameter("userName"));
		user.setPassWord(request.getParameter("passWord"));
		dao.addUser(user);
	%>
		<jsp:forward page="Menu.jsp" />
	<%
		}	
	%>
</body>
</html>