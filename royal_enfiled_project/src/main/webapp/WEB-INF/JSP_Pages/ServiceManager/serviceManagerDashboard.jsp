 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
    <title>Notebook | Web Application</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/css/app.v1.css" type="text/css" />
</head>

<body>
	<section id="content" class="bg-light lter">
	        <section class="vbox">
	            <section class="scrollable padder">                                               
	                                
	                <div class="m-b-md">
	                    <h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">Dashboard</h3>
	                </div>
	                
	               
	               <div class="hbox b-a bg-light" style="border-radius: 3px">
	               		
	               		<h3 class="m-l-xs" style="text-align: center">Services Graph</h3>
	               		
	               		<a  href="ApprovedServicesPage">
	               		<div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading bg-danger lt" style="font-size: 15px">Approved Services</header>
                                        <div class="panel-body text-center">
                                            <h4>${approvedServiceCount} </h4>
                                            <div class="inline">
                                                <div class="easypiechart text-danger" data-percent="${approvedServiceCount *100/totalServiceCount }"
                                                    data-line-width="5" data-track-Color="#f0f0f0" data-bar-color="#FF5F4A"
                                                    data-rotate="0" data-scale-Color="false" data-size="150"
                                                    data-animate="2000"> <span class="h2 step font-bold"></span>%
                                                    <div class="easypie-text text-muted">Waiting</div>
                                                </div>      
                                            </div>
                                        </div>

                                        <div class="panel-footer bg-danger lt" style="font-size: 15px">Total Services ${totalServiceCount}</div>

                                    </section>    
                             </div>
                    		</a>
							
						   <a  href="ServicesInprogressPage">	
                           <div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading bg-warning lt" style="font-size: 15px">In-Progress Services</header>
                                        <div class="panel-body text-center">
                                            <h4>${inProgerssServices}</h4>
                                            <div class="inline">
                                                <div class="easypiechart text-warning" data-percent="${inProgerssServices *100/totalServiceCount }"
                                                    data-line-width="5" data-track-Color="#f0f0f0" data-bar-color="#FFD300"
                                                    data-rotate="0" data-scale-Color="false" data-size="150"
                                                    data-animate="2000"> <span class="h2 step font-bold">72</span>%
                                                    <div class="easypie-text text-muted">In-progress</div>
                                                </div>      
                                            </div>
                                        </div>

                                        <div class="panel-footer bg-warning lt" style="font-size: 15px">Total Services ${totalServiceCount}</div>

                                    </section>    
                            </div>
                            </a>
                               
                            <a href="BikeServicesRecordsPage">
                            <div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading bg-success lt" style="font-size: 15px">Completed Services</header>
                                        <div class="panel-body text-center">
                                            <h4>${completedservices}</h4>
                                            <div class="inline">
                                                <div class="easypiechart text-success" data-percent="${completedservices *100/totalServiceCount }"
                                                    data-line-width="5" data-track-Color="#f0f0f0" data-bar-color="#8ec165"
                                                    data-rotate="0" data-scale-Color="false" data-size="150"
                                                    data-animate="2000"> <span class="h2 step font-bold">22.66</span>%
                                                    <div class="easypie-text text-muted">Done</div>
                                                </div>      
                                            </div>
                                        </div>

                                        <div class="panel-footer bg-success lt" style="font-size: 15px">Total Services ${totalServiceCount}</div>

                                    </section>    
                           </div>
						   </a>
                            
	               		
	               </div>
	               
	               
	               <div class="hbox b-a bg-light" style="margin-top: 20px; margin-bottom: 20px; border-radius: 3px">
	               
	               		<h3 class="m-l-xs" style="text-align: center">Customization  Graph</h3>
	               		
	               		<a href="ApprovedCustomizationPage">
	               			<div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading bg-danger lt" style="font-size: 15px">Approved Customization</header>
                                        <div class="panel-body text-center">
                                            <h4>8</h4>
                                            <div class="inline">
                                                <div class="easypiechart text-danger" data-percent="5.33"
                                                    data-line-width="5" data-track-Color="#f0f0f0" data-bar-color="#FF5F4A"
                                                    data-rotate="0" data-scale-Color="false" data-size="150"
                                                    data-animate="2000"> <span class="h2 step font-bold">5.3</span>%
                                                    <div class="easypie-text text-muted">Waiting</div>
                                                </div>      
                                            </div>
                                        </div>

                                        <div class="panel-footer bg-danger lt" style="font-size: 15px">Total Customization 20</div>

                                    </section>    
                                </div>
							</a>
							
							<a href="CustomizationInprogressPage">
                                <div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading bg-warning lt" style="font-size: 15px">In-Progress Customization</header>
                                        <div class="panel-body text-center">
                                            <h4>14</h4>
                                            <div class="inline">
                                                <div class="easypiechart text-warning" data-percent="70"
                                                    data-line-width="5" data-track-Color="#f0f0f0" data-bar-color="#FFD300"
                                                    data-rotate="0" data-scale-Color="false" data-size="150"
                                                    data-animate="2000"> <span class="h2 step font-bold">70</span>%
                                                    <div class="easypie-text text-muted">In-progress</div>
                                                </div>      
                                            </div>
                                        </div>

                                        <div class="panel-footer bg-warning lt" style="font-size: 15px">Total Customization 20</div>

                                    </section>    
                                </div>
                              </a>
                              
                              <a href="BikeCustomizationRecordsPage">  
                                <div class="col-lg-4">
                                    <section class="panel panel-default">
                                        <header class="panel-heading bg-success lt" style="font-size: 15px">Completed Customization</header>
                                        <div class="panel-body text-center">
                                            <h4>4</h4>
                                            <div class="inline">
                                                <div class="easypiechart text-success" data-percent="20"
                                                    data-line-width="5" data-track-Color="#f0f0f0" data-bar-color="#8ec165"
                                                    data-rotate="0" data-scale-Color="false" data-size="150"
                                                    data-animate="2000"> <span class="h2 step font-bold">20</span>%
                                                    <div class="easypie-text text-muted">Done</div>
                                                </div>      
                                            </div>
                                        </div>

                                        <div class="panel-footer bg-success lt" style="font-size: 15px">Total Customization 20</div>

                                    </section>    
                                </div>
							</a>
                                
	               </div>
	               

	            </section>
	        </section>
	 </section>               

</body>
</html>