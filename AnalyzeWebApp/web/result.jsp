<%-- 
    Document   : result
    Created on : Mar 13, 2026, 2:51:45 PM
    Author     : xaban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Message Analysis Result Page</title>
    </head>
    <body>
        <h1>Message Analysis Result</h1>
        <% 
           
          Integer length = (Integer)session.getAttribute("length");
          Integer words = (Integer)session.getAttribute("words");
          Integer frequency = (Integer)session.getAttribute("frequency");
          Integer commas = (Integer)session.getAttribute("commas");
          Integer fullStops = (Integer)session.getAttribute("fullStops");
          
          String error = (String)request.getAttribute("error");
        %>
        <% if (error != null) { %>
           <p><%=error%></p>
        <% } else { %>
            <p>Length: <%=length%></p>
            <p>Words: <%=words%></p>
            <p>Frequency: <%=frequency%>%</p>
            <p>Commas: <%=commas%></p>
            <p>Full Stops: <%=fullStops%></p>
        <% } %>
        <p>
            Click <a href="message.jsp">here</a> to enter another message
            or <a href="summary.jsp">here</a> to view summary.
        </p>
    </body>
</html>
