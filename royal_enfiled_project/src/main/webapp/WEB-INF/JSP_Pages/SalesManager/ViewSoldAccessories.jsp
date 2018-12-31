<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
						ViewSoldAccessories</h3>
				</div>

				<!-- first table starts -->
				<div class="col-sm-12">
					<section class="panel panel-default">
						<table class="table table-striped m-b-none b-a">
							<thead>
								<tr>
									<th style="text-align: center">VSAId</th>
									<th style="text-align: center">AddingDate</th>
									<th style="text-align: center">BikeModel</th>
									<th style="text-align: center">EngineType</th>
									<!-- <th style="text-align: center">BikeColor</th> -->
									<th style="text-align: center">PartName</th>
									<th style="text-align: center">PartPrices</th>
									<th style="text-align: center">WithGstPartPrices</th>
									<th style="text-align: center">PartQuantitys</th>
									<th style="text-align: center"></th>
								</tr>
							</thead>

						
	                          <tbody>
                                  	<c:forEach items="${soldAccessoriess}" var="sa">
								<tr>
									<td>${sa.soldAccessoriesId}</td>
									<td>${sa.date}</td>
									<td>${sa.bikeModel.modelName}</td>
									<td>${sa.bikeModel.enginecapacity.engineType}</td>
								<%-- 	 <td>${sa.bikeModel.color.colorName}</td> --%>
									<td>${sa.partName}</td>
									<td>${sa. partPrice}</td>
									<td>${sa.withGstPartPrices}</td>
									<td>${sa.partQuantity}</td>
									</tr>
								</c:forEach>
                                  
						

							</tbody>

						</table>
					</section>
				</div>
			</section>
		</section>
	</section>

</body>
</html>