<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
    <title>Notebook | Web Application</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />
</head>

<body>
 	 <section id="content">

                    <section class="vbox container-fluid ">
                    <section class="scrollable padder">
                        <div class="m-b-md">
	                    <h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">Dashboard</h3>
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
                 </section>
         </section>
 </body>
                       
</html>