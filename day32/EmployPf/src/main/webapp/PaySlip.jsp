<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <center>
	<jsp:useBean id="dao" class="com.infinite.emp.EmployDAO" />
	<form action="PaySlip.jsp">

		Employ No: <input type="number" name="empno"><br />
		<br /> Month: <select name="month">
			<option value="01">January</option>
			<option value="02">Febrauary</option>
			<option value="03">March</option>
			<option value="04">April</option>
			<option value="05">May</option>
			<option value="06">June</option>
			<option value="07">July</option>
			<option value="08">August</option>
			<option value="09">September</option>
			<option value="10">October</option>
			<option value="11">November</option>
			<option value="12">December</option>
		</select><br />
		<br /> <input type="submit" value="Submit" /><br />
		<br />
	</form>
	</center>
</body>
<c:if test="${param.empno != null }">
	<c:set var="id" value="${param.empno}" />
	<c:set var="m" value="${param.month}" />
	<c:set var="employ" value="${dao.searchemploy(id)}" />
	<jsp:useBean id="leave" class="com.infinite.emp.LeaveTable" />
	<c:set var="pay" value="${dao.lOSS_OF_PAY(id,m)}" />
	<center><h3>Employ Id:${id}</h3></center>
	<table style="width: 80%">
		<tr>
			<th></th>

			<th></th>
		</tr>

		<tr>
			<td><b>Earned Salary
				<hr></b>
			</td>
			<td><b>Deducted Salary
				<hr></b>
			</td>
		</tr>
		<tr>
			<td>Basic Salary:${employ.salary}</td>
			<td>Persnal Funds:${employ.pf}</td>
		</tr>
		<tr>
			<td>HRA:${employ.hra}</td>
			<td>Tax:${employ.tax}</td>
		</tr>
		<tr>
			<td>DA:${employ.da}</td>
			<td>Loss Of Pay:${pay}</td>
		</tr>
		<tr>
			<td>TA:${employ.ta}</td>

		</tr>

		<tr>
			<td><hr><b>Total Income: ${employ.gross}</b>
				<hr></td>
			<td><hr><b>Total Deduction:<c:out
					value="${employ.pf+employ.tax+pay }" />
				</b><hr></td>
		</tr>
		<tr>
			<c:set var="total" value="${employ.pf+employ.tax+pay }" />
			<td>Net Pay :<c:out value="${employ.gross-total}" /></td>
		</tr>

	</table>
</c:if>
</html>