

<%@page import="java.util.List"%>
<%@page import="com.app.extremity.model.AvailableServicing"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p"%>

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

<script type="text/javascript">
 function onSubmit()
{
	document.addservice.action="addNewService";
	document.addservice.submit();
	}
 </script>

<body>
	<section id="content" class="bg-light lter">
		<section class="vbox">
			<section class="scrollable padder">

				<div class="m-b-md"
					style="display: flex; flex-wrap: wrap; justify-content: space-between;">
					<h3 class="m-b-none inline"
						style="font-size: 30pxl; font-weight: bold;">Available
						Services</h3>
					<a href="" class="btn btn-lg btn-success btn-rounded"
						data-toggle="modal" data-target="#myModal"
						style="margin-top: 20px">Add new Service</a>
				</div>

				<div class="hbox"
					style="display: flex; flex-wrap: wrap; justify-content: center;">

					<!-- table starts -->
					<div class="col-sm-8">
						<section class="panel panel-default b-a"
							style="border-color: #C8C5C3">
							<!-- <header class="panel-heading bg-success dk" style="font-size: 25px;">Bullet 350cc</header> -->
							<table style="text-align: center"
								class="table table-striped m-b-none bg-light lt">
								<thead>
									<tr>
										<th style="text-align: center">Service Name</th>
										<th style="text-align: center">Cost</th>
									</tr>
								</thead>
								<tbody>
									<p:forEach items="${list}" var="s">
										<tr>
											<td>${s.serviceName }</td>
											<td>${s.cost }</td>
										</tr>
									</p:forEach>
								</tbody>
							</table>
						</section>
					</div>
					<!-- table ends -->

					<!-- modal starts-->
					<div class="modal fade" id="myModal" role="dialog">

						<div class="modal-dialog modal-md">
							<div class="modal-content">

								<div class="modal-header">
									<h3 style="text-align: center">Add new service</h3>
								</div>
								<form name="addservice">
									<div class="modal-body">
										<div class="form-group">
											<label>Service Name</label> <input type="text"
												class="form-control" placeholder="Enter service"
												id="servicename" name="serviceName">
											</div>
										<div class="form-group">
											<label>Cost</label> <input type="text" class="form-control"
												placeholder="Enter cost" id="cost" name="cost">
										</div>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-primary" 
											data-dismiss="modal" onclick="onSubmit()">Submit</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Cancel</button>
									</div>
								</form>
							</div>
						</div>
					</div>
					<!-- modal ends -->
				</div>
			</section>
		</section>
	</section>
</body>
</html>
