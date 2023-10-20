/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ashshi
 */
public class DBConnector 
{
    static Connection con = null;
    static Statement st = null;
    
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentservice","root","root");
            System.out.println("Connection established");
            st=con.createStatement();
        }
        catch(ClassNotFoundException | SQLException e)
         {
                 System.out.println(e);   
         }
    }
    public static Statement getStatement()
    {
        return st;
    }
}
