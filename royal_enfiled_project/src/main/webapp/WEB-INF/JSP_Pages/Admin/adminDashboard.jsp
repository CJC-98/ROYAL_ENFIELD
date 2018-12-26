<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css"
	type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css"
	type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css"
	type="text/css" />
</head>

<body>
	<section id="content">
		<section class="scrollable padder">
			<div class="m-b-md">
				<h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">Welcome
					Nilesh</h3>
			</div>

			<section class="panel panel-default">
				<div class="row m-l-none m-r-none bg-light lter">
					<div class="col-sm-6 col-md-3 padder-v b-r b-light lt">
						<span class="fa-stack fa-2x pull-left m-r-sm"> <i
							class="fa fa-circle fa-stack-2x text-info"></i> <i
							class="fa fa-male fa-stack-1x text-white"></i> <span
							class="easypiechart pos-abt" data-percent="100"
							data-line-width="4" data-track-Color="#fff"
							data-scale-Color="true" data-size="50" data-line-cap='butt'
							data-animate="2000" data-update="3000"></span>
						</span> <a class="clear" href="#"> <span class="h3 block m-t-xs"><strong>${registrionCount}</strong></span>
							<small class="text-muted text-uc">Registrations</small>
						</a>
					</div>
					<div class="col-sm-6 col-md-3 padder-v b-r b-light lt">
						<span class="fa-stack fa-2x pull-left m-r-sm"> <i
							class="fa fa-circle fa-stack-2x text-warning"></i> <i
							class="fa fa-male fa-stack-1x text-white"></i> <span
							class="easypiechart pos-abt" data-percent="100"
							data-line-width="4" data-track-Color="#fff"
							data-scale-Color="true" data-size="50" data-line-cap='butt'
							data-animate="2000" data-update="3000"></span>
						</span> <a class="clear" href="#"> <span class="h3 block m-t-xs"><strong>468</strong></span>
							<small class="text-muted text-uc">Visitor</small>
						</a>
					</div>
					<div class="col-sm-6 col-md-3 padder-v b-r b-light lt">
						<span class="fa-stack fa-2x pull-left m-r-sm"> <i
							class="fa fa-circle fa-stack-2x text-info "></i> <i
							class="fa fa-male fa-stack-1x text-white"></i> <span
							class="easypiechart pos-abt" data-percent="100"
							data-line-width="4" data-track-Color="#f5f5f5"
							data-scale-Color="false" data-size="50" data-line-cap='butt'
							data-animate="3000" data-update="5000"></span>
						</span> <a class="clear" href="employeeList?designation=USER"> <span class="h3 block m-t-xs"><strong>${userCount}</strong></span>
							<small class="text-muted text-uc">Users</small>
						</a>
					</div>
					<div class="col-sm-6 col-md-3 padder-v b-r b-light lt">
						<span class="fa-stack fa-2x pull-left m-r-sm"> <i
							class="fa fa-circle fa-stack-2x text-info "></i> <i
							class="fa fa-male fa-stack-1x text-white"></i> <span
							class="easypiechart pos-abt" data-percent="100"
							data-line-width="4" data-track-Color="#f5f5f5"
							data-scale-Color="false" data-size="50" data-line-cap='butt'
							data-animate="3000" data-update="5000"></span>
						</span> <a class="clear" href="employeeList?designation=DEALER"> <span class="h3 block m-t-xs"><strong>${dealerCount}</strong></span>
							<small class="text-muted text-uc">Dealer</small>
						</a>
					</div>
				</div>
			</section>
			<div class="row">
				<div class="col-sm-6 col-md-3 padder-v b-r b-light lt">

					<div class="row b-a "
						style="margin: 3px; padding: 5px; margin-bottom: 15px">
						<span class="fa-stack fa-2x pull-left m-r-sm"> <i
							class="fa fa-circle fa-stack-2x text-danger"></i> <i
							class="fa fa-rupee fa-stack-1x text-white"></i> <span
							class="easypiechart pos-abt" data-percent="100"
							data-line-width="4" data-track-Color="#fff"
							data-scale-Color="true" data-size="50" data-line-cap='butt'
							data-animate="2000" data-update="3000"> </span>
						</span> <a class="clear" href="#"> <span class="h3 block m-t-xs">
								<strong>468000</strong>
						</span> <small class="text-muted text-uc">Balance</small>
						</a>
					</div>

					<div class="row b-a"
						style="margin: 3px; padding: 5px; margin-bottom: 15px">
						<span class="fa-stack fa-2x pull-left m-r-sm"> <i
							class="fa fa-circle fa-stack-2x text-danger"></i> <i
							class="fa fa-fire-extinguisher fa-stack-1x text-white"></i> <span
							class="easypiechart pos-abt" data-percent="100"
							data-line-width="4" data-track-Color="#fff"
							data-scale-Color="false" data-size="50" data-line-cap='butt'
							data-animate="2000" data-update="3000"> </span>
						</span> <a class="clear" href="#"> <span class="h3 block m-t-xs">
								<strong>${bikeCount}</strong>
						</span> <small class="text-muted text-uc">Bike</small>
						</a>
					</div>
					<div class="row b-a"
						style="margin: 3px; padding: 5px; margin-bottom: 15px;">
						<span class="fa-stack fa-2x pull-left m-r-sm"> <i
							class="fa fa-circle fa-stack-2x text-danger"></i> <i
							class="fa fa-fire-extinguisher fa-stack-1x text-white"></i> <span
							class="easypiechart pos-abt" data-percent="100"
							data-line-width="4" data-track-Color="#fff"
							data-scale-Color="false" data-size="50" data-line-cap='butt'
							data-animate="2000" data-target="#bugs" data-update="3000">
						</span>
						</span> <a class="clear" href="accessoriesStock"> <span class="h3 block m-t-xs">
								<strong>${accessoriesCount}</strong>
						</span> <small class="text-muted text-uc">Accessories</small>
						</a>
					</div>
					<div class="row b-a" style="margin: 3px; padding: 5px;">
						<span class="fa-stack fa-2x pull-left m-r-sm"> <i
							class="fa fa-circle fa-stack-2x text-danger"></i> <i
							class="fa fa-rupee fa-stack-1x text-white"></i> <span
							class="easypiechart pos-abt" data-percent="100"
							data-line-width="4" data-track-Color="#fff"
							data-scale-Color="true" data-size="50" data-line-cap='butt'
							data-animate="2000" data-target="#bugs" data-update="3000">
						</span>
						</span> <a class="clear" href="#"> <span class="h3 block m-t-xs">
								<strong>20000</strong>
						</span> <small class="text-muted text-uc">Profit_Loss</small>
						</a>
					</div>


				</div>

				<div class="col-md-9">
					<section class="panel panel-default">
						<header class="panel-heading font-bold">Vertical bar</header>
						<div class="panel-body">
							<div id="flot-bar"
								style="height: 260px; padding: 0px; position: relative;">
								<canvas class="flot-base" width="508" height="240"
									style="direction: ltr; position: absolute; left: 0px; top: 0px; width: 508px; height: 240px;"></canvas>
							</div>
						</div>
					</section>

				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<section class="panel panel-default">
						<header class="panel-heading font-bold">Pie Chart</header>
						<div class="panel-body">
							<div id="flot-pie"
								style="height: 240px; padding: 0px; position: relative;">
								<canvas class="flot-base" width="508" height="240"
									style="direction: ltr; position: absolute; left: 0px; top: 0px; width: 508px; height: 240px;">
                                                        </canvas>
							</div>
						</div>
					</section>
				</div>

				<div class="col-md-6">
					<section class="panel panel-default">
						<header class="panel-heading font-bold">Feedbacks</header>
						<div class="tab-pane active" id="activity">
							<ul
								class="list-group no-radius m-b-none m-t-n-xxs list-group-lg no-border">
								<c:forEach items="${feedbackList }" var="feedback">

									<li class="list-group-item"><a href="#"
										class="thumb-sm pull-left m-r-sm"> <img
											src="images/avatar_default.jpg" class="img-circle">
									</a> <a href="#" class="clear"> <small class="pull-right">3
												minuts ago</small> <strong class="block">${feedback.userName}</strong>
											<small>${ feedback.feedbackMessage}</small>
									</a></li>
								</c:forEach>
								<li class="list-group-item"><a href="#"
									class="thumb-sm pull-left m-r-sm"> <img
										src="images/avatar.jpg" class="img-circle">
								</a> <a href="#" class="clear"> <small class="pull-right">1
											hour ago</small> <strong class="block">Jonathan George</strong> <small>Morbi
											nec nunc condimentum...</small>
								</a></li>
								<li class="list-group-item"><a href="#"
									class="thumb-sm pull-left m-r-sm"> <img
										src="images/avatar.jpg" class="img-circle">
								</a> <a href="#" class="clear"> <small class="pull-right">2
											hours ago</small> <strong class="block">Josh Long</strong> <small>Vestibulum
											ullamcorper sodales nisi nec...</small>
								</a></li>
								<li class="list-group-item"><a href="#"
									class="thumb-sm pull-left m-r-sm"> <img
										src="images/avatar_default.jpg" class="img-circle">
								</a> <a href="#" class="clear"> <small class="pull-right">1
											day ago</small> <strong class="block">Jack Dorsty</strong> <small>Morbi
											nec nunc condimentum...</small>
								</a></li>

							</ul>
						</div>

					</section>

				</div>
			</div>
		</section>


	</section>



</body>

</html>