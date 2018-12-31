<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
						Offers</h3>
				</div>

				<!-- first table starts -->
				<div class="col-sm-12">
					<section class="panel panel-default">
						<table class="table table-striped m-b-none b-a" border="2">
							
								<tr>
									<th style="text-align: center">OId</th>
									<th style="text-align: center">OfferName</th>
									<th style="text-align: center">DiscountInPercentage</th>
									<th style="text-align: center">StartDate</th>
									<th style="text-align: center">EndDate</th>
								</tr>
								
								<c:forEach items="${bikeoffers}" var="offer">
								<tr>
									<td>${offer.bikeOfferId}</td>
									<td>${offer.offerName}</td>
									<td>${offer.discountInPercentage}</td>
									<td>${offer.startDate}</td>
									<td>${offer.endDate}</td>
									</tr>
								</c:forEach>



						</table>
					</section>
				</div>
			</section>
		</section>
	</section>

</body>
</html>