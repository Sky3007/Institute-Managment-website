

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registor</title>
        <!--css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.css">
        <style>
             body {
    background-image: url("image/login.jpg");
}</style>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <main class="primary-background banner-backgruond">
            <div class="container">
                <div class="col-md-6 offset-md-4">
                    
                    <div class="card">
                        <div class="card-header text-center">
                            <span class="fa fa-3x fa-user-circle"></span><br> Registration form
                        </div>
                    </div>
                    
                    <div class="card-body">
                        <form id="stu-reg" action="Registerservlet" method="POST">
    <div class="form-group">
    <label for="user_name">User Name</label>
    <input type="text" name="user_name" class="form-control" id="user_name" aria-describedby="emailHelp" placeholder="Enter name">
  </div>
     
    <div class="form-group">
    <label for="M/F">Gender</label><br>
   <input type="radio" name="user_gender"  id="gender" value='Male' >Male
   <input type="radio" name="user_gender" id="gender" value="Female">Female
  </div>                        
                            
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" name="user_email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
                            
   <div class="form-group">
    <label for="courses">Courses</label>
    <select name="user_course">
        <option>Select</option>
<option>Java</option>
<option>NIMSET</option>
<option>DATA Structure</option>
<option>C++</option>
<option>DBMS</option>
<option>Descrete mathmatics</option>
</select>
  </div>   
                            
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="user_password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
                             
                            
  <div class="form-group">
    <label for="exampleInputPassword1">Address</label><br>
    <textarea name="address" style="width:300px;height:100px;"></textarea>
  </div>
  
  <div class="form-group">
    <label for="exampleInputPassword1">Contact</label>
    <input type="number" name="contact"/>
  </div>
                            
  <div class="form-check">
    <input type="checkbox" name="check" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">terms and condition</label>
  </div>
          <br>
          <div class="container text-center" id="loader" style="display: none;">
              <span class="fa fa-hourglass-half fa-spin" ></span>
              <h4>Please wait..</h4>
          </div>
                            <br>
    <button type="submit" class="btn btn-primary" id="s-btn" >Submit</buttton>
</form>
                    </div>
                    
                    <div class="card-footer">
                        <a href="index.jsp"> Home  </a><t>
                        <a href="login-student.jsp">  Login</a>
                    </div>
                    
                </div>
            </div>
        </main>
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
