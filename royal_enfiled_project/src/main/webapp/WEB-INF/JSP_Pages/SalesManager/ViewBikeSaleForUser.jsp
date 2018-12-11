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
					<h3 class="m-b-none"
						style="text-align: center; font-size: 30pxl; font-weight: bold;">View
						BikeSaleForUser</h3>
				</div>

				<!-- first table starts -->
				<div class="col-sm-12">
					<section class="panel panel-default">
						<table class="table table-striped m-b-none b-a">
							<thead>
								<tr>
									<th style="text-align: center">VBSFUId</th>
									<th style="text-align: center">Adding Date</th>
									<th style="text-align: center">ModelName</th>
									<th style="text-align: center">EngineType</th>
									<th style="text-align: center">BikeColor</th>
									<th style="text-align: center">BikeWheel</th>
									<th style="text-align: center">ShowroomPrice</th>
									<th style="text-align: center">OnRoadPrice</th>
									<th style="text-align: center">EngineStartingType</th>
								</tr>
							</thead>

							<tbody></table>
					</section>
				</div>
			</section>
		</section>
	</section>

</body>
</html>