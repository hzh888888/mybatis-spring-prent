<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-11-21
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/emp/insert">
        工资：<input type="text" name="salary"><br>
        日期：<input type="text" name="hiredate"><br>
        性别：<input type="text" name="gender"><br>
        姓名：<input type="text" name="username"><br>
        部门:<input type="text" name="deptid"><br>
        <input type="submit" value="添加">
    </form>
</body>
</html>
