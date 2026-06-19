<%-- 
    Document   : error
    Created on : Mar 13, 2026, 3:08:05 PM
    Author     : xaban
--%>

<%@page isErrorPage="true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <h1>Error Page</h1>
        <p>
           Error Message: <%= exception.getMessage() %>
        </p>

    <p>
        Exception Type: <%= exception.getClass().getName() %>
    </p>

    <p>
        <a href="index.jsp">Go back to home</a>
    </p>
    </body>
</html>
