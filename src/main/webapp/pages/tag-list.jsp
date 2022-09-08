<%--
  Created by IntelliJ IDEA.
  User: 18493
  Date: 2022/8/16
  Time: 下午 2:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div id="app">
    <div style="display: inline-block">


        <jsp:include page="aside.jsp"></jsp:include>

        <div id="cont" style="float: left;margin-top: 200px;margin-left: 200px">
            <a href="${pageContext.request.contextPath}/pages/tag-add.jsp" style="text-decoration-line: none">添加标签信息</a>


            <table border="1" >
                <tr>
                    <td><input type="submit" value="批量删除"></td>

                    <td>编号</td>
                    <td>标签名</td>
                    <td>类型</td>


                </tr>

                <c:forEach items="${tagList}" var="tag">
                    <tr>
                        <td><input type="checkbox" value=""></td>

                        <td>${tag.id}</td>
                        <td>${tag.name}</td>
                        <td>${tag.type}</td>

                        <td>
                            <a href="${pageContext.request.contextPath}/tag/del?id=${tag.id}" style="text-decoration-line: none">删除</a></td>

                    </tr>
                </c:forEach>
            </table>




            <a href="" style="text-decoration-line: none">下载信息到文件</a>
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
