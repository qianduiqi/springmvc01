
<%--
  Created by IntelliJ IDEA.
  User: 18493
  Date: 2022/8/19
  Time: 下午 2:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
            <p>这里是添加页面</p>
         <form action="${pageContext.request.contextPath}/empl/add">
             <input type="text" name="name"  placeholder="姓名"><br>
             <input type="text" name="sex" placeholder="性别"><br>
             <input type="text" name="phone" placeholder="电话"><br>
             <input type="text"  name="birth" placeholder="生日"><br>
             <input type="text" name="state" placeholder="状态"><br>
             <input type="text" name="star" placeholder="星座"><br>


             <c:forEach items="${tagList}" var="tag">
                 <input type="checkbox" name="tagIds" value=<c:out value="${tag.id}"/>><c:out value="${tag.name}"/>
             </c:forEach><br>

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