<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>onlineConsultantDoctor</title>
  </head>
  <%@include  file="/html/navbar.html" %>
  <body>

<div class="container register-form">
            <div class="form">
                <div class="note">
                    <h4>Add Doctor.</h4>
                </div>

<form action="addNewDoctor" method="post">
                <div class="form-content">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Name *" name="emloyee_Name"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Email *" name="email"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Phone Number *" name="phone_Number"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Department *" name="department_Name"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Salary *" name="salary"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Experience *" name="experience"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Hire Date - DD/MM/YYYY *" name="hire_Date"/>
                            </div>
                        </div>
                    </div>
                    <button type="submit" class="btnSubmit">Add</button>
                </div>
</form>
            </div>
        </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>