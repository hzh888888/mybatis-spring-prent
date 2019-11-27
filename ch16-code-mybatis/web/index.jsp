<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>
            首页
        </title>
        <style>
            ul{
                list-style-type: none;
                display: inline-flex;
            }
            li{
                margin-left: 10px;
            }
        </style>
    </head>

    <body>
            <table border="1">
                <tr>
                    <th>ID</th>
                    <th>姓名</th>
                </tr>

                <c:forEach items="${pageInfo.list}" var="employee">
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.username}</td>
                    </tr>
                </c:forEach>
            </table>

            <a href="${pageContext.request.contextPath}/index?pageNum=1$pageSize=${pageInfo.pageSize}">首页</a>
            <a href="${pageContext.request.contextPath}/index?pageNum=${pageInfo.prePage}&pageSize=${pageInfo.pageSize}">上一页</a>
            <a href="${pageContext.request.contextPath}/index?pageNum=${pageInfo.nextPage}&pageSize=${pageInfo.pageSize}">下一页</a>
            <a href="${pageContext.request.contextPath}/index?pageNum=${pageInfo.pages}&pageSize=${pageInfo.pageSize}">尾页</a>
            <br>

            <ul>
                <c:forEach items="${pageInfo.navigatepageNums}" var="num">
                    <li>
                        <a href="${pageContext.request.contextPath}/index?pageNum=${num}&pageSize=${pageInfo.pageSize}">${num}</a>
                    </li>
                </c:forEach>
            </ul>
    </body>
</html>