<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head></head>
<title>Employee</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/style.css" />">
</head>
<body>
	<h1>Welcome to Employee Management Page</h1>
	<a href="<c:url value="/searchEmployee" />">Find Employee</a> |
	<a href="<c:url value="/deleteEmploee" />">Delete Employee</a>
</body>
</html>