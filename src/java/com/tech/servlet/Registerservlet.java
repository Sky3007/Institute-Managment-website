
package com.tech.servlet;

import com.tech.helper.connectionprovider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tech.dao.studentdao;
import com.tech.entities.users;
import javax.servlet.annotation.MultipartConfig;

@MultipartConfig
public class Registerservlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            // fetch all form data
            
            String check=request.getParameter("check");
            //out.println("check");
            if(check==null)
            {
                out.println("Please check the check box!");
            }
            else
            {
                String name=request.getParameter("user_name");
                String gender=request.getParameter("user_gender");
                String email=request.getParameter("user_email");
                String course=request.getParameter("user_course");
                String password=request.getParameter("user_password");
                String address=request.getParameter("address");
                String contact=request.getParameter("contact");
               // out.println(name);
                //create users object and set all data to that object
                users  user= new users(name,email,gender,course,address,contact,password);
                
                //create a user dao object
               out.println(user.getName());
                //out.println(user.getGender());
                //out.println(user.getPhnnum());
                studentdao dao;
                dao = new studentdao(connectionprovider.getConnection());
                if(connectionprovider.getConnection()==null){
                    out.println("not connected");}
                if(user==null)
                    out.println("user not connect");
               int s=dao.saveUser(user);
                if(s==1)
                {
                   request.getRequestDispatcher("/login-student.jsp").forward(request,response);
                }
                else
                {
                    out.println("error");
                }
              // out.println(dao.saveUser(user));
                
      
        }
        }
    }

   
    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
