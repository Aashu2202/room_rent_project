/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dbconnector.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ashshi
 */
@WebServlet(name = "RegistationAuthenticator", urlPatterns = {"/RegistationAuthenticator"})
public class RegistrationAuthenticator extends HttpServlet {
    Statement st = DBConnector.getStatement();
    
public boolean authenticator(String username , String contact , String email, String password)
 {
     boolean n=false;
    try
    {
        String query="insert into logindetails(username , contact , email , password)values('"+username+"','"+contact+"','"+email+"','"+password+"')";   
        int i= st.executeUpdate(query);
        if(i>0)
        {
            System.out.println("registration complete - RegistrationAuthenticator");
            n=true;
        }
    }
    catch(SQLException e)
            {
                System.out.println(e);
            }
    return n;
}
}
