
package com.tech.helper;


import java.sql.*;

public class connectionprovider {
    public static void main(String[] args) {}
        public static Connection getConnection(){
        Connection con=null;
       
            //class.forName("URL");
            try
        {
       if(con == null)
       {
            // driver classloaded
           Class.forName("com.mysql.jdbc.Driver");
            
//create a connection...
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/coaching_db", "root", "maalove@");

       }
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
        
            }
    }


