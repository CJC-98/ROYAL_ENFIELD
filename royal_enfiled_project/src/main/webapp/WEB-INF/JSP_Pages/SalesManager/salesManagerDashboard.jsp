<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
    <title>SalesManager Dashboard</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />
</head>

<body>
 	<section id="content">
                    <section class="vbox">
                        <section class="scrollable padder">
                            <ul class="breadcrumb no-border no-radius b-b b-light pull-in">
                                <li><a href="index.html"><i class="fa fa-home"></i> Home</a></li>
                                <li class="active">Workset</li>
                            </ul>
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
                                                    <p class="text-center"> <em class="h4 text-mute"><img src="${pageContext.request.contextPath}/Resources/images/bike7.jpg" class="m-r-sm" width="750" height="500"></em><br>
                                                        <small class="text-muted"><h3>Continental GT</h3></small> </p>
                                                </div>
                                                 <div class="item">
                                                    <p class="text-center"> <em class="h4 text-mute"><img src="${pageContext.request.contextPath}/Resources/images/bike1.jpg" class="m-r-sm" width="750" height="500"></em><br> <small class="text-muted"><h3>Classic</h3></small>
                                                    </p>
                                                </div>
                                                <div class="item active">
                                                    <p class="text-center"> <em class="h4 text-mute"><img src="${pageContext.request.contextPath}/Resources/images/bike2.jpg" class="m-r-sm" width="750" height="500"></em><br> <small class="text-muted"><h3>Himalayan</h3></small>
                                                    </p>
                                                </div>
                                                <div class="item">
                                                    <p class="text-center"> <em class="h4 text-mute"><img src="${pageContext.request.contextPath}/Resources/images/bike4.jpg" class="m-r-sm" width="750" height="500"></em><br> <small class="text-muted"><h3>Thunderbird</h3></small>
                                                    </p>
                                                </div>
                                                <div class="item">
                                                    <p class="text-center"> <em class="h4 text-mute"><img src="${pageContext.request.contextPath}/Resources/images/bike6.jpg" class="m-r-sm" width="750" height="500"></em><br> <small class="text-muted"><h3>Interceptor</h3></small>
                                                    </p>
                                                </div>
                                            </div> <a class="left carousel-control" href="#c-fade" data-slide="prev">
                                                <i class="fa fa-angle-left"></i> </a> <a class="right carousel-control"
                                                href="#c-fade" data-slide="next"> <i class="fa fa-angle-right"></i> </a>
                                        </div>
                                    </section>
                 </section>
                    </section> <a href="#" class="hide nav-off-screen-block" data-toggle="class:nav-off-screen, open"
                        data-target="#nav,html"></a>
                </section>
                  <script src="${pageContext.request.contextPath}/js/app.v1.js"></script>
    <script src="${pageContext.request.contextPath}/js/charts/easypiechart/jquery.easy-pie-chart.js"></script>
    <script src="${pageContext.request.contextPath}/js/charts/sparkline/jquery.sparkline.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/charts/flot/jquery.flot.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/charts/flot/jquery.flot.tooltip.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/charts/flot/jquery.flot.resize.js"></script>
    <script src="${pageContext.request.contextPath}/js/charts/flot/jquery.flot.grow.js"></script>
    <script src="${pageContext.request.contextPath}/js/charts/flot/demo.js"></script>
    <script src="${pageContext.request.contextPath}/js/calendar/bootstrap_calendar.js"></script>
    <script src="${pageContext.request.contextPath}/js/calendar/demo.js"></script>
    <script src="${pageContext.request.contextPath}/js/sortable/jquery.sortable.js"></script>
    <script src="${pageContext.request.contextPath}/js/app.plugin.js"></script>
</body>
</html>