<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login form</title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
       <style><%@include file="/css/main.css"%></style>
        <!-- Favicon and touch icons -->

    </head>

    <body>
        <div class="container">
            <div class="row">            
                <div class="login-container col-lg-4 col-md-6 col-sm-8 col-xs-12">
                     <div class="login-title text-center">
                     </div>
                    <div class="login-content">
                        <div class="login-header ">
                            <h3><strong>Register</strong></h3>
                            
                        </div>
                        <div class="login-body">
                            <form role="form" action="registerUser" method="post" class="login-form">
                                <div class="form-group ">
                                    <div class="pos-r">                                        
                                        <input   id="form-username" type="text" name="name" placeholder="Name" class="form-username form-control">
                                        <i class="fa fa-user"></i>
                                        <span></span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="pos-r">                                    
                                        <input id="form-password" type="email" name="email" placeholder="Email" class="form-password form-control" >
                                        <i class="fa fa-envelope"></i>
                                        <span></span>                                        
                                    </div>
                                </div>
                                <div class="form-group ">
                                    <div class="pos-r">                                        
                                        <input   id="form-username" type="password" name="password" placeholder="Password" class="form-username form-control">
                                        <i class="fa fa-lock"></i>
                                        <span></span>
                                    </div>
                                </div>
                                <div class="form-group ">
                                    <div class="pos-r">                                        
                                        <input   id="form-username" type="text" name="mobile" placeholder="Mobile" class="form-username form-control">
                                        <i class="fa fa-mobile-phone"></i>
                                        <span></span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="pos-r">                                    
                                        <input id="form-password" type="password" name="address" placeholder="City" class="form-password form-control" >
                                        <i class="fa fa-compass"></i>
                                        <span></span>                                        
                                    </div>
                                </div>
                                <div class="form-group text-right">     
                                    <a href="#" class="bold"> Forgot password?</a>
                                </div>
                                
                                <div class="form-group">     
                                    <button type="submit" class="btn btn-warning form-control"><strong>Sign in</strong></button>  
                                </div>   
                                                                              
                            </form>
                        </div> <!-- end  login-body -->                     
                    </div><!-- end  login-content -->  
                    <div class="login-footer text-center template">
                        <h5>Back To Login?<a href="login" class="bold">Login </a></h5>
                    </div>
                </div>  <!-- end  login-container -->      

            </div>
        </div><!-- end container -->

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </body>

</html>