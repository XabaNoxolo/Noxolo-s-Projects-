<%-- 
    Document   : EmptyDataException
    Created on : Mar 30, 2026, 6:49:15 PM
    Author     : xaban
--%>

<%@page isErrorPage="true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empty Data Error Page</title>
    </head>
    <body>
       <p><%=request.getAttribute("error")%></p>
       <a href="analyze.jsp">Try Again</a>
    </body>
</html>
