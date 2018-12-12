<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!--//author: Dipali  -->
<meta charset="utf-8" />
<title>Notebook | Web Application</title>
<meta name="description"
	content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<link rel="stylesheet "
	href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css"
	type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
<style>
body {
	background-image:
		url("${pageContext.request.contextPath}/Resources/Royal Enfield images/wp3609142.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	background-attachment: fixed;
}

h2 {
	color: black;
	text-align: center;
	margin-left: 20px;
}

.panel {
	position: relative;
	margin-top: 3%;
	opacity: 0.5;
}
</style>
<script>
	function createXmlHttpRequestObject() {
	var xmlHttp;
	if (window.ActiveXObject) {
		try {
			xmlHttp = new ActiveXObject(Microsoft.XMLHTTP);
		} catch (e) {
			xmlHttp = false;
		}
	} else {
		try {
			xmlHttp = new XMLHttpRequest();
		} catch (e) {
			xmlHttp = false;
		}
	}
	if (!xmlHttp)
		alert("cant create xmlHttp object");
	else
		return xmlHttp;
	}
		
	function showForm() {
		document.getElementById("panel").style.opacity = "1";
	}
	
	function openFile() {
		var fileReader = new FileReader();
		fileReader.readAsDataURL(document.getElementById("file").files[0]);
		fileReader.onload = function(oFREvent) {
			document.getElementById("uploadPreview").src = oFREvent.target.result;
		};
	}
	
	function checkPassword() {
		var password = document.getElementById("password").value;
		console.log(password);
		var confirmPassword = document.getElementById("confirmPassword").value;
		console.log(confirmPassword);
		var passwordMessage = document.getElementById("passwordMessage");
		console.log(passwordMessage);
		if ((password == null && confirmPassword == null)
				|| (password == confirmPassword)) {

			passwordMessage.style.display = "none";
		} else {
			passwordMessage.innerHTML = "password must be same";
			passwordMessage.style.display = "initial";
		}
	}
	
</script>

</head>
<body>
	<div class="container-fluid">
		<div class="col-md-5 col-md-offset-3">
			<div class="panel panel-success" onmouseover="showForm()" id="panel">
				<div class="panel-heading">
					<h2>Registration Form</h2>
				</div>
				<form action="saveEmployee" data-validate="parsley"
					enctype="multipart/form-data" method="post">
					<div class="panel-body">
						<!-- name -->
						<div class="row">
							<div class="col-md-5">
								<div class="form-group">
									<img
										src="${pageContext.request.contextPath}/Resources/images/profilePic.png"
										alt="Smiley face" height="150" width="150" id="uploadPreview">
								</div>
							</div>
							<div class="col-md-7">
								<div class="form-group">
									<label for="name">Name:</label> <input type="text"
										class="form-control" id="name" placeholder="Enter name"
										name="employeeName" required>

								</div>
								<!-- Gender -->
								<div class="form-group">
									<div class="row">
										<label for="gender">Gender:</label>
									</div>
									<label class="radio-inline "> <input type="radio"
										name="employeeGender" value="male" checked>Male
									</label> <label class="radio-inline"> <input type="radio"
										name="employeeGender" value="female">Female
									</label>
								</div>
							</div>
						</div>
						<!-- file tag -->
						<div class="row">
							<div class="col-md-offset-1">
								<input type='file' accept='image/*' onchange='openFile()'
									name="profilePic" id="file" required="required">
							</div>
						</div>
						<!-- address -->
						<div class="form-group">
							<label for="address">Address:</label>
							<div class="row">
								<div class="col-md-6">
									<input type="text" class="form-control" id="employeeAreaName"
										placeholder="Enter areaname" name="employeeAreaName" required>
								</div>
								<div class="col-md-6">
									<input type="text" class="form-control" id="cityname"
										placeholder="Enter cityname" name="employeeCityName" required>
								</div>

							</div>
							<br>

							<div class="form-group">
								<div class="row">
									<div class="col-md-6">
										<input type="text" class="form-control" id="employeeStateName"
											placeholder="Enter statename" name="employeeStateName"
											required>
									</div>
									<div class="col-md-6">
										<input type="text" class="form-control"
											id="employeeCountryName" placeholder="Enter countryname"
											name="employeeCountryName" required>
									</div>
								</div>
							</div>

							<div class="form-group">
								<div class="row">
									<div class="col-md-6">
										<input type="text" class="form-control" id="pincode"
											placeholder="Enter pincode" name="employeePincode" required>
									</div>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-6">
								<!-- mobile no -->
								<div class="form-group">
									<label>Mobile no:</label> <input type="text"
										class="form-control" data-type="phone"
										placeholder="(XXX) XXXX XXX" data-required="true"
										name="employeeMobileNumber">
								</div>
							</div>
							<div class="col-md-6">

								<!-- date of birth -->
								<div class="form-group">
									<label for="employeeDateOfBirth">Date Of Birth:</label> <input
										type="date" name="employeeDateOfBirth" required>
								</div>

								<!-- designation -->
								<!-- <div class="form-group">
									<label for="designation">Designation</label> <input type="text"
										class="form-control" placeholder="Enter Designation"
										name="employeeDesignation" data-required="true">
								</div> -->
							</div>
						</div>




						<div class="row">
							<div class="col-md-6">
								<!-- date of joining -->
								<div class="form-group">
									<label for="employeeJoiningDate">Date Of Joining </label> <input
										type="date" name="employeeJoiningDate" required>
								</div>
							</div>

							<div class="col-md-6">
								<!-- email -->
								<div class="form-group">

									<label for="employeeEmail">Email:</label>
									<div class="input-group">
										<span class="input-group-addon"><i
											class="glyphicon glyphicon-user"></i></span> <input id="email"
											type="text" class="form-control parsley-validated"
											name="employeeEmail" placeholder="Email" data-type="email"
											data-required="true">
									</div>
									<div class="emailMessage"></div>
								</div>
							</div>

						</div>
						<div class="row">
							<div class="col-md-6">
								<!-- password -->
								<div class="form-group">

									<label for="employeePassword">Password:</label>
									<div class="input-group">
										<span class="input-group-addon"><i
											class="glyphicon glyphicon-lock"></i></span> <input id="password"
											type="password" class="form-control" name="employeePassword"
											placeholder="Password" required="required">
									</div>

								</div>

							</div>
							<div class="col-md-6">
								<!--Confirm password -->
								<div class="form-group">

									<label for="employeePassword">Confirm Password:</label>
									<div class="input-group">
										<span class="input-group-addon"><i
											class="glyphicon glyphicon-lock"></i></span> <input
											id="confirmPassword" type="password" class="form-control"
											name="employeePassword" placeholder="Password"
											onchange="checkPassword()" required="required">
									</div>
									<small id="passwordMessage" class="alert-danger"></small>
								</div>
							</div>
						</div>
						<!-- terms of services -->
						<label> <input type="checkbox" name="check"
							data-required="true" class="parsley-validated"> I agree
							to the <a href="#" class="text-info">Terms of Service</a>
						</label>
					</div>



					<div class="panel-footer panel-success ">
						<button type="submit" class="btn btn-success btn-block btn-lg">Register</button>
					</div>
				</form>
				<!-- close pannal-default -->
			</div>
		</div>
	</div>

	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/parsley/parsley.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/parsley/parsley.extend.js"></script>
	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/app.v1.js"></script>
	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/app.plugin.js"></script>
</body>
</html>