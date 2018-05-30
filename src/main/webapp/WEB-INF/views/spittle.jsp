<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
    <title>The First Spittle</title>
</head>
<body>
    <div class="spittleMessage">
        <div class="spittleMessage"> <c:out value="${spittle.message}"/> </div>
        <div>
            <span class="spittleTime"> <c:out value="${spittle.time}"/> </span>
        </div>
    </div>
</body>
</html>
