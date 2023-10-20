package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.ArrayList;
import controller.*;

public final class indexpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Rental Application</title>\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <link href=\"stylesheet.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"bg_top\"></div>\n");
      out.write("        <div id=\"wrap\">\n");
      out.write("            <div class=\"wrap_left\">\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    ");

                        String username = (String) session.getAttribute("username");
                        String email = (String) session.getAttribute("email");
                    
      out.write("\n");
      out.write("                    <h1><a href=\"#\">Welcome ");
      out.print(username);
      out.write("<br></a></h1>\n");
      out.write("                    <h1><a href=\"#\">");
      out.print(email);
      out.write(" </a></h1>\n");
      out.write("                    <a href=\"#\"><small></small></a> </div>\n");
      out.write("                <div id=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\" class=\"active\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">Blog</a></li>\n");
      out.write("                        <li><a href=\"#\">Gallery</a></li>\n");
      out.write("                        <li><a href=\"#\">About Us</a></li>\n");
      out.write("\n");
      out.write("                        <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"news_box\">\n");
      out.write("                    <h2>Filter</h2>\n");
      out.write("                    <div class=\"news\"> <img src=\"images/img7.jpg\" alt=\"\" title=\"\"/>\n");
      out.write("\n");
      out.write("                        <p> \n");
      out.write("                            <tr>Select Type </tr>\n");
      out.write("                             </br>\n");
      out.write("                            <td><input name=\"select type\" type=\"radio\" id=\"rooms\" >Rooms</td></br>\n");
      out.write("                            <td><input name=\"select type\"type=\"radio\" id=\"apartment\" >Apartment</td></br>\n");
      out.write("                            <td><input name=\"select type\" type=\"radio\" id=\"home\" >Home</td></br>\n");
      out.write("                            <td><input name=\"select type\"type=\"radio\" id=\"shop\" >Shop</td></p></br>\n");
      out.write("                        <div class=\"border\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"news\"> <img src=\"images/img8.jpg\" alt=\"\" title=\"\"/>\n");
      out.write("                        <p> <label for=\"text1\">Size:</label></br>\n");
      out.write("                            <select name=\"Range\" id=\"range\" >\n");
      out.write("                                <option value=\"\">---Plot size---</option>\n");
      out.write("                                <option value=\"1BHK\">250 sq.feet -500 sq.feet</option>\n");
      out.write("                                <option value=\"1BHK\">500 sq.feet -750 sq.feet</option>\n");
      out.write("                                <option value=\"1BHK\">750 sq.feet -1000 sq.feet</option>\n");
      out.write("                                <option value=\"1BHK\">1000 sq.feet -1250 sq.feet</option>\n");
      out.write("                                <option value=\"1BHK\">1250 sq.feet -1500 sq.feet</option>\n");
      out.write("                                <option value=\"1BHK\">1500 sq.feet - more</option>\n");
      out.write("                            </select></br></p>\n");
      out.write("\n");
      out.write("                        <div class=\"border\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"news\"> <img src=\"images/img9.jpg\" alt=\"\" title=\"\"/>\n");
      out.write("                        <p> <label for=\"text1\">Price range:</label><br />\n");
      out.write("                            <select name=\"Range\" id=\"range\" >\n");
      out.write("                                <option value=\"\">---Price---</option>\n");
      out.write("                                <option value=\"1BHK\">2500/- - 5000/- </option>\n");
      out.write("                                <option value=\"1BHK\">5000/- - 7000/-</option>\n");
      out.write("                                <option value=\"1BHK\">7000/- - 10000/-</option>\n");
      out.write("                                <option value=\"1BHK\">10000/- - 12000/-</option>\n");
      out.write("                                <option value=\"1BHK\">12000/- - more</option>\n");
      out.write("                            </select></br></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"wrap_right\">\n");
      out.write("                <div id=\"top_text_box\"> \n");
      out.write("                    <p>\n");
      out.write("                        <select name=\"state\" id=\"state\" class=\"form-control\">\n");
      out.write("                            <option value=\"\">---Select City---</option>\n");
      out.write("                            <option value=\"Andhra Pradesh\">Andhra Pradesh</option>\n");
      out.write("                            <option value=\"Andaman and Nicobar Islands\">Andaman and Nicobar Islands</option>\n");
      out.write("                            <option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\n");
      out.write("                            <option value=\"Assam\">Assam</option>\n");
      out.write("                            <option value=\"Bihar\">Bihar</option>\n");
      out.write("                            <option value=\"Chandigarh\">Chandigarh</option>\n");
      out.write("                            <option value=\"Chhattisgarh\">Chhattisgarh</option>\n");
      out.write("                            <option value=\"Dadar and Nagar Haveli\">Dadar and Nagar Haveli</option>\n");
      out.write("                            <option value=\"Daman and Diu\">Daman and Diu</option>\n");
      out.write("                            <option value=\"Delhi\">Delhi</option>\n");
      out.write("                            <option value=\"Lakshadweep\">Lakshadweep</option>\n");
      out.write("                            <option value=\"Puducherry\">Puducherry</option>\n");
      out.write("                            <option value=\"Goa\">Goa</option>\n");
      out.write("                            <option value=\"Gujarat\">Gujarat</option>\n");
      out.write("                            <option value=\"Haryana\">Haryana</option>\n");
      out.write("                            <option value=\"Himachal Pradesh\">Himachal Pradesh</option>\n");
      out.write("                            <option value=\"Jammu and Kashmir\">Jammu and Kashmir</option>\n");
      out.write("                            <option value=\"Jharkhand\">Jharkhand</option>\n");
      out.write("                            <option value=\"Karnataka\">Karnataka</option>\n");
      out.write("                            <option value=\"Kerala\">Kerala</option>\n");
      out.write("                            <option value=\"Madhya Pradesh\">Madhya Pradesh</option>\n");
      out.write("                            <option value=\"Maharashtra\">Maharashtra</option>\n");
      out.write("                            <option value=\"Manipur\">Manipur</option>\n");
      out.write("                            <option value=\"Meghalaya\">Meghalaya</option>\n");
      out.write("                            <option value=\"Mizoram\">Mizoram</option>\n");
      out.write("                            <option value=\"Nagaland\">Nagaland</option>\n");
      out.write("                            <option value=\"Odisha\">Odisha</option>\n");
      out.write("                            <option value=\"Punjab\">Punjab</option>\n");
      out.write("                            <option value=\"Rajasthan\">Rajasthan</option>\n");
      out.write("                            <option value=\"Sikkim\">Sikkim</option>\n");
      out.write("                            <option value=\"Tamil Nadu\">Tamil Nadu</option>\n");
      out.write("                            <option value=\"Telangana\">Telangana</option>\n");
      out.write("                            <option value=\"Tripura\">Tripura</option>\n");
      out.write("                            <option value=\"Uttar Pradesh\">Uttar Pradesh</option>\n");
      out.write("                            <option value=\"Uttarakhand\">Uttarakhand</option>\n");
      out.write("                            <option value=\"West Bengal\">West Bengal</option>\n");
      out.write("                        </select> \n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!--Registration start-->\n");
      out.write("                        <div class=\"center\">\n");
      out.write("                            <button id=\"show-registration\">&#43;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <form method=\"post\" action=\"RoomRegistration\">\n");
      out.write("                            <div class=\"popup\">\n");
      out.write("                                <div class=\"close-btn\">&times;</div>\n");
      out.write("                                <div class=\"form\">\n");
      out.write("                                    <h2>Registration </h2>\n");
      out.write("                                    <div class=\"form-element\">\n");
      out.write("                                        <select name=\"roomtype\" id=\"range\" >\n");
      out.write("                                            <option value=\"\">---Type---</option>\n");
      out.write("                                            <option value=\"room\">Room</option>\n");
      out.write("                                            <option value=\"shop\">Shop</option>\n");
      out.write("                                            <option value=\"flat\">Flat</option>\n");
      out.write("                                            <option value=\"apartment\">Apartment</option>\n");
      out.write("                                            <option value=\"other\">other</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-element\">\n");
      out.write("                                        <div class=\"form-element\">\n");
      out.write("                                            <label for=\"price\">family type you want</label><br>\n");
      out.write("                                                <input type=\"radio\" id=\"As-landlord\" name=\"foodtype\" value=\"veg\" >\n");
      out.write("                                                    <label for=\"veg\">Veg</label><br>\n");
      out.write("                                                        <input type=\"radio\" id=\"As-rental\" name=\"foodtype\" value=\"non-veg\">\n");
      out.write("                                                            <label for=\"non-veg\">Non-veg</label>\n");
      out.write("\n");
      out.write("                                                            </div >\n");
      out.write("                                                            <label for=\"price\">Price</label><br>\n");
      out.write("                                                                <input type=\"text\" id=\"price\"  name=\"price\" placeholder=\"Enter price here\">\n");
      out.write("                                                                    <label for=\"size\">Size</label><br>\n");
      out.write("                                                                        <input type=\"text\" id=\"size\" name=\"size\" placeholder=\"Enter size here\">\n");
      out.write("                                                                            <label for=\"location\">Location :-</label><br>\n");
      out.write("                                                                                <label for=\"address\">Address</label><br>\n");
      out.write("                                                                                    <input type=\"text\" id=\"address\" name=\"address\" placeholder=\"Enter address here\">\n");
      out.write("                                                                                        <label for=\"city\">city</label><br>\n");
      out.write("                                                                                            <input type=\"text\" id=\"city\" name=\"city\" placeholder=\"Enter city here\">\n");
      out.write("                                                                                                <label for=\"pin\">pin code</label><br>\n");
      out.write("                                                                                                    <input type=\"text\" id=\"pin\" name=\"pin\" placeholder=\"Enter your PIN code\">\n");
      out.write("                                                                                                        <label for=\"pin\">email</label><br>\n");
      out.write("                                                                                                            <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"Enter your registered email address\">\n");
      out.write("                                                                                                                <label for=\"description\">Description</label><br>\n");
      out.write("                                                                                                                    <input type=\"text\" id=\"description\" name=\"description\" placeholder=\"add description in 250 word\">\n");
      out.write("                                                                                                                        <label for=\"description\">upload photos of your place</label><br>\n");
      out.write("                                                                                                                            <input type=\"file\" name=\"fileName\"><br>\n");
      out.write("                                                                                                                                     <label for=\"imgbill\">electricity bill</label><br>\n");
      out.write("                                                                                                                                        <input type=\"file\" name=\"fileName\"><br>\n");
      out.write("                                                                                                                                  \n");
      out.write("                                                                                                                                            </div>\n");
      out.write("                                                                                                                                            <div class=\"form-element\">\n");
      out.write("                                                                                                                                                </br><button>Submit</button>\n");
      out.write("                                                                                                                                            </div>\n");
      out.write("\n");
      out.write("                                                                                                                                            </div>\n");
      out.write("                                                                                                                                            </div>\n");
      out.write("                                                                                                                                            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                                                                            <!--Registration end-->\n");
      out.write("                                                                                                                                            <div class=\"read\">\n");
      out.write("                                                                                                                                                </br>\n");
      out.write("                                                                                                                                            </div>\n");
      out.write("                                                                                                                                            </p>\n");
      out.write("                                                                                                                                            <div class=\"read\"><a href=\"#\"></a></div>\n");
      out.write("                                                                                                                                            </div>\n");
      out.write("                                                                                                                                                <div class=\"gallery_inline\">\n");
      out.write("                                                                                                                                                ");

                                                                                                                                                    RoomInfo ri=new RoomInfo(); 
                                                                                                                                                    ArrayList<admin> list=ri.getadmin();
                                                                                                                                                
      out.write("\n");
      out.write("\n");
      out.write("                                                                                                                                                 \n");
      out.write("                                                                                                                                                         <div class=\"gallery_inline\">\n");
      out.write("                                                                                                                                                        ");

                                                                                                                                                   for(admin a : list)
                                                                                                                                                    {
                                                                                                                                                    
      out.write("\n");
      out.write("                                                                                                                                                    <div class=\"gal_img\">\n");
      out.write("                                                                                                                                                        <form method=\"post\" action=\"BookingPage\">\n");
      out.write("                                                                                                                                                        <h4>");
      out.print(a.getType());
      out.write("</h4>\n");
      out.write("                                                                                                                                                        <div class=\"gal_img_bg\">\n");
      out.write("                                                                                                                                                            <img src=\"images/img1.jpg\" alt=\"\" title=\"\" />\n");
      out.write("                                                                                                                                                        </div>\n");
      out.write("                                                                                                                                                        <input type=\"hidden\" name=\"address\" value=\"");
      out.print( a.getAddress());
      out.write("\" />\n");
      out.write("                                                                                                                                                        <p><span>&#8377;  :-");
      out.print(a.getPrice());
      out.write(" /-</span> </br> size :- ");
      out.print(a.getSize());
      out.write("</br> description :- ");
      out.print(a.getDescription());
      out.write("</br> Location :- ");
      out.print(a.getAddress());
      out.write("</p>\n");
      out.write("                                                                                                                                                        \n");
      out.write("                                                                                                                                                        <input type=\"submit\" value=\"details\">\n");
      out.write("\n");
      out.write("                                                                                                                                                        </form>\n");
      out.write("                                                                                                                                                        \n");
      out.write("                                                                                                                                                    </div>         \n");
      out.write("                                                                                                                                                ");

                                                                                                                                                    }
                                                                                                                                                
      out.write("\n");
      out.write("                                                                                                                                                </div>\n");
      out.write("                                                                                                                                                <div class=\"clear\"></div>\n");
      out.write("                                                                                                                                                 <div class=\"border\"></div>\n");
      out.write("                                                                                                                                                \n");
      out.write("\n");
      out.write("                                                                                                                                                <div class=\"clear\"></div>\n");
      out.write("                                                                                                                                            </div>\n");
      out.write("                                                                                                                                            </div>\n");
      out.write("                                                                                                                                            <div class=\"clear\"></div>\n");
      out.write("                                                                                                                                            </div>\n");
      out.write("                                                                                                                                            <div id=\"bottom_text_box_bg\"></div>\n");
      out.write("                                                                                                                                            <div id=\"block2\">\n");
      out.write("                                                                                                                                                <div class=\"wrap_left\"></div>\n");
      out.write("                                                                                                                                                <div class=\"wrap_right\"> \n");
      out.write("                                                                                                                                                    <div id=\"footer_bot\">\n");
      out.write("                                                                                                                                                        <p>Copyright &copy; 2023. Design by <a href=\"https://business.google.com/website/programming-world-by-pankaj-wadhwani\" title=\"Free Web Templates\">PW & team</a></p>\n");
      out.write("                                                                                                                                                        <p> <a href=\"#\">Privacy Policy</a> | <a href=\"#\">Terms of Use</a> | <a href=\"https://business.google.com/website/programming-world-by-pankaj-wadhwani\" title=\" programming world indore\"><abbr title=\"HyperText Markup Language\">PW</abbr></a> | <a href=\"http://jigsaw.w3.org/css-validator/check/referer\" title=\"This page validates as CSS\"><abbr title=\"Cascading Style Sheets\">Aashish</abbr></a></p>\n");
      out.write("                                                                                                                                                    </div>\n");
      out.write("                                                                                                                                                </div>\n");
      out.write("                                                                                                                                                <div class=\"clear\"></div>\n");
      out.write("                                                                                                                                            </div>\n");
      out.write("                                                                                                                                            <script >\n");
      out.write("                                                                                                                                                document.querySelector(\"#show-registration\").addEventListener(\"click\", function () {\n");
      out.write("                                                                                                                                                    document.querySelector(\".popup\").classList.add(\"active\");\n");
      out.write("                                                                                                                                                });\n");
      out.write("                                                                                                                                                document.querySelector(\".popup .close-btn\").addEventListener(\"click\", function () {\n");
      out.write("                                                                                                                                                    document.querySelector(\".popup\").classList.remove(\"active\");\n");
      out.write("                                                                                                                                                });\n");
      out.write("                                                                                                                                            </script>\n");
      out.write("\n");
      out.write("                                                                                                                                            </body>\n");
      out.write("                                                                                                                                            </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
