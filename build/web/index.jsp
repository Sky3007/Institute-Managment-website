
<%@page import="com.tech.helper.connectionprovider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!--css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            
            body {
    background-image: url("image/project_1.jpg");
}
            </style>
    </head>
    <body>
        
        <%@include file="navbar.jsp"%>
        <!--banner-->
        <div class="container-fluid p-0 m-0">
            <div class="jumbotron">
            <div class="container">
                <h3 class="display-3"> Welcome in Flux Coaching institute!</h3>
                <p> “Attitude is a choice. Happiness is a choice. Optimism is a choice. Kindness is a choice. Giving is a choice. Respect is a choice. Whatever choice you make makes you. Choose wisely!"</p>
                
                <a href="Student_reg.jsp" class="btn btn-outline-light btn-lg"> <span class="fa fa-user"></span>start! its free</a>
                <a href="login-student.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa-user fa-spin"></span> login</a>
            </div>
        </div>
            
   
        </div>
        <!--cards-->
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="card" >
                        <img class="card-img-top" src="https://tse4.mm.bing.net/th?id=OIP.4NgnkuzMjnEV9t1Nj6ImNQHaEo&pid=Api&P=0&w=294&h=184" alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title">NIMSET 2022</h5>
    <p class="card-text"> Do you want to take admission in top collegs of <b>INDIA</b><br> Hurry up ! Limited seats</p>
    <a href="nimset.jsp" class="btn btn-primary text-white">Read more</a>
  </div>
</div>
                </div>
                <div class="col-md-4">
                    <div class="card" >
                        <img class="card-img-top" src="https://tse2.mm.bing.net/th?id=OIP.-cP0wDTdQTr739GMijVfqwHaEK&pid=Api&P=0&w=271&h=153" alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title">DBA</h5>
    <p class="card-text"> Learn how to handle a database with live <b>DEMO!!!</b> </p>
    <a href="dbms.jsp" class="btn btn-primary text-white">Read more</a>
  </div>
</div>
                </div>
                <div class="col-md-4">
                    <div class="card" >
  <img class="card-img-top" src="https://tse4.mm.bing.net/th?id=OIP.deYTHi4OCg6-hPoM7ZI-5AHaEo&pid=Api&P=0&w=275&h=173" alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title">JAVA</h5>
    <p class="card-text">Complete course with core java and  advance java<br> <b> A chance to Work on live project</b></p>
    <a href="java.jsp" class="btn btn-primary text-white">Read more</a>
  </div>
</div>
                </div>
                
                
                <div class="col-md-4">
                    <div class="card" >
  <img class="card-img-top" src="https://tse1.mm.bing.net/th?id=OIP.S6iNHKPtE6BW9luqvtVRpwHaDt&pid=Api&P=0&w=301&h=151" alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title">DATA Structure</h5>
    <p class="card-text">Want to work with Top MNC's Enroll now to reserve your seat and learn from basic to advance level<br><b>Hurry up! <br > Limited Seats !</b></p>
    <a href="datastructure.jsp" class="btn btn-primary text-white">Read more</a>
  </div>
</div>
                </div>
                 <div class="col-md-4">
                    <div class="card" >
  <img class="card-img-top" src="https://tse3.mm.bing.net/th?id=OIP.XuUaCX8tI3Bp6jvcTChPHQHaEK&pid=Api&P=0&w=297&h=168" alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title">C++</h5>
    <p class="card-text"> Build your future as a Software engineer <br><b> Start now !</b> </p>
    <a href="datastructure.jsp" class="btn btn-primary text-white">Read more</a>
            </div>
  
            
        </div>
                 </div>
                 <div class="col-md-4">
                    <div class="card" >
  <img class="card-img-top" src="https://tse1.mm.bing.net/th?id=OIP.ye0MtE9yySgoCg7_Q5ZRzQHaDL&pid=Api&rs=1&c=1&qlt=95&w=278&h=119" alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title">Discreate Mathmetics</h5>
    <p class="card-text"> New batches start reserve you seat<br><b> Hurry Up !</b> </p>
    <a href="datastructure.jsp" class="btn btn-primary text-white">Read more</a>
            </div>
  
            
        </div>
                 </div>
                
    
        <!javascript----->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="javascript/myjs.js" type="text/javascript"></script>


</body>
</html>
