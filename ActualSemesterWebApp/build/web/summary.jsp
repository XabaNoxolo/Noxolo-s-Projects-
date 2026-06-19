<%-- 
    Document   : summary
    Created on : Mar 30, 2026, 6:24:10 PM
    Author     : xaban
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Summary Page</title>
    </head>
    <body>
     <% 
        List messages = (List)session.getAttribute("messages");
        if(messages == null) messages = new ArrayList();
        String name = (String)request.getAttribute("name");
        String character = pageContext.getServletContext().getInitParameter("character");
     %>
     <p>
         Hi <%=name%> this is <%=character%> this is your summary.
         Total messages : <%=messages.size()%>
         
     </p>
     <% 
        for(Object m: messages){
     %>
     <p>
         <%=m%>
     </p>
     <% 
         }
     %>
     <p>
         Click <a href="index.html">Home</a>
     </p>
    
    </body>
</html>
