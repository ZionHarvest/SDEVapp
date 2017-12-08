<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Fran
  Date: 12/7/2017
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>SDEV Web Application</title>
  </head>
  <body>
<h1> Web application (JSP) </h1>

<p> web and JSP page.</p>
<%
  Date date = new Date();
  out.print("<h2>" + date.toString() + "<h2>");
%>
  </body>
</html>
