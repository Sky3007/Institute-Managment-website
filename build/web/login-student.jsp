

<%@page import="com.tech.entities.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <!--css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
             body {
    background-image: url("image/login.jpg");
}</style>
    </head>
    <body>
        <!--navbar-->
        <%@include file="navbar.jsp"%>
        <main class="d-flex align-items-center primary-background " style="height: 90vh">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 offset-md-4">
                        <div class="card-header primary text-muted ">
                            <span class="fa fa-user-circle faa-3x text-center"></span> <b>Login As Student</b>
                        </div>
                        <%
                            Message m=(Message)session.getAttribute("msg");
                            if(m!=null)
                            {
                                %>
                                <div class="alert <%= m.getContent()%>" role="alert">
  <%= m.getContent()%>
</div>
                                <%
                                    session.removeAttribute("msg");
                                    }

                         %>
                        
                        <div class="card-body">
                            <form action="viewstudentservlet" method="POST">
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input name="email" required type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input name="password" required type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  
  <div class="container text-center">
                                    <button type="submit" class="btn btn-primary">Submit</button></div>
</form>
                        </div>
                    </div>
                </div>
                
                
                
         
            </div>
        </main>
        <!javascript----->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="javascript/myjs.js" type="text/javascript"></script>
    </body>
    
</html>
