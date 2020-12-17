<%-- 
    Document   : login
    Created on : Dec 17, 2020, 3:33:52 AM
    Author     : 813116
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <br>
        <form method ="post" action="login">
            <label>Username:</label><input type ="text" name="username">
            <br>
            <label>Password:</label><input type ="text" name="password">
            <br>
            <input type ="submit" value ="Log in">        
        </form>
        <p> ${message}</p>        
    </body>
</html>
