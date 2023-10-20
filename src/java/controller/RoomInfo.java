/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import dbconnector.DBConnector;
 import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Ashshi
 */
public class RoomInfo
{
    
    public ArrayList<admin> getadmin()
    { 
       
        ArrayList<admin> list = new ArrayList<admin>();

    try {

        Statement st = DBConnector.getStatement();;
        ResultSet rs = st.executeQuery("select count, type, price, size, description,address from landlord ");

        while (rs.next()) {
            admin u1 = new admin();
            u1.setcount(rs.getInt("count"));
            u1.setType(rs.getString("type"));
             u1.setPrice(rs.getString("price"));
              u1.setSize(rs.getString("size"));
               u1.setAddress(rs.getString("address"));
                u1.setDescription(rs.getString("description"));
                
            list.add(u1);
        }

    } 
    catch (SQLException ex) {
        System.out.println(ex);
    }


  return list;
    }
}
