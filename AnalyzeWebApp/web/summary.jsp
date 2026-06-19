<%-- 
    Document   : summary
    Created on : Mar 13, 2026, 2:54:22 PM
    Author     : xaban
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Summary Page</title>
    </head>
    <body>
        <h1>Summary</h1>
        <% 
           List messages = (List)session.getAttribute("messages");
           if(messages == null)
           messages = new ArrayList();
        %>
        Total Messages Analyzed: <%=messages.size()%>
        <h2>Messages: </h2>
        <% 
          for(Object msg: messages){
        %>
        <p><%=msg%></p>
        <% 
            }
        %>
        <p>Click <a href="message.jsp">here</a> to enter another message
            or <a href="endSession.jsp">here</a> to end the session.
        </p>
     
    </body>
</html>
