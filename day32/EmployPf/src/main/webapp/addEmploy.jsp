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
<jsp:useBean id="dao" class="com.infinite.emp.EmployDAO" />
<form method="get" action="addEmploy.jsp">
  Employ Name      :
  <input type="text" name="ename" /><br/><br/>
  Employ Gender    :
  <input type="radio" name="gender" value="MALE"> Male
  <input type="radio" name="gender" value="FEMALE"> Female<br/><br/>
  Employ salary    :
  <input type="number" name="salary" /><br/><br/>

  <input type="submit" value="Submit" />
  
  <c:if test="${param.ename != null}">
	<jsp:useBean id="beanEmploy" class="com.infinite.emp.Employ" />
	<jsp:setProperty property="*" name="beanEmploy"/>
	<c:out value="${dao.addEmploy(beanEmploy)}"/>
</c:if>
</form>

</body>
</html>