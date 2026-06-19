<%-- 
    Document   : endSession
    Created on : Mar 13, 2026, 2:58:05 PM
    Author     : xaban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>End Page</title>
    </head>
    <body>
        <% 
           session.invalidate();
           response.sendRedirect("index.jsp");
        %>
    </body>
    
</html>
