<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html lang="en" class="app">
<head>
	<meta charset="utf-8" />
    <title>Royal Enfield | Web Application</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />
    
</head>
<body class="">

     <section class="vbox">
        <header class="bg-dark dk header navbar navbar-fixed-top-xs">
            <div class="navbar-header aside-md"> <a class="btn btn-link visible-xs" data-toggle="class:nav-off-screen,open"
                    data-target="#nav,html"> <i class="fa fa-bars"></i> </a> <a href="#" class="navbar-brand"
                    data-toggle="fullscreen"><img src="${pageContext.request.contextPath}/Resources/Royal Enfield images/RL_logo3.jpg" class="m-r-sm">Royal Enfield</a> <a class="btn btn-link visible-xs"
                    data-toggle="dropdown" data-target=".nav-user"> <i class="fa fa-cog"></i> </a> </div>
           
            <ul class="nav navbar-nav navbar-right m-n hidden-xs nav-user">
                <li class="hidden-xs"> <a href="#" class="dropdown-toggle dk" data-toggle="dropdown"> <i class="fa fa-bell"></i>
                        <span class="badge badge-sm up bg-danger m-l-n-sm count">2</span> </a>
                    <section class="dropdown-menu aside-xl">
                        <section class="panel bg-white">
                            <header class="panel-heading b-light bg-light"> <strong>You have <span class="count">2</span>
                                    notifications</strong> </header>
                            <div class="list-group list-group-alt animated fadeInRight"> <a href="#" class="media list-group-item">
                                    <span class="pull-left thumb-sm"> <img src="images/avatar.jpg" alt="John said"
                                            class="img-circle"> </span> <span class="media-body block m-b-none"> Use
                                        awesome animate.css<br> <small class="text-muted">10 minutes ago</small> </span>
                                </a> <a href="#" class="media list-group-item"> <span class="media-body block m-b-none">
                                        1.0 initial released<br> <small class="text-muted">1 hour ago</small> </span>
                                </a> </div>
                            <footer class="panel-footer text-sm"> <a href="#" class="pull-right"><i class="fa fa-cog"></i></a>
                                <a href="#notes" data-toggle="class:show animated fadeInRight">See all the
                                    notifications</a> </footer>
                        </section>
                    </section>
                </li>
                <li class="dropdown hidden-xs"> <a href="#" class="dropdown-toggle dker" data-toggle="dropdown"><i
                            class="fa fa-fw fa-search"></i></a>
                    <section class="dropdown-menu aside-xl animated fadeInUp">
                        <section class="panel bg-white">
                            <form role="search">
                                <div class="form-group wrapper m-b-none">
                                    <div class="input-group"> <input type="text" class="form-control" placeholder="Search">
                                        <span class="input-group-btn"> <button type="submit" class="btn btn-info btn-icon"><i
                                                    class="fa fa-search"></i></button> </span> </div>
                                </div>
                            </form>
                        </section>
                    </section>
                </li>
                <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                	<span class="thumb-sm avatar pull-left">
                            <img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg"> 
                            </span> John.Smith <b class="caret"></b> </a>
                    <ul class="dropdown-menu animated fadeInRight"> <span class="arrow top"></span>
                        <li> <a href="#">Settings</a> </li>
                        <li> <a href="profile.html">Profile</a> </li>
                        <li> <a href="#"> <span class="badge bg-danger pull-right">3</span> Notifications </a> </li>
                        <li> <a href="docs.html">Help</a> </li>
                        <li class="divider"></li>
                        <li> <a href="modal.lockme.html" data-toggle="ajaxModal">Logout</a> </li>
                    </ul>
                </li>
            </ul>
        </header>
        <section>
            <section class="hbox stretch">
                <!-- .aside -->
                <aside class="bg-dark lter aside-md hidden-print hidden-xs" id="nav">
                    <section class="vbox">
                    
                        <section class="w-f scrollable">
                            <div class="slim-scroll" data-height="auto" data-disable-fade-out="true" data-distance="0"
                                data-size="5px" data-color="#333333">
                                <!-- nav -->
                                <nav class="nav-primary hidden-xs">
                                    <ul class="nav">
                                        
                                        <li> 
                                        	<a href="DashboardPage"> 
                                        		<i class="fa fa-dashboard icon">
                                            		<b class="bg-danger"></b> 
                                            	</i> 
                                            	<span>Service Dashboard</span>
                                            </a>
                                        </li>
                                        
                                        <li> 
											
											<a href=""> 
												<i class="fa fa-gear icon"> 
													<b class="bg-warning dker"></b>
                                                </i> 
                                                <span class="pull-right"> 
                                                	<i class="fa fa-angle-down text"></i> 
                                                	<i class="fa fa-angle-up text-active"></i> 
                                                </span> 
                                                <span>Services</span>
                                            </a>
                                            
                                            
                                            
                                            <ul class="nav lt">
                                                <li> 
                                                	<a href="ApprovedServicesPage"> 
                                                		<i class="fa fa-angle-right"></i> 
                                                		<span>Approved Services</span> 
                                                	</a> 
                                                </li> 
                                            </ul>
                                            
                                            <ul class="nav lt">
                                                <li> 
                                                	<a href="ServicesInprogressPage"> 
                                                		<i class="fa fa-angle-right"></i> 
                                                		<span>In-progress Services</span> 
                                                	</a> 
                                                </li> 
                                            </ul>
                                            
                                            <ul class="nav lt">
                                                <li> 
                                                	<a href="BikeServicesRecordsPage"> 
                                                		<i class="fa fa-angle-right"></i> 
                                                		<span>Services Records</span> 
                                                	</a> 
                                                </li> 
                                            </ul>
                                            
                                            <ul class="nav lt">
                                                <li> 
                                                	<a href="AvailableServicesPage"> 
                                                		<i class="fa fa-angle-right"></i> 
                                                		<span>Available Services</span> 
                                                	</a> 
                                                </li> 
                                            </ul>    
                                            
                                        </li>
                                        
                                        <li> 
                                        	<a href=""> 
												<i class="fa fa-wrench icon"> 
													<b class="bg-success dker"></b>
                                                </i> 
                                                <span class="pull-right"> 
                                                	<i class="fa fa-angle-down text"></i> 
                                                	<i class="fa fa-angle-up text-active"></i> 
                                                </span> 
                                                <span>Customization</span>
                                            </a>
                                            
                                            <ul class="nav lt">
                                                <li> 
                                                	<a href="ApprovedCustomizationPage"> 
                                                		<i class="fa fa-angle-right"></i> 
                                                		<span>Approved Customization</span> 
                                                	</a> 
                                                </li> 
                                            </ul>
                                            
                                            <ul class="nav lt">
                                                <li> 
                                                	<a href="CustomizationInprogressPage"> 
                                                		<i class="fa fa-angle-right"></i> 
                                                		<span>In-progress Customization</span> 
                                                	</a> 
                                                </li> 
                                            </ul>
                                            
                                            <ul class="nav lt">
                                                <li> 
                                                	<a href="BikeCustomizationRecordsPage"> 
                                                		<i class="fa fa-angle-right"></i> 
                                                		<span>Customization Records</span> 
                                                	</a> 
                                                </li> 
                                            </ul>
                                            
                                            <ul class="nav lt">
                                                <li> 
                                                	<a href="AvailableCustomizationPage"> 
                                                		<i class="fa fa-angle-right"></i> 
                                                		<span>Available Customization</span> 
                                                	</a> 
                                                </li> 
                                            </ul> 
                                        </li>
                                        
   
                                       
                                       <li> 
                                        	<a href=""> 
												<i class="fa fa-rupee icon"> 
													<b class="bg-info dker"></b>
                                                </i> 
                                                <span class="pull-right"> 
                                                	<i class="fa fa-angle-down text"></i> 
                                                	<i class="fa fa-angle-up text-active"></i> 
                                                </span> 
                                                <span>Invoice</span>
                                            </a> 
                                            
                                            <ul class="nav lt">
                                                <li> 
                                                	<a href="ServicesInvoicePage"> 
                                                		<i class="fa fa-angle-right"></i> 
                                                		<span>Servicing Invoice</span> 
                                                	</a> 
                                                </li> 
                                            </ul>
                                            
                                            <ul class="nav lt">
                                                <li> 
                                                	<a href="CustomizationInvoicePage"> 
                                                		<i class="fa fa-angle-right"></i> 
                                                		<span>Customization Invoice</span> 
                                                	</a> 
                                                </li> 
                                            </ul>
                                       </li>
                                       
                                       <li> 
                                        	<a href="MyNotificationsPage"> 
                                        		<i class="fa fa-bell icon"> 
                                        			<b class="bg-info lt"></b>  
                                                </i> 
                                                <span>My Notifications</span> 
                                            </a> 
                                       </li>
                                       
                                    </ul>
                                </nav> <!-- / nav -->
                            </div>
                        </section>
                        
                        <footer class="footer lt hidden-xs b-t b-dark">
                            
                            <a href="#nav" data-toggle="class:nav-xs" class="pull-right btn btn-sm btn-dark btn-icon">
                                <i class="fa fa-angle-left text"></i> 
                                <i class="fa fa-angle-right text-active"></i> 
                            </a>
                       
                        </footer>
                    </section>
                </aside> <!-- /.aside -->
                  
                <!-- dashboard starts -->
                	 <jsp:include page="${link}"/>
                <!-- dashboard ends -->
                
                <aside class="bg-light lter b-l aside-md hide" id="notes">
                    <div class="wrapper">Notification</div>
                </aside>
            </section>
        </section>
    </section> <!-- Bootstrap -->
    <!-- App -->
    <script src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/app.v1.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/charts/easypiechart/jquery.easy-pie-chart.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/charts/sparkline/jquery.sparkline.min.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/charts/flot/jquery.flot.min.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/charts/flot/jquery.flot.tooltip.min.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/charts/flot/jquery.flot.resize.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/charts/flot/jquery.flot.grow.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/charts/flot/demo.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/demo.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/sortable/jquery.sortable.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/app.plugin.js"></script> 
</body>
</html>