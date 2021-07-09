
package com.tech.servlet;

import com.tech.dao.studentdao;
import com.tech.entities.users;
import com.tech.helper.connectionprovider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class updatestudent extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        try (PrintWriter out = response.getWriter()) {
           
            
            String name=request.getParameter("name");
	 	String email=request.getParameter("email");
		String sex=request.getParameter("sex");
		String course=request.getParameter("course");
		//int fee=Integer.parseInt(request.getParameter("fee"));
		//int paid=Integer.parseInt(request.getParameter("paid"));
		//int due=Integer.parseInt(request.getParameter("due"));
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
                String password=request.getParameter("password");
		
		users user=new users(name, email, sex, course,address, contact,password);
		studentdao dao;
              //  out.println(user.getName());
               // out.println(user.getEmail());
                dao = new studentdao(connectionprovider.getConnection());
                int s=dao.update(user);
                //response.sendRedirect("viewallstudent");
                if(connectionprovider.getConnection()==null){
                    out.println("not connected");}
                if(user==null)
                    out.println("user not connect");
                if(s!=0)
                {
                    out.println("<script type=\"text/javascript\">");
            out.println("alert('Product updated.');");
            out.println("location='viewallstudent';");
            out.println("</script>");
                }
                else
                {
                    out.println("error");
                }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
