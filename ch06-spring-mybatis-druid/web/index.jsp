<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1">
    <tr>
        <th>序号</th>
        <th>ID</th>
        <th>名字</th>
    </tr>
    <c:forEach items="${emp}" var="emp1" varStatus="c">
        <tr>
            <td>${c.count}</td>
            <td>${emp1.id}</td>
            <td>${emp1.username}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
