<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beanDao" class="com.infinite.emp.EmployDAO" />

<form method="get" action="ApplyLeave.jsp">
	
	 Enter Employ Number :
	 <input type="number" name="empno"><br/><br/>
	 Enter Leave Start :
	 <input type="date" name="lEAVE_START_DATE"><br/><br/>
	 Enter Leave End :
	 <input type="date" name="lEAVE_END_DATE"><br/><br/>
	 Enter Leave Reason :
	 <input type="text" name="lEAVE_REASON"><br/><br/>
	 
	 <input type="submit" value="Submit"><br/><br/>
	
</form>

<c:if test="${param.lEAVE_REASON != null}">

<c:if test="${param.lEAVE_REASON != null}">
	<jsp:useBean id="leaveTable" class="com.infinite.emp.LeaveTable" />
	<jsp:setProperty property="empno" name="leaveTable"/>
	
	
	<fmt:parseDate value="${param.lEAVE_START_DATE}" pattern="yyyy-MM-dd" var="cdate1"/>
		<c:set var="sqlDate1" value="${beanDao.convertDate(cdate1)}"/>
		
		<fmt:parseDate value="${param.lEAVE_END_DATE}" pattern="yyyy-MM-dd" var="cdate2"/>
		<c:set var="sqlDate2" value="${beanDao.convertDate(cdate2)}"/>
		
	<jsp:setProperty property="lEAVE_START_DATE" name="leaveTable" value="${sqlDate1}"/>	
	<jsp:setProperty property="lEAVE_END_DATE" name="leaveTable" value="${sqlDate2}"/>	
		
		<jsp:setProperty property="lEAVE_REASON" name="leaveTable"/>
	
	<c:out value="${beanDao.applyLeave(leaveTable)}"></c:out>
	</c:if>
</c:if>
</body>
</html>