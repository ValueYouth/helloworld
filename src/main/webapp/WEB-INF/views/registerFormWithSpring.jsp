<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Register Form with Spring Tag</title>
</head>
<body>
    <sf:form method="post" commandName="spitter">
        First Name: <sf:input path="firstName"/><br/>
        Last Name: <sf:input path="lastName"/><br/>
        Email: <sf:input path="email"/><br/>
        Username: <sf:input path="username"/><br/>
        Password: <sf:input path="password"/><br/>
        <input type="submit" value="Register" />
    </sf:form>
</body>
</html>
