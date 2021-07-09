<%@page import="com.tech.dao.studentdao"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.tech.entities.users"%>
<%@page import="com.tech.servlet.viewallstudent" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student update</title>
        <!--css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-backgruond
            {
                clip-path: polygon(50% 0%, 100% 8%, 100% 84%, 75% 100%, 25% 100%, 0 85%, 0 6%);
            }
            </style>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
       <ul> <h1><b>List of Student</h1> </ul>
        <%
            List<users> use=(List<users>)session.getAttribute("Currentuser");
            
            //List<users> l=studentdao.getfullrecord();
   // Iterator<users> itr=use.iterator();
     if(use==null)
    {
        out.println(use);
        response.sendRedirect("login-student.jsp");
    }
        
     else{
       
       out.println("<table class='table table-bordered table-striped'>");
		out.print("<tr><th>Rollno</th><th>Name</th><th>Email</th><th>Sex</th><th>Course</th><th>address</th><th>contact</th><th>Delete</th><th>Edit</th>");
		//out.println(use.get(1).getName());
                int c=1;
                for(users bean:use){
                    //out.println("heloooo");
                        //out.println(bean.getName());
			out.print("<tr><td>"+c+++"</td><td>"+bean.getName()+"</td><td>"+bean.getEmail()+"</td><td>"+bean.getGender()+"</td><td>"+bean.getCource()+"</td><td>"+bean.getAddress()+"</td><td>"+bean.getPhnnum()+"</td><td><a href='deletestudent?email="+bean.getEmail()+"'>Delete</a></td><td><a href='confirmstudent.jsp'>Edit</a></td></tr>");
		}
                
		out.println("</table>");}
    
%>
        <!javascript----->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="javascript/myjs.js" type="text/javascript"></script>
<script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert-dev.js"></script>
  
<script>
   echo '<script>
    setTimeout(function() {
        swal({
            title: "Wow!",
            text: "Message!",
            type: "success"
        }, function() {
            window.location = "redirectURL";
        });
    }, 1000);
</script>';
</script>
    </body>
</html>
