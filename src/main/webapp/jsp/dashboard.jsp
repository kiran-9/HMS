<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>HMS</title>
  </head>
  <%@include  file="/html/navbar.html" %>
  <style><%@include file="/css/card.css"%></style>
  <body>

	<div class="parent">

		<div class="div1">
			<div class="card" align="center">
				<div class="card-body">
					<div class="clock">
						<%@include file="/html/clock.html"%>
					</div>
					<h3 class="card-title">
						Chat
						</h3>
						
				</div>
			</div>
		</div>

		<div class="div2">
			<a href="doctors" style="text-decoration:none; color: black;">
				<div class="card" align="center">
					<img src="https://img.icons8.com/color/48/000000/doctor-male--v1.png" alt="Card image cap"/>
					<div class="card-body">
						<h5 class="card-title">Doctors</h5>
					</div>
			</a>
		</div>
	</div>


	<div class="div3">
	<a href="nurses" style="text-decoration:none; color: black;">
		<div class="card" align="center" >
				<img src="https://img.icons8.com/color/48/000000/nurse-female--v1.png" alt="Card image cap"/>
				<div class="card-body">
					<h5 class="card-title">Nurse</h5>
				</div>
			</div>
	</a>
		</div>
		
		<div class="div4">
		<a href="patients" style="text-decoration:none; color: black;">
		<div class="card" align="center" >
				<img src="https://img.icons8.com/color/48/000000/patient-oxygen-mask.png" alt="Card image cap"/>
				<div class="card-body">
					<h5 class="card-title">Patients</h5>
				</div>
			</div>
		</a>
		</div>
		
		<div class="div5">
		<a href="pharmacy" style="text-decoration:none; color: black;">
		<div class="card" align="center" >
				<img src="https://img.icons8.com/color/48/000000/pharmacy-shop.png" alt="Card image cap"/>
				<div class="card-body">
					<h5 class="card-title">Pharmacy</h5>
				</div>
			</div>
		</a>
		</div>
		
		<div class="div6">
		<a href="surgeries" style="text-decoration:none; color: black;">
		<div class="card" align="center" >
				<img src="https://img.icons8.com/color/48/000000/surgery.png" alt="Card image cap"/>
				<div class="card-body">
					<h5 class="card-title">Surgeries</h5>
				</div>
			</div>
		</a>
		</div>
		
		<div class="div7">
		<a href="laboratory" style="text-decoration:none; color: black;">
		<div class="card" align="center" >
				<img src="https://img.icons8.com/fluent/48/000000/test-tube.png" alt="Card image cap"/>
					<div class="card-body">
					<h5 class="card-title">laboratory</h5>
				</div>
			</div>
		</a>
		</div>
		
		<div class="div8">
		<a href="appointments" style="text-decoration:none; color: black;">
		<div class="card" align="center" >
				<img src="https://img.icons8.com/color/48/000000/health-checkup.png" alt="Card image cap"/>
					<div class="card-body">
					<h5 class="card-title">Appointment</h5>
				</div>
			</div>
		</a>
		</div>
		
		<div class="div9">
		<a href="schedule" style="text-decoration:none; color: black;">
		<div class="card" align="center" >
				<img src="https://img.icons8.com/color/48/000000/planner.png"/>
				<div class="card-body">
					<h5 class="card-title">schedule</h5>
				</div>
			</div>
		</a>
		</div>
		
		<div class="div10">
		<a href="employees" style="text-decoration:none; color: black;">
		<div class="card" align="center" >
				<img src="https://img.icons8.com/color/48/000000/men-age-group-5.png"/>
				<div class="card-body">
					<h5 class="card-title">Employees</h5>
				</div>
			</div>
		</a>
		</div>
		
		<div class="div11">
		<a href="reports" style="text-decoration:none; color: black;">
		<div class="card" align="center" >
				<img src="https://img.icons8.com/color/48/000000/treatment-plan.png"/>
				<div class="card-body">
					<h5 class="card-title">Reports</h5>
				</div>
			</div>
		</a>
		</div>
		
		<div class="div12">
		<a href="accounts" style="text-decoration:none; color: black;">
		<div class="card" align="center" >
				<img src="https://img.icons8.com/color/48/000000/coins.png"/>
				<div class="card-body">
					<h5 class="card-title">Accounts</h5>
				</div>
			</div>
		</a>
		</div>
		
		<div class="div13">
		<a href="administration" style="text-decoration:none; color: black;">
		<div class="card" align="center" >
				<img src="https://img.icons8.com/color/48/000000/admin-settings-male.png"/>
				<div class="card-body">
					<h5 class="card-title">Administration</h5>
				</div>
			</div>
		</a>
		</div>
		
		<div class="div14">
		<a href="Doctors" style="text-decoration:none; color: black;">
		<div class="card" align="center" >
				<div class="card-body">
					<h5 class="card-title" style="color: red;">News</h5>
					<h6 style="color: green;">
							Coronavirus disease (COVID-19) Situation dashboard This
							interactive dashboard/map provides the latest global numbers and
							numbers by country of COVID-19 cases on a daily basis.
							</h6>
				</div>
			</div>
		</a>
		</div>

	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>