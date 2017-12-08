<%--
  Created by IntelliJ IDEA.
  User: Fran
  Date: 12/7/2017
  Time: 12:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Entry Way</title>
</head>
<body>

    <h1> Sign In Page</h1>
    <form action="/inlog" method="post">
        USERNAME: <input type="text" name="signonname" width="30"/>
        PASSWORD: <input type="password" name="password" width="10"/>
        <input type="submit" value="access"/>
    </form>
<p style="color:red;">${errorMessage}</p>


</body>
</html>
