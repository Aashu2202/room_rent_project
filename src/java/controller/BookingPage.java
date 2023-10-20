/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbconnector.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ashshi
 */
@WebServlet(name = "BookingPage", urlPatterns = {"/BookingPage"})
public class BookingPage extends HttpServlet {

    String price, size, city, pin, email, description, type, foodtype,address;
    Statement st = DBConnector.getStatement();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("indexpage.jsp");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
         address = req.getParameter("address");
        
         HttpSession session = req.getSession(true);
         session.setAttribute("address", address);
        try {
            System.out.println("hiii me booking page par hu");
            String query = "SELECT price,size,type,foodtype,city,pin,emailID,description from landlord where address='" + address + "'";
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                price = rs.getString("price");
                size = rs.getString("size");
                type = rs.getString("type");
                foodtype = rs.getString("foodtype");
                city = rs.getString("city");
                pin = rs.getString("pin");
                email = rs.getString("emailID");
                description = rs.getString("description");
                System.out.println("bhai me Booking page par aa gya data lekar");
               
                
                session.setAttribute("price", price);
                session.setAttribute("size", size);
                session.setAttribute("type", type);
                session.setAttribute("foodtype", foodtype);
                session.setAttribute("email", email);
                session.setAttribute("city", city);
                session.setAttribute("pin", pin);
                session.setAttribute("description", description);
                System.out.println("bhai data lekar booking.jsp par jaa rha hu");
            }
        } catch (SQLException e) {
                System.out.println(e);
        }

        resp.sendRedirect("Booking.jsp");

    }
}
