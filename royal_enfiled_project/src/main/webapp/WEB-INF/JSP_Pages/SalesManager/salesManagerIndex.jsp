<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en" class="app">
<!-- Mirrored from flatfull.com/themes/note/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:16:42 GMT -->

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
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body class="">
	<div style="overflow: scroll; height: 100%; max-height: 1200px">
		<section class="vbox">
			<header class="bg-dark dk header navbar navbar-fixed-top-xs">
				<div class="navbar-header aside-md">
					<a class="btn btn-link visible-xs"
						data-toggle="class:nav-off-screen,open" data-target="#nav,html">
						<i class="fa fa-bars"></i>
					</a> <a href="#" class="navbar-brand" data-toggle="fullscreen"><img
						src="${pageContext.request.contextPath}/Resources/Royal Enfield images/RL_logo3.png class="m-r-sm">Royal
						Enfield</a> <a class="btn btn-link visible-xs" data-toggle="dropdown"
						data-target=".nav-user"> <i class="fa fa-cog"></i>
					</a>
				</div>

				<ul class="nav navbar-nav navbar-right m-n hidden-xs nav-user">
					<li class="hidden-xs"><a href="#" class="dropdown-toggle dk"
						data-toggle="dropdown"> <i class="fa fa-bell"></i> <span
							class="badge badge-sm up bg-danger m-l-n-sm">${inboxCount}</span>
					</a>
						<section class="dropdown-menu aside-xl">
							<section class="panel bg-white">
								<header class="panel-heading b-light bg-light">
									<strong>You have <span class="">${inboxCount}</span>&nbsp;unread
										notifications
									</strong>
								</header>
								<div class=" list-group-alt animated fadeInRight">

									<a:forEach var="data" items="${shortInboxList}">
										<a href="MyNotificationsPages" class="media list-group-item">
											<span class="pull-left thumb-sm"> <img
												src="${pageContext.request.contextPath}/Resources/images/EmployeeProfilePicture/${data.senderImg}"
												alt="John said" class="img-circle">
										</span> <span class="media-body block m-b-none"><strong>${data.senderName}</strong>&nbsp;&nbsp;${data.message}<br>
												<small class="text-muted">${data.sendDate}</small> </span>
										</a>
									</a:forEach>
								</div>
								<%--  <footer class="panel-footer text-sm"> 
                         	<a href="MyNotificationsPage" class="pull-right"></a>
                            <a href="MyNotificationsPage" data-toggle="class:show animated fadeInRight">
                            	See all the notifications
                            </a> 
                         </footer> --%>
							</section>
						</section></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> <span
							class="thumb-sm avatar pull-left"> <img
								src="${pageContext.request.contextPath}/Resources/images/EmployeeProfilePicture/${currentUserImg}">
						</span> ${currentUserName} <b class="caret"></b>
					</a>
						<ul class="dropdown-menu animated fadeInRight">
							<span class="arrow top"></span>
							<li><a href="#">Settings</a></li>
							<li><a href="#">Profile</a></li>
							<li><a href="MyNotificationsPages"> <span
									class="badge bg-danger pull-right"></span> Notifications
							</a></li>
							<li><a href="#">Help</a></li>
							<li class="divider"></li>
							<li><a href="modal.lockme.html" data-toggle="ajaxModal">Logout</a>
							</li>
						</ul></li>
				</ul>
			</header>
			<section>
				<section class="hbox stretch">
					<!-- .aside -->
					<aside class="bg-dark lter aside-md hidden-print hidden-xs"
						id="nav">
						<section class="vbox">

							<section class="w-f scrollable">
								<div class="slim-scroll" data-height="auto"
									data-disable-fade-out="true" data-distance="0" data-size="5px"
									data-color="#333333">
									<!-- nav -->
									<nav class="nav-primary hidden-xs">
										<ul class="nav">

											<li><a href="toSalesManagerHomePage"> <i
													class="fa fa-dashboard icon"> <b class="bg-danger"></b>
												</i> <span>Dashboard</span>
											</a></li>

											<li><a href="#uikit"> <i class="fa fa-flask icon">
														<b class="bg-success"></b>
												</i> <span class="pull-right"> <i
														class="fa fa-angle-down text"></i> <i
														class="fa fa-angle-up text-active"></i>
												</span> <span>ADD NEW</span>
											</a>
												<ul class="nav lt">
													<li><a href="AddnewBike"> <i
															class="fa fa-angle-right"></i> <span>Bike</span>
													</a></li>

													<li><a href="AddAccessories"> <i
															class="fa fa-angle-right"></i> <span>Accessories</span>
													</a></li>

													<li><a href="Offers"> <i class="fa fa-angle-right"></i>
															<span>Offer</span>
													</a></li>

													<%-- <li><a href="#table"> <i
															class="fa fa-angle-down text"></i> <i
															class="fa fa-angle-up text-active"></i> <span>Dead
																Stock</span>
													</a>
														<ul class="nav bg">
															<li><a href="DeadAccessories"> <i
																	class="fa fa-angle-right"></i> <span>DeadAccessories</span>
															</a></li>
															<li><a href="DeadBike"> <i
																	class="fa fa-angle-right"></i> <span>DeadBike</span>
															</a></li>

														</ul></li>
 --%>
												</ul></li>


											<li><a href="#uikit"> <i class="fa fa-flask icon">
														<b class="bg-success"></b>
												</i> <span class="pull-right"> <i
														class="fa fa-angle-down text"></i> <i
														class="fa fa-angle-up text-active"></i>
												</span> <span>ORDER</span>
											</a>
												<ul class="nav lt">
													<li><a href="OrderToCompanyForNewBike"> <i
															class="fa fa-angle-right"></i> <span>Order For
																Bike</span>
													</a></li>
												</ul>

												<ul class="nav lt">
													<li><a href="OrderToCompanyForNewAccessories"> <i
															class="fa fa-angle-right"></i> <span>Order For
																Accessories</span>
													</a></li>
												</ul></li>


											</li>

											<li><a href="#uikit"> <i class="fa fa-flask icon">
														<b class="bg-success"></b>
												</i> <span class="pull-right"> <i
														class="fa fa-angle-down text"></i> <i
														class="fa fa-angle-up text-active"></i>
												</span> <span>SaleForUser</span>
											</a>
												<ul class="nav lt">
													<li><a href="BikeSaleForUser"> <i
															class="fa fa-angle-right"></i> <span>BikesaleForUser</span>
													</a></li>
												</ul>

												<ul class="nav lt">
													<li><a href="AccessoriesSaleForUser"> <i
															class="fa fa-angle-right"></i> <span>AccessoriesSaleForUser</span>
													</a></li>
												</ul></li>
											</li>


											<li><a href="#uikit"> <i class="fa fa-flask icon">
														<b class="bg-success"></b>
												</i> <span class="pull-right"> <i
														class="fa fa-angle-down text"></i> <i
														class="fa fa-angle-up text-active"></i>
												</span> <span>VIEW</span>
											</a>
												<ul class="nav lt">

													<li><a href="#table"> <i
															class="fa fa-angle-down text"></i> <i
															class="fa fa-angle-up text-active"></i> <span>View
																Order</span>
													</a>
														<ul class="nav bg">
															<li><a href="ViewOrderBike"> <i
																	class="fa fa-angle-right"></i> <span>Bike</span>
															</a></li>
															<li><a href="ViewOrderAccessories"> <i
																	class="fa fa-angle-right"></i> <span>Accessories</span>
															</a></li>

														</ul></li>
													<li><a href="ViewOldBike"> <i
															class="fa fa-angle-right"></i> <span> ViewOldBike</span>
													</a></li>

													<li><a href="ViewInvoice"> <i
															class="fa fa-angle-right"></i> <span>View Invoice</span>
													</a></li>

													<li><a href="ViewOffer"> <i
															class="fa fa-angle-right"></i> <span>View Offer</span>
													</a></li>
													<li><a href="ViewBikeSaleForUser"> <i
															class="fa fa-angle-right"></i> <span>ViewBikeSaleForUser</span>
													</a></li>
													<li><a href="ViewAccessoriesSaleForUser"> <i
															class="fa fa-angle-right"></i> <span>ViewAccessoriesSaleForUser</span>
													</a></li>
													<li><a href="#table"> <i
															class="fa fa-angle-down text"></i> <i
															class="fa fa-angle-up text-active"></i> <span>View
																Sold</span>
													</a>
														<ul class="nav bg">
															<li><a href="ViewSoldAccessories"> <i
																	class="fa fa-angle-right"></i> <span>Accessories</span>
															</a></li>
															<li><a href="ViewSoldOldBike"> <i
																	class="fa fa-angle-right"></i> <span>Old Bike</span>
															</a></li>
															<li><a href="ViewSoldNewBike"> <i
																	class="fa fa-angle-right"></i> <span>New Bike</span>
															</a></li>

														</ul></li>
														
													<%-- <li><a href="#table"> <i
															class="fa fa-angle-down text"></i> <i
															class="fa fa-angle-up text-active"></i> <span>View
																DeadStock</span>
													</a>
														<ul class="nav bg">
															<li><a href="ViewDeadStockAccessories"> <i
																	class="fa fa-angle-right"></i> <span>Accessories</span>
															</a></li>
															<li><a href="ViewDeadStockBike"> <i
																	class="fa fa-angle-right"></i> <span>Bike</span>
															</a></li>


														</ul></li> --%>

												</ul></li>
									</nav>
									<!-- / nav -->
								</div>
							</section>
							<footer class="footer lt hidden-xs b-t b-dark">
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
								<div id="invite" class="dropup">
									<section class="dropdown-menu on aside-md m-l-n">
										<section class="panel bg-white">
											<header class="panel-heading b-b b-light">
												John <i class="fa fa-circle text-success"></i>
											</header>
											<div class="panel-body animated fadeInRight">
												<p class="text-sm">No contacts in your lists.</p>
												<p>
													<a href="#" class="btn btn-sm btn-facebook"><i
														class="fa fa-fw fa-facebook"></i> Invite from Facebook</a>
												</p>
											</div>
										</section>
									</section>
								</div>
								<a href="#nav" data-toggle="class:nav-xs"
									class="pull-right btn btn-sm btn-dark btn-icon"> <i
									class="fa fa-angle-left text"></i> <i
									class="fa fa-angle-right text-active"></i>
								</a>
								<div class="btn-group hidden-nav-xs">
									<button type="button" title="Chats"
										class="btn btn-icon btn-sm btn-dark" data-toggle="dropdown"
										data-target="#chat">
										<i class="fa fa-comment-o"></i>
									</button>
									<button type="button" title="Contacts"
										class="btn btn-icon btn-sm btn-dark" data-toggle="dropdown"
										data-target="#invite">
										<i class="fa fa-facebook"></i>
									</button>
								</div>
							</footer>
						</section>
					</aside>
					<!-- /.aside -->

					<!-- dashboard starts -->
					<jsp:include page="${link}" />
					<!-- dashboard ends -->


					<aside class="bg-light lter b-l aside-md hide" id="notes">
						<div class="wrapper">Notification</div>
					</aside>
				</section>
			</section>
		</section>
		<!-- Bootstrap -->
		<!-- App -->
		<script
			src="${pageContext.request.contextPath}/Resources/notebook UI/js/app.v1.js"></script>
		<script
			src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/easypiechart/jquery.easy-pie-chart.js"></script>
		<script
			src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/sparkline/jquery.sparkline.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.tooltip.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.resize.js"></script>
		<script
			src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.grow.js"></script>
		<script
			src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/demo.js"></script>
		<script
			src="${pageContext.request.contextPath}/Resources/notebook UI/js/calendar/bootstrap_calendar.js"></script>
		<script
			src="${pageContext.request.contextPath}/Resources/notebook UI/js/calendar/demo.js"></script>
		<script
			src="${pageContext.request.contextPath}/Resources/notebook UI/js/sortable/jquery.sortable.js"></script>
		<script
			src="${pageContext.request.contextPath}/Resources/notebook UI/js/app.plugin.js"></script>
	</div>
</body>
<!-- Mirrored from flatfull.com/themes/note/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:16:42 GMT -->

</html>