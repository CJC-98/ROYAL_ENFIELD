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
		
		var reciverName;
		var reciverPost;
		var reciverImg;
	
	
		function markIt(id){
			var req = new XMLHttpRequest();		
			req.open("GET","markIt?notficationId="+id,true);
			req.send();
			
		}
		
		
	
		function searchEmployee(){
			
			var empName = document.getElementById("empName").value;
			
			
			if(empName==""){
				alert("Please enter employee name!!!");
			}
			//TODO: get login user name from session
			else if(empName == "pranay"){
				alert("You can't send notification to yourself!!!");
			}
			else{
				var req = new XMLHttpRequest();
				
				req.open("GET","searchEmployee?empName="+empName,true);
				req.send();
				
				req.onreadystatechange=function(){
					if(req.readyState==4 && req.status==200){
						
						
						if(req.responseText){
							empDetails = JSON.parse(req.responseText);
							
							reciverName = empDetails.employeeName;
							reciverPost = empDetails.employeeDesignation;
							reciverImg = empDetails.profilePictureUrl;
							
							document.getElementById("notificationBody").style.display = "block";	
							document.getElementById("senderName").innerHTML = empDetails.employeeName;
							document.getElementById("senderImg").src = "${pageContext.request.contextPath}/Resources/images/EmployeeProfilePicture/"+empDetails.profilePictureUrl;
							
							document.getElementById("senderPost").innerHTML = empDetails.employeeDesignation;
							
						}
						else{
							alert("Employee not exist!!!")
							document.getElementById("notificationBody").style.display = "none";
						}

					}

				}
			
			}
			
		}
		
		function sendNotification(){
			var msg = document.getElementById("message").value;

			if(msg!=""){
				var req = new XMLHttpRequest();
				req.open("GET","sendNotification?reciverName="+reciverName+
											  "&&reciverPost="+reciverPost+
											  "&&reciverImg="+reciverImg+
											  "&&message="+msg, true);
				req.send();
				
				alert("notification is send successfully");
				document.getElementById("notificationBody").style.display = "none";
				document.getElementById("empName").value = "";
			}
			else{
				alert("please write a message!!!");
			}
			
	
			
		}
		
		function cancel(){
			document.getElementById("notificationBody").style.display = "none";
			document.getElementById("empName").value = "";
		}



	</script>
	
	<a:set var="ReciverName" value="hello"/>
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
			                                    <ul class="list-group no-radius m-b-none m-t-n-xxs list-group-alt list-group-lg">      
			                                        <a:forEach var="data" items="${inboxList}">
				                                		<li class="list-group-item"> 
			                                        		<a class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/images/EmployeeProfilePicture/${data.senderImg}" class="img-circle"> 
			                                                </a> 
			                                                <a  class="clear"> 

			                                                	<small class="pull-right text-muted" style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">

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
																	  	<a data-toggle="class" class="btn btn-default btn-xs active" disabled=true> 
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
																				                                              
			                                                   <%--  <a data-toggle="modal" 
			                                                       data-target="#myModal" 
			                                                       class="btn btn-default btn-xs">
			                                                        <i class="fa fa-mail-reply text-muted"></i> 
			                                                        <span onclick="">Reply</span>
			                                                    </a> --%>
			                                                </div>
			                                           </li>			          			                                                         
				                                	</a:forEach>		                                        
												 </ul>
                              			  
                              			  </section>
                              			  </aside>             
                              		  </div>
                                       <!-- inbox ends -->       
                                        
                                                                         
                                    		
                                   	<!-- outbox starts -->                                   	
                                    <div class="tab-pane bg-light dker" id="Outbox">
                                      <aside class="bg-light dk b-l" id="email-list">
                            			<section class="vbox">                                        
			                                    <ul class="list-group no-radius m-b-none m-t-n-xxs list-group-alt list-group-lg">
			                                        
			                                        
			                                        <a:forEach var="data" items="${outboxList}">
				                                		<li class="list-group-item"> 
			                                        		<a class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/images/EmployeeProfilePicture/${data.reciverImg}" class="img-circle"> 
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
												
												<a class="thumb-sm pull-left m-r-sm">
			                                         <img id="senderImg" class="img-circle"> 
			                                    </a>
												<h4 id="senderName"></h4>
												<h5 id="senderPost"></h5>
												
												<textarea class="form-control" id="message" rows="3" placeholder="Please write message here"></textarea>
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
	 
	        
		
		<script>

			document.getElementById("notificationBody").style.display = "none";	

		</script>
					  		
					                           

</body>

</html>