<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	
	<c:set var="ans" value="${welcome}"></c:set>
	<c:if test="${empty ans }">

		<c:out value="${default}"></c:out>
		<p>Welcome to SpringBoot!</p>

	</c:if>
	<c:if test="${not empty ans }">

		<c:out value="${ans}"></c:out>
		<p>Welcome to SpringBoot!</p>

	</c:if>

</body>
</html>