/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.connector.Response;
import model.RegistrationAuthenticator;

/**
 *
 * @author Ashshi
 */
@WebServlet(name = "Registration", urlPatterns = {"/Registration"})
public class Registration extends HttpServlet 
{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
    {
         response.sendRedirect("registration.jsp");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
    {
        String username = request.getParameter("name");
        String contact = request.getParameter("contact");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String cpassword = request.getParameter("cpassword");
        System.out.println(username+" "+contact+" "+email+" "+password);
        if(password != null && cpassword != null && password.equals(cpassword))
        {
            RegistrationAuthenticator regi = new RegistrationAuthenticator();
            boolean registation = regi.authenticator(username,contact,email,password);
            if(registation)
            {
                response.sendRedirect("login.jsp");
            }
            else
            {
                response.sendRedirect("registration.jsp");
            }
        }
    }
}
