package edb;


import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anush
 */
public class Conn {
   private static Connection con;
   public Conn(){
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/edb_data","root","root");
       }
       catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
   }
      public static Connection getconnection()
    {
        try
        {
        if(con.isClosed()) con =DriverManager.getConnection("jdbc:mysql://localhost:3306/edb_data","root","root");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return con;
    }
   }
    
