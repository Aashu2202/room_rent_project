<%-- 
    Document   : loginpage
    Created on : 11 Oct, 2022, 11:00:42 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="login.css">
        <style>
            img{
                max-width: 100%;
                height: auto;
                position: relative;
            }
        </style>
    </head>
    <body>
        <img src="images/RentLOGO.png" alt="logo">
        <form method="post" action="Login">
        <div class="popup">
            <div class="form">
                <h2>Log in</h2>
                <div class="form-element">
                    <label for="email">Email</label>
                    <input type="text" id="email" name="email" placeholder="Enter email here">
                </div>
                <div class="form-element">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" placeholder="Enter password here">
                </div>
                <div class="form-element">
                   <input id="submit1" type="submit" name="submit1" value="Login" />
                </div>
                <div class="form-element">
                    <a href="registration.jsp"> Registration here</a> 
                </div>
            </div>
        </div>
            </form>
    </body>
</html>
