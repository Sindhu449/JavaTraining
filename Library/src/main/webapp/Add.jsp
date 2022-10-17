<%@page import="com.Infinite.library.Books"%>
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
       <form method="get" action="Add.jsp">
		<center>
			Book Name : 
			<input type='text' name='name' /> <br/><br/> 
			Author  : 
			<input type="text" name="author" /> <br/><Br/> 
			Edition : 
			<input type="text" name='edition' /> <br/><br/>
			Department : 
			<input type="text" name='dept' /> <br/><br/>
			No Of Books : 
			<input type="number" name='noOfBooks' /> <br/><br/>
			<input type="submit" value="Add" /> 
		</center>
	</form>
	<%
	if (request.getParameter("noOfBooks")!=null) {
		LibraryDAO dao = new LibraryDAO();
		Books books = new Books();
		books.setName(request.getParameter("name"));
		books.setAuthor(request.getParameter("author"));
		books.setEdition(request.getParameter("edition"));
		books.setDept(request.getParameter("dept"));
		books.setNoOfBooks(Integer.parseInt(request.getParameter("noOfBooks")));
		dao.addBook(books);
	%>
		<jsp:forward page="Menu.jsp" />
	<%
		}	
	%>
       
      
</body>
</html>