<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.infinite.emp.LeaveTable" %>
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
           <form action="SearchLeave.jsp" method="post">
              <input type="number" name="empno"/><br/><br/>            
               <input type='submit' value='SearchLeave' >                          
                <c:if test="${param.empno != null}">       
					<table border='3'>
                      <tr>
                      	 <th>LeaveId </th>
						 <th>Empno </th>
						 <th>LeaveStartDate</th>
		   				 <th>LeaveEndDate</th>
		   				 <th>NoOfDays</th>
		   				 <th>LeaveReason</th>
		   				 <th>lossOfPay</th>
		   				 </tr>
				<c:set var="empno" value="${param.empno}"/>
				<c:forEach var="leave" items="${beanDao.searchleave(param.empno)}">
                         <tr>
                         <td><c:out value="${leave.leave_id}"/> </td>
                         <td><c:out value="${leave.empno}"/> </td>
                         <td><c:out value="${leave.lEAVE_START_DATE}"/> </td>
                         <td><c:out value="${leave.lEAVE_END_DATE}"/> </td>
                         <td><c:out value="${leave.lEAVE_NO_OF_DAYS}"/> </td>
                         <td><c:out value="${leave.lEAVE_REASON}"/> </td>
                         <td><c:out value="${leave.lOSS_OF_PAY}"/> </td>
                         </c:forEach>
                  </c:if>
</table>  <br/> 
 </form>
</body>
</html>
