
<%--
  Created by IntelliJ IDEA.
  User: 18493
  Date: 2022/8/19
  Time: 下午 2:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
    <style>

        #foot {
            height: 40px;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div id="app">
    <div style="display: inline-block">


        <jsp:include page="aside.jsp"></jsp:include>

        <div id="cont" style="float: left;margin-top: 200px;margin-left: 200px">

         <form action="${pageContext.request.contextPath}/empl/change">
             <p>这里是修改页面</p>
             <input type="text" name="name" value="${param.name}" placeholder="在这里输入要修改的姓名"><br>
             <input type="text" name="sex" placeholder="在这里输入要修改的性别"><br>
             <input type="text" name="phone" placeholder="在这里输入要修改的电话"><br>
             <input type="text"  name="birth" placeholder="在这里输入要修改的生日"><br>
             <input type="text" name="state" placeholder="在这里输入要修改的状态"><br>
             <input type="text" name="star" placeholder="在这里输入要修改的星座"><br>

             <input type="submit" value="提交">

         </form>


        </div>
    </div>
    <footer style="">
        <div id="foot" style="float: right;margin-top: 200px">
            <strong><a style="text-decoration-line: none" href=""> sfddsf</a></strong>&nbsp;&nbsp;&nbsp;All rights
            reserved. <b>Version</b>1.0

        </div>
    </footer>
</div>
</body>
</html>
