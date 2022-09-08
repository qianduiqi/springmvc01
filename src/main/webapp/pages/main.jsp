<%--
  Created by IntelliJ IDEA.
  User: 18493
  Date: 2022/8/16
  Time: 上午 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<video width="800" height="400" controls="controls" autoplay="autoplay" muted="muted">
    <source src="/img/123.mp4" type="video/mp4" />
</video>



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
