<%-- 
    Document   : registration
    Created on : 10 Oct, 2022, 10:16:57 PM
    Author     : Aashish
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="registration.css">
    <title>Registration </title>
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
    <form method="post" action="Registration">
    <div class="popup">
        <div class="form">
            <h2>Registration </h2>
            <div class="form-element">
                <label for="first name"> Name</label>
                <input type="text" id="First Name" name="name" placeholder="Enter  name here">
                <label for="contact">Contact</label><br>
                <input type="text" id="Contact" name="contact" placeholder="Enter contact no. here">
                <label for="email">Email</label><br>
                <input type="text" id="Email" name="email" placeholder="Enter email here">
                <label for="password">Password</label><br>
                <input type="password" id="Password" name="password" placeholder="Enter password here">
                <label for="confirm password">Confirm Password</label><br>
                <input type="password" id="Confirm Password" name="cpassword"  placeholder="Confirm Password">
            </div>
            <div class="form-element">
                <button>Submit</button>
            </div>
        </div>
    </div>
        </form>
</body>
</html>