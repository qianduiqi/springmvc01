<%--
  Created by IntelliJ IDEA.
  User: 18493
  Date: 2022/8/16
  Time: 下午 2:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
            <a href="${pageContext.request.contextPath}/empl/saveUI" style="text-decoration-line: none">添加员工信息</a>
            <form action="${pageContext.request.contextPath}/empl/list">
                <input type="text" name="name" value="" placeholder="在这里根据姓名来搜索">
<%--                <input type="text" name="type" value="" >--%>
                <input type="submit" value="搜索" ></input>

            </form>

           <table border="1" id="tb" >
               <tr>
                   <td><a href="#" onclick="toDelete()">批量删除</a></td>
                   <td>ID</td>
                   <td>姓名</td>
                   <td>性别</td>
                   <td>电话</td>
                   <td>出生日期</td>
                   <td>状态</td>
                   <td>星座</td>
                   <td>部门</td>
                   <td>小组</td>
                   <td>城市</td>
                   <td>标签</td>
                   <td>操作</td>

               </tr>

               <c:forEach items="${pageInfo.list}" var="empl">
               <tr>
                   <td><input type="checkbox" id="case" ></td>
                   <td><input type="text" value="${empl.id}"></td>
                   <td>${empl.name}</td>
                   <td>${empl.sex}</td>
                   <td>${empl.phone}</td>
                   <td><fmt:formatDate value="${empl.birth}" pattern="yyyy-MM-dd"/></td>

                   <td>${empl.state}</td>
                   <td>${empl.star}</td>
                   <td>${empl.dept.name}</td>
                   <td>${empl.group.name}</td>
                   <td>${empl.city.name}</td>
                   <td>
                       <c:forEach items="${empl.tagList}" var="tag">
                           ${tag.name}
                       </c:forEach>
                   </td>
                   <td><a href="${pageContext.request.contextPath}/pages/employee-change.jsp?name=${empl.name}" style="text-decoration-line: none">修改</a>
                       <a href="${pageContext.request.contextPath}/empl/del?eid=${empl.id}" style="text-decoration-line: none">删除</a></td>

               </tr>
               </c:forEach>
           </table>

            <a href="${pageContext.request.contextPath}/empl/list?name=<%= session.getAttribute("searchName")%>" aria-label="Previous">首页</a>
            <a href="${pageContext.request.contextPath}/empl/list?currentPage=${pageInfo.currentPage-1}&name=<%= session.getAttribute("searchName")%>">上一页</a>
            <c:forEach begin="1" end="${pageInfo.totalPage}" var="pageNum">
                <a href="${pageContext.request.contextPath}/empl/list?currentPage=${pageNum}&name=<%= session.getAttribute("searchName")%>">${pageNum}</a>
            </c:forEach>
            <a href="${pageContext.request.contextPath}/empl/list?currentPage=${pageInfo.currentPage+1}&name=<%= session.getAttribute("searchName")%>">下一页</a>
            <a href="${pageContext.request.contextPath}/empl/list?currentPage=${pageInfo.totalPage}&name=<%= session.getAttribute("searchName")%>" aria-label="Next">尾页</a>

            <br>
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
