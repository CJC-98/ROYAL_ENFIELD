<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %> 
  
 
<!DOCTYPE>
<html>
<head>
</head>
<body>			
		<section id="content">
                    <section class="vbox">
                        <section class="scrollable padder">
                        <h1>Old Bikes</h1>
<div class="navbar">
	  
		<ul class="thumbnails">
			<a:forEach items="${data}" var="old">
			<li class="span3">
			  <div class="bg-dark">
				
				<h4><a class="zoomTool" href="quickview1?oldBikeStockId=${old.oldBikeStockId}" title="View Bike"><span class="icon-search"></span> QUICK VIEW</a></h4>
				<a href="quickview1?oldBikeStockId=${old.oldBikeStockId}"><img src="${pageContext.request.contextPath}/Resources/images/bikeImages/${old.bikeImage}" width="276px" height="376px" alt=""></a>
				<div class="caption cntr">
					<p><h3><strong><a:out value="${old.oldBikeModelName}"></a:out></strong></h3></p>
					
					
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


</html>