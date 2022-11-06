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
  background-color: lightblue;
}

h1 {
  color: white;
  text-align: center;
}

p {
  font-family: verdana;
  font-size: 20px;
}
</style>

</head>
<body>
	<jsp:useBean id="beanDao" class="com.infinite.canteen.MainProg"/>

 <form method="get" action="ShowMenu.jsp" style="text-align: center">
	
	    Rest id:
	    <input type="text" name="rest_id" /><br/><br/>
		Menu Item :
		<input type="text" name="menu_item" /><br/><br/>
		Menu Price :
		<input type="text" name="menu_price" /><br/><br/>
		Menu Type  :
		<input type="text" name="menu_type" /><br/><br/>
		<input type="submit" value ="Submit"/><br/><br/>
	
	<c:if test="${param.menu_item != null }">
	<jsp:useBean id="beanMenu" class="com.infinite.canteen.Menu" />
	<jsp:setProperty property="*" name="beanMenu"/>
	<c:out value="${beanDao.AddMenu(beanMenu)}"/>
</c:if>
</form>
	
</body>
</html>