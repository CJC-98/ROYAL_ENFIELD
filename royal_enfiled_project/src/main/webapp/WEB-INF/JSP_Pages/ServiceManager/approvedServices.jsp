<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Notebook | Web Application</title>
<meta name="description"
	content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/notebook UI/css/font.css"
	type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/notebook UI/js/calendar/bootstrap_calendar.css"
	type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/notebook UI/css/app.v1.css"
	type="text/css" />
</head>

<body>
	<section id="content" class="bg-light lter">
		<section class="vbox">
			<section class="scrollable padder">

				<div class="m-b-md">
					<h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">Approved
						Services</h3>
				</div>




				<style>
* {
	box-sizing: border-box
}

/* Set height of body and the document to 100% */
body, html {
	height: 100%;
	margin: 0;
	font-family: Arial;
}

/* Style tab links */
.tablink {
	background-color: #555;
	color: white;
	float: left;
	border: none;
	outline: none;
	cursor: pointer;
	padding: 14px 16px;
	font-size: 17px;
	width: 25%;
}

.tablink:hover {
	background-color:#777 ;
}

/* Style the tab content (and add height:100% for full page content) */
.tabcontent {
	color: white;
	display: none;
	padding: 100px 20px;
	height: 100%;
}

#BikeInformation {
	background-color: LightGray;
}

#ServiceChart {
	background-color: LightGray;
}

#CustomerDetail {
	background-color: LightGray;
}
.table{
background-color: LightGray;
	}

#Invoice {
	background-color: LightGray;
}

h3, .h3 {
    color: black;
}
</style>
				</head>
				<body>

					<button class="tablink" onclick="openPage('BikeInformation', this, 'black')">Bike Information</button>
					<button class="tablink" onclick="openPage('ServiceChart', this, 'black')"id="defaultOpen">Service Chart</button>
					<button class="tablink" onclick="openPage('CustomerDetail', this, 'black')">Customer Detail</button>
					<button class="tablink" onclick="openPage('Invoice', this, 'black')">Invoice</button>

					<div id="BikeInformation" class="tabcontent">
						<h3>Bike Information</h3>
						

						<div class="container-fluid" >
							
							
							<table class="table table-striped m-b-none"  border="2" >
								<thead>
									<tr class="panel-heading bg-success dk">
										<th>Id</th>
										<th>Bike Name</th>
										<th>Bike Chassis</th>
										
									</tr>
								</thead>
								<tbody>
									
									<tr>
										<td>B101</td>
										<td>Pulsar</td>
										<td>Bno1000</td>
									</tr>
									
									
								</tbody>
							</table>
						</div>


					</div>

					<div id="ServiceChart" class="tabcontent">
						<h3>Service Chart</h3>
						
						<table class="table" border="2">
								<thead>
									<tr>
										<th>Id</th>
										<th>Work</th>
										<th>Cost</th>
										<th>Status</th>
										
									</tr>
								</thead>
								<tbody>
									
									<tr  bgcolor="#DC143C">
										<td>B101</td>
										<td>Labour charge</td>
										<td>100</td>
										<td>pending</td>
									</tr>
									
									<tr  bgcolor="#FFD700">
										<td>B102</td>
										<td>Oil change</td>
										<td>350</td>
										<td>In-Progress</td>
									</tr>
									
									<tr  bgcolor="#32CD32">
										<td>B103</td>
										<td>Oil change</td>
										<td>350</td>
										<td>Completed</td>
									</tr>
								</tbody>
							</table>
						
					</div>

					<div id="CustomerDetail" class="tabcontent">
						<h3>Customer Detail</h3>
						
						<div class="container-fluid" >
							
							
							<table class="table table-striped m-b-none"  border="2" >
								<thead>
									<tr class="panel-heading bg-success dk">
										<th>Id</th>
										<th>Name</th>
										<th>Address</th>
										
									</tr>
								</thead>
								<tbody>
									
									<tr>
										<td>B101</td>
										<td>Sandip</td>
										<td>Pune</td>
									</tr>
									
									
								</tbody>
							</table>
						</div>
					</div>

					<div id="Invoice" class="tabcontent">
						<h3>Invoice</h3>
						<div class="container-fluid" >
							
							
							<table class="table table-striped m-b-none"  border="2" >
								<thead>
									<tr class="panel-heading bg-success dk">
										<th>Id</th>
										<th>Amount</th>
										<th>GST</th>
										<th>Total Amount</th>
										
									</tr>
								</thead>
								<tbody>
									
									<tr>
										<td>B101</td>
										<td>100</td>
										<td>12%</td>
										<td>150</td>
									</tr>
									
									
									
								</tbody>
								
							</table>
							
							<button class="btn btn-info" >Details</button>
						</div>
					</div>

					<script>
						function openPage(pageName, elmnt, color) {
							var i, tabcontent, tablinks;
							tabcontent = document
									.getElementsByClassName("tabcontent");
							for (i = 0; i < tabcontent.length; i++) {
								tabcontent[i].style.display = "none";
							}
							tablinks = document
									.getElementsByClassName("tablink");
							for (i = 0; i < tablinks.length; i++) {
								tablinks[i].style.backgroundColor = "";
							}
							document.getElementById(pageName).style.display = "block";
							elmnt.style.backgroundColor = color;

						}
						// Get the element with id="defaultOpen" and click on it
						document.getElementById("defaultOpen").click();
					</script>

					    
			</section>
		</section>
	</section>
</body>
</html>