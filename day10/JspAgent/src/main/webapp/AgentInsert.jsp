<%@page import="com.infinite.JspAgent.Agent"%>
<%@page import="com.infinite.JspAgent.AgentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="get" action="AgentInsert.jsp">
		<center>
			Agent Id :
			<input type='number' name='number' /> <br/><br/>
			Agent Name :
			<input type='text' name='name' /> <br/><br/>
			City :
			<input type='text' name='city' /> <br/><br/>
			Gender :
			<input type="text" name="text" /> <br/><br/>
			MaritalStatus :
			<input type="number" name='number' /> <br/><br/>
			Premium :
			<input type="number" name="basic" /> <br/><br/>
			<input type="submit" value="Insert" />
		</center>
	
	</form>
	<%
	if(request.getParameter("basic")!=null){
		AgentDAO dao = new AgentDAO();
		Agent agent = new Agent();
		agent.setAgentId(Integer.parseInt(request.getParameter("AgentId")));
		agent.setName(request.getParameter("name"));
        agent.setCity(request.getParameter("city"));
        agent.setMaritalStatus(Integer.parseInt(request.getParameter("MaritalStatus")));
        agent.setPremium(Integer.parseInt(request.getParameter("premium")));

		dao.addAgent(agent);
	%>
		<jsp:forward page="AgentTable.jsp" />
	<%
		}
	%>

</body>
</html>