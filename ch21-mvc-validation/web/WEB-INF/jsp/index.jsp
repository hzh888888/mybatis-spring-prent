<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-11-13
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .input{
            border: none;
            font-family: 隶书;
            color:red;
        }
    </style>
</head>
<body>

    <form action="add" method="get">
        <input type="text" name="id"><input type="text" value="${id}" class="input"><br>
        <input type="text" name="sysUsername"> <input type="text" value="${sysUsername}" class="input"><br>
        <input type="text" name="age"> <input type="text" value="${sysUsername}"  class="input"><br>
        <button type="submit">提交</button>
    </form>
</body>
</html>
