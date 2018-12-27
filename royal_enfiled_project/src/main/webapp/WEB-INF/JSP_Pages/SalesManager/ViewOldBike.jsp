<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	
	<style type="text/css">
	.panel{
	      overflow-x:auto;
	
	      }
	</style>
	
	
</head>
<body>
	<section id="content" class="bg-light lter">
		<section class="vbox">
			<section class="scrollable padder">

				<div class="m-b-md">
					<h3 class="m-b-none"
						style="text-align: center; font-size: 30pxl; font-weight: bold;">View
						Old Bike Stock</h3>
				</div>

				<!-- first table starts -->
				<div class="col-sm-12">
					<section class="panel panel-default">
						<table class="table table-striped m-b-none b-a" border="4">

							<tr>
								<th style="text-align: center">OldBikeStockId</th>
								<th style="text-align: center">BikeModelName</th>
								<th style="text-align: center">SoldDate</th>
								<th style="text-align: center">TotalKmRun</th>
								<th style="text-align: center">BikeModelYear</th>
								<th style="text-align: center">BikePurchaseDate</th>
								<th style="text-align: center">MobileNumber</th>
								<th style="text-align: center">RegistrationNo</th>
								<th style="text-align: center">SellerName</th>
								<th style="text-align: center">BikeMileage</th>
								<!-- <th style="text-align: center">BikeImage</th> -->
								<th style="text-align: center">Colors</th>
								<th style="text-align: center">Price</th>
								<th style="text-align: center">NewPrice</th>
							</tr>
							<c:forEach items="${old}" var="o">
								<tr>
									<td>${o.oldBikeStockId}</td>
									<td>${o.oldBikeModelName}</td>
									<td>${o.date}</td>
									<td>${o.totalKmRun}</td>
									<td>${o.bikeModelYear}</td>
									<td>${o.bikePurchaseDate}</td>
									<td>${o.mobileNumber}</td>
									<td>${o.registrationNo}</td>
									<td>${o.sellerName}</td>
									<td>${o.bikeMileage}</td>
									<%-- <td>${o.bikeImage}</td> --%>
									<td>${o.colors}</td>
									<td>${o.price}</td>
									<td>${o.newPrice}</td>
								</tr>
							</c:forEach>

							<tbody>
						</table>
					</section>
				</div>
			</section>
		</section>
	</section>
</body>
</html>