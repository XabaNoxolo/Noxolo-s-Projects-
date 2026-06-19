<%-- 
    Document   : start
    Created on : Mar 13, 2026, 1:49:15 PM
    Author     : xaban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start Page</title>
    </head>
    <body>
        <h1>Fill in the form below: </h1>
        <form action="message.jsp" method="POST">
            <table>
                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="name" required=""</td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="submit"></td>
                </tr>
            </table>
            
        </form>
        
    </body>
</html>
