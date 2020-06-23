<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Patients</title>
  </head>
  <%@include  file="/html/navbar.html" %>
   <style ><%@include  file="/css/card.css" %></style>
  <body>

<div>
<a  class="btn btn-primary" href="add_new_patient_form" role="button">Add Patient</a>
</div>
<table class="tg">
<thead>
  <tr>
    <th class="tg-on0t">Patient Name</th>
    <th class="tg-on0t">Sympotem</th>
    <th class="tg-on0t">Doc-Name</th>
    <th class="tg-on0t">Bed.No</th>
    <th class="tg-on0t">Date Of Adimit</th>
    <th class="tg-on0t">Contact Number</th>
    <th class="tg-on0t">Surgery</th>
    <th class="tg-on0t">Comments</th>
  </tr>
</thead>
<tbody align="center">
<c:forEach var="pat" items="${patients}">
  <tr>
    <td class="tg-jgo1">${pat.patName}</td>
    <td class="tg-jgo1">${pat.patSympotem}</td>
    <td class="tg-jgo1">${pat.patSymDoctor}</td>
    <td class="tg-jgo1">${pat.patBed}</td>
    <td class="tg-jgo1">${pat.patAdimitionDate}</td>
    <td class="tg-jgo1">${pat.patPhone}</td>
    <td class="tg-jgo1">${pat.patSurgery}</td>
    <td class="tg-jgo1">${pat.patSurgeryComments}</td>
  </tr>
</c:forEach>
</tbody>
</table>


    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>