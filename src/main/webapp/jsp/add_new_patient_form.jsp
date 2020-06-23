<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Book Appointments</title>
  </head>
  <%@include  file="/html/navbar.html" %>
  <body>
 <div class="container register-form">
            <div class="form">
                <div class="note">
                    <h4>Add New Patient</h4>
                </div>

<form action="addNewPatient" method="post">
                <div class="form-content">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Patient Name *" name="patName"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Patient Identification (ID) *" name="patId"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Sympotem *" name="patSympotem"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Doc-Name *" name="patSymDoctor"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Bed.No *" name="patBed"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Date Of Adimit DD/MM/YYYY*" name="patAdimitionDate"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Contact Number *" name="patPhone"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Surgery *" name="patSurgery"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Comments *" name="patSurgeryComments"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Address *" name="patAddress"/>
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