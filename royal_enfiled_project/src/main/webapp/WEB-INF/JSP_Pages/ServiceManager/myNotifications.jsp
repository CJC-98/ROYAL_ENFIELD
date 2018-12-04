
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<section id="content"  class="bg-light lter">
	        <section class="vbox">
	            <section class="scrollable padder">                                               
	                                
	                <div class="m-b-md">
	                    <h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">My Notifications</h3>
	                </div>
	                
	              
	               <section class="panel panel-default">
                             <header class="panel-heading bg-light dker">
                                     <ul class="nav nav-tabs nav-justified">
                                           <li class="active"><a href="#Unread" data-toggle="tab">Unread</a></li>
                                           <li><a href="#Read" data-toggle="tab">Read</a></li>
                                           <li><a href="#Sendnotification" data-toggle="tab">Send Notification</a></li>         
                                     </ul>
                             </header>
                                        <div class="panel-body bg-light dk">
                                            <div class="tab-content">

                                               
												<div class="tab-pane active bg-light dk" id="Unread">
                                                	<span class="">List Of Unread Massages</span>                          
                                    			</div>
                                   
                                   		
                                                <div class="tab-pane bg-light dk" id="Read">
                                                
                                                     <div class="well m-t">
                                              <!-- First read msg info start-->
                                           <div class="row">
                                           <div class="col-lg-12">
                                          
                                          <ul class="breadcrumb">
                                                   <div class="clearfix m-b">
                                                  <a href="#" class="pull-left thumb m-r">
                                                  
                                                <span class="thumb-sm avatar pull-left">
                                                   <img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg">
                                                    </span> 
                                                  </a>
                      
                                                    <div class="clear">
                                                    <small class="text-muted">
                                                        <i class="fa fa-map-marker"></i> London, UK</small>
                                                    
                                                        <div class="h5 m-t-xs m-b-xs"><strong>Name:</strong> John Smith
                                                        <br>
                                                        <br>
                                                       <strong> Designation:</strong> Sales manager1
                                                        <br>
                                                        <br>
                                                       <strong> Discription:</strong> //
                                                        Description of readed messages will be here.
                                                        //<span class="text-muted m-l-sm pull-right"> <i class="fa fa-clock-o"></i> Message Time </span> 
                                                         <br>
                                                         <br>
                                                         <strong>Replied Message:</strong> //
                                                         Description of replied message will be here.
                                                         //                 
                                  <span class="text-muted m-l-sm pull-right"> <i class="fa fa-clock-o"></i> Reply Time</span>
                                 
                                                        </div>
                                                        </div>
                                                        </div>
                                                        </ul>
                                                        </div>         
                                                        </div>
                                                <!-- First read msg info end -->
                                               <!-- Second read msg info start-->
                                         
                                           <div class="row">
                                           <div class="col-lg-12">
                                          
                                          <ul class="breadcrumb">
                                                  <div class="clearfix m-b"> 
                                                   <a href="#" class="pull-left thumb m-r">
                                                  
                                                <span class="thumb-sm avatar pull-left">
                                                   <img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg">
                                                    </span> 
                                                  </a>
                    
                                                    <div class="clear">
                                                    <small class="text-muted">
                                                    
                                                         <i class="fa fa-map-marker"></i> Pune, India</small>
                                                    
                                                        <div class="h5 m-t-xs m-b-xs"><strong>Name:</strong>Pranay K
                                                        <br>
                                                        <br>
                                                       <strong> Designation:</strong> Sales manager2
                                                        <br>
                                                        <br>
                                                       <strong> Discription:</strong>//
                                                         Description of messages will be here.
                                                        //<span class="text-muted m-l-sm pull-right"> <i class="fa fa-clock-o"></i> Message Time
                                                      
                                                         </span>
                                                        <br>
                                                        <br>
                                                        <strong>Replied Message:</strong> //
                                                         Description of replied message will be here.
                                                         // 
                                                         <span class="text-muted m-l-sm pull-right"> <i class="fa fa-clock-o"></i> Reply Time
                                                         </span>
                                                
                                                        </div>
                                                        
                                                        </div>
                                                        </div>
                                                        </ul>
                                                        </div> 
                                                       </div>
                                                    
                                                <!-- Second read msg info end -->
                                </div>

                                                
                                                
                                         
                                                
                                                
                                                
                                                
                                              </div>

                                              
                                                <div class="tab-pane bg-light dk" id="Sendnotification">

												        <div class="modal-header">
												        	<h3 style="text-align: center">Send Notification</h3>
												        	<div class="input-group"> 
												        		<input type="text" class="form-control rounded" placeholder="Search Employee"> 
												        		<span class="input-group-btn">
											                          <button class="btn btn-success" type="button" onclick="showBody()">write notificaltion</button>
											                    </span> 
											                </div>  
												        </div>
						        
												        <div id="notificationBody">
													        <div class="modal-body">
													          <h4>Employee Name Here</h4>
													          <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" placeholder="Please write message here"></textarea>
													        </div>
													        
													        <div style="margin-left:12px">
													          <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="sendNotification()">Send Notification</button>	
													          <button type="button" class="btn btn-default" data-dismiss="modal" onclick="cancel()">Cancel</button>
													        </div>
												        </div>
						      					</div>   
						    			</div>
					  			</div>
					                           
                      </section>                                                                   
	              </section>
	        </section>
	 </section> 
</body>


<script>
	
	document.getElementById("notificationBody").style.display = "none";
	
	function showBody(){
		document.getElementById("notificationBody").style.display = "block";
	}
	
	function sendNotification(){
		alert("notification is send successfully");
		document.getElementById("notificationBody").style.display = "none";
	}
	
	function cancel(){
		document.getElementById("notificationBody").style.display = "none";
	}
	 
</script>
</html>
