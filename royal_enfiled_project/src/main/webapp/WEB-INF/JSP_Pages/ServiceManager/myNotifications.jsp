<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>  
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


	

	<script>
	
		function markIt(id){
			var req = new XMLHttpRequest();		
			req.open("GET","markIt?notficationId="+id,true);
			req.send();
			
		}
	
		function searchEmployee(){
			
			var empName = document.getElementById("empName").value;
			
			if(empName==""){
				alert("Please enter employee name!!!");
			}else{
				var req = new XMLHttpRequest();
				
				req.open("GET","searchEmployee?empName="+empName,true);
				req.send();
				
				req.onreadystatechange=function(){
					if(req.readyState==4 && req.status==200){
						
					}
				}
			
			}
			
		}

	</script>

	<section id="content"  class="bg-light lter">
	        <section class="vbox">
	            <section class="scrollable padder">                                               
	                                
	                <div class="m-b-md">
	                    <h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">My Notifications</h3>
	                </div>
	                
	              
	               <section class="panel panel-default">
                             <header class="panel-heading bg-light dker">
                                     <ul class="nav nav-tabs nav-justified">
                                           <li class="active"><a href="#Inbox" data-toggle="tab">Inbox</a></li>
                                           <li><a href="#Outbox" data-toggle="tab">Outbox</a></li>
                                           <li><a href="#ComposeNotification" data-toggle="tab">Compose Notification</a></li>         
                                     </ul>
                             </header>
                               
                             <div class="panel-body bg-light dk">
                                      <div class="tab-content">

                                       

                                      <!-- inbox started -->

								      <div class="tab-pane active bg-light dker" id="Inbox">  
								      		
								      	<aside class="bg-light dk b-l" id="email-list">
                            			<section class="vbox">	
								      		<section class="scrollable hover">
			                                    <ul class="list-group no-radius m-b-none m-t-n-xxs list-group-alt list-group-lg">
			                                        
			                                        <a:set var="sendToName" value="${null}"/>
			                                        
			                                        <a:forEach var="data" items="${inboxList}">
				                                		<li class="list-group-item"> 
			                                        		<a href="#" class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg" class="img-circle"> 
			                                                </a> 
			                                                <a href="#" class="clear"> 

			                                                	<small class="pull-right text-muted" 
			                                                		   style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">

			                                                		<strong style="font-size: 15px">${data.sendDate}</strong> 
			                                                		<span>${data.sendTime}</span>
			                                                	</small>
			                                                	<strong style="font-size: 15px">FROM: ${data.senderName}</strong><br>
			                                                	<span style="font-size: 15px">${data.senderPost}</span><br>
			                                                	<span>${data.message}</span>     	
			                                                </a>
			                                                
			                                                <div class="comment-action m-t-sm"> 

			                                                	
			                                                		
			                                               		<a:choose>
																	  <a:when test="${data.markAsRead}">
																	  	<a href="#" data-toggle="class" class="btn btn-default btn-xs active" disabled=true> 
			                                                				<i class="fa fa-star-o text-muted text"></i>
																	    		<i class="fa fa-star text-danger text-active"></i> Mark As Read
																	    </a>		 
																	  </a:when>
																	  <a:otherwise>
																	    	<a data-toggle="class" class="btn btn-default btn-xs"> 
			                                                					<i class="fa fa-star-o text-muted text"></i>
																	    			 <i class="fa fa-star text-danger text-active"></i> 
																	    			 <span onclick="markIt(${data.notficationId})">Mark As Read</span>
																	        </a>
																	  </a:otherwise>
																	</a:choose>
			                         
			                                                

			                                                    <a data-toggle="modal" 
			                                                       data-target="#myModal" 
			                                                       class="btn btn-default btn-xs"    
			                                                       onclick="">
			                                                        <i class="fa fa-mail-reply text-muted"></i> Reply
			                                                    </a>
			                                                </div>
			                                           </li>
			          			                                                         
				                                	</a:forEach>
			                                        
			                                        
			                                        
												 </ul>
                              			  </section>  
                              			  </section>
                              			  </aside>             
                              		  </div>
                                       <!-- inbox ends -->       
                                        
                                                                         
                                    		
                                   	<!-- outbox starts -->
                                    <div class="tab-pane bg-light dker" id="Outbox">
                                      <aside class="bg-light dk b-l" id="email-list">
                            			<section class="vbox">  
                                        <section class="scrollable hover">
			                                    <ul class="list-group no-radius m-b-none m-t-n-xxs list-group-alt list-group-lg">
			                                        
			                                        
			                                        <a:forEach var="data" items="${outboxList}">
				                                		<li class="list-group-item"> 
			                                        		<a class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg" class="img-circle"> 
			                                                </a> 
			                                                <a class="clear"> 
			                                                	<small class="pull-right text-muted" style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">
			                                                		<strong style="font-size: 15px">${data.sendDate}</strong> 
			                                                		<span>${data.sendTime}</span>
			                                                	</small>
			                                                	<strong style="font-size: 15px">${data.reciverName}</strong><br>
			                                                	<span style="font-size: 15px">${data.reciverPost}</span><br>
			                                                	<span>${data.message}</span> 
			                                                </a>
			                                        	</li>
				                                	</a:forEach>
			                                        
			                           
												 </ul>
                              			  </section> 
                              			  </section>
                              			  </aside>          

                                   </div>
                                  <!-- outbox ends -->
                                  
                                  <!-- ComposeNotification starts -->
								  <div class="tab-pane bg-light dk" id="ComposeNotification">	

								   <div class="modal-header">
									<h3 style="text-align: center">Compose Notification</h3>
									 <div class="input-group"> 
									  <input type="text" class="form-control rounded" placeholder="Search Employee" id="empName"> 
									   <span class="input-group-btn">
										<button class="btn btn-success" type="button" onclick="searchEmployee()">Search</button>
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
						      				
						      				
						      							                                        	        <!-- modal starts-->
 
																	<div class="modal fade" id="myModal" role="dialog">
																		    <div class="modal-dialog modal-md">
																		      <div class="modal-content">
																		        <div class="modal-header">
																		        	<h3 style="text-align: center">Your Reply</h3>  
																		        </div>
																		        <div class="modal-body">
																		          <div class="form-group"> 
																		          	<label style="font-size: 20px"><strong>To : </strong>${sendToName}</label> 
																		          </div>
												                                  <div class="form-group"> 
												                                  	<label>Message</label> 
												                                  	<textarea class="form-control" rows="5" placeholder="your message"></textarea>
												                                  </div>
																		        </div>
																		        <div class="modal-footer">
																		          <button type="button" class="btn btn-primary" data-dismiss="modal">Send</button>	
																		          <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
																		        </div>
																		      </div>
																		    </div>
																	  	</div>
																	  
																	  
															<!-- modal ends -->	
						      					
						      					 
						    	</div>
					  		</div>
					                           
                      </section>                                                                   
	              </section>
	        </section>
	        
	         
	        
	 </section> 
	 
	        
                                               



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

	<script src="js/app.v1.js"></script>
    <script src="js/charts/easypiechart/jquery.easy-pie-chart.js"></script>
    <script src="js/charts/sparkline/jquery.sparkline.min.js"></script>
    <script src="js/app.plugin.js"></script>

</body>

</html>

