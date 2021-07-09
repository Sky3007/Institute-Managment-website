
package com.tech.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.tech.dao.accountdao;
import com.tech.entities.accountant;
import com.tech.helper.connectionprovider;
public class addAccServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String name=request.getParameter("user_name");
               // String gender=request.getParameter("user_gender");
                String email=request.getParameter("user_email");
                //String course=request.getParameter("user_course");
                String password=request.getParameter("user_password");
                String address=request.getParameter("address");
                String contact=request.getParameter("contact");
                
                
                accountant acc = new accountant(name,email,password,address,contact);
            accountdao dao ;
            dao=new accountdao(connectionprovider.getConnection());
            if(connectionprovider.getConnection()==null){
                    out.println("not connected");}
                if(acc==null)
                    out.println("user not connect");
                if(dao.save(acc)==1)
                {
                    out.println("<script type=\"text/javascript\">");
                   out.println("alert('added sucessfully!.');");
                    out.println("</script>");
                    request.getRequestDispatcher("/admin.jsp").forward(request,response);
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
