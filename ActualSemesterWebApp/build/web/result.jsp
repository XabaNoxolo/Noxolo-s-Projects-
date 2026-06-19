<%-- 
    Document   : result
    Created on : Mar 30, 2026, 6:22:31 PM
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

        <h1>Message analysis result</h1>
         <%
             int length = (Integer)request.getAttribute("length");
             int commas = (Integer)request.getAttribute("commas");
             int fullStops = (Integer)request.getAttribute("fullStops");
             String unique = (String)request.getAttribute("unique");
             String nonUnique = (String) request.getAttribute("nonUnique");
             String frequency = (String) request.getAttribute("frequency");
         %>
         <p>
             Go back to analyze <a href="analyze.html">here</a>.
             <a href="summary.jsp">here</a> to view Summary.
         </p>
        

    </body>
</html>
