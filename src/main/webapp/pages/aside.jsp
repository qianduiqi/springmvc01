<%--
  Created by IntelliJ IDEA.
  User: 18493
  Date: 2022/8/16
  Time: 上午 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

        <div id="side" style="width: 200px;float: left" >
            <div style="display: block;margin-top: 30px;">
                <img src="${pageContext.request.contextPath}/img/user2-160x160.jpg" width="50" height="50">


            </div>
            <div>
            <ul style="list-style-type: none;"  >

                <li style="margin-top: 20px">
                    <a href="${pageContext.request.contextPath}/empl/list?name=" style="text-decoration-line: none">
                    员工管理
                    </a>
                </li>
                <li style="margin-top: 10px">
                    <a href="${pageContext.request.contextPath}/dept/list" style="text-decoration-line: none">
                        部门管理
                    </a>
                </li>
                <li style="margin-top: 10px">
                    <a href="${pageContext.request.contextPath}/group/list" style="text-decoration-line: none">
                        小组管理
                    </a>
                </li>
                <li style="margin-top: 10px">
                    <a href="${pageContext.request.contextPath}/city/list" style="text-decoration-line: none">
                        城市管理
                    </a>
                </li >
                <li style="margin-top: 10px">
                    <a href="${pageContext.request.contextPath}/tag/list" style="text-decoration-line: none">
                        标签管理
                    </a>
                </li>
                <li style="margin-top: 10px">
                    <a href="${pageContext.request.contextPath}/pages/rizhi.jsp" style="text-decoration-line: none">
                        日志管理
                    </a>
                </li>
            </ul>
            </div>
        </div>

