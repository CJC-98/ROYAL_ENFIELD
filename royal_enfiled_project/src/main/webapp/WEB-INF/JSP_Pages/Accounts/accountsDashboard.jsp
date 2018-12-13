<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
<meta charset="utf-8" />
    <title>Account | Dashboard</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />

	<script type="text/javascript">
	     function display_c(){
			 var refresh=1000; // Refresh rate in milli seconds
			 mytime=setTimeout('display_ct()',refresh)
	     }
	                                    	
	     var m=0;
	
	     function display_ct() {
			  var x = new Date()
			  var s = x.getSeconds();	                            	
			  if(s===59){
			  m++;
			  }
			  document.getElementById('ct').innerHTML = s;
			  document.getElementById('ct1').innerHTML = m;
			  display_c();
	     }
     </script>
</head>

<body onload=display_ct();>
 	<section id="content">
                    <section class="vbox">
                        <section class="scrollable padder">
                            <ul class="breadcrumb no-border no-radius b-b b-light pull-in">
                                <li><a href="index.html"><i class="fa fa-home"></i> Home</a></li>
                                <li class="active">Account_Workset</li>
                            </ul>
                            <div class="m-b-md">
                                <h3 class="m-b-none">Workset</h3> <small>Welcome back, Account_Manager</small>
                            </div>
                            <section class="panel panel-default">
                                <div class="row m-l-none m-r-none bg-light lter">
                                    <div class="col-sm-6 col-md-3 padder-v b-r b-light"> 
                                    	<span class="fa-stack fa-2x pull-left m-r-sm">
                                            <i class="fa fa-circle fa-stack-2x text-info"></i> <i class="fa fa-male fa-stack-1x text-white"></i>
                                        </span> <a class="clear" href="#"> 
                                        <span class="h3 block m-t-xs"><strong>52,000</strong></span>
                                        <small class="text-muted text-uc">New robots</small> </a>
                                         
                                   </div>
                                    <div class="col-sm-6 col-md-3 padder-v b-r b-light lt"> 
                                    	<span class="fa-stack fa-2x pull-left m-r-sm">
                                            <i class="fa fa-circle fa-stack-2x text-warning"></i> <i class="fa fa-bug fa-stack-1x text-white"></i>
                                            <span class="easypiechart pos-abt" data-percent="100" data-line-width="4"
                                                data-track-Color="#fff" data-scale-Color="false" data-size="50"
                                                data-line-cap='butt' data-animate="2000" data-target="#bugs"
                                                data-update="3000">
                                            </span> 
                                        </span> 
                                        <a class="clear" href="#"> 
	                                        <span class="h3 block m-t-xs"><strong id="bugs">468</strong></span> 
	                                        <small class="text-muted text-uc">Bugs intruded</small> 
                                        </a> 
                                    </div>
                                    <div class="col-sm-6 col-md-3 padder-v b-r b-light"> 
                                    	<span class="fa-stack fa-2x pull-left m-r-sm">
                                            <i class="fa fa-circle fa-stack-2x text-danger"></i> 
                                            <i class="fa fa-fire-extinguisher fa-stack-1x text-white"></i>
                                            <span class="easypiechart pos-abt" data-percent="100" data-line-width="4"
                                                data-track-Color="#f5f5f5" data-scale-Color="false" data-size="50"
                                                data-line-cap='butt' data-animate="3000" data-target="#firers"
                                                data-update="5000">
                                            </span> 
                                        </span> 
                                        <a class="clear" href="#"> 
	                                        <span class="h3 block m-t-xs"><strong id="firers">359</strong></span> 
	                                        <small class="text-muted text-uc">Extinguishers ready</small> 
                                        </a> 
                                    </div>
                                    
                                    
                                    
                                    
                                    
                                    
                                    <div class="col-sm-6 col-md-3 padder-v b-r b-light lt"> 
                                    	<span class="fa-stack fa-2x pull-left m-r-sm">
                                            <i class="fa fa-circle fa-stack-2x icon-muted"></i> <i class="fa fa-clock-o fa-stack-1x text-white"></i>
                                        </span> 
                                        <a class="clear" href="#"> 
                                        	<span class="h3 block m-t-xs"><strong><b id="ct1"></b>:<b id="ct"></b> &nbsp&nbsp </strong></span>
                                            <small class="text-muted text-uc">your login time..</small>                                          
                                        </a> 
                                    </div>
                                </div>
                            </section>      
                            
                            
                            <c:set var="lg" value="${lg}" />
                            <c:set var="lg1" value="${lg1}" />
                            <c:set var="per" value="${100}" />
                            <c:set var="Avg" value="${(lg1/lg)*per}" />
                            
                            <div class="row">
                                <div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading"> Sold Bike </header>
                                        <div class="panel-body text-center">
                                            <h4>${Avg} % <small>Bikes are Sold..</small></h4> <small class="text-muted block">
                                                 </small>
                                            <div class="inline">
                                                <div class="easypiechart" data-percent=${Avg} data-line-width="16"
	                                                 data-rotate="0" 
	                                                 data-scale-Color="false" data-animate="2000"
                                                     data-loop="false" data-size="188"> <span class="h2 step"></span>%
                                                    <div class="easypie-text">New</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel-footer"><small>% of avarage rate of the Conversion</small></div>
                                    </section>
                                </div>
                                <div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading"> Bounce rate </header>
                                        <div class="panel-body text-center">
                                            <h4><small>last </small>12<small> hrs</small></h4> <small class="text-muted block">   </small>
                                            <div class="inline">
                                                <div class="easypiechart" data-percent="25" data-line-width="6"
                                                	data-animate="2000"
                                                    data-loop="false" data-size="188"> <span class="h2 step">25</span>%
                                                    <div class="easypie-text">Today</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel-footer"><small>% of change</small></div>
                                    </section>
                                </div>
                                <div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading"> New visitors </header>
                                        <div class="panel-body text-center">
                                            <h4>3,450</h4> <small class="text-muted block">     </small>
                                            <div class="inline">
                                                <div class="easypiechart" data-percent="60" data-line-width="30"
                                                	data-animate="2000"
                                                    data-track-color="#eee" data-bar-color="#afcf6f" data-scale-color="#fff"
                                                    data-size="188" data-line-cap='butt'> <span class="h2 step">60</span>%
                                                    <div class="easypie-text">new visits</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel-footer"><small>% of avarage rate of the visits</small></div>
                                    </section>
                                </div>
                            </div>
                            
                            
                            
                            
                            
                            
                            
                            <div class="row">
                                <div class="col-md-8">
                                    <section class="panel panel-default">
                                        <header class="panel-heading font-bold">Statistics</header>
                                        <div class="panel-body">
                                            <div id="flot-1ine" style="height:210px"></div>
                                        </div>
                                        <footer class="panel-footer bg-white no-padder">
                                            <div class="row text-center no-gutter">
                                                <div class="col-xs-3 b-r b-light"> <span class="h4 font-bold m-t block">5,860</span>
                                                    <small class="text-muted m-b block">Orders</small> </div>
                                                <div class="col-xs-3 b-r b-light"> <span class="h4 font-bold m-t block">10,450</span>
                                                    <small class="text-muted m-b block">Sellings</small> </div>
                                                <div class="col-xs-3 b-r b-light"> <span class="h4 font-bold m-t block">21,230</span>
                                                    <small class="text-muted m-b block">Items</small> </div>
                                                <div class="col-xs-3"> <span class="h4 font-bold m-t block">7,230</span>
                                                    <small class="text-muted m-b block">Customers</small> </div>
                                            </div>
                                        </footer>
                                    </section>
                                </div>
                                <div class="col-md-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading font-bold">Data graph</header>
                                        <div class="bg-light dk wrapper"> <span class="pull-right">Friday</span> <span
                                                class="h4">$540<br> <small class="text-muted">+1.05(2.15%)</small>
                                            </span>
                                            <div class="text-center m-b-n m-t-sm">
                                                <div class="sparkline" data-type="line" data-height="65" data-width="100%"
                                                    data-line-width="2" data-line-color="#dddddd" data-spot-color="#bbbbbb"
                                                    data-fill-color="" data-highlight-line-color="#fff"
                                                    data-spot-radius="3" data-resize="true" values="280,320,220,385,450,320,345,250,250,250,400,380"></div>
                                                <div class="sparkline inline" data-type="bar" data-height="45"
                                                    data-bar-width="6" data-bar-spacing="6" data-bar-color="#65bd77">11,9,11,10,11,10,12,10,9,10,11,9,8</div>
                                            </div>
                                        </div>
                                        <div class="panel-body">
                                            <div> <span class="text-muted">Total:</span> <span class="h3 block">$2500.00</span>
                                            </div>
                                            <div class="line pull-in"></div>
                                            <div class="row m-t-sm">
                                                <div class="col-xs-4"> <small class="text-muted block">Market</small>
                                                    <span>$1500.00</span> </div>
                                                <div class="col-xs-4"> <small class="text-muted block">Referal</small>
                                                    <span>$600.00</span> </div>
                                                <div class="col-xs-4"> <small class="text-muted block">Affiliate</small>
                                                    <span>$400.00</span> </div>
                                            </div>
                                        </div>
                                    </section>
                                </div>
                            </div>
                            
                        </section>
                    </section> <a href="#" class="hide nav-off-screen-block" data-toggle="class:nav-off-screen, open"
                        data-target="#nav,html"></a>
                </section>
</body>


</html>