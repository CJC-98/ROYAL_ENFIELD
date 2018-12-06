<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" class="app">
<!-- Mirrored from flatfull.com/themes/note/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:16:42 GMT -->

<head>
    <meta charset="utf-8" />
    <title>Notebook | Web Application</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/bike.css" type="text/css" />
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body class="">
    <section class="vbox">
        <header class="bg-dark dk header navbar navbar-fixed-top-xs">
            <div class="navbar-header aside-md"> <a class="btn btn-link visible-xs" data-toggle="class:nav-off-screen,open"
                    data-target="#nav,html"> <i class="fa fa-bars"></i> </a> <a href="#" class="navbar-brand"
                    data-toggle="fullscreen"><img src="images/logo.png" class="m-r-sm">Royal Enfield</a> <a class="btn btn-link visible-xs"
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
                <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <span class="thumb-sm avatar pull-left">
                            <img src="images/avatar.jpg"> </span> John.Smith <b class="caret"></b> </a>
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
                                        <li class="active"> <a href="index.html" class="active"> <i class="fa fa-plus">
                                                    <b class="bg-danger"></b> </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
                                                    <i class="fa fa-angle-up text-active"></i> </span> <span>ADD NEW</span>
                                            </a>
                                            <ul class="nav lt">
                                                <li class="active"> <a href="AddNewBike.jsp" class="active"> <i
                                                            class="fa fa-angle-right"></i>
                                                        <span>BIKE</span> </a> </li>
                                                <li class="active"> <a href="index.html" class="active"> <i class="fa fa-angle-right"></i>
                                                        <span>OFFER</span> </a> </li>


                                                <li class="active"> <a href="AddAccessorieForm.html"> <i class="fa fa-angle-right"></i>
                                                        <span>ACCESSORIES</span> </a> </li>
                                                <li>
                                                    <a href="#layout"> <i class="fa fa-eye"> <b class="bg-warning"></b>
                                                        </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
                                                            <i class="fa fa-angle-up text-active"></i> </span><span>DEADSTOCK</span>
                                                    </a>
                                                    <ul class="nav lt">
                                                        <li> <a href="index.html"> <i class="fa fa-angle-right"></i>
                                                                <span>Accessories</span> </a> </li>
                                                        <li> <a href="index.html"> <i class="fa fa-angle-right"></i>
                                                                <span> Bike</span> </a> </li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>
                                        <li> <a href="#layout"> <i class="fa fa-eye"> <b class="bg-warning"></b>
                                                </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i> <i
                                                        class="fa fa-angle-up text-active"></i> </span><span>VIEW</span>
                                            </a>
                                            <ul class="nav lt">
                                                <li><a href="#layout"> <i class="fa fa-motorcycle"> <b class="bg-warning"></b>
                                                        </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
                                                            <i class="fa fa-angle-up text-active"></i> </span><span>View
                                                            Bike</span></a>
                                                    <ul class="nav lt">
                                                        <li> <a href="layout-c.html"> <i class="fa fa-angle-right"></i>
                                                                <span>Old Bike</span> </a> </li>
                                                        <li> <a href="layout-c.html"> <i class="fa fa-angle-right"></i>
                                                                <span>New Bike</span> </a> </li>
                                                    </ul>

                                                </li>
                                                <li> <a href="layout-c.html"> <i class="fa fa-angle-right"></i> <span>View
                                                            Accessories</span> </a> </li>

                                                <li> <a href="layout-c.html"> <i class="fa fa-money"></i> <span>View
                                                            Invoice</span> </a> </li>
                                                <li> <a href="layout-c.html"> <i class="fa fa-angle-right"></i> <span>View
                                                            Offer</span> </a> </li>
                                                <li> <a href="#layout"> <i class="fa fa-columns icon"> <b class="bg-warning"></b>
                                                        </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
                                                            <i class="fa fa-angle-up text-active"></i> </span><span>View
                                                            Sold</span></a>
                                                    <ul class="nav lt">
                                                        <li> <a href="layout-c.html"> <i class="fa fa-angle-right"></i>
                                                                <span>Accessories</span> </a> </li>
                                                        <li> <a href="layout-c.html"> <i class="fa fa-angle-right"></i>
                                                                <span>Old Bike</span> </a> </li>
                                                        <li> <a href="layout-c.html"> <i class="fa fa-angle-right"></i>
                                                                <span>New Bike</span> </a> </li>
                                                    </ul>
                                                </li>
                                                <li>
                                                    <a href="#layout"> <i class="fa fa-columns icon"> <b class="bg-warning"></b>
                                                        </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
                                                            <i class="fa fa-angle-up text-active"></i> </span><span>View
                                                            DeadStock</span></a>
                                                    <ul class="nav lt">
                                                        <li> <a href="layout-c.html"> <i class="fa fa-angle-right"></i>

                                                                <span>Accessories</span> </a> </li>
                                                        <li> <a href="layout-c.html"> <i class="fa fa-angle-right"></i>
                                                                <span> Bike</span> </a> </li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>
                                        <li> <a href="order"> <i class="fa fa-flask icon"> <b class="bg-success"></b>
                                                </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i> <i
                                                        class="fa fa-angle-up text-active"></i> </span> <span>order</span>
                                            </a>
                                            <ul class="nav lt">

                                                <li> <a href="components.html"> <i class="fa fa-angle-right"></i> <span>Components</span>
                                                    </a> </li>
                                                <li> <a href="list.html"> <i class="fa fa-angle-right"></i> <span>List
                                                            group</span> </a> </li>
                                                <li> <a href="#table"> <i class="fa fa-angle-down text"></i> <i class="fa fa-angle-up text-active"></i>
                                                        <span>Table</span> </a>
                                                    <ul class="nav bg">
                                                        <li> <a href="table-static.html"> <i class="fa fa-angle-right"></i>
                                                                <span>Table static</span> </a> </li>
                                                        <li> <a href="table-datatable.html"> <i class="fa fa-angle-right"></i>
                                                                <span>Datatable</span> </a> </li>
                                                        <li> <a href="table-datagrid.html"> <i class="fa fa-angle-right"></i>
                                                                <span>Datagrid</span> </a> </li>
                                                    </ul>
                                                </li>
                                                <li> <a href="#form"> <i class="fa fa-angle-down text"></i> <i class="fa fa-angle-up text-active"></i>
                                                        <span>Form</span> </a>
                                                    <ul class="nav bg">
                                                        <li> <a href="form-elements.html"> <i class="fa fa-angle-right"></i>
                                                                <span>Form elements</span> </a> </li>
                                                        <li> <a href="form-validation.html"> <i class="fa fa-angle-right"></i>
                                                                <span>Form validation</span> </a> </li>
                                                        <li> <a href="form-wizard.html"> <i class="fa fa-angle-right"></i>
                                                                <span>Form wizard</span> </a> </li>
                                                    </ul>

                                            </ul>
                                        </li>



                                    </ul>
                                </nav> <!-- / nav -->
                            </div>
                        </section>
                        <footer class="footer lt hidden-xs b-t b-dark">
                            <div id="chat" class="dropup">
                                <section class="dropdown-menu on aside-md m-l-n">
                                    <section class="panel bg-white">
                                        <header class="panel-heading b-b b-light">Active chats</header>
                                        <div class="panel-body animated fadeInRight">
                                            <p class="text-sm">No active chats.</p>
                                            <p><a href="#" class="btn btn-sm btn-default">Start a chat</a></p>
                                        </div>
                                    </section>
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
                    <section class="vbox">
                        <section class="scrollable padder">
                            <ul class="breadcrumb no-border no-radius b-b b-light pull-in">
                                <li><a href="index.html"><i class="fa fa-home"></i> Home</a></li>

                            </ul>

                            <section class="panel panel-default">
                                <div class="row m-l-none m-r-none bg-light lter">
                                    <div class="col-sm-6 col-md-3 padder-v b-r b-light"> <span class="fa-stack fa-2x pull-left m-r-sm">
                                            <i class="fa fa-circle fa-stack-2x text-info"></i> <i class="fa fa-male fa-stack-1x text-white"></i>
                                        </span> <a class="clear" href="#"> <span class="h3 block m-t-xs"><strong>50000</strong></span>
                                            <small class="text-muted text-uc">Sale</small> </a> </div>
                                    <div class="col-sm-6 col-md-3 padder-v b-r b-light lt"> <span class="fa-stack fa-2x pull-left m-r-sm">
                                            <i class="fa fa-circle fa-stack-2x text-warning"></i> <i class="fa fa-bug fa-stack-1x text-white"></i>
                                            <span class="easypiechart pos-abt" data-percent="100" data-line-width="4"
                                                data-track-Color="#fff" data-scale-Color="false" data-size="50"
                                                data-line-cap='butt' data-animate="2000" data-target="#bugs"
                                                data-update="3000"></span> </span> <a class="clear" href="#"> <span
                                                class="h3 block m-t-xs"><strong id="bugs">468</strong></span> <small
                                                class="text-muted text-uc">Bugs intruded</small> </a> </div>
                                    <div class="col-sm-6 col-md-3 padder-v b-r b-light"> <span class="fa-stack fa-2x pull-left m-r-sm">
                                            <i class="fa fa-circle fa-stack-2x text-danger"></i> <i class="fa fa-fire-extinguisher fa-stack-1x text-white"></i>
                                            <span class="easypiechart pos-abt" data-percent="100" data-line-width="4"
                                                data-track-Color="#f5f5f5" data-scale-Color="false" data-size="50"
                                                data-line-cap='butt' data-animate="3000" data-target="#firers"
                                                data-update="5000"></span> </span> <a class="clear" href="#"> <span
                                                class="h3 block m-t-xs"><strong id="firers">359</strong></span> <small
                                                class="text-muted text-uc">Extinguishers ready</small> </a> </div>
                                    <div class="col-sm-6 col-md-3 padder-v b-r b-light lt"> <span class="fa-stack fa-2x pull-left m-r-sm">
                                            <i class="fa fa-circle fa-stack-2x icon-muted"></i> <i class="fa fa-clock-o fa-stack-1x text-white"></i>
                                        </span> <a class="clear" href="#"> <span class="h3 block m-t-xs"><strong>31:50</strong></span>
                                            <small class="text-muted text-uc">Left to exit</small> </a> </div>
                                </div>
                            </section>
                            
                                
                                   



                                              
                                                    <div class="image" style="width:; height: auto;">
                                                        <img src="${pageContext.request.contextPath}/Resources/images/bike1.jpg">
                                                        <h2><span>Selling Bikes:<span class='spacer'></span><br /><span class='spacer'></span>Since 2001</span></h2>
                                                           <p class="sp-layer sp-white sp-padding sub-txt1 for-480-sub-txt" data-horizontal="15%" data-vertical="210" data-show-transition="left" data-show-delay="800" data-hide-transition="left" data-hide-delay="100">
        India's First Bike Portal
      </p>  
                                                        </div>

   <!-- --image below -->




                                                    <!-- <div class="sp-layer sp-black sp-padding head-title1"
                                                        data-horizontal="100%" data-vertical="100%" data-hide-delay="100"
                                                        data-show-delay="400" data-show-transition="right"
                                                        data-hide-transition="right" data-layer-init="true" style="visibility: visible; left: 15%; top: 50px; transform-origin: left top 0px; transform: scale(1) translate3d(0px, 0px, 0px); opacity: 1;">
                                                        Selling Bikes<br>Since 2007
                                                    </div>
                                                    <p class="sp-layer sp-white sp-padding sub-txt1 for-480-sub-txt"
                                                        data-horizontal="15%" data-vertical="210" data-show-transition="left"
                                                        data-show-delay="800" data-hide-transition="left"
                                                        data-hide-delay="100" data-layer-init="true" style="visibility: visible; left: 15%; top: 210px; transform-origin: left top 0px; transform: scale(1) translate3d(0px, 0px, 0px); opacity: 1;">
                                                        India's First Bike Portal
                                                    </p>
                                                    <p style="width: auto; visibility: visible; left: 15%; top: 260px; transform-origin: left top 0px; transform: scale(1) translate3d(0px, 0px, 0px); opacity: 1;"
                                                        href="" class="sp-layer sp-white sp-padding sub-btn1"
                                                        data-horizontal="15%" data-vertical="260" data-show-transition="up"
                                                        data-show-delay="1000" data-hide-transition="down"
                                                        data-hide-delay="100" data-layer-init="true">
                                                        <a href="/sell.php">Sell Your Bike</a>
                                                        <a href="/used/buy/">Buy Used Bike</a>
                                                        <a href="/new/">Buy New Bike</a>
                                                    </p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
 -->
                            </section>
                            <!-- <section>
                                <div>
                                    <div>
                                        <div class="title-box">Sell Used Bike</div>
                                    </div>
                                    <div class="search-out-box">
                                        <div class="budget">
                                            <select id="usedbudgetD">
                                                <option value="">Budget</option>
                                                <option value="1000-20000">Rs.1000 - Rs.20,000</option>
                                                <option value="20000-40000">Rs.20,000 - Rs.40,000</option>
                                                <option value="40000-60000">Rs.40,000 - Rs.60,000</option>
                                                <option value="60000-80000">Rs.60,000 - Rs.80,000</option>
                                                <option value="80000-100000">Rs.80,000 - Rs.1 Lakh</option>
                                                <option value="100000-200000">Rs.1 Lakh - Rs.2 Lakh</option>
                                                <option value="200000-9999999">Above Rs. 2 Lakh</option>
                                            </select>
                                        </div>
                                        <div class="state"><select id="usedstateD">
                                                <option value="">Select State</option>
                                                <option value="Andhra Pradesh">Andhra Pradesh</option>
                                                <option value="Andaman Nicobar">Andaman Nicobar</option>
                                                <option value="Arunachal Pradesh">Arunachal Pradesh</option>
                                                <option value="Assam">Assam</option>
                                                <option value="Bihar">Bihar</option>
                                                <option value="Chandigarh">Chandigarh</option>
                                                <option value="Chhattisgarh">Chhattisgarh</option>
                                                <option value="Dadra Nagar Haveli">Dadra Nagar Haveli</option>
                                                <option value="Daman n Diu">Daman n Diu</option>
                                                <option value="Delhi">Delhi</option>
                                                <option value="Goa">Goa</option>
                                                <option value="Gujarat">Gujarat</option>
                                                <option value="Haryana">Haryana</option>
                                                <option value="Himachal Pradesh">Himachal Pradesh</option>
                                                <option value="Jammu Kashmir">Jammu Kashmir</option>
                                                <option value="Jharkhand">Jharkhand</option>
                                                <option value="Karnataka">Karnataka</option>
                                                <option value="Kerala">Kerala</option>
                                                <option value="Lakshadweep">Lakshadweep</option>
                                                <option value="Madhya Pradesh">Madhya Pradesh</option>
                                                <option value="Maharashtra">Maharashtra</option>
                                                <option value="Manipur">Manipur</option>
                                                <option value="Meghalaya">Meghalaya</option>
                                                <option value="Mizoram">Mizoram</option>
                                                <option value="Nagaland">Nagaland</option>
                                                <option value="Orissa">Orissa</option>
                                                <option value="Pondicherry">Pondicherry</option>
                                                <option value="Punjab">Punjab</option>
                                                <option value="Rajasthan">Rajasthan</option>
                                                <option value="Sikkim">Sikkim</option>
                                                <option value="Tamil Nadu">Tamil Nadu</option>
                                                <option value="Telangana">Telangana</option>
                                                <option value="Tripura">Tripura</option>
                                                <option value="Uttar Pradesh">Uttar Pradesh</option>
                                                <option value="Utarakhand">Utarakhand</option>
                                                <option value="West Bengal">West Bengal</option>
                                            </select></div>
                                        <div class="go"><a onclick="usedadvSearch('#usedstateD','#usedbudgetD');">Go</a></div>
                                    </div>
                                </div>

                            </section>
 -->



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
                           <!--  <script type="text/javascript" src="/scripts/assets/slider-pro/jquery.sliderPro.min.js"></script>
                            <script type="text/javascript" src="/scripts/assets/owl-carousel/2.2.1/owl.carousel.min.js"></script>
                            <script type="text/javascript" src="/scripts/buy-new-v1.2.js"></script>
                            <script type="text/javascript" src="/scripts/price-widget-v1.3.js"></script>
                            <script type="text/javascript" src="/scripts/home-footer-v1.3.js"></script>
                            <script type="text/javascript" src="/scripts/compare/compare-v1-5bf285ac87cd4.js"></script>
                            <script type="text/javascript" src="/scripts/com-foot-v1.2.js"></script> -->
</body>
<!-- Mirrored from flatfull.com/themes/note/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:16:42 GMT -->

</html>