/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.servlet;

import com.tech.dao.accountdao;
import com.tech.entities.Message;
import com.tech.entities.accountant;
import com.tech.helper.connectionprovider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class viewaccountServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet viewaccountServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            request.getRequestDispatcher("navbar.jsp").include(request, response);
            out.println("<div class='container'>");
		
		out.print("<h1>View Admin</h1>");
	
		String userEmail=request.getParameter("email1");
                String userPassword=request.getParameter("password1");
                
                //out.println(userEmail);
                //out.println(userPassword);
                
                accountdao dao=new accountdao(connectionprovider.getConnection());
                
                if(dao==null)
                    out.println("ERRORR");
                
                accountant data=dao.getrecords(userEmail, userPassword);
             //   out.println(data);
                
                if(data==null)
                {
                    out.println("INvalid Detail Try again!!");
                    
                    Message msg= new Message("Invalid Details Try again!","error","alert-danger");
                    
                    HttpSession s=request.getSession();
                    s.setAttribute("msg", msg);
                    //response.sendRedirect("login-student.jsp");
                }
                else
                {
                    out.println("welcome!!");
                    HttpSession s=request.getSession();
                    s.setAttribute("Currentuser", data);
                    response.sendRedirect("accountantview.jsp");
                }
                
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
