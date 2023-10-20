<%-- 
    Document   : indexpage
    Created on : Oct 12, 2022, 4:30:45 PM
    Author     : Aashish
--%>
<%@page import="java.util.*"%> 
<%@page import="java.util.ArrayList"%> 
<%@page import="controller.*"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <title>Rental Application</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <link href="stylesheet.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <div id="bg_top"></div>
        <div id="wrap">
            <div class="wrap_left">
                <div id="logo">
                    <%
                        String username = (String) session.getAttribute("username");
                        String email = (String) session.getAttribute("email");
                    %>
                    <h1><a href="#">Welcome <%=username%><br></a></h1>
                    <h1><a href="#"><%=email%> </a></h1>
                    <a href="#"><small></small></a> </div>
                <div id="menu">
                    <ul>
                        <li><a href="#" class="active">Home</a></li>
                        <li><a href="#">Blog</a></li>
                        <li><a href="#">Gallery</a></li>
                        <li><a href="#">About Us</a></li>

                        <li><a href="#">Contact Us</a></li>
                    </ul>
                    <div class="clear"></div>
                </div>
                <div id="news_box">
                    <h2>Filter</h2>
                    <div class="news"> <img src="images/img7.jpg" alt="" title=""/>

                        <p> 
                            <tr>Select Type </tr>
                             </br>
                            <td><input name="select type" type="radio" id="rooms" >Rooms</td></br>
                            <td><input name="select type"type="radio" id="apartment" >Apartment</td></br>
                            <td><input name="select type" type="radio" id="home" >Home</td></br>
                            <td><input name="select type"type="radio" id="shop" >Shop</td></p></br>
                        <div class="border"></div>
                    </div>
                    <div class="news"> <img src="images/img8.jpg" alt="" title=""/>
                        <p> <label for="text1">Size:</label></br>
                            <select name="Range" id="range" >
                                <option value="">---Plot size---</option>
                                <option value="1BHK">250 sq.feet -500 sq.feet</option>
                                <option value="1BHK">500 sq.feet -750 sq.feet</option>
                                <option value="1BHK">750 sq.feet -1000 sq.feet</option>
                                <option value="1BHK">1000 sq.feet -1250 sq.feet</option>
                                <option value="1BHK">1250 sq.feet -1500 sq.feet</option>
                                <option value="1BHK">1500 sq.feet - more</option>
                            </select></br></p>

                        <div class="border"></div>
                    </div>
                    <div class="news"> <img src="images/img9.jpg" alt="" title=""/>
                        <p> <label for="text1">Price range:</label><br />
                            <select name="Range" id="range" >
                                <option value="">---Price---</option>
                                <option value="1BHK">2500/- - 5000/- </option>
                                <option value="1BHK">5000/- - 7000/-</option>
                                <option value="1BHK">7000/- - 10000/-</option>
                                <option value="1BHK">10000/- - 12000/-</option>
                                <option value="1BHK">12000/- - more</option>
                            </select></br></p>
                    </div>
                </div>
            </div>
            <div class="wrap_right">
                <div id="top_text_box"> 
                    <p>
                        <select name="state" id="state" class="form-control">
                            <option value="">---Select City---</option>
                            <option value="Andhra Pradesh">Andhra Pradesh</option>
                            <option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
                            <option value="Arunachal Pradesh">Arunachal Pradesh</option>
                            <option value="Assam">Assam</option>
                            <option value="Bihar">Bihar</option>
                            <option value="Chandigarh">Chandigarh</option>
                            <option value="Chhattisgarh">Chhattisgarh</option>
                            <option value="Dadar and Nagar Haveli">Dadar and Nagar Haveli</option>
                            <option value="Daman and Diu">Daman and Diu</option>
                            <option value="Delhi">Delhi</option>
                            <option value="Lakshadweep">Lakshadweep</option>
                            <option value="Puducherry">Puducherry</option>
                            <option value="Goa">Goa</option>
                            <option value="Gujarat">Gujarat</option>
                            <option value="Haryana">Haryana</option>
                            <option value="Himachal Pradesh">Himachal Pradesh</option>
                            <option value="Jammu and Kashmir">Jammu and Kashmir</option>
                            <option value="Jharkhand">Jharkhand</option>
                            <option value="Karnataka">Karnataka</option>
                            <option value="Kerala">Kerala</option>
                            <option value="Madhya Pradesh">Madhya Pradesh</option>
                            <option value="Maharashtra">Maharashtra</option>
                            <option value="Manipur">Manipur</option>
                            <option value="Meghalaya">Meghalaya</option>
                            <option value="Mizoram">Mizoram</option>
                            <option value="Nagaland">Nagaland</option>
                            <option value="Odisha">Odisha</option>
                            <option value="Punjab">Punjab</option>
                            <option value="Rajasthan">Rajasthan</option>
                            <option value="Sikkim">Sikkim</option>
                            <option value="Tamil Nadu">Tamil Nadu</option>
                            <option value="Telangana">Telangana</option>
                            <option value="Tripura">Tripura</option>
                            <option value="Uttar Pradesh">Uttar Pradesh</option>
                            <option value="Uttarakhand">Uttarakhand</option>
                            <option value="West Bengal">West Bengal</option>
                        </select> 


                        <!--Registration start-->
                        <div class="center">
                            <button id="show-registration">&#43;</button>
                        </div>
                        <form method="post" action="RoomRegistration">
                            <div class="popup">
                                <div class="close-btn">&times;</div>
                                <div class="form">
                                    <h2>Registration </h2>
                                    <div class="form-element">
                                        <select name="roomtype" id="range" >
                                            <option value="">---Type---</option>
                                            <option value="room">Room</option>
                                            <option value="shop">Shop</option>
                                            <option value="flat">Flat</option>
                                            <option value="apartment">Apartment</option>
                                            <option value="other">other</option>
                                        </select>
                                    </div>
                                    <div class="form-element">
                                        <div class="form-element">
                                            <label for="price">family type you want</label><br>
                                                <input type="radio"  name="foodtype" value="veg" >
                                                    <label for="veg">Veg</label><br>
                                                        <input type="radio" name="foodtype" value="non-veg">
                                                            <label for="non-veg">Non-veg</label>

                                                            </div >
                                                            <label for="price">Price</label><br>
                                                                <input type="text" id="price"  name="price" placeholder="Enter price here">
                                                                    <label for="size">Size</label><br>
                                                                        <input type="text" id="size" name="size" placeholder="Enter size here">
                                                                            <label for="location">Location :-</label><br>
                                                                                <label for="address">Address</label><br>
                                                                                    <input type="text" id="address" name="address" placeholder="Enter address here">
                                                                                        <label for="city">city</label><br>
                                                                                            <input type="text" id="city" name="city" placeholder="Enter city here">
                                                                                                <label for="pin">pin code</label><br>
                                                                                                    <input type="text" id="pin" name="pin" placeholder="Enter your PIN code">
                                                                                                        <label for="pin">email</label><br>
                                                                                                            <input type="text" id="email" name="email" placeholder="Enter your registered email address">
                                                                                                                <label for="description">Description</label><br>
                                                                                                                    <input type="text" id="description" name="description" placeholder="add description in 250 word">
                                                                                                                        <label for="description">upload photos of your place</label><br>
                                                                                                                            <input type="file" name="photo" size="50"/><br>
                                                                                                                                     <label for="imgbill">electricity bill</label><br>
                                                                                                                                        <input type="file" name="fileName"><br>
                                                                                                                                  
                                                                                                                                            </div>
                                                                                                                                            <div class="form-element">
                                                                                                                                                </br><button>Submit</button>
                                                                                                                                            </div>

                                                                                                                                            </div>
                                                                                                                                            </div>
                                                                                                                                            </form>


                                                                                                                                            <!--Registration end-->
                                                                                                                                            <div class="read">
                                                                                                                                                </br>
                                                                                                                                            </div>
                                                                                                                                            </p>
                                                                                                                                            <div class="read"><a href="#"></a></div>
                                                                                                                                            </div>
                                                                                                                                                <div class="gallery_inline">
                                                                                                                                                <%
                                                                                                                                                    RoomInfo ri=new RoomInfo(); 
                                                                                                                                                    ArrayList<admin> list=ri.getadmin();
                                                                                                                                                %>

                                                                                                                                                 
                                                                                                                                                         <div class="gallery_inline">
                                                                                                                                                        <%
                                                                                                                                                   for(admin a : list)
                                                                                                                                                    {
                                                                                                                                                    %>
                                                                                                                                                    <div class="gal_img">
                                                                                                                                                        <form method="post" action="BookingPage">
                                                                                                                                                        <h4><%=a.getType()%></h4>
                                                                                                                                                        <div class="gal_img_bg">
                                                                                                                                                            <img src="images/img1.jpg" alt="" title="" />
                                                                                                                                                        </div>
                                                                                                                                                        <input type="hidden" name="address" value="<%= a.getAddress()%>" />
                                                                                                                                                        <p><span>&#8377;  :-<%=a.getPrice()%> /-</span> </br> size :- <%=a.getSize()%></br> description :- <%=a.getDescription()%></br> Location :- <%=a.getAddress()%></p>
                                                                                                                                                        
                                                                                                                                                        <input type="submit" value="details">

                                                                                                                                                        </form>
                                                                                                                                                        
                                                                                                                                                    </div>         
                                                                                                                                                <%
                                                                                                                                                    }
                                                                                                                                                %>
                                                                                                                                                </div>
                                                                                                                                                <div class="clear"></div>
                                                                                                                                                 <div class="border"></div>
                                                                                                                                                

                                                                                                                                                <div class="clear"></div>
                                                                                                                                            </div>
                                                                                                                                            </div>
                                                                                                                                            <div class="clear"></div>
                                                                                                                                            </div>
                                                                                                                                            <div id="bottom_text_box_bg"></div>
                                                                                                                                            <div id="block2">
                                                                                                                                                <div class="wrap_left"></div>
                                                                                                                                                <div class="wrap_right"> 
                                                                                                                                                    <div id="footer_bot">
                                                                                                                                                        <p>Copyright &copy; 2023. Design by <a href="https://business.google.com/website/programming-world-by-pankaj-wadhwani" title="Free Web Templates">PW & team</a></p>
                                                                                                                                                        <p> <a href="#">Privacy Policy</a> | <a href="#">Terms of Use</a> | <a href="https://business.google.com/website/programming-world-by-pankaj-wadhwani" title=" programming world indore"><abbr title="HyperText Markup Language">PW</abbr></a> | <a href="http://jigsaw.w3.org/css-validator/check/referer" title="This page validates as CSS"><abbr title="Cascading Style Sheets">Aashish</abbr></a></p>
                                                                                                                                                    </div>
                                                                                                                                                </div>
                                                                                                                                                <div class="clear"></div>
                                                                                                                                            </div>
                                                                                                                                            <script >
                                                                                                                                                document.querySelector("#show-registration").addEventListener("click", function () {
                                                                                                                                                    document.querySelector(".popup").classList.add("active");
                                                                                                                                                });
                                                                                                                                                document.querySelector(".popup .close-btn").addEventListener("click", function () {
                                                                                                                                                    document.querySelector(".popup").classList.remove("active");
                                                                                                                                                });
                                                                                                                                            </script>

                                                                                                                                            </body>
                                                                                                                                            </html>
