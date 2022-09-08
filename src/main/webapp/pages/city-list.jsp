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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script type="text/javascript">

        var oall=document.getElementById("all");
        var oid=document.getElementsByName("id");
        oall.onclick=function(){
            for(var i=0;i<oid.length;i++){
                //所有的选择框和全选一致
                oid[i].checked=oall.checked;
            }
        };


        //点击复选框

        <%--for (var i = 0; i < b.length; i++) {--%>
        <%--    b[i].onclick = function () {--%>
        <%--        for (var j = 0; j < b.length; j++) {--%>
        <%--            if (b[j].checked = false) {--%>
        <%--                a.checked = false;--%>
        <%--                break;--%>
        <%--            } else {--%>
        <%--                a.checked = true;--%>
        <%--            }--%>
        <%--        }--%>

        <%--    };--%>
        <%--}--%>
        <%--//点击删除--%>
        <%--${"#del"}.click(function () {--%>
        <%--    var ids = "";--%>
        <%--    var n = 0;--%>
        <%--    for (var i = 0; i < b.length; i++) {--%>
        <%--        if (b[i].length.checked == true) {--%>
        <%--            var id = b[i].value;--%>
        <%--            if (n = 0) {--%>
        <%--                ids += "ids=" + id;--%>
        <%--            } else {--%>
        <%--                ids += "&ids=" + id;--%>
        <%--            }--%>
        <%--            n++;--%>
        <%--        }--%>
        <%--    }--%>


        <%--    $.get("/city/delMany", ids, function (data) {--%>
        <%--        if (data == "\"ok\"") {--%>
        <%--            alert("删除成功");--%>
        <%--            location.href = "${pageContext.request.contextPath}/city/list";--%>
        <%--        } else {--%>
        <%--            alert("删除失败");--%>
        <%--        }--%>
        <%--    });--%>

        <%--});--%>
    </script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div id="app">
    <div style="display: inline-block">


        <jsp:include page="aside.jsp"></jsp:include>

        <div id="cont" style="float: left;margin-top: 200px;margin-left: 200px">
            <a href="${pageContext.request.contextPath}/pages/city-add.jsp"
               style="text-decoration-line: none">添加城市信息</a><br>
            <button id="del">批量删除</button>


            <table border="1">
                <tr>
                    <td><input id="all" type="checkbox" /></td>

                    <td>编号</td>
                    <td>城市名</td>


                </tr>

                <c:forEach items="${cityList}" var="city">
                    <tr>
                        <td><input name="id" type="checkbox"/></td>

                        <td>${city.id}</td>
                        <td>${city.name}</td>

                        <td>
                            <a href="${pageContext.request.contextPath}/city/del?id=${city.id}"
                               style="text-decoration-line: none">删除</a></td>

                    </tr>
                </c:forEach>
            </table>



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
