/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbconnector.DBConnector;
import java.io.IOException;
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
@WebServlet(name = "RoomRegistration", urlPatterns = {"/RoomRegistration"})
public class RoomRegistration extends HttpServlet 
{
    Statement st =DBConnector.getStatement();
public void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException
    {
        response.sendRedirect("indexpage.jsp");
    }
public void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException
    {
        String email = request.getParameter("email");
        String type = request.getParameter("roomtype");
        String foodtype = request.getParameter("foodtype");
        String price=request.getParameter("price");
        String size=request.getParameter("size");
        String address=request.getParameter("address");
        String city=request.getParameter("city");
        String pin=request.getParameter("pin");
        String description=request.getParameter("description");
        System.out.println(email);
        try
        {
            String query="insert into landlord (emailID, type, foodtype, price, size, address, city, pin, description) values('"+email+"','"+type+"','"+foodtype+"','"+price+"','"+size+"','"+address+"','"+city+"','"+pin+"','"+description+"')"; 
            int i = st.executeUpdate(query);
            if(i>0)
            {
                System.out.println("query updated successfully - RoomRegistration");
                response.sendRedirect("indexpage.jsp");
            }   
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        
    }
}
