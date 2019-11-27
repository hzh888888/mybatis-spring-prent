<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-11-11
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="get" action="list">

    <input type="text" name="userInfos[0].id"/>
    <input type="text" name="userInfos[0].sysUserInfo"/>
    <input type="text" name="userInfos[0].age"/>

    <input type="text" name="userInfos[1].id"/>
    <input type="text" name="userInfos[1].username"/>
    <input type="text" name="userInfos[1].gender"/>

    <input type="submit" value="tijiao"/>
</form>
        <form>
            <input type="text" value="${userInfo.id}">
            <input type="text" value="${userInfo.sysUserInfo}">
            <input type="text" value="${userInfo.age}">
        </form>

    <form method="get" action="list2">
        <input type="text" name="name">
        <input type="text" name="name">
        <input type="text" name="name">

        <button type="submit" >添加</button>
    </form>
</body>
</html>
