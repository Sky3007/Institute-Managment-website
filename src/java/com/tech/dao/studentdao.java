
package com.tech.dao;
import com.tech.entities.users;
import com.tech.helper.connectionprovider;
import static java.lang.System.out;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class studentdao {
    
    Connection con=connectionprovider.getConnection();


    public studentdao(Connection con) {
        this.con= con;
    }

   

    
    // method to insert user to database
    
    public int saveUser(users user)
    {
         int f=0;
        try
        {
            //user -->database
          // 
            String query="insert into student(NAME,GENDER,EMAIL,COURSE,PASSWORD,ADDRESS,CONTACT) values(?,?,?,?,?,?,?)";
            PreparedStatement pstmt=this.con.prepareStatement(query);
            if(pstmt==null)
                out.println("pstmt empty");
            pstmt.setString(1, user.getName());
            pstmt.setString(2,user.getGender());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getCource());
            pstmt.setString(5, user.getpassword());
            pstmt.setString(6, user.getAddress());
            pstmt.setString(7, user.getPhnnum());
            
            pstmt.executeUpdate();
            f=1;
            
        }catch(Exception e)
        {
           e.printStackTrace();
            //return e;
        }
        //return new Exception();
        return f;
    }
    
   public users getrecord(String email, String password)
   {
       users use=null;
       try{
           String query="select * from student where email=? and password=?";
           PreparedStatement pst= con.prepareStatement(query);
           pst.setString(1,email);
           pst.setString(2, password);
           
           ResultSet set=pst.executeQuery();
           
           if(set.next())
           {
               use = new users();
               
               String name=set.getString("NAME");
               use.setName(name);
               
              // use.setId(set.getInt("#"));
              String e=set.getString("EMAIL");
               use.setEmail(e);
               use.setGender(set.getString("GENDER"));
               use.setCource(set.getString("COURSE"));
               use.setPhnnum(set.getString("CONTACT"));
               use.setAddress(set.getString("ADDRESS"));
               use.setpassword(set.getString("PASSWORD"));
               
               
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return use;
   }
    public  int delete(String email){
	int status=0;
	try{
		
		String query="delete from student where email=?";
                PreparedStatement pst= con.prepareStatement(query);
		pst.setString(1,email);
		status=pst.executeUpdate();

	}catch(Exception ex){System.out.println(ex);}
	return status;
}
   public List<users> getfullrecord()
   {
       List<users> list=new ArrayList<users>();
       try{
           String query="select * from student";
       PreparedStatement ps;
        ps = con.prepareStatement(query);
		ResultSet set=ps.executeQuery();
                while(set.next()){
                  users  use = new users();
			String name=set.getString("NAME");
               use.setName(name);
               
              // use.setId(set.getInt("#"));
              String e=set.getString("EMAIL");
               use.setEmail(e);
               use.setGender(set.getString("GENDER"));
               use.setCource(set.getString("COURSE"));
               use.setPhnnum(set.getString("CONTACT"));
               use.setAddress(set.getString("ADDRESS"));
               use.setpassword(set.getString("PASSWORD"));
               list.add(use);
		}
               
           }catch(Exception ex){System.out.println(ex);}
         
       return list;
   }
   public  int update(users bean){
	int status=0;
	try{
		//Connection con=DB.getCon();
              String  query="update student set NAME = ?, GENDER = ?, COURSE = ?, ADDRESS = ?, CONTACT = ? where EMAIL = ?";
		PreparedStatement ps=con.prepareStatement(query);
		//PreparedStatement ps = con.prepareStatement(PRODUCT_UPDATE);
                ps.setString(6,bean.getEmail());
                
                ps.setString(1,bean.getName());
		//ps.setString(2,bean.getEmail());
		ps.setString(2,bean.getGender());
		ps.setString(3,bean.getCource());
		//ps.setInt(5,bean.getFee());
		//ps.setInt(6,bean.getPaid());
		//ps.setInt(7,bean.getDue());
		ps.setString(4,bean.getAddress());
		ps.setString(5,bean.getPhnnum());
		//ps.setInt(10,bean.getId());
              
		status=ps.executeUpdate();
                
                
		
	}catch(Exception ex){System.out.println(ex);}
	return status;
}
   public users getRecordByEmail(String email){
	users use=new users();
	try{
            
		PreparedStatement ps=con.prepareStatement("select * from student where email=?");
		ps.setString(1,email);
		ResultSet set=ps.executeQuery();
		 if(set.next())
           {
               
               
               String name=set.getString("NAME");
               use.setName(name);
               
              // use.setId(set.getInt("#"));
              String e=set.getString("EMAIL");
               use.setEmail(e);
               use.setGender(set.getString("GENDER"));
               use.setCource(set.getString("COURSE"));
               use.setPhnnum(set.getString("CONTACT"));
               use.setAddress(set.getString("ADDRESS"));
               use.setpassword(set.getString("PASSWORD"));
               
               
           }
		
	}catch(Exception ex){System.out.println(ex);}
	
	return use;
}
}