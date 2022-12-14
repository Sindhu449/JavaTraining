<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.infinite.emp.Employ" %>
    <%@ page import="java.util.List" %>
     <%@ page import="com.infinite.emp.EmployDAO" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
          
     <c:set var="empno" value="${param.empno}"/>
<jsp:useBean id="beanDao" class="com.infinite.emp.EmployDAO"/>                              
     <form action="SearchEmploy.jsp" method="post">
     <input type="number" name="empno"/><br/><br/>
     <input type='submit' value='SearchEmploy' >                         
     <c:if test="${param.empno != null}">
      <table border='3'>
        <tr>
               <th>Employ No </th>
               <th>Employ Name </th>
               <th>Gender</th>
               <th>Salary</th>
               <th>hra</th>
               <th>Da</th>
               <th>Ta</th>
               <th>Tax</th>
               <th>Gross </th>
               <th>Netpay </th>
               <th>Leaveavailable </th>
        </tr>
                               
                
        <c:set var="empno" value="${param.empno}"/>
        <c:forEach var="employ" items="${beanDao.searchemploy(param.empno)}">
    <tr>
        <td><c:out value="${employ.empno}"/> </td>
        <td><c:out value="${employ.ename}"/> </td>
        <td><c:out value="${employ.gender}"/> </td>
        <td><c:out value="${employ.salary}"/> </td>
        <td><c:out value="${employ.hra}"/> </td>
        <td><c:out value="${employ.da}"/> </td>
        <td><c:out value="${employ.ta}"/> </td>
        <td><c:out value="${employ.tax}"/> </td>
        <td><c:out value="${employ.gross}"/> </td>
        <td><c:out value="${employ.netPay}"/> </td>
        <td><c:out value="${employ.leaveAvailable}"/> </td>
        <td><input type='checkbox' name="empno" value="${employ.empno}" /></td>
    </tr>
                                                
        </c:forEach>
       </c:if>                
                 
 </table><br/>
 </form>
</body>
</html>
