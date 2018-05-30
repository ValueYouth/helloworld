<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page contentType="text/html;charset=UTF-8" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<h1>Register</h1>--%>
    <%--<form method="POST">--%>
        <%--First Name: <input type="text" name="firstName" /><br/>--%>
        <%--Last Name: <input type="text" name="lastName" /><br/>--%>
        <%--Email: <input type="email" name="email" /><br/>--%>
        <%--Username: <input type="text" name="username" /><br/>--%>
        <%--Password: <input type="password" name="password" /><br/>--%>
        <%--<input type="submit" value="Register" />--%>
    <%--</form>--%>

    <sf:form method="post" commandName="spitter">
        First Name: <sf:input path="firstName"/><br/>
            <sf:errors path="firstName" cssClass="error"/><br/>
        Last Name: <sf:input path="lastName"/><br/>
        Email: <sf:input path="email" type="email"/><br/>
        Username: <sf:input path="username"/><br/>
        Password: <sf:password path="password"/><br/>
        <input type="submit" value="Register" />
    </sf:form>

</body>
</html>
