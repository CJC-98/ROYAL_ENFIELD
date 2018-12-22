<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="a"%>
<!DOCTYPE html>
<html>
<head>
<title>Accessories</title>

<meta name="description"
	content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />
</head>

<body>
<section id="content">
                    <section class="vbox">
                        <section class="scrollable padder">
                        <h1>Accessories</h1>
<div class="navbar">
	  
		<ul class="thumbnails">
			<a:forEach items="${list}" var="accessories">
			<li class="span3">
			  <div class="thubnail">
				<div class="caption cntr">
				<h4><a class="zoomTool" href="#"title="View Bike"><span class="icon-search"></span></a></h4>
				<img src="${pageContext.request.contextPath}/Resources/images/bikeImages/${accessories.image}" width="276px" height="376px" alt="">
				
					<p><h4><strong>Accessories Name:-</strong><a:out value="${accessories.partName}"></a:out></h4></p>
					<p><h4><strong>Accessories Price:-</strong><a:out value="${accessories.partPrice}"></a:out></h4></p>
					<h4><a href="addcart3?id=${accessories.partId}" title="add to cart" class="btn btn-s-md btn-primary btn-rounded">Add to cart</a>
					
					<div class="actionList">			
					</div>
					<br class="clr">
				</div>
				
			  </div>
			  
			</li></a:forEach>
</ul>

<!-- 
Clients 
-->

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
</section>
</section>
</section>



</body>