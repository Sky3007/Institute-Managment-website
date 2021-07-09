
package com.tech.servlet;

import com.tech.dao.studentdao;
import com.tech.entities.users;
import com.tech.helper.connectionprovider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class editstudentform extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
           studentdao dao=new studentdao(connectionprovider.getConnection());
                 String userEmail=request.getParameter("email");
                 out.println(userEmail);
                 users bean=dao.getRecordByEmail(userEmail);
                 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet editstudentform</title>"); 
             out.print("<style>");
             out.print("https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css");
             out.print("css/newcss.css");
             out.print("//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css");
             out.print("</style>");
            out.println("</head>");
            out.println("<body>");
            request.getRequestDispatcher("navbar.jsp").include(request, response);
            out.println("<div class='container'>");
		
		out.print("<h1>Edit Student Form</h1>");
		out.print("<form action='updatestudent' method='post'>");
		out.print("<table>");
            //    out.println("<h1>"+bean.getName()+"</h1>");
		out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+bean.getName()+"'/></td></tr>");
		out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+bean.getEmail()+"'/></td></tr>");
		out.print("<tr><td>Sex:</td><td><input type='text' name='sex' value='"+bean.getGender()+"'/></td></tr>");
		out.print("<tr><td>Course:</td><td><input type='text' name='course' value='"+bean.getCource()+"'/></td></tr>");
                out.print("<tr><td>Address:</td><td><textarea name='address' style='width:300px;height:100px;'>"+bean.getAddress()+"</textarea></td></tr>");
		out.print("<tr><td>Contact No:</td><td><input type='text' name='contact' value='"+bean.getPhnnum()+"'/></td></tr>");
                out.print("<tr><td>Password:</td><td><input type='text' name='password' value='"+bean.getpassword()+"'/></td></tr>");
		out.print("<tr><td colspan='2' align='center'><input type='submit' value='Update Student'/></td></tr>");
            
                out.println("<script type='text/javascript'>");
RequestDispatcher dispatcher = request.getRequestDispatcher("//code.jquery.com/jquery-3.6.0.min.js");
request.getRequestDispatcher("//cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js");
request.getRequestDispatcher("//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js");
request.getRequestDispatcher("javascript/myjs.js");
out.println("</script>");
                out.println("</body>");
            out.println("</html>");
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
