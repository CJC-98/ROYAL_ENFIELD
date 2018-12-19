<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="a"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />
    
</head>
<title>Old Bike</title>

<body>
<section id="content">
                    <section class="vbox">
                        <section class="scrollable padder">
                        <h1>Old Bike</h1>
<div class="navbar">
	  
		<ul class="thumbnails">
			<a:forEach items="${list}" var="bike">
			<li class="span4">
			  <div class="bg-dark">
				
				<h4><a class="zoomTool" href="quickview1?id=${bike.modelId}" title="View Bike"><span class="icon-search"></span> QUICK VIEW</a></h4>
				<a href="quickview1?id=${bike.modelId}"><img src="${pageContext.request.contextPath}Resources/Royal Enfield images/gallary images/old.jpg" width="276px" height="376px" alt=""></a>
				<div class="caption cntr">
					<h3><p><a:out value="${bike.modelName}"></a:out></p></h3>
					
					
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