<%-- 
    Document   : FileNotFoundException
    Created on : Mar 30, 2026, 6:59:44 PM
    Author     : xaban
--%>

<%@page isErrorPage="true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>File Not Found</title>
    </head>
    <body>
        <p><%=request.getAttribute("error")%></p>
        <a href="analyze.jsp">Try Again</a>
       
    </body>
</html>
