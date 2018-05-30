<%--
  Created by IntelliJ IDEA.
  User: cwang6
  Date: 2017/11/19
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <h1>Recent Spittles</h1>
</head>
<body>
<div class="listTitle">
    <ul class="spittleList">
        <c:forEach items="${spittleList}" var="spittle" >
            <li id="spittle_<c:out value="spittle.id"/>">
                <div class="spittleMessage">
                    <c:out value="${spittle.message}" />
                </div>
                <div>
                    <span class="spittleTime">
                        <c:out value="${spittle.time}" />
                    </span>
                    <span class="spittleLocation">
                        (
                        <c:out value="${spittle.latitude}" />,
                        <c:out value="${spittle.longitude}" />
                        )
                    </span>
                </div>
            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
