<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
        <th>工资</th>
        <th>日期</th>
        <th>性别</th>
        <th>姓名</th>
        <th>部门</th>
        <th>操作</th>
    </tr>

    <c:forEach items="${pageInfo.list}" var="employee">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.salary}</td>
            <td>${employee.hiredate}</td>
            <td>${employee.gender}</td>
            <td>${employee.username}</td>
            <td>${employee.deptid}</td>
            <td>
                <a href="/emp/add">添加</a>
                <a href="/dept/delete?deptid=${employee.deptid}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>

<a href="/emp/List?pageNum=1">首页</a>
<a href="/emp/List?pageNum=${pageInfo.prePage}">上一页</a>
<a href="/emp/List?pageNum=${pageInfo.nextPage}">下一页</a>
<a href="/emp/List?pageNum=${pageInfo.pages}">尾页</a>
<br>

<ul>
    <c:forEach items="${pageInfo.navigatepageNums}" var="num">
        <li>
            <a href="/emp/List?pageNum=${num}">${num}</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>
