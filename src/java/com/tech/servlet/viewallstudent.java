/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.servlet;

import com.tech.dao.studentdao;
import com.tech.entities.Message;
import com.tech.entities.users;
import com.tech.helper.connectionprovider;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author anjal
 */
public class viewallstudent extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet viewallstudent</title>");            
            out.println("</head>");
            out.println("<body>");
           request.getRequestDispatcher("navbar.jsp").include(request, response);
            out.println("<div class='container'>");
		
		out.print("<u><b><h3>All Registerd Studens</h1></b></u>");
                studentdao dao=new studentdao(connectionprovider.getConnection());
                
                List<users> data=dao.getfullrecord();
                //out.println(data.get(0).getEmail());
                
                out.println("<table class='table table-bordered table-striped'>");
		out.print("<tr><th>Name</th><th>Email</th><th>Sex</th><th>Course</th><th>address</th><th>contact</th>");
		if(data==null)
                {
                    //out.println("INvalid Detail Try again!!");
                    Message msg= new Message("Invalid Details Try again!","error","alert-danger");
                    
                    HttpSession s=request.getSession();
                    s.setAttribute("msg", msg);
                    response.sendRedirect("login-student.jsp");
                }
                else
                {
                    HttpSession s=request.getSession();
                    s.setAttribute("Currentuser", data);
                    response.sendRedirect("viewallstudent.jsp");
                }
		out.println("</table>");
		out.println("</div>");
                
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
