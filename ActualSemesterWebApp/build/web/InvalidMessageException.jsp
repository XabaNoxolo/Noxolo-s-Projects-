<%-- 
    Document   : InvalidMessageException
    Created on : Mar 30, 2026, 7:02:49 PM
    Author     : xaban
--%>

<%@page isErrorPage="true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invalid Message Error</title>
    </head>
    <body>
        <p><%=request.getAttribute("error")%></p>
        <a href="analyze.jsp">Try Again</a>
    </body>
</html>
