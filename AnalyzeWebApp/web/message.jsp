<%-- 
    Document   : message
    Created on : Mar 13, 2026, 1:54:36 PM
    Author     : xaban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Message Page</title>
    </head>
    <body>
        <h1>Message analysis</h1>
        <% 
           String username = (String)request.getParameter("name");
           String character = pageContext.getServletContext().getInitParameter("character");
        %>
        
        <p>
            Hello <%=username%>, this is <%=character%>.
            Please enter a short text message
        </p>
        <form action="AnalyzeServlet.do" method="POST">
            <input type="hidden" name="name" value="<%=username%>">
            
            <textarea name="message" rows="5" cols="40"></textarea>
            <input type="submit" value="ANALYZE">
        </form>
        
    </body>
</html>
