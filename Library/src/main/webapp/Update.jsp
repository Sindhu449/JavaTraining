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
<%
Books books = new Books();
%>
     <form method="get" action="Menu.jsp">
     <center>
     BookId :
     <input type="number" name="id" value="<%=request.getParameter("id") %>"/><br/><br/>
     Book Name :
     <input type="text" name="name" value="<%=request.getParameter("name")%>"/><br/><br/>
     Book Author :
     <input type="text" name="author" value="<%=request.getParameter("author")%>"/><br/><br/>
     Book Edition :
     <input type="text" name="edition" value="<%=request.getParameter("edition")%>"/><br/><br/>
     Book Department :
     <input type="text" name="dept" value="<%=request.getParameter("dept")%>"/><br/><br/>
     No Of Books :
     <input type="number" name="noOfBooks" value="<%=request.getParameter("noOfBooks") %>"/><br/><br/>
     <input type="submit" value ="Update">
     </center>
     </form>
     <%
	if (request.getParameter("id")!=null) {
		LibraryDAO dao = new LibraryDAO();
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