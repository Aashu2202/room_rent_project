<%-- 
    Document   : Booking
    Created on : Mar 3, 2023, 11:30:13 PM
    Author     : Ashshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Booking your Dreams</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="Booking.css" type="text/css">

</head>
<body>
<div class="page">
  <div class="header"> 
    <%
                        String type= (String) session.getAttribute("type");
                        String price = (String) session.getAttribute("price");
                        String size = (String) session.getAttribute("size");
                        String address = (String) session.getAttribute("address");
                        String city = (String) session.getAttribute("city");
                        String pin = (String) session.getAttribute("pin");
                        String foodtype = (String) session.getAttribute("foodType");
                        String description= (String) session.getAttribute("description");
                        String email = (String) session.getAttribute("email");
                    %>
    <div id="model"><!--<img src="images1/2012-collection.jpg" alt="">--></div>
    <div> 
      <ul id="navigation">
       <li>Type :-<%=type %></li>
        <li>Price :-<%=price%> /-</li>
        <li>Size :-<%=size %></li>
        <li>Food Type:-<%=foodtype%></li>
        <li>Address:-<%= address %>,<%= city%>,<%= pin%></li>
        <li>Email:- <%= email%></li>
        <li>Description :-<%= description%></li>
      </ul>
    </div>
  </div>
  <div class="footer">
    <div>
      <p>Sign Up for relax N rent and receive 10% off your next order!</p>
      <form action="#">
        <input type="text" value="Name" >
        <input type="text" value="Enter Email Address" >
      </form>
    </div>
    <div id="connect">
      <h3>Get in touch / for inquiries:</h3>
      <span>gurjarashish1010@email.com <font><br> or <br></font> <span>7489838868</span></span>
     
    </div>
    <p id="footnote">Copyright &copy; 2023 <a href="https://business.google.com/website/programming-world-by-pankaj-wadhwani">PW</a> privacy policy | Terms of use <a target="_blank" href="https://business.google.com/website/programming-world-by-pankaj-wadhwani">PW & team</a></p>
  </div>
</div>
</body>
</html>

