<%@page import="com.tech.entities.accountant"%>
<%
    accountant use=(accountant)session.getAttribute("Currentuser");
    if(use==null)
    {
     //   response.sendRedirect("login-student.jsp");
        out.println("INvalid Detail Try again!!jsp");
    }

    %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
        <!--css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
           body {
    background-image: url("image/login.jpg");
}
            </style>
    </head>
    <body>
        <!--navbar-->
       <nav class="navbar navbar-expand-lg navbar-dark bg-dark ">
  <a class="navbar-brand" href="index.jsp"><span class="fa fa-check-circle"></span>Flux</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
          <a class="nav-link" href="addacc.jsp"><span class="fa fa-home"></span>Accountant <span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Cources
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="nimset.jsp">NIMSET</a>
          <a class="dropdown-item" href="cplus.jsp">C++</a>
          <a class="dropdown-item" href="dbms.jsp">DBMS</a>
          <a class="dropdown-item" href="java.jsp">JAVA</a>
          <a class="dropdown-item" href="dm.jsp">Discrete Maths</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="datastructure.jsp">Data Structure</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="contact.jsp">Contact</a>
      </li>
     
      
    </ul>
      
    <ul class="navbar-nav mr-right">
        <li class="nav-item">
        <a class="nav-link" ><span class="fa fa-user"></span> <%= use.getName()%> </a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="logoutadmin">Logout</a>
      </li>
            </ul>
  </div>
</nav>
      <form action="viewallstudent" method="POST">
        <h1> Welcome <%= use.getName()%>! </h1>
        <table class='table table-bordered table-striped'>
		<tr><th>Name <br><%= use.getName()%></th><th>Email <br> <%= use.getEmail()%></th><th>address <br>
        <%= use.getAddress()%></th><th>contact <br>
        <%= use.getContact()%> </th>
        </table>
  
        <div class="container text-center" >
            <button type="submit" class="btn btn-primary" id="s-btn" > Registerd Student</button>
        </div>
        
      </form>
         <!javascript----->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="javascript/myjs.js" type="text/javascript"></script>
    </body>
</html>
