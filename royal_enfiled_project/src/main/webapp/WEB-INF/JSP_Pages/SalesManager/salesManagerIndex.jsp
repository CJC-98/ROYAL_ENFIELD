<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" class="app">
<!-- Mirrored from flatfull.com/themes/note/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:16:42 GMT -->

<head>
<meta charset="utf-8" />
<title>ROYAL ENFIELD | Web Application</title>
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

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body class="">
	<section class="vbox">
		<header class="bg-dark dk header navbar navbar-fixed-top-xs">
			<div class="navbar-header aside-md">
				<a class="btn btn-link visible-xs"
					data-toggle="class:nav-off-screen,open" data-target="#nav,html">
					<i class="fa fa-bars"></i>
				</a> <a href="#" class="navbar-brand" data-toggle="fullscreen">ROYAL
					ENFIELD</a> <a class="btn btn-link visible-xs" data-toggle="dropdown"
					data-target=".nav-user"> <i class="fa fa-cog"></i>
				</a>
			</div>
			<ul class="nav navbar-nav hidden-xs">
				<li class="dropdown"></li>
				<li>
					<div class="m-t m-l">
						<a href="price.html"
							class="dropdown-toggle btn btn-xs btn-primary" title="Upgrade"><i
							class="fa fa-long-arrow-up"></i></a>
					</div>
				</li>
			</ul>
			<ul class="nav navbar-nav navbar-right m-n hidden-xs nav-user">
				<li class="hidden-xs"><a href="#" class="dropdown-toggle dk"
					data-toggle="dropdown"> <i class="fa fa-bell"></i> <span
						class="badge badge-sm up bg-danger m-l-n-sm count">2</span>
				</a>
					<section class="dropdown-menu aside-xl"></section></li>


			</ul>
		</header>
		<section>
			<section class="hbox stretch">
				<!-- .aside -->
				<aside class="bg-dark lter aside-md hidden-print hidden-xs" id="nav">
					<section class="vbox">

						<section class="w-f scrollable">
							<div class="slim-scroll" data-height="auto"
								data-disable-fade-out="true" data-distance="0" data-size="5px"
								data-color="#333333">
								<!-- nav -->
								<nav class="nav-primary hidden-xs">
									<ul class="nav">
										<li class="active"><a href="index.html" class="active">
												<i class="fa fa-plus"> <b class="bg-danger"></b>
											</i> <span class="pull-right"> <i
													class="fa fa-angle-down text"></i> <i
													class="fa fa-angle-up text-active"></i>
											</span> <span>ADD NEW</span>
										</a>
											<ul class="nav lt">
												<li class="active"><a href="AddNewBike" class="active">
														<i class="fa fa-angle-right"></i> <span>BIKE</span>
												</a></li>
												<li class="active"><a href="AddOfferForm.html"
													class="active"> <i class="fa fa-angle-right"></i> <span>OFFER</span>
												</a></li>


												<li class="active"><a href="AddForm"> <i
														class="fa fa-angle-right"></i> <span>ACCESSORIES</span>
												</a></li>
												<li><a href="#layout"> <i class="fa fa-eye"> <b
															class="bg-warning"></b>
													</i> <span class="pull-right"> <i
															class="fa fa-angle-down text"></i> <i
															class="fa fa-angle-up text-active"></i>
													</span><span>DEADSTOCK</span>
												</a>
													<ul class="nav lt">
														<li><a href="index.html"> <i
																class="fa fa-angle-right"></i> <span>Accessories</span>
														</a></li>
														<li><a href="index.html"> <i
																class="fa fa-angle-right"></i> <span> Bike</span>
														</a></li>
													</ul></li>
											</ul></li>
										<li><a href="#layout"> <i class="fa fa-eye"> <b
													class="bg-warning"></b>
											</i> <span class="pull-right"> <i
													class="fa fa-angle-down text"></i> <i
													class="fa fa-angle-up text-active"></i>
											</span><span>VIEW</span>
										</a>
											<ul class="nav lt">
												<li><a href="#layout"> <i class="fa fa-motorcycle">
															<b class="bg-warning"></b>
													</i> <span class="pull-right"> <i
															class="fa fa-angle-down text"></i> <i
															class="fa fa-angle-up text-active"></i>
													</span><span>View Bike</span></a>
													<ul class="nav lt">
														<li><a href="layout-c.html"> <i
																class="fa fa-angle-right"></i> <span>Old Bike</span>
														</a></li>
														<li><a href="layout-c.html"> <i
																class="fa fa-angle-right"></i> <span>New Bike</span>
														</a></li>
													</ul></li>
												<li><a href="layout-c.html"> <i
														class="fa fa-angle-right"></i> <span>View
															Accessories</span>
												</a></li>

												<li><a href="layout-c.html"> <i class="fa fa-money"></i>
														<span>View Invoice</span>
												</a></li>
												<li><a href="layout-c.html"> <i
														class="fa fa-angle-right"></i> <span>View Offer</span>
												</a></li>
												<li><a href="#layout"> <i
														class="fa fa-columns icon"> <b class="bg-warning"></b>
													</i> <span class="pull-right"> <i
															class="fa fa-angle-down text"></i> <i
															class="fa fa-angle-up text-active"></i>
													</span><span>View Sold</span></a>
													<ul class="nav lt">
														<li><a href="layout-c.html"> <i
																class="fa fa-angle-right"></i> <span>Accessories</span>
														</a></li>
														<li><a href="layout-c.html"> <i
																class="fa fa-angle-right"></i> <span>Old Bike</span>
														</a></li>
														<li><a href="layout-c.html"> <i
																class="fa fa-angle-right"></i> <span>New Bike</span>
														</a></li>
													</ul></li>
												<li><a href="#layout"> <i
														class="fa fa-columns icon"> <b class="bg-warning"></b>
													</i> <span class="pull-right"> <i
															class="fa fa-angle-down text"></i> <i
															class="fa fa-angle-up text-active"></i>
													</span><span>View DeadStock</span></a>
													<ul class="nav lt">
														<li><a href="layout-c.html"> <i
																class="fa fa-angle-right"></i> <span>Accessories</span>
														</a></li>
														<li><a href="layout-c.html"> <i
																class="fa fa-angle-right"></i> <span> Bike</span>
														</a></li>
													</ul></li>
											</li>
										<li><a href="#order"> <i class="fa fa-flask icon">
													<b class="bg-success"></b>
											</i> <span class="pull-right"> <i
													class="fa fa-angle-down text"></i> <i
													class="fa fa-angle-up text-active"></i>
											</span> <span>ORDER</span>
										</a> <!--  <ul class="nav lt" class="active">
                                                <li> <a href="#layout"> <i class="fa fa-columns icon"> <b class="bg-warning"></b>
                                                </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
                                                    <i class="fa fa-angle-up text-active"></i> </span><span>company
                                                    </span></a>
                                                    <ul class="nav lt">
                                                        <li> <a href="OrderToCompanyForNewBike" class="active"> <i class="fa fa-angle-right"></i>
                                                                <span>New Bike</span> </a> </li>
                                                        <li> <a href="OrderToCompanyForAccessories" class="active"> <i class="fa fa-angle-right"></i>
                                                                <span>Accessories</span> </a> </li>
                                                    </ul>
                                                </li>
                                              
                                                </ul>
                                        </li>  -->
								</nav>
								<!-- / nav -->
							</div>


							<div class="dropdown">
								<button class="btn btn-default dropdown-toggle" type="button"
									data-toggle="dropdown">
									ORDER <span class="caret"></span>
								</button>
								<ul class="dropdown-menu">
									<li class="dropdown-header"></li>
									<li><a href="OrderToCompanyForNewBike">BIKE ORDER</a></li>
									<li><a href="OrderToCompanyForNewAccessories">ACCESSORIES
											ORDER</a></li>

								</ul>
							</div>


						</section>
						<!-- <footer class="footer lt hidden-xs b-t b-dark">
							<div id="chat" class="dropup">
								<section class="dropdown-menu on aside-md m-l-n">
									<section class="panel bg-white">
										<header class="panel-heading b-b b-light">Active
											chats</header>
										<div class="panel-body animated fadeInRight">
											<p class="text-sm">No active chats.</p>
											<p>
												<a href="#" class="btn btn-sm btn-default">Start a chat</a>
											</p>
										</div>
									</section>
								</section>
							</div>



						</footer> -->
					</section>
				</aside>
				<!-- /.aside -->
				<!-- dashboard starts -->
				<jsp:include page="${link}" />
				<!-- dashboard ends -->


				</div>



				</div>





				</article>
				<!-- / .comment-reply -->

			</section>
		</section>
		<!-- Bootstrap -->
		<!-- App -->
		<script src="js/app.v1.js"></script>
		<script src="js/charts/easypiechart/jquery.easy-pie-chart.js"></script>
		<script src="js/charts/sparkline/jquery.sparkline.min.js"></script>
		<script src="js/charts/flot/jquery.flot.min.js"></script>
		<script src="js/charts/flot/jquery.flot.tooltip.min.js"></script>
		<script src="js/charts/flot/jquery.flot.resize.js"></script>
		<script src="js/charts/flot/jquery.flot.grow.js"></script>
		<script src="js/charts/flot/demo.js"></script>
		<script src="js/calendar/bootstrap_calendar.js"></script>
		<script src="js/calendar/demo.js"></script>
		<script src="js/sortable/jquery.sortable.js"></script>
		<script src="js/app.plugin.js"></script>
</body>
<!-- Mirrored from flatfull.com/themes/note/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:16:42 GMT -->

</html>