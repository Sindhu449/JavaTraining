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
	<c:set var="emp_Id" value="${param.id}"></c:set>
	<h3>Employ Details....</h3><br/><br/>
	<c:if test="${emp_Id!=null}">
	<c:set var="emp_Id" value="${param.id }"/>
		<c:set var="employ" value="${beanDao.searchEmploy(emp_Id)}"/>
		<c:if test="${employ!=null}">
		Employ Id : <b>
			<c:out value="${employ.EMP_ID}"/></b> <br/>
		Employ Name : <b>
			<c:out value="${employ.EMP_NAME}"/></b> <br/>
		Employ Mail : <b>
			<c:out value="${employ.EMP_MAIL}"/></b> <br/>
		Employ Mobile Number : <b>
			<c:out value="${employ.EMP_MOB_NO}"/></b> <br/>
		Employ Date of Join : <b>
			<c:out value="${employ.EMP_DT_JOIN}"/></b> <br/>
		Employ Department : <b>
			<c:out value="${employ.EMP_DEPT}"/></b> <br/>
		Employ Manager Id : <b>
			<c:out value="${employ.EMP_MANAGER_ID}"/></b> <br/>
		Employ Available leave : <b>
			<c:out value="${employ.EMP_AVAIL_LEAVE_BAL}"/></b> <br/>
			<c:out value="...................................................................."/>
			<br/><br/>
			</c:if>
			</c:if>	
	<c:set var="Manager_ID" value="${param.Manager_Id}"/>
	<h3>Manager Details.... </h3>
	<c:if test="${Manager_ID!=null}">
		<c:set var="employ1" value="${beanDao.searchEmploy(Manager_ID)}"/>
		<c:if test="${employ1!=null}">
		Employ Id : <b>
			<c:out value="${employ1.EMP_ID}"/></b> <br/>
		Employ Name : <b>
			<c:out value="${employ1.EMP_NAME}"/></b> <br/>
		Employ Mail : <b>
			<c:out value="${employ1.EMP_MAIL}"/></b> <br/>
		Employ Mobile Number : <b>
			<c:out value="${employ1.EMP_MOB_NO}"/></b> <br/>
		Employ Date of Join : <b>
			<c:out value="${employ1.EMP_DT_JOIN}"/></b> <br/>
		Employ Department : <b>
			<c:out value="${employ1.EMP_DEPT}"/></b> <br/>
		Employ Manager Id : <b>
			<c:out value="${employ1.EMP_MANAGER_ID}"/></b> <br/>
		Employ Available leave : <b>
			<c:out value="${employ1.EMP_AVAIL_LEAVE_BAL}"/></b> <br/>
			<c:out value="...................................................................."/>
			<br/><br/>
	 
	    </c:if>
		</c:if>
		   <c:if test="${Manager_ID!=null }">
	    <c:out value="No Manager Found for the employ">
	    </c:out>
	    <c:set var="emp_Id" value="${param.id}"></c:set>
		 <h3>"Leave Details"</h3>
			<c:if test="${emp_Id!=null}">
			<table border="3" align="center">
			<tr>
				<th>LEAVE_ID</th>
				<th>LEAVE_MANAGER_COMMENTS</th>
				<th>EMP_ID</th>
				<th>LEAVE_START_DATE</th>
				<th>LEAVE_END_DATE</th>
				<th>LEAVE_TYPE</th>
				<th>LEAVE_STATUS</th>
				<th>LEAVE_REASON</th>
			</tr>
			<c:forEach var="leave" items="${beanDao.searchLeave(emp_Id)}">
	
	<tr>
	<td>${leave.leave_Id}</td>
	<td>${leave.leave_ManagerComments}</td>
	<td>${leave.EMP_ID}</td>	
	<td>${leave.leave_StartDate}</td>
	<td>${leave.leave_EndDate}</td>
	<td>${leave.leave_Type}</td>
	<td>${leave.leave_Status}</td>
	<td>${leave.leave_Reason}</td>
	</tr>
	
	</c:forEach>
	</table>

</c:if>
</c:if>
</body>
</html>