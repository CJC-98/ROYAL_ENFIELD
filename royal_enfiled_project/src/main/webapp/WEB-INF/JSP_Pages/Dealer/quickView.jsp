<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!-- author shital belokar
this form is designed to display new bikes specification 
-->
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="a"%>
<html>   
<head>

<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />

<meta charset="ISO-8859-1">
<title>Quick View</title>
</head>
<body class="bg-dark">
	<section id="content">
		<section class="vbox">
			<section class="scrollable padder">
				<h1>Bike View</h1>

				<div class="thumbnail">
					<img
						src="${pageContext.request.contextPath}/Resources/images/bikeImages/${data.bikemodel.image}"
						width="276px" height="376px" alt="">
					<div class="caption cntr">
						<centre>
						<h4><p><a:out value="${data.bikemodel.modelName}"></a:out></p></h4>
						</centre>
						<p>
							<h5><strong><a:out value="${data.showroomPrice}"></a:out></strong></h5>
						</p>
						<h4><a href="addcart?id=${data.bikemodel.modelId}" title="add to cart" class="btn btn-s-md btn-primary btn-rounded">Add to cart</a>
						</h4>
						
						<p>
							<strong> Specification</strong>
						</p>
						<table class="table table-striped m-b-none">
							<tbody>
								<tr><input type="hidden" id="id" value="${data.bikemodel.modelId}">
									<td>Mileage</td>
									<td><a:out value="${data.mileage}"></a:out></td>
								</tr>
                             <tr>
									<td>Tyre Type</td>
									<td><a:out value="${data.tyreType}"></a:out></td>
								</tr>
								<tr>
									<td>Engine Starting Type</td>
									<td><a:out value="${data.engineStartingType}"></a:out></td>
								</tr>
								<tr>
									<td>Number Of gears</td>
									<td><a:out value="${data.noOfGears}"></a:out></td>
								</tr>

                                 <tr>
									<td>Wheel Type</td>
									<td><a:out value="${data.bikewheel}"></a:out></td>
								</tr>
							</tbody>
							</table>

						<br class="clr">
					</div>
				</div>
</body>
</html>