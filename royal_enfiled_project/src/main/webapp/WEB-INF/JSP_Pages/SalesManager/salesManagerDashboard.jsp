<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>SalesManager Dashboard</title>
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
	<section id="content" class="bg-light lter">
		<section class="vbox">
			<section class="scrollable padder">

				<div class="m-b-md">
					<h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">Dashboard</h3>
				</div>


				<div class="hbox b-a bg-light" style="border-radius: 3px">

					<h3 class="m-l-xs" style="text-align: center">SaleManager
						Stock-Graph</h3>


					<div class="col-lg-4">
						<section class="panel panel-default">
							<header class="panel-heading bg-danger lt"
								style="font-size: 15px">BikeSaleForUserStock</header>
							<div class="panel-body text-center">
								BikeSaleForUserCount
								<h4>${totalServiceCount}</h4>
								<div class="inline">
									<div class="easypiechart text-danger"
										data-percent="${totalServiceCount*100/50 }"
										data-line-width="5" data-track-Color="#f0f0f0"
										data-bar-color="#FF5F4A" data-rotate="0"
										data-scale-Color="false" data-size="150" data-animate="2000">
										<span class="h2 step font-bold"></span>%
										<div class="easypie-text text-muted">percent</div>
									</div>
								</div>
							</div>

							<div class="panel-footer bg-danger lt" style="font-size: 15px">
								BikeSaleForUserStock ${totalServiceCount}</div>

						</section>
					</div>
					<!-- </a> -->

					<a href="#">
						<div class="col-lg-4">
							<section class="panel panel-default">
								<header class="panel-heading bg-warning lt"
									style="font-size: 15px">OldBikeStock</header>
								<div class="panel-body text-center">
									<h4>${approvedCustomizationCount}</h4>
									<div class="inline">
										<div class="easypiechart text-warning"
											data-percent="${approvedCustomizationCount*100/100 }"
											data-line-width="5" data-track-Color="#f0f0f0"
											data-bar-color="#FFD300" data-rotate="0"
											data-scale-Color="false" data-size="150" data-animate="2000">
											<span class="h2 step font-bold">72</span>%
											<div class="easypie-text text-muted">percent</div>
										</div>
									</div>
								</div>

								<div class="panel-footer bg-warning lt" style="font-size: 15px">
									OldBikeStock ${approvedCustomizationCount}</div>

							</section>
						</div>
					</a> <a href="#">
						<div class="col-lg-4">
							<section class="panel panel-default">
								<header class="panel-heading bg-success lt"
									style="font-size: 15px">BikeDeadStock</header>
								<div class="panel-body text-center">
									<h4>${totalCustomizationCount}</h4>
									<div class="inline">
										<div class="easypiechart text-success"
											data-percent="${totalCustomizationCount *100/50 }"
											data-line-width="5" data-track-Color="#f0f0f0"
											data-bar-color="#8ec165" data-rotate="0"
											data-scale-Color="false" data-size="150" data-animate="2000">
											<span class="h2 step font-bold">22.66</span>%
											<div class="easypie-text text-muted">percent</div>
										</div>
									</div>
								</div>

								<div class="panel-footer bg-success lt" style="font-size: 15px">
									BikeDeadStock ${totalCustomizationCount}</div>

							</section>
						</div>
					</a>

				</div>


				<div class="hbox b-a bg-light"
					style="margin-top: 20px; margin-bottom: 20px; border-radius: 3px">

					<h3 class="m-l-xs" style="text-align: center">Sold-Graph</h3>

					<a href="#">
						<div class="col-lg-4">
							<section class="panel panel-default">
								<header class="panel-heading bg-danger lt"
									style="font-size: 15px">SoldBikeSaleForUSer</header>
								<div class="panel-body text-center">
									Sold Count
									<h4>${totalServiceCount1}</h4>
									<div class="inline">
										<div class="easypiechart text-danger"
											data-percent="${totalServiceCount1*100/50}"
											data-line-width="5" data-track-Color="#f0f0f0"
											data-bar-color="#FF5F4A" data-rotate="0"
											data-scale-Color="false" data-size="150" data-animate="2000">
											<span class="h2 step font-bold">5.3</span>%
											<div class="easypie-text text-muted">percent</div>
										</div>
									</div>
								</div>

								<div class="panel-footer bg-danger lt" style="font-size: 15px">
									SoldBikeSaleForUSer ${totalServiceCount1}</div>

							</section>
						</div>
					</a> <a href="#">
						<div class="col-lg-4">
							<section class="panel panel-default">
								<header class="panel-heading bg-warning lt"
									style="font-size: 15px">SoldOldBike</header>
								<div class="panel-body text-center">
									<h4>${approvedCustomizationCount2}</h4>
									<div class="inline">
										<div class="easypiechart text-warning"
											data-percent="${approvedCustomizationCount2 *100/100}"
											data-line-width="5" data-track-Color="#f0f0f0"
											data-bar-color="#FFD300" data-rotate="0"
											data-scale-Color="false" data-size="150" data-animate="2000">
											<span class="h2 step font-bold">70</span>%
											<div class="easypie-text text-muted">percent</div>
										</div>
									</div>
								</div>

								<div class="panel-footer bg-warning lt" style="font-size: 15px">
									SoldOldBike ${approvedCustomizationCount2}</div>

							</section>
						</div>
					</a> <a href="#">
						<div class="col-lg-4">
							<section class="panel panel-default">
								<header class="panel-heading bg-success lt"
									style="font-size: 15px">CompanyOrderBike</header>
								<div class="panel-body text-center">
									<h4>${totalCustomizationCount3}</h4>
									BikeOrderCount
									<div class="inline">
										<div class="easypiechart text-success"
											data-percent="${totalCustomizationCount3 *100/100}"
											data-line-width="5" data-track-Color="#f0f0f0"
											data-bar-color="#8ec165" data-rotate="0"
											data-scale-Color="false" data-size="150" data-animate="2000">
											<span class="h2 step font-bold">20</span>%
											<div class="easypie-text text-muted">percent</div>
										</div>
									</div>
								</div>

								<div class="panel-footer bg-success lt" style="font-size: 15px">
									CompanyOrderBike ${totalCustomizationCount3}</div>

							</section>
						</div>
					</a>

				</div>

				<!-- </section>
	        </section>
	 </section>       -->
				<!-- <section id="content">
                    <section class="vbox">
                        <section class="scrollable padder">
                            <ul class="breadcrumb no-border no-radius b-b b-light pull-in">
                                <li><a href="index.html"><i class="fa fa-home"></i> Home</a></li>
                                <li class="active">Workset</li>
                            </ul> -->
				<section class="panel bg-dark">
					<div class="carousel slide carousel-fade panel-body" id="c-fade">
						<ol class="carousel-indicators out">
							<li data-target="#c-fade" data-slide-to="0" class=""></li>
							<li data-target="#c-fade" data-slide-to="1" class="active"></li>
							<li data-target="#c-fade" data-slide-to="2" class=""></li>
							<li data-target="#c-fade" data-slide-to="3" class=""></li>
							<li data-target="#c-fade" data-slide-to="4" class=""></li>
						</ol>
						<div class="carousel-inner">
							<div class="item">

								<p class="text-center">
									<em class="h4 text-mute"><img
										src="${pageContext.request.contextPath}/Resources/images/bike7.jpg"
										class="m-r-sm" width="750" height="500"></em><br> <small
										class="text-muted"><h3>Continental GT</h3></small>
								</p>
							</div>
							<div class="item">

								<p class="text-center">
									<em class="h4 text-mute"><img
										src="${pageContext.request.contextPath}/Resources/images/bike1.jpg"
										class="m-r-sm" width="750" height="500"></em><br> <small
										class="text-muted"><h3>Classic</h3></small>

								</p>
							</div>
							<div class="item active">

								<p class="text-center">
									<em class="h4 text-mute"><img
										src="${pageContext.request.contextPath}/Resources/images/bike2.jpg"
										class="m-r-sm" width="750" height="500"></em><br> <small
										class="text-muted"><h3>Himalayan</h3></small>

								</p>
							</div>
							<div class="item">

								<p class="text-center">
									<em class="h4 text-mute"><img
										src="${pageContext.request.contextPath}/Resources/images/bike4.jpg"
										class="m-r-sm" width="750" height="500"></em><br> <small
										class="text-muted"><h3>Thunderbird</h3></small>

								</p>
							</div>
							<div class="item">

								<p class="text-center">
									<em class="h4 text-mute"><img
										src="${pageContext.request.contextPath}/Resources/images/bike6.jpg"
										class="m-r-sm" width="750" height="500"></em><br> <small
										class="text-muted"><h3>Interceptor</h3></small>

								</p>
							</div>
						</div>
						<a class="left carousel-control" href="#c-fade" data-slide="prev">
							<i class="fa fa-angle-left"></i>
						</a> <a class="right carousel-control" href="#c-fade"
							data-slide="next"> <i class="fa fa-angle-right"></i>
						</a>
					</div>
				</section>
			</section>
		</section>
		<a href="#" class="hide nav-off-screen-block"
			data-toggle="class:nav-off-screen, open" data-target="#nav,html"></a>
	</section>

	<script src="${pageContext.request.contextPath}/js/app.v1.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/charts/easypiechart/jquery.easy-pie-chart.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/charts/sparkline/jquery.sparkline.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/charts/flot/jquery.flot.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/charts/flot/jquery.flot.tooltip.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/charts/flot/jquery.flot.resize.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/charts/flot/jquery.flot.grow.js"></script>
	<script src="${pageContext.request.contextPath}/js/charts/flot/demo.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/calendar/bootstrap_calendar.js"></script>
	<script src="${pageContext.request.contextPath}/js/calendar/demo.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/sortable/jquery.sortable.js"></script>
	<script src="${pageContext.request.contextPath}/js/app.plugin.js"></script>
</body>
</html>