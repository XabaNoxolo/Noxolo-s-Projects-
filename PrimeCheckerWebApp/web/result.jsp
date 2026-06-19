<%-- 
    Document   : result
    Created on : Apr 26, 2026, 7:23:31 PM
    Author     : xaban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Page</title>
    </head>
    <body>
        <h1>results: </h1>
        <%
            Boolean result = (Boolean)request.getAttribute("result");
            int num = (Integer)request.getAttribute("num");
        %>
        <% 
            if(result == true){
        %>
        <p>
            <%=num%> is a prime.
        </p>
        <% 
            }else {
        %>
        <p>
            <%=num%> is not prime.
        </p>
        <% 
            }
        %>
        <p>
            Click <a href="index.html"> here</a> to go back.
        </p>
        
    </body>
</html>
