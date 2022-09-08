<%--
  Created by IntelliJ IDEA.
  User: 18493
  Date: 2022/8/16
  Time: 上午 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>登录系统</p>
<form action="${pageContext.request.contextPath}/user/login">
    <input type="text" name="name" placeholder="用户名">
    <input type="text" name="pwd" placeholder="密码">
    <input type="submit" value="登录"></input>
</form>
<a href="change.jsp" style="text-decoration-line: none">忘记密码？点我</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="register.jsp" style="text-decoration-line: none">没有账号？点我</a>

</body>
</html>
