package controller;

import dbconnector.DBConnector;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Loginauthenticator;
/**
 *
 * @author Ashshi
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
    {
        response.sendRedirect("login.jsp");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String email= request.getParameter("email");
        System.out.println("email="+email);
        String password = request.getParameter("password");
        System.out.println("Login page check 1");
        Loginauthenticator authenticator = new Loginauthenticator();
        boolean login =authenticator.isLogin(email , password);
        String username="";
        if(login)
        {   
            System.out.println("login successfully from login.java");
            Statement st=DBConnector.getStatement();
            try
            {
                String query="SELECT username from logindetails where email='"+email+"'";
                ResultSet rs = st.executeQuery(query);
                if(rs.next())
                {
                    username=rs.getString("username");
                    
                }
            }
            catch(SQLException e)
                    {
                        System.out.println(e);
                    }
            HttpSession session = request.getSession(true);
            session.setAttribute("username",username);
            System.out.println("email"+email);
            session.setAttribute("email",email);
            response.sendRedirect("indexpage.jsp");
            
        }
        else
        {
            System.out.println("sorry something went wrong please check it again from login.java");
            response.sendRedirect("login.jsp");
        }
    }
}
