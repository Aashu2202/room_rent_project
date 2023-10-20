/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dbconnector.DBConnector;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Aashish
 */
public class Loginauthenticator {

    Statement st = null;
    String pass = "";
    String username="";

    public boolean isLogin(String email, String password) {
        st = DBConnector.getStatement();
        try {
            String query = "SELECT password  from logindetails where  email='" + email + "'";
            
            System.out.println("query= "+query);
            System.out.println("queary tak aa gya bhai - loginauthenticator ");
            ResultSet rs = st.executeQuery(query);
            
            if (rs.next())
            {
                pass = rs.getString("password");
          
           
                System.out.println("condition me hu bhai - loginauthenticator");
                //username =rs.getString("username");
            }
            System.out.println("password="+pass);
        } catch (Exception e) {
            System.out.println(e);
        }
        if (email != null && password != null && !email.trim().equals("") && email.equalsIgnoreCase(email) && password.equals(pass)) 
        {
            System.out.println("bhai return true kar diya - loginauthenticator");
            return true;
        }
        else
        {
            System.out.println("return false - login authenticator");
            return false;
        }

    }
  
}
