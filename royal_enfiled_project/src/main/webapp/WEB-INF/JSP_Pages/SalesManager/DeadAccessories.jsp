<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" class="bg-dark">
<!-- Mirrored from flatfull.com/themes/note/signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:17:05 GMT -->

<head>
<meta charset="utf-8" />
<title>Notebook | Web Application</title>
<meta name="description"
	content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<link rel="stylesheet" href="css/font.css" type="text/css" />
<link rel="stylesheet" href="css/app.v1.css" type="text/css" />
<link rel="stylesheet" href="js/datepicker/datepicker.css"
	type="text/css" />
<!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body class="">
	<section id="content" class="m-t-lg wrapper-md animated fadeInDown">
		<div class="container aside-xxl">
			<a class="navbar-brand block" href="index.html">DeadAccessories
				Form</a>
			<section class="panel panel-default m-t-lg bg-white">
				<header class="panel-heading text-center">
					<strong>DeadAccessories</strong>
				</header>

				<div class="form-group">
					<label class="col-sm-3 control-label">Adding Date</label>
					<div class="col-sm-3">
						<input class="input-sm input-s datepicker-input form-control"
							size="16" type="date" value="12-02-2013"
							data-date-format="dd-mm-yyyy">
					</div>
				</div>

				<form action="http://flatfull.com/themes/note/index.html"
					class="panel-body wrapper-lg">
					<div class="form-group">
						<label class="col-sm-3 control-label">BikeModel</label> <select
							data-required="true" class="form-control m-t">
							<option value="">Please choose Bike Model</option>
							<option value="foo">Foo</option>
							<option value="bar">Bar</option>
						</select>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">BikeEngineType</label> <select
							data-required="true" class="form-control m-t">
							<option value="">Please choose Bike Engine Type</option>
							<option value="foo">350cc</option>
							<option value="bar">500cc</option>
						</select>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">BikeColor</label> <select
							data-required="true" class="form-control m-t">
							<option value="">Please choose Bike Color Type</option>
							<option value="foo">Red</option>
							<option value="foo">Blue</option>
							<option value="bar">Black</option>
							<option value="foo">White</option>
						</select>
					</div>
					<div class="form-group">
						<label class="control-label">PartNames</label> <input type="text"
							name="partNames" placeholder="Enter part Names"
							class="form-control input-lg">
					</div>
					<div class="form-group">
						<label class="control-label">PartPrices</label> <input
							type="text" name="partPrices"
							placeholder="Enter ShowRoom PartPrices"
							class="form-control input-lg">
					</div>
					<div class="form-group">
						<label class="control-label">WithGstPartPrices</label> <input
							type="text" name="partPrices"
							placeholder="Enter ShowRoom PartPrices"
							class="form-control input-lg">
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">PartQuantitys</label> <input
							type='text' name='partQuantitys' id='qty' /> <input type='button'
							name='add'
							onclick='javascript: document.getElementById("qty").value++;'
							value='+' /> <input type='button' name='subtract'
							onclick='javascript: document.getElementById("qty").value--;'
							value='-' />
					</div>
					</select>
					<center>
						<a class="btn btn-s-md btn-success btn-rounded" href="#">AddDeadAccessories</a>
					</center>
				</form>
			</section>
		</div>
	</section>

	<script src="js/datepicker/bootstrap-datepicker.js"></script>
</body>
</html>