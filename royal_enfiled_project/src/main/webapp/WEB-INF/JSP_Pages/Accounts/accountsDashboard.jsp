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
	
</head>

<body>
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
                            
                           <div class="row">                        
	                            
	                            	
                            </div> <br>
                            
                            <c:set var="lg" value="${lg}" />
                            <c:set var="lg1" value="${lg1}" />
                            <c:set var="per" value="${100}" />
                            <c:set var="Avg" value="${(lg1/lg)*per}" />
                            
                            <div class="row">
                                <div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading bg-danger lt no-border"> New Bikes </header>
                                        <div class="panel-body text-center">
                                            <h4><small>New Bike</small></h4> 
                                            <small class="text-muted block">     </small>
                                            <div class="inline">
                                                <div class="easypiechart text-danger" data-percent=${lg} data-line-width="16"
	                                                 data-rotate="0"  data-bar-color="#4cc0c1"
	                                                 data-scale-Color="false" data-animate="2000"
                                                     data-loop="false" data-size="188"> <span class="h2 step"></span>
                                                    <div class="easypie-text">New</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel-footer bg-danger lt no-border"><small>Count Of New Bikes..</small></div>
                                    </section>
                                </div>
                                <div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading bg-danger lt no-border"> New Solded Bikes</header>
                                        <div class="panel-body text-center">
                                            <h4><small>Solded Bikes</small></h4> 
                                            <small class="text-muted block">  </small>
                                            <div class="inline">
                                                <div class="easypiechart text-danger"  data-percent="${lg1}" data-line-width="6"
                                                	data-animate="2000"  data-bar-color="#4cc0c1"
                                                    data-loop="false" data-size="188"> <span class="h2 step">25</span>
                                                    <div class="easypie-text">Today</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel-footer bg-danger lt no-border"><small>Count Of Solded New Bikes..</small></div>
                                    </section>
                                </div>
                                <div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading bg-danger lt no-border"> Average of Sold New Bikes </header>
                                        <div class="panel-body text-center">
                                            <h4><small>Average</small></h4> 
                                            <small class="text-muted block">    </small>
                                            <div class="inline">
                                                <div class="easypiechart text-danger" data-percent="${Avg}" data-line-width="16"
                                                	data-animate="2000" 
                                                    data-scale-color="false"
                                                    data-size="188" data-line-cap='butt'> <span class="h2 step">60</span>%
                                                    <div class="easypie-text">new visits</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel-footer bg-danger lt no-border"><small>% of Sold Bikes..</small></div>
                                    </section>
                                </div>
                            </div>
                            
                            
                            
                           <div class="row">
                                <div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading bg-info lt no-border"> Old Bikes </header>
                                        <div class="panel-body text-center">
                                            <h4><small>Old Bike</small></h4> 
                                            <small class="text-muted block">   </small>
                                            <div class="inline">
                                                <div class="easypiechart text-info" data-percent=${lg} data-line-width="16"
	                                                 data-rotate="0" 
	                                                 data-scale-Color="false" data-animate="2000"
                                                     data-loop="false" data-size="188"> <span class="h2 step"></span>
                                                    <div class="easypie-text">New</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel-footer bg-info lt no-border" bg-info lt no-border><small>Count Of Old Bikes..</small></div>
                                    </section>
                                </div>
                                <div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading bg-info lt no-border"> Old Solded Bikes</header>
                                        <div class="panel-body text-center">
                                            <h4><small>Solded Bikes</small></h4> 
                                            <small class="text-muted block">   </small>
                                            <div class="inline">
                                                <div class="easypiechart text-info" data-percent="${lg1}" data-line-width="6"
                                                	data-animate="2000"
                                                    data-loop="false" data-size="188"> <span class="h2 step">25</span>
                                                    <div class="easypie-text">Today</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel-footer bg-info lt no-border"><small>Count Of Solded Old Bikes..</small></div>
                                    </section>
                                </div>
                                <div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading bg-info lt no-border"> Average of Sold Old Bikes </header>
                                        <div class="panel-body text-center">
                                            <h4><small>Average</small></h4> 
                                            <small class="text-muted block">     </small>
                                            <div class="inline">
                                                <div class="easypiechart text-info" data-percent="${Avg}" data-line-width="16"
                                                	data-animate="2000"
                                                    data-scale-color="false"
                                                    data-size="188" data-line-cap='butt'> <span class="h2 step">60</span>%
                                                    <div class="easypie-text">new visits</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel-footer bg-info lt no-border"><small>% of Sold Old Bikes..</small></div>
                                    </section>
                                </div>
                            </div>
                             
                            
                            
                            
                 
                            <div class="row">
                                
                               
                            </div>
                            
                        </section>
                    </section> <a href="#" class="hide nav-off-screen-block" data-toggle="class:nav-off-screen, open"
                        data-target="#nav,html"></a>
                </section>
                
                
               
</body>


	
</html>