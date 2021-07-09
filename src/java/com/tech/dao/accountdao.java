
package com.tech.dao;

import com.tech.entities.accountant;
import java.sql.DriverManager;
import java.sql.*;
public class accountdao {
 private  Connection con;

    public accountdao(Connection con) {
        this.con = con;
    }
    public  int save(accountant acc)
    {
        int status=0;
	try{
		
		
            String query="insert into admin(NAME,EMAIL,PASSWORD,ADDRESS,CONTACT) values(?,?,?,?,?)";
            PreparedStatement ps;
            ps = this.con.prepareStatement(query);
		ps.setString(1,acc.getName());
		ps.setString(2,acc.getEmail());
		ps.setString(3,acc.getPassword());
		ps.setString(4,acc.getAddress());
		ps.setString(5,acc.getContact());
		status=ps.executeUpdate();
		status=1;
	}catch(Exception ex){System.out.println(ex);}
	return status;
    }
    
    public accountant getrecords(String email, String password)
   {
       accountant use=null;
       
       try{
           String query="select * from admin where email=? and password=?";
          PreparedStatement pst= con.prepareStatement(query);
          pst.setString(1,email);
          pst.setString(2, password);
           
           ResultSet set=pst.executeQuery();
           
           if(set.next())
           {
               use = new accountant();
               
               String name=set.getString("NAME");
               use.setName(name);
               
              // use.setId(set.getInt("#"));
              String e=set.getString("EMAIL");
               use.setEmail(e);
              // use.setGender(set.getString("GENDER"));
               //use.setCource(set.getString("COURSE"));
               use.setContact(set.getString("CONTACT"));
               use.setAddress(set.getString("ADDRESS"));
               use.setPassword(set.getString("PASSWORD"));
               
               
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
          // return e;
       }
       return use;
      // return null;
   }
}
