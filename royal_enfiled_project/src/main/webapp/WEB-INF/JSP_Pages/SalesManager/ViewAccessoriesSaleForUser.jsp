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
.panel {
	overflow-x: auto;
}
</style>

</head>
<body>
<script> 
function mark(id){
	var req = new XMLHttpRequest();		
	req.open("GET","marks?accessoriesSaleForUserId="+id,true);
	req.send();
	
	req.onreadystatechange=function(){
		if(req.readyState==4 && req.status==200){
			location.reload();
		}
	}
	
}
</script>
	<section id="content" class="bg-light lter">
		<section class="vbox">
			<section class="scrollable padder">

				<div class="m-b-md">
					<h3 class="m-b-none"
						style="text-align: center; font-size: 30pxl; font-weight: bold;">View
						AccessoriesSaleForUser</h3>
				</div>

				<!-- first table starts -->
				<div class="col-sm-12">
					<section class="panel panel-default">
						<table class="table table-striped m-b-none b-a" border="2">
							<thead>
								<tr>
									<th style="text-align: center">ASFUId</th>
									<th style="text-align: center">AddingDate</th>
									<th style="text-align: center">BikeModel</th>
									<th style="text-align: center">EngineType</th>
									<!-- <th style="text-align: center">BikeColor</th> -->
									<th style="text-align: center">PartName</th>
									<th style="text-align: center">PartPrices</th>
									<th style="text-align: center">WithGstPartPrices</th>
									<th style="text-align: center">PartQuantitys</th>
									<th style="text-align: center">Status</th>
								</tr>
							</thead>

							<tbody>
								<c:forEach items="${accessoriesSaleForUsers}"
									var="accessoriessaleforuser">
									<tr>
										<td>${accessoriessaleforuser.accessoriesSaleForUserId}</td>
										<td>${accessoriessaleforuser.date}</td>
										<td>${accessoriessaleforuser.bikeModel.modelName}</td>
										<td>${accessoriessaleforuser.bikeModel.enginecapacity.engineType}</td>

										<td>${accessoriessaleforuser.partNames}</td>
										<td>${accessoriessaleforuser.partPrices}</td>
										<td>${accessoriessaleforuser.withGstPartPrices}</td>
										<td>${accessoriessaleforuser.partQuantitys}</td>
										<td><a:choose>
											<a:otherwise>
												<a data-toggle="class" class="btn btn-default btn-xs"> <i
													class="fa fa-star-o text-muted text"></i> <i
													class="fa fa-star text-danger text-active"></i> <span
													onclick="#">DeadStockAccessories</span>
												</a>
											</a:otherwise>
										</a:choose></td>
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