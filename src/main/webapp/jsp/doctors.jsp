<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>HMS</title>
  </head>
  <%@include  file="/html/navbar.html" %>
  <style ><%@include  file="/css/adminCard.css" %></style>
  <body><br>
<div class="container">
<div>
<a class="btn btn-primary" href="addDoctor_form" role="button">Add Doctor</a>
			
		</div>
<br>
  <div class="row" align="center">
    <div class="col-12">
      <table class="table table-bordered">
        <thead align="center">
          <tr>
            <th scope="col">Sr.No</th>
            <th scope="col">ID </th>
            <th scope="col">Name</th>
            <th scope="col">Department</th>
            <th scope="col">Phone</th>
            <th scope="col">Email</th>
            <th scope="col">Shift</th>
            <th scope="col">Action</th>
          </tr>
        </thead>
        <tbody align="center">
          <core:forEach var="doc" items="${doctors}">
          <tr>
            <th scope="row">1</th>
            <td>${doc.employee_Id}</td>
            <td>${doc.emloyee_Name}</td>
            <td>${doc.department_Name}</td>
            <td>${doc.phone_Number}</td>
            <td>${doc.email}</td>
            <td>${doc.hire_Date}</td>
            <td>
              <button type="button" class="btn btn-primary"><i class="fa fa-eye"></i></button>
              <button type="button" class="btn btn-success"><i class="fa fa-edit"></i></button>
            <button type="button" class="btn btn-danger"><i class="fa fa-trash"></i></button>
            </td>
          </tr>
          </core:forEach>
        </tbody>
      </table>
    </div>
  </div>
</div>
 
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>