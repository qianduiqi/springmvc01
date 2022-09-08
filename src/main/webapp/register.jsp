<%--
  Created by IntelliJ IDEA.
  User: 18493
  Date: 2022/8/17
  Time: 上午 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>注册账号</p>
<form action="${pageContext.request.contextPath}/user/add">
    <input type="text" name="name" placeholder="请输入用户名">
    <input type="text" name="pwd" placeholder="请设置密码">
    <input type="submit" value="注册"></input>
</form>
</body>
</html>
