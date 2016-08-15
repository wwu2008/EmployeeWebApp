<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Employee search result</title>
</head>
<body>
<h1>
	Employee Search result:   
</h1>

<br></br>

<c:choose>
<c:when test="${empty employee}">
<p>There are no employee in system yet.</p>
</c:when>
<c:otherwise>
<table border="1">
<tr>
<td>EmployeeId</td>
<td>First Name</td>
<td>Last Name</td>
<td>Address</td>
<td>Phone</td>
</tr>
<c:forEach items="${employee}" var="eachEmployee" >
<tr valign="top">
<td>${eachEmployee.employeeId}</td>
<td>${eachEmployee.fisrtName}</td>
<td>${eachEmployee.lastName}</td>
<td>${eachEmployee.address}</td>
<td>${eachEmployee.phone}</td>
<%-- The c:out will escape html/xml characters. --%>
<td><pre><c:out value="${eachEmployee.text}"/></pre></td>
</tr>
</c:forEach>
</table>
</c:otherwise>
</c:choose>