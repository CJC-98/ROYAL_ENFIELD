<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8" />
    <title>Notebook | Web Application</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body class="">
    <section class="vbox">
        <!-- Start Header -->
        <header class="bg-dark dk header navbar navbar-fixed-top-xs">
            <div class="navbar-header aside-md"> <a class="btn btn-link visible-xs" data-toggle="class:nav-off-screen,open"
                    data-target="#nav,html"> <i class="fa fa-bars"></i> </a> <a href="#" class="navbar-brand"
                    data-toggle="fullscreen"><img src="images/logo.png" class="m-r-sm">Admin</a> <a class="btn btn-link visible-xs"
                    data-toggle="dropdown" data-target=".nav-user"> <i class="fa fa-cog"></i> </a> </div>
            <ul class="nav navbar-nav hidden-xs">
                <li class="dropdown"> <a href="#" class="dropdown-toggle dker" data-toggle="dropdown"> <i class="fa fa-building-o"></i>
                        <span class="font-bold">Active</span> </a>
                        <!-- This for Login User Details -->
                    <section class="dropdown-menu aside-xl on animated fadeInLeft no-borders lt">
                        <div class="wrapper lter m-t-n-xs"> <a href="#" class="thumb pull-left m-r"> <img src="images/Nikita.jpg"
                                    class="img-circle"> </a>
                            <div class="clear"> <a href="#"><span class="text-white font-bold">Nikita_Pise</a></span>
                                <small class="block">Art Director</small> <a href="#" class="btn btn-xs btn-success m-t-xs">Upgrade</a>
                            </div>
                        </div>
                        <div class="row m-l-none m-r-none m-b-n-xs text-center">
                            <div class="col-xs-4">
                                <div class="padder-v"> <span class="m-b-xs h4 block text-white">245</span> <small class="text-muted">Followers</small>
                                </div>
                            </div>
                            <div class="col-xs-4 dk">
                                <div class="padder-v"> <span class="m-b-xs h4 block text-white">55</span> <small class="text-muted">Likes</small>
                                </div>
                            </div>
                            <div class="col-xs-4">
                                <div class="padder-v"> <span class="m-b-xs h4 block text-white">2,035</span> <small
                                        class="text-muted">Photos</small> </div>
                            </div>
                        </div>
                    </section>
                     <!-- End Login User Details -->
                </li>
                <li>
                    <div class="m-t m-l"> <a href="price.html" class="dropdown-toggle btn btn-xs btn-primary" title="Upgrade"><i
                                class="fa fa-long-arrow-up"></i></a> </div>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right m-n hidden-xs nav-user">
                <li class="hidden-xs"> <a href="#" class="dropdown-toggle dk" data-toggle="dropdown"> <i class="fa fa-bell"></i>
                        <span class="badge badge-sm up bg-danger m-l-n-sm count">2</span> </a>
                    <section class="dropdown-menu aside-xl">
                        <section class="panel bg-white">
                            <!-- This for notification block -->
                            <header class="panel-heading b-light bg-light"> <strong>You have <span class="count">2</span>
                                    notifications</strong> </header>
                             
                            <div class="list-group list-group-alt animated fadeInRight"> <a href="#" class="media list-group-item">
                                    <span class="pull-left thumb-sm"> <img src="images/Nikita.jpg" alt="Nikita said"
                                            class="img-circle"> </span> <span class="media-body block m-b-none"> Use
                                        awesome animate.css<br> <small class="text-muted">10 minutes ago</small> </span>
                                </a> <a href="#" class="media list-group-item"> <span class="media-body block m-b-none">
                                        1.0 initial released<br> <small class="text-muted">1 hour ago</small> </span>
                                </a> </div>
                            <footer class="panel-footer text-sm"> <a href="#" class="pull-right"><i class="fa fa-cog"></i></a>
                                <a href="#notes" data-toggle="class:show animated fadeInRight">See all the
                                    notifications</a> </footer>
                            <!-- This for notification block -->
                        </section>
                    </section>
                </li>
                <!-- Search_icon Block -->
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
                <!-- End Search_icon Block -->
                <!-- Login_Profile Details -->
                <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <span class="thumb-sm avatar pull-left">
                            <img src="images/Nikita.jpg"> </span>Nikita_Pise <b class="caret"></b> </a>
                    <ul class="dropdown-menu animated fadeInRight"> <span class="arrow top"></span>
                        <li> <a href="#">Settings</a> </li>
                        <li> <a href="profile.html">Profile</a> </li>
                        <li> <a href="#"> <span class="badge bg-danger pull-right">3</span> Notifications </a> </li>
                        <li> <a href="docs.html">Help</a> </li>
                        <li class="divider"></li>
                        <li> <a href="modal.lockme.html" data-toggle="ajaxModal">Logout</a> </li>
                    </ul>
                </li>
                <!-- End Login_Profile Details -->
            </ul>
        </header>
        <!-- End Header -->
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
                                        <li> <a href="#add" class="active"> <i class="fa fa-dashboard icon">
                                                    <b class="bg-danger"></b> </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
                                                    <i class="fa fa-angle-up text-active"></i> </span> <span>Add</span>
                                            </a>
                                             <!-- This for sublist of Add -->
                                            <ul class="nav lt">

                                                <li> <a href="#manager">
                                                          <i class="fa fa-angle-right"><b class="bg-danger"></b></i><span class="pull-right">
                                                            <i class="fa fa-angle-down text"></i> <i class="fa fa-angle-up text-active"></i> </span> 
                                                         <span>Manager</span> </a> 

                                                         <!-- this for sublist of Manager -->
                                                         <ul class="nav lt">
                                                        <li class="active"> <a href="composeMail" class="active">
                                                            <span>SalesManager</span> </a> </li>
                                                        <li class="active"> <a href="composeMail" class="active">
                                                            <span>ServiceManager</span> </a> </li>
                                                        </ul>
                                                         <!-- end of sublist of Manager -->
                                                </li>
                                                
												<li> <a href="composeMail"> <i class="fa fa-angle-right"><b class="bg-danger"></b></i>
                                                    
                                                    <span>Accountant</span> </a> 

                                       
												</li>
                                              
											</ul>
                                           
                                             <!-- end of sublist of Add -->

                                        </li>
									
										
                                     
                                        <!-- This for User -->
                                        <li> <a href="user.html"> <i class="fa fa-user icon"> <b class="bg-warning"></b>
                                                </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i> <i
                                                        class="fa fa-angle-up text-active"></i> </span> <span>User</span>
                                            </a>
                                            
                                        </li>
                                        <!-- End User -->
                                        <!-- This for Stock -->
                                       
                                            <li> <a href="#stock"> <i class="fa fa-flask icon"> <b class="bg-success"></b>
                                            </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i> <i
                                                    class="fa fa-angle-up text-active"></i> </span> <span>Stock</span>
                                        </a>
                                        <ul class="nav lt">
                                            <li> <a href="bike.html"> <i class="fa fa-angle-right"></i> <span>Bike</span>
                                                </a> 
                                                         <!-- this for sublist of Bike -->
                                                         <ul class="nav lt">
                                                        <li> <a href="composeMail" class="active">
                                                            <span>NewBike</span> </a> </li>
                                                        <li> <a href="composeMail" class="active">
                                                            <span>OldBike</span> </a> </li>
                                                        </ul>
                                                         <!-- end of sublist of Bike -->
                                                </li>
                                            <li> <a href="accessories.html"> <b class="badge bg-info pull-right"></b>
                                                    <i class="fa fa-angle-right"></i> <span>Accesories</span> </a> </li>
                                            
                                            <li> <a href=""> <i class="fa fa-angle-down text"></i> <i class="fa fa-angle-up text-active"></i>
                                                    <span>Dead_stock</span> </a>
                                                <ul class="nav bg">
                                                    <li> <a href="deadbike.html"> <i class="fa fa-angle-right"></i>
                                                            <span>Dead_Bike</span> </a> </li>
                                                    <li> <a href="deadaccessories.html"> <i class="fa fa-angle-right"></i>
                                                            <span>Dead_Accessories</span> </a> </li>
                                                </ul>
                                            </li>
                                            
                                        </ul>
										
										<!-- This for View -->
                                        <li> <a href="#view"> <i class="fa fa-user icon"> <b class="bg-warning"></b>
                                                </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i> <i
                                                        class="fa fa-angle-up text-active"></i> </span> <span>View</span>
                                            </a>
                                            <ul class="nav lt">
                                                    <li> <a href="salesmanagerlist.html" class="active">
                                                            <i class="fa fa-angle-right"></i> 
                                                            <span>SalesManager</span> </a> </li>
                                                    <li> <a href="servicemanagerlist.html" class="active">
                                                            <i class="fa fa-angle-right"></i> 
                                                            <span>ServiceManager</span> </a> </li>
                                                    <li> <a href="accountantlist.html" class="active">
                                                            <i class="fa fa-angle-right"></i> 
                                                            <span>Accountant</span> </a> </li>
                                                    <li> <a href="dealerlist.html" class="active">
                                                            <i class="fa fa-angle-right"></i> 
                                                            <span>Dealer</span> </a> </li>
                                                    <li> <a href="userlist.html" class="active">
                                                            <i class="fa fa-angle-right"></i> 
                                                             <span>User</span> </a> </li>
                                                </ul>
                                            
                                        </li>
                                        <!-- End view -->
										</li>
                                        </li>
                                        <!-- End Stock -->
                                        <li> <a href="mail.html"> <b class="badge bg-danger pull-right">3</b> <i class="fa fa-envelope-o icon">
                                                    <b class="bg-primary dker"></b> </i> <span>Message</span> </a> </li>
                                        <li> <a href="notebook.html"> <i class="fa fa-pencil icon"> <b class="bg-info"></b>
                                                </i> <span>Notes</span> </a> </li>
                                    </ul>
                                </nav> <!-- / nav -->
                            </div>
                        </section>
                        <footer class="footer lt hidden-xs b-t b-dark">
                            <div id="chat" class="dropup">
                                <section class="dropdown-menu on aside-md m-l-n">

                                </section>
                            </div>
                            <div id="invite" class="dropup">
                                <section class="dropdown-menu on aside-md m-l-n">
                                    <section class="panel bg-white">
                                        <header class="panel-heading b-b b-light"> John <i class="fa fa-circle text-success"></i>
                                        </header>
                                        <div class="panel-body animated fadeInRight">
                                            <p class="text-sm">No contacts in your lists.</p>
                                            <p><a href="#" class="btn btn-sm btn-facebook"><i class="fa fa-fw fa-facebook"></i>
                                                    Invite from Facebook</a></p>
                                        </div>
                                    </section>
                                </section>
                            </div> <a href="#nav" data-toggle="class:nav-xs" class="pull-right btn btn-sm btn-dark btn-icon">
                                <i class="fa fa-angle-left text"></i> <i class="fa fa-angle-right text-active"></i> </a>
                            <div class="btn-group hidden-nav-xs"> <button type="button" title="Chats" class="btn btn-icon btn-sm btn-dark"
                                    data-toggle="dropdown" data-target="#chat"><i class="fa fa-comment-o"></i></button>
                                <button type="button" title="Contacts" class="btn btn-icon btn-sm btn-dark" data-toggle="dropdown"
                                    data-target="#invite"><i class="fa fa-facebook"></i></button> </div>
                        </footer>
                    </section>
                </aside> <!-- /.aside -->
                <section id="content">
                    <section class="vbox .container-fluid ">
                        <section class="scrollable padder">
                            <ul class="breadcrumb no-border no-radius b-b b-light pull-in">
                                <li><a href="index.html"><i class="fa fa-home"></i> Home</a></li>
                            </ul>
                            <div class="m-b-md">
                                <h3 class="m-b-none">Workset</h3> <small>Welcome back,Royal_Enfield</small>
                            </div>
                            <section class="panel panel-default">
                                <div class="row m-l-none m-r-none bg-light lter">
                                    <div class="col-sm-6 col-md-3 padder-v b-r b-light"> <span class="fa-stack fa-2x pull-left m-r-sm">
                                            <i class="fa fa-circle fa-stack-2x text-info"></i> <i class="fa fa-male fa-stack-1x text-white"></i>
                                        </span> <a class="clear" href="#"> <span class="h3 block m-t-xs"><strong>52,000</strong></span>
                                            <small class="text-muted text-uc">Register</small> </a> </div>
                                    <div class="col-sm-6 col-md-3 padder-v b-r b-light lt"> <span class="fa-stack fa-2x pull-left m-r-sm">
                                            <i class="fa fa-circle fa-stack-2x text-warning"></i> <i class="fa fa-bug fa-stack-1x text-white"></i>
                                            <span class="easypiechart pos-abt" data-percent="100" data-line-width="4"
                                                data-track-Color="#fff" data-scale-Color="false" data-size="50"
                                                data-line-cap='butt' data-animate="2000" data-target="#bugs"
                                                data-update="3000"></span> </span> <a class="clear" href="#"> <span
                                                class="h3 block m-t-xs"><strong id="bugs">468</strong></span> <small
                                                class="text-muted text-uc">Visitor</small> </a> </div>
                                    <div class="col-sm-6 col-md-3 padder-v b-r b-light"> <span class="fa-stack fa-2x pull-left m-r-sm">
                                            <i class="fa fa-circle fa-stack-2x text-danger"></i> <i class="fa fa-fire-extinguisher fa-stack-1x text-white"></i>
                                            <span class="easypiechart pos-abt" data-percent="100" data-line-width="4"
                                                data-track-Color="#f5f5f5" data-scale-Color="false" data-size="50"
                                                data-line-cap='butt' data-animate="3000" data-target="#firers"
                                                data-update="5000"></span> </span> <a class="clear" href="#"> <span
                                                class="h3 block m-t-xs"><strong id="firers">359</strong></span> <small
                                                class="text-muted text-uc">User_Dealer</small> </a> </div>
                                    <div class="col-sm-6 col-md-3 padder-v b-r b-light lt"> <span class="fa-stack fa-2x pull-left m-r-sm">
                                            <i class="fa fa-circle fa-stack-2x text-info "></i> <i class="fa fa-fire-extinguisher fa-stack-1x text-white"></i>
                                        </span> <a class="clear" href="#"> <span class="h3 block m-t-xs"><strong>31</strong></span>
                                            <small class="text-muted text-uc">Profit_Loss</small> </a> </div>
                                </div>
                            </section>
                            <div class="row">
                                <div class="col-sm-6 col-md-3"> 
                                    <div class="row b-a " style=" margin: 3px;padding: 5px;margin-bottom: 15px  ">
                                         <span class="fa-stack fa-2x pull-left m-r-sm">
                                             <i class="fa fa-circle fa-stack-2x text-danger"></i>
                                             <i class="fa fa-rupee fa-stack-1x text-white" ></i>
                                                 
                                                    <span class="easypiechart pos-abt" data-percent="100" data-line-width="4"
                                                         data-track-Color="#fff" data-scale-Color="false" data-size="50"
                                                        data-line-cap='butt' data-animate="2000" data-target="#bugs"
                                                        data-update="3000">
                                                    </span>
                                        </span> 
                                        <a class="clear" href="#">
                                          <span class="h3 block m-t-xs">
                                              <strong id="bugs">468</strong>
                                            </span> 
                                            <small class="text-muted text-uc">Balance</small> 
                                         </a> 
                                    </div>

                                    <div class="row b-a" style=" margin: 3px;padding: 5px; margin-bottom: 15px" >
                                         <span class="fa-stack fa-2x pull-left m-r-sm">
                                             <i class="fa fa-circle fa-stack-2x text-danger"></i>
                                                 <i class="fa fa-fire-extinguisher fa-stack-1x text-white"></i>
                                                    <span class="easypiechart pos-abt" data-percent="100" data-line-width="4"
                                                         data-track-Color="#fff" data-scale-Color="false" data-size="50"
                                                        data-line-cap='butt' data-animate="2000" data-target="#bugs"
                                                        data-update="3000">
                                                    </span>
                                        </span> 
                                        <a class="clear" href="#">
                                          <span class="h3 block m-t-xs">
                                              <strong id="bugs">468</strong>
                                            </span> 
                                            <small class="text-muted text-uc">Bike</small> 
                                         </a> 
                                    </div>
                                    <div class="row b-a" style=" margin: 3px;padding: 5px;">
                                         <span class="fa-stack fa-2x pull-left m-r-sm">
                                             <i class="fa fa-circle fa-stack-2x text-danger"></i>
                                                 <i class="fa fa-fire-extinguisher fa-stack-1x text-white"></i>
                                                    <span class="easypiechart pos-abt" data-percent="100" data-line-width="4"
                                                         data-track-Color="#fff" data-scale-Color="false" data-size="50"
                                                        data-line-cap='butt' data-animate="2000" data-target="#bugs"
                                                        data-update="3000">
                                                    </span>
                                        </span> 
                                        <a class="clear" href="#">
                                          <span class="h3 block m-t-xs">
                                              <strong id="bugs">488</strong>
                                            </span> 
                                            <small class="text-muted text-uc">Accesories</small> 
                                         </a> 
                                    </div>
                                </div>

                                <div class="col-md-9">
                                    <section class="panel panel-default">
                                        <header class="panel-heading font-bold">Vertical bar</header>
                                            <div class="panel-body">
                                                <div id="flot-bar" style="height: 200px; padding: 0px; position: relative;">
                                                    <canvas class="flot-base" width="508" height="200px" style="direction: ltr; position: absolute; left: 0px; top: 0px; width: 508px; height: 240px;">
                                                    </canvas>
                                                    <div class="flot-text" style="position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px; font-size: smaller; color: rgb(84, 84, 84);">
                                                        <div class="flot-x-axis flot-x1-axis xAxis x1Axis" style="position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px; display: block;">
                                                            <div class="flot-tick-label tickLabel" style="position: absolute; max-width: 46px; top: 225px; left: 35px; text-align: center;">10</div>
                                                            <div class="flot-tick-label tickLabel" style="position: absolute; max-width: 46px; top: 225px; left: 90px; text-align: center;">15</div>
                                                            <div class="flot-tick-label tickLabel" style="position: absolute; max-width: 46px; top: 225px; left: 145px; text-align: center;">20</div>
                                                            <div class="flot-tick-label tickLabel" style="position: absolute; max-width: 46px; top: 225px; left: 200px; text-align: center;">25</div>
                                                            <div class="flot-tick-label tickLabel" style="position: absolute; max-width: 46px; top: 225px; left: 256px; text-align: center;">30</div>
                                                            <div class="flot-tick-label tickLabel" style="position: absolute; max-width: 46px; top: 225px; left: 311px; text-align: center;">35</div>
                                                            <div class="flot-tick-label tickLabel" style="position: absolute; max-width: 46px; top: 225px; left: 366px; text-align: center;">40</div>
                                                            <div class="flot-tick-label tickLabel" style="position: absolute; max-width: 46px; top: 225px; left: 421px; text-align: center;">45</div><div class="flot-tick-label tickLabel" style="position: absolute; max-width: 46px; top: 225px; left: 476px; text-align: center;">50</div>
                                                        </div>
                                                        <div class="flot-y-axis flot-y1-axis yAxis y1Axis" style="position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px; display: block;">
                                                            <div class="flot-tick-label tickLabel" style="position: absolute; top: 213px; left: 12px; text-align: right;">0</div>
                                                            <div class="flot-tick-label tickLabel" style="position: absolute; top: 170px; left: 6px; text-align: right;">25</div>
                                                            <div class="flot-tick-label tickLabel" style="position: absolute; top: 128px; left: 6px; text-align: right;">50</div>
                                                            <div class="flot-tick-label tickLabel" style="position: absolute; top: 85px; left: 6px; text-align: right;">75</div>
                                                            <div class="flot-tick-label tickLabel" style="position: absolute; top: 43px; left: 0px; text-align: right;">100</div>
                                                            <div class="flot-tick-label tickLabel" style="position: absolute; top: 1px; left: 0px; text-align: right;">125</div>
                                                        </div>
                                                    </div>
                                                    <canvas class="flot-overlay" width="508" height="240" style="direction: ltr; position: absolute; left: 0px; top: 0px; width: 508px; height: 240px;">
                                                    </canvas>
                                                    <div class="legend">
                                                        <div style="position: absolute; width: 59px; height: 45px; right: 13px; background-color: rgb(255, 255, 255); opacity: 0.85;"> </div>
                                                        <table style="position:absolute;right:13px;;font-size:smaller;color:#545454">
                                                            <tbody>
                                                                <tr>
                                                                    <td class="legendColorBox">
                                                                        <div style="border:1px solid none;padding:1px">
                                                                            <div style="width:4px;height:0;border:5px solid #6783b7;overflow:hidden"></div>
                                                                        </div>
                                                                    </td>
                                                                    <td class="legendLabel">Product 1</td>
                                                                </tr>
                                                                <tr><td class="legendColorBox">
                                                                    <div style="border:1px solid none;padding:1px">
                                                                        <div style="width:4px;height:0;border:5px solid #4fcdb7;overflow:hidden">
                                                                        </div>
                                                                    </div>
                                                                </td>
                                                                <td class="legendLabel">Product 2</td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="legendColorBox">
                                                                        <div style="border:1px solid none;padding:1px">
                                                                            <div style="width:4px;height:0;border:5px solid #8dd168;overflow:hidden">
                                                                            </div>
                                                                        </div>
                                                                    </td>
                                                                    <td class="legendLabel">Product 3</td>
                                                                 </tr>
                                                                </tbody>
                                                            </table>
                                                        </div>
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
                                                    <div id="flot-pie" style="height: 240px; padding: 0px; position: relative;">
                                                        <canvas class="flot-base" width="508" height="240" style="direction: ltr; position: absolute; left: 0px; top: 0px; width: 508px; height: 240px;">
                                                        </canvas>
                                                            <canvas class="flot-overlay" width="508" height="240" style="direction: ltr; position: absolute; left: 0px; top: 0px; width: 508px; height: 240px;">
                                                            </canvas>
                                                            <span class="pieLabel" id="pieLabel0" style="position: absolute; top: 64px; left: 330px;">
                                                                <div style="font-size:x-small;text-align:center;padding:2px;color:rgb(153,199,206);">Series1<br>37%</div>
                                                            </span>
                                                            <span class="pieLabel" id="pieLabel1" style="position: absolute; top: 207px; left: 234px;">
                                                                <div style="font-size:x-small;text-align:center;padding:2px;color:rgb(153,153,153);">Series2<br>26%</div>
                                                            </span><span class="pieLabel" id="pieLabel2" style="position: absolute; top: 63px; left: 141px;">
                                                                <div style="font-size:x-small;text-align:center;padding:2px;color:rgb(187,187,187);">Series3<br>37%</div>
                                                            </span>
                                                    </div>
                                                </div>
                                            </section>
                            </div>
                        </section>

                        <aside class="bg-light lter b-l aside-md hide" id="notes">
                            <div class="wrapper">Notification</div>
                        </aside>
                    </section>
                </section>
            </section> <!-- Bootstrap -->
            <!-- App -->
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

            

            
</body>
</html>