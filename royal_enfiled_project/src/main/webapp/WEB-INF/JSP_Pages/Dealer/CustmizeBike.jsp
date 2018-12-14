<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>CustmizeBike</title>

<meta name="description"
	content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/css/app.v1.css" type="text/css" />
    
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<header class="bg-dark dk header navbar navbar-fixed-top-xs">
	<div class="navbar-header aside-md">
		<a class="btn btn-link visible-xs"
			data-toggle="class:nav-off-screen,open" data-target="#nav,html">
			<i class="fa fa-bars"></i>
		</a> <img src="images/logo1.svg" class="m-r-sm"> <a
			class="btn btn-link visible-xs" data-toggle="dropdown"
			data-target=".nav-user"> <i class="fa fa-cog"></i>
		</a>
	</div>


	<style>
img-thumbnail1 {
	max-width: 100%;
	margin: auto;
	border: 1px solid red;
}
/* Three image containers (use 25% for four, and 50% for two, etc) */
.column {
	float: left;
	width: 33.33%;
	padding: 5px;
}
/* Clear floats after image containers */
.row::after {
	content: "";
	clear: both;
	display: table;
}
.row {
	display: flex;
}
.column {
	flex: 33.33%;
	padding: 5px;
}
figcaption {
	display: block;
	font-size: large;
}
</style>
</head>
<body>
	<h1>Purchase custmize Bike</h1>

	<div>
		<div class="row">
			<div class="column">
				<img
					src="${pageContext.request.contextPath}/Resources/images/Bullet350.jpg"
					class="img-fluid img-thumbnail" alt="San Fran"
					style="width: 300px; height: auto;">
				<center>
					<figcaption>Bullet-350</figcaption>
					<button type="button" class="btn btn-default btn-sm">
						<span class="glyphicon glyphicon-shopping-cart"></span> Add To
						Cart
					</button>

					<a href="#" class="btn btn-info btn-sm"> <span>Buy Now</span>
					</a>
				</center>
			</div>
			<div class="column">
				<img
					src="${pageContext.request.contextPath}/Resources/images/Bullet-500.jpg"
					class="img-fluid img-thumbnail" alt="San Fran"
					style="width: 300px; height: auto;">
				<center>
					<figcaption>Bullet-500</figcaption>
					<button type="button" class="btn btn-default btn-sm">
						<span class="glyphicon glyphicon-shopping-cart"></span> Add To
						Cart
					</button>

					<a href="#" class="btn btn-info btn-sm"> <span>Buy Now</span>
					</a>
				</center>
			</div>
			<div class="column">

				<img
					src="${pageContext.request.contextPath}/Resources/images/Allbikes.jpg"
					class="img-fluid img-thumbnail" alt="San Fran"
					style="width: 300px; height: auto;">
				<center>
					<figcaption>All-Bikes</figcaption>
					<button type="button" class="btn btn-default btn-sm">
						<span class="glyphicon glyphicon-shopping-cart"></span> Add To
						Cart
					</button>
					<a href="#" class="btn btn-info btn-sm"> <span>Buy Now</span>
					</a>
				</center>
			</div>
			<div class="column">
				<img
					src="${pageContext.request.contextPath}/Resources/images/Classic-350new.jpg"
					class="img-fluid img-thumbnail" alt="San Fran"
					style="width: 400px; height: auto;">
				<center>
					<figcaption>Classic-350</figcaption>
					<button type="button" class="btn btn-default btn-sm">
						<span class="glyphicon glyphicon-shopping-cart"></span> Add To
						Cart
					</button>
					<a href="#" class="btn btn-info btn-sm"> <span>Buy Now</span>
					</a>
				</center>
			</div>
		</div>
		<div class="row">
			<div class="column">

				<img
					src="${pageContext.request.contextPath}/Resources/images/classic-350.jpg"
					class="img-fluid img-thumbnail" alt="San Fran"
					style="width: 300px; height: auto;">
				<center>
					<figcaption>Classic-500</figcaption>
					<button type="button" class="btn btn-default btn-sm">
						<span class="glyphicon glyphicon-shopping-cart"></span> Add To
						Cart
					</button>
					<a href="#" class="btn btn-info btn-sm"> <span>Buy Now</span>
					</a>
				</center>
			</div>
			<div class="column">
				<img
					src="${pageContext.request.contextPath}/Resources/images/Himalayan.jpg"
					class="img-fluid img-thumbnail" alt="San Fran"
					style="width: 300px; height: auto;">
				<center>
					<figcaption>Himalayan</figcaption>
					<button type="button" class="btn btn-default btn-sm">
						<span class="glyphicon glyphicon-shopping-cart"></span> Add To
						Cart
					</button>

					<a href="#" class="btn btn-info btn-sm"> <span>Buy Now</span>
					</a>
				</center>
			</div>
			<div class="column">
				<img
					src="${pageContext.request.contextPath}/Resources/images/Classic-Desert-Storm.jpg"
					class="img-fluid img-thumbnail" alt="San Fran"
					style="width: 300px; height: auto;">
				<center>
					<figcaption>Classic-Desert-Storm</figcaption>
					<button type="button" class="btn btn-default btn-sm">
						<span class="glyphicon glyphicon-shopping-cart"></span> Add To
						Cart
					</button>
					<a href="#" class="btn btn-info btn-sm"> <span>Buy Now</span>
					</a>
				</center>
			</div>
			<div class="column">
				<img
					src="${pageContext.request.contextPath}/Resources/images/Cafe Racer.jpg"
					class="img-fluid img-thumbnail" alt="San Fran"
					style="width: 300px; height: auto;">
				<center>
					<figcaption>Cafe-Racer</figcaption>

					<button type="button" class="btn btn-default btn-sm">
						<span class="glyphicon glyphicon-shopping-cart"></span> Add To
						Cart
					</button>
					<a href="#" class="btn btn-info btn-sm"> <span>Buy Now</span>
					</a>
				</center>


			</div>
		</div>




	</div>

 <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/app.v1.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/easypiechart/jquery.easy-pie-chart.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/sparkline/jquery.sparkline.min.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.min.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.tooltip.min.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.resize.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.grow.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/demo.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/calendar/bootstrap_calendar.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/calendar/demo.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/sortable/jquery.sortable.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/app.plugin.js"></script>
</body>
</html>