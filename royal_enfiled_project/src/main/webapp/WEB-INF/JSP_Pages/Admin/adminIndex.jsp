<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<title>Royal_Enfield | Web Application</title>
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
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body bgcolor="cyan">
	<section class="vbox"> <!-- Start Header --> <header
		class="bg-dark dk header navbar navbar-fixed-top-xs">
	<div class="navbar-header aside-md">
		<a class="btn btn-link visible-xs"
			data-toggle="class:nav-off-screen,open" data-target="#nav,html">
			<i class="fa fa-bars"></i>
		</a> <a href="toAdminHomePage" class="navbar-brand"><img
			src="images/logo.png" class="m-r-sm">Admin</a> <a
			class="btn btn-link visible-xs" data-toggle="dropdown"
			data-target=".nav-user"> <i class="fa fa-cog"></i>
		</a>
	</div>
	<ul class="nav navbar-nav hidden-xs">
		<li class="dropdown"><a href="#" class="dropdown-toggle dker"
			data-toggle="dropdown"> <i class="fa fa-building-o"></i> <span
				class="font-bold">Active</span>
		</a> <!-- This for Login User Details --> <section
				class="dropdown-menu aside-xl on animated fadeInLeft no-borders lt">
			<div class="wrapper lter m-t-n-xs">
				<a href="#" class="thumb pull-left m-r"> <img
					src="images/Nikita.jpg" class="img-circle">
				</a>
				<div class="clear">
					<a href="#"><span class="text-white font-bold">Nikita_Pise</a></span>
					<small class="block">Art Director</small> <a href="#"
						class="btn btn-xs btn-success m-t-xs">Upgrade</a>
				</div>
			</div>
			<div class="row m-l-none m-r-none m-b-n-xs text-center">
				<div class="col-xs-4">
					<div class="padder-v">
						<span class="m-b-xs h4 block text-white">245</span> <small
							class="text-muted">Followers</small>
					</div>
				</div>
				<div class="col-xs-4 dk">
					<div class="padder-v">
						<span class="m-b-xs h4 block text-white">55</span> <small
							class="text-muted">Likes</small>
					</div>
				</div>
				<div class="col-xs-4">
					<div class="padder-v">
						<span class="m-b-xs h4 block text-white">2,035</span> <small
							class="text-muted">Photos</small>
					</div>
				</div>
			</div>
			</section> <!-- End Login User Details --></li>
		<li>
			<div class="m-t m-l">
				<a href="price.html" class="dropdown-toggle btn btn-xs btn-primary"
					title="Upgrade"><i class="fa fa-long-arrow-up"></i></a>
			</div>
		</li>
	</ul>
	<ul class="nav navbar-nav navbar-right m-n hidden-xs nav-user">
                <li class="hidden-xs"> <a href="#" class="dropdown-toggle dk" data-toggle="dropdown"> <i class="fa fa-bell"></i>
                        <span class="badge badge-sm up bg-danger m-l-n-sm">${inboxCount}</span> </a>
                    <section class="dropdown-menu aside-xl">
                        <section class="panel bg-white">
                            <header class="panel-heading b-light bg-light"> 
                            	<strong>You have <span class="">${inboxCount}</span>&nbsp;unread notifications</strong> 
                            </header>
                           <div class=" list-group-alt animated fadeInRight"> 
                           
                           	<c:forEach var="data" items="${shortInboxList}">
                            	<a href="myNotifications" class="media list-group-item">
                                    <span class="pull-left thumb-sm"> 
                                    	<img src="${pageContext.request.contextPath}/Resources/images/EmployeeProfilePicture/${data.senderImg}" alt="John said" class="img-circle"> 
                                    </span> 
                                    <span class="media-body block m-b-none"><strong>${data.senderName}</strong>&nbsp;&nbsp;${data.message}<br> 
                                    	<small class="text-muted">${data.sendDate}</small> 
                                    </span>
                                </a> 
                            </c:forEach>
                         </div>
                          <!-- <footer class="panel-footer text-sm"> 
                         	<a href="myNotifications" class="pull-right"></a>
                            <a href="myNotifications" data-toggle="class:show animated fadeInRight">
                            	See all the notifications
                            </a> 
                         </footer> -->
                      </section>
                  </section>
                </li>

                <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                	<span class="thumb-sm avatar pull-left">
                            <img src="${pageContext.request.contextPath}/Resources/images/EmployeeProfilePicture/${currentUserImg}"> 
                            </span> ${currentUserName} <b class="caret"></b> </a>
                    <ul class="dropdown-menu animated fadeInRight"> <span class="arrow top"></span>
                        <li> <a href="#">Settings</a> </li>
                        <li> <a href="profile.html">Profile</a> </li>
                        <li> <a href="myNotifications"> <span class="badge bg-danger pull-right">${inboxCount}</span> Notifications </a> </li>
                        <li> <a href="docs.html">Help</a> </li>
                        <li class="divider"></li>
                        <li> <a href="adminLogout" data-toggle="ajaxModal">Logout</a> </li>
                    </ul>
                </li>
            </ul>
	</header> <!-- End Header --> <section> <section class="hbox stretch">
	<!-- .aside --> <aside
		class="bg-dark lter aside-md hidden-print hidden-xs" id="nav">
	<section class="vbox"> <section class="w-f scrollable">
	<div class="slim-scroll" data-height="auto"
		data-disable-fade-out="true" data-distance="0" data-size="5px"
		data-color="#333333">
		<!-- nav -->
		<nav class="nav-primary hidden-xs">
		<ul class="nav">



			<li><a href="#"> <i class="fa fa-dashboard icon"> <b
						class="bg-warning"></b>
				</i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
						<i class="fa fa-angle-up text-active"></i>
				</span> <span>Add</span>
			</a>
				<ul class="nav lt">


					<li><a href="composeMail?designation=1"> <span>SalesManager</span>
					</a></li>

					<li><a href="composeMail?designation=2"> <span>ServiceManager</span>
					</a></li>

					<li><a href="composeMail?designation=3"> <span>Accountant</span>
					</a></li>


				</ul></li>

			<!-- This for User -->
			<li><a href=""> <i class="fa fa-user icon"> <b
						class="bg-warning"></b>
				</i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
						<i class="fa fa-angle-up text-active"></i>
				</span> <span>User</span>
			</a>
				<ul class="nav lt">
					<li><a href="employeeList?designation=SalesManager"> <span>SalesManager</span>
					</a></li>

					<li><a href="employeeList?designation=ServiceManager"> <span>ServiceManager</span>
					</a></li>

					<li><a href="employeeList?designation=AccountManager"> <span>Accountant</span>
					</a></li>

					<li><a href="employeeList?designation=DEALER"> <span>Dealer</span>
					</a></li>

					<li><a href="employeeList?designation=USER"> <span>User</span>
					</a></li>


				</ul></li>
			<!-- End User -->

			<!-- This for Stock -->
			<li><a href="#"> <i class="fa fa-flask icon"> <b
						class="bg-success"></b>
				</i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
						<i class="fa fa-angle-up text-active"></i>
				</span> <span>Stock</span>
			</a>
				<ul class="nav lt">
					<li><a href=""> <i class="fa fa-angle-right"></i> <span>Bike</span>
					</a> <!-- this for sublist of Bike -->
						<ul class="nav lt">
							<li><a href="newBikeStock"> <span>NewBike</span>
							</a></li>
							<li><a href="oldBikeStock"> <span>OldBike</span>
							</a></li>
						</ul> <!-- end of sublist of Bike --></li>
					<li><a href="accessoriesStock"> <b
							class="badge bg-info pull-right"></b> <i
							class="fa fa-angle-right"></i> <span>Accesories</span>
					</a></li>

					<li><a href=""> <i class="fa fa-angle-down text"></i> <i
							class="fa fa-angle-up text-active"></i> <span>Dead_stock</span>
					</a>
						<ul class="nav bg">
							<li><a href="deadBikeStock"> <span>Dead_Bike</span>
							</a></li>
							<li><a href="accessoriesDeadStock"> <span>Dead_Accessories</span>
							</a></li>
						</ul></li>
				</ul></li>
			<!-- End Stock -->
			<!-- This for View -->
			<li><a href="#v"> <i class="fa fa-user icon"> <b
						class="bg-warning"></b>
				</i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
						<i class="fa fa-angle-up text-active"></i>
				</span> <span>View</span>
			</a>
				<ul class="nav lt">

					<li><a href="bikeServicesRecords"> <span>Bike_Services_Record</span>
					</a></li>

					<!-- TestDrive -->
					<li><a href="testDriveCustomer"> <span>testDriveCustomer</span>
					</a></li>
					<!--End Test Drive  -->
				</ul></li>
			<!-- End view -->

			<!--Start Invoice  -->

			<li><a href=""> <i class="fa fa-user icon"> <b
						class="bg-warning"></b>
				</i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
						<i class="fa fa-angle-up text-active"></i>
				</span> <span>Invoice</span>
			</a></li>

			<!--End Invioce  -->


			<!--Start BikeOffer  -->
			<li><a href="bikeOffer"> <i class="fa fa-user icon"> <b
						class="bg-warning"></b>
				</i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
						<i class="fa fa-angle-up text-active"></i>
				</span> <span>Offer</span>
			</a></li>
			<!--End BikeOffer  -->

			<!--Start Sales  -->
			<li><a href=""> <i class="fa fa-user icon"> <b
						class="bg-warning"></b>
				</i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
						<i class="fa fa-angle-up text-active"></i>
				</span> <span>Sales</span>
			</a>
				<ul class="nav bg">

					<li><a href=""> <i class="fa fa-angle-right"></i> <span>Bike</span>
					</a> <!-- this for sublist of Bike -->
						<ul class="nav lt">
							<li><a href="soldNewBike"> <span>NewBike</span>
							</a></li>
							<li><a href="soldOldBike"> <span>OldBike</span>
							</a></li>
						</ul></li>
					<!-- end of sublist of Bike -->

					<li><a href="soldAccessories"> <i
							class="fa fa-angle-right"></i> <span>Accessories</span>
					</a></li>
				</ul></li>
			<!--End Sales  -->

			<!-- Start Service -->
			<li><a href=""> <i class="fa fa-user icon"> <b
						class="bg-warning"></b>
				</i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
						<i class="fa fa-angle-up text-active"></i>
				</span> <span>Services</span>
			</a>

				<ul class="nav bg">

					<li><a href="avaliableServicing"> <span>Available_Service</span>
					</a></li>



					<li><a href="bikeCustomization"> <span>Bike_Customization_Details</span>
					</a></li>

					<li><a href="bikeServicing"> <span>Bike_Servicing_Details</span>
					</a></li>
				</ul></li>

			<!-- End Service -->
			
			<!--Start notification  -->
			<li><a href="myNotifications"> <i class="fa fa-bell icon"> <b
						class="bg-warning"></b>
				</i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
						<i class="fa fa-angle-up text-active"></i>
				</span> <span>Notification</span>
			</a></li>
			
			<!--End notification  -->

			</li>
		</ul>

		</li>
		</nav>
		<!-- / nav -->
	</div>
	</section> <footer class="footer lt hidden-xs b-t b-dark">
	<div id="chat" class="dropup">
		<section class="dropdown-menu on aside-md m-l-n"> </section>
	</div>
	<div id="invite" class="dropup">
		<section class="dropdown-menu on aside-md m-l-n"> <section
			class="panel bg-white"> <header
			class="panel-heading b-b b-light"> John <i
			class="fa fa-circle text-success"></i> </header>
		<div class="panel-body animated fadeInRight">
			<p class="text-sm">No contacts in your lists.</p>
			<p>
				<a href="#" class="btn btn-sm btn-facebook"><i
					class="fa fa-fw fa-facebook"></i> Invite from Facebook</a>
			</p>
		</div>
		</section> </section>
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
	</footer> </section> </aside> <!-- /.aside --> <!-- dashboard starts --> <jsp:include
		page="${link}" /> <!-- dashboard ends --> <aside
		class="bg-light lter b-l aside-md hide" id="notes">
	<div class="wrapper">Notification</div>
	</aside> </section> </section> <!-- Bootstrap --> <!-- App --> <script
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
	<%-- <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/calendar/bootstrap_calendar.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/calendar/demo.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/sortable/jquery.sortable.js"></script> --%>
	<script
		src="${pageContext.request.contextPath}/Resources/notebook UI/js/app.plugin.js"></script>
	<%-- <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/datatables/demo.js"></script> --%>
	<script
		src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.orderBars.js"></script>
	<script
		src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.pie.min.js"></script>
	<%--  	<script src="${pageContext.request.contextPath}/Resources/notebook UI/js/datatables/jquery.dataTables.min.js"></script> --%>
</body>
</html>