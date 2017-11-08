<%--
  Created by IntelliJ IDEA.
  User: mustafa.tekin
  Date: 04/10/2017
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ page isELIgnored="false" %>
</head>
<body>
<h1>Spring 3 MVC REST web service</h1>

<table>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>Employee ID: <c:out value="${employee.firstName}"/></td>
            <td>Employee Pass: <c:out value="${employee.lastName}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
