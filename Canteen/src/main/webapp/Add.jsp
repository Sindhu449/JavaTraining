<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="">
			Name : 
			<input type="text" name="name"/><br/><br/> 
			City : 
			<input type="text" name="city"/> <br/><br/>
			State : 
			<input type="text" name="state"/> <br/><br/>
			Pincode:
			<input type="number" name="pincode"/> <br/><br/>
			Email:
			<input type="text" name="email"/> <br/><br/>
			Mobile Number:
			<input type="text" name="mobilenumber"/> <br/><br/>
			User Name:
			<input type="text" name="username"/> <br/><br/>
			Password:
			<input type="text" name="password"/> <br/><br/>
			<input type="submit" value="Add"/> 
	</form>

	<c:if test="${param.email!=null}">
		<jsp:useBean id="resturant" class="com.infinite.canteen.Restaurant" />
		<jsp:useBean id="dao" class="com.infinite.canteen.RestaurantDAO"/>
		<jsp:setProperty property="*" name="resturant"/>
		<c:out value="${dao.addResturant(resturant)}" />
	</c:if>
	
</body>
</html>