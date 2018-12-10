
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

                                       
								      <div class="tab-pane active bg-light dker" id="Unread">  
								      		
								      	<aside class="bg-light dk b-l" id="email-list">
                            			<section class="vbox">	
								      		<section class="scrollable hover">
			                                    <ul class="list-group no-radius m-b-none m-t-n-xxs list-group-alt list-group-lg">
			                                        <li class="list-group-item"> 
			                                        		<a href="#" class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg" class="img-circle"> 
			                                                </a> 
			                                                <a href="#" class="clear"> 
			                                                	<small class="pull-right text-muted" style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">
			                                                		<strong style="font-size: 15px">12/08/2018</strong> 
			                                                		<span>12:45 AM</span>
			                                                	</small>
			                                                	<strong style="font-size: 15px">Drew Wllon</strong><br>
			                                                	<span style="font-size: 15px">Sales Manager</span><br>
			                                                	<span>Message : Wellcome and play this web application template</span> 
			                                                </a>
			                                                <div class="comment-action m-t-sm"> 
			                                                	<a href="#" data-toggle="class" class="btn btn-default btn-xs active"> 
			                                                		<i class="fa fa-star-o text-muted text"></i>
			                                                        <i class="fa fa-star text-danger text-active"></i> Mark as read 
			                                                    </a>
			                                                    <a data-toggle="modal" data-target="#myModal" class="btn btn-default btn-xs"> 
			                                                        <i class="fa fa-mail-reply text-muted"></i> Reply
			                                                    </a>
			                                                </div>
			                                        </li>
			                                        
			                                        <li class="list-group-item"> 
			                                        		<a href="#" class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg" class="img-circle"> 
			                                                </a> 
			                                                <a href="#" class="clear"> 
			                                                	<small class="pull-right text-muted" style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">
			                                                		<strong style="font-size: 15px">12/08/2018</strong> 
			                                                		<span>12:45 AM</span>
			                                                	</small>
			                                                	<strong style="font-size: 15px">Drew Wllon</strong><br>
			                                                	<span style="font-size: 15px">Sales Manager</span><br>
			                                                	<span>Message : Wellcome and play this web application template</span> 
			                                                </a>
			                                                <div class="comment-action m-t-sm"> 
			                                                	<a href="#" data-toggle="class" class="btn btn-default btn-xs active"> 
			                                                		<i class="fa fa-star-o text-muted text"></i>
			                                                        <i class="fa fa-star text-danger text-active"></i> Mark as read </a>
			                                                        <a href="#comment-form" class="btn btn-default btn-xs"> 
			                                                        <i class="fa fa-mail-reply text-muted"></i> Reply </a>
			                                                </div>
			                                        </li>
			                                        
			                                        <li class="list-group-item"> 
			                                        		<a href="#" class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg" class="img-circle"> 
			                                                </a> 
			                                                <a href="#" class="clear"> 
			                                                	<small class="pull-right text-muted" style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">
			                                                		<strong style="font-size: 15px">12/08/2018</strong> 
			                                                		<span>12:45 AM</span>
			                                                	</small>
			                                                	<strong style="font-size: 15px">Drew Wllon</strong><br>
			                                                	<span style="font-size: 15px">Sales Manager</span><br>
			                                                	<span>Message : Wellcome and play this web application template</span> 
			                                                </a>
			                                                <div class="comment-action m-t-sm"> 
			                                                	<a href="#" data-toggle="class" class="btn btn-default btn-xs active"> 
			                                                		<i class="fa fa-star-o text-muted text"></i>
			                                                        <i class="fa fa-star text-danger text-active"></i> Mark as read </a>
			                                                        <a href="#comment-form" class="btn btn-default btn-xs"> 
			                                                        <i class="fa fa-mail-reply text-muted"></i> Reply </a>
			                                                </div>
			                                        </li>
			                                        
			                                        <li class="list-group-item"> 
			                                        		<a href="#" class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg" class="img-circle"> 
			                                                </a> 
			                                                <a href="#" class="clear"> 
			                                                	<small class="pull-right text-muted" style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">
			                                                		<strong style="font-size: 15px">12/08/2018</strong> 
			                                                		<span>12:45 AM</span>
			                                                	</small>
			                                                	<strong style="font-size: 15px">Drew Wllon</strong><br>
			                                                	<span style="font-size: 15px">Sales Manager</span><br>
			                                                	<span>Message : Wellcome and play this web application template</span> 
			                                                </a>
			                                                <div class="comment-action m-t-sm"> 
			                                                	<a href="#" data-toggle="class" class="btn btn-default btn-xs active"> 
			                                                		<i class="fa fa-star-o text-muted text"></i>
			                                                        <i class="fa fa-star text-danger text-active"></i> Mark as read </a>
			                                                        <a href="#comment-form" class="btn btn-default btn-xs"> 
			                                                        <i class="fa fa-mail-reply text-muted"></i> Reply </a>
			                                                </div>
			                                        </li>
			                                        
			                                        <li class="list-group-item"> 
			                                        		<a href="#" class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg" class="img-circle"> 
			                                                </a> 
			                                                <a href="#" class="clear"> 
			                                                	<small class="pull-right text-muted" style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">
			                                                		<strong style="font-size: 15px">12/08/2018</strong> 
			                                                		<span>12:45 AM</span>
			                                                	</small>
			                                                	<strong style="font-size: 15px">Drew Wllon</strong><br>
			                                                	<span style="font-size: 15px">Sales Manager</span><br>
			                                                	<span>Message : Wellcome and play this web application template</span> 
			                                                </a>
			                                                <div class="comment-action m-t-sm"> 
			                                                	<a href="#" data-toggle="class" class="btn btn-default btn-xs active"> 
			                                                		<i class="fa fa-star-o text-muted text"></i>
			                                                        <i class="fa fa-star text-danger text-active"></i> Mark as read </a>
			                                                        <a href="#comment-form" class="btn btn-default btn-xs"> 
			                                                        <i class="fa fa-mail-reply text-muted"></i> Reply </a>
			                                                </div>
			                                        </li>
			                                        
			                                        <li class="list-group-item"> 
			                                        		<a href="#" class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg" class="img-circle"> 
			                                                </a> 
			                                                <a href="#" class="clear"> 
			                                                	<small class="pull-right text-muted" style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">
			                                                		<strong style="font-size: 15px">12/08/2018</strong> 
			                                                		<span>12:45 AM</span>
			                                                	</small>
			                                                	<strong style="font-size: 15px">Drew Wllon</strong><br>
			                                                	<span style="font-size: 15px">Sales Manager</span><br>
			                                                	<span>Message : Wellcome and play this web application template</span> 
			                                                </a>
			                                                <div class="comment-action m-t-sm"> 
			                                                	<a href="#" data-toggle="class" class="btn btn-default btn-xs active"> 
			                                                		<i class="fa fa-star-o text-muted text"></i>
			                                                        <i class="fa fa-star text-danger text-active"></i> Mark as read </a>
			                                                        <a href="#comment-form" class="btn btn-default btn-xs"> 
			                                                        <i class="fa fa-mail-reply text-muted"></i> Reply </a>
			                                                </div>
			                                        </li>
			                                        
			                                        <li class="list-group-item"> 
			                                        		<a href="#" class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg" class="img-circle"> 
			                                                </a> 
			                                                <a href="#" class="clear"> 
			                                                	<small class="pull-right text-muted" style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">
			                                                		<strong style="font-size: 15px">12/08/2018</strong> 
			                                                		<span>12:45 AM</span>
			                                                	</small>
			                                                	<strong style="font-size: 15px">Drew Wllon</strong><br>
			                                                	<span style="font-size: 15px">Sales Manager</span><br>
			                                                	<span>Message : Wellcome and play this web application template</span> 
			                                                </a>
			                                                <div class="comment-action m-t-sm"> 
			                                                	<a href="#" data-toggle="class" class="btn btn-default btn-xs active"> 
			                                                		<i class="fa fa-star-o text-muted text"></i>
			                                                        <i class="fa fa-star text-danger text-active"></i> Mark as read </a>
			                                                        <a href="#comment-form" class="btn btn-default btn-xs"> 
			                                                        <i class="fa fa-mail-reply text-muted"></i> Reply </a>
			                                                </div>
			                                        </li>
			                                        
			                                        <li class="list-group-item"> 
			                                        		<a href="#" class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg" class="img-circle"> 
			                                                </a> 
			                                                <a href="#" class="clear"> 
			                                                	<small class="pull-right text-muted" style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">
			                                                		<strong style="font-size: 15px">12/08/2018</strong> 
			                                                		<span>12:45 AM</span>
			                                                	</small>
			                                                	<strong style="font-size: 15px">Drew Wllon</strong><br>
			                                                	<span style="font-size: 15px">Sales Manager</span><br>
			                                                	<span>Message : Wellcome and play this web application template</span> 
			                                                </a>
			                                                <div class="comment-action m-t-sm"> 
			                                                	<a href="#" data-toggle="class" class="btn btn-default btn-xs active"> 
			                                                		<i class="fa fa-star-o text-muted text"></i>
			                                                        <i class="fa fa-star text-danger text-active"></i> Mark as read </a>
			                                                        <a href="#comment-form" class="btn btn-default btn-xs"> 
			                                                        <i class="fa fa-mail-reply text-muted"></i> Reply </a>
			                                                </div>
			                                        </li>
			                                        
												 </ul>
                              			  </section>  
                              			  </section>
                              			  </aside>             
                              		  </div>
                                              

                                              <!-- First unread msg info start-->
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
                                                     <div class="h5 m-t-xs m-b-xs"><strong>John Smith</strong>
                                                      
                                             
                                <span class="text-muted m-l-sm pull-right"> 
                               <strong class="h6">12:18</strong> <small class="text-muted">pm</small>
                                <br>
                                <strong class="h6">17</strong> <small class="text-muted">feb</small> <small class="text-muted">2018</small>
                              </span> 
                              <br>
                              <br>
                               Designation:<strong>Service manager1</strong>
                                                        <br>
                                                        <br>
                                Description://
                             <strong>  Description of unread messages will be here.
                                                        //</strong> 
                         <span class="text-muted m-l-sm pull-right"> 
                           <a href="" class="btn btn-sm btn-info btn-rounded" data-toggle="modal" data-target="#myModal">Reply</a>
                      <a href="#" data-toggle="class" class="btn btn-default btn-xs active">
                     <i class="fa fa-star-o text-muted text"></i> 
                     <i class="fa fa-star text-danger text-active"></i>Mark as read </a> 
                    
                                                        </div>
                                                        </div>
                                                        </div>
                                                        </ul>
                                                        </div>         
                                                        </div>
                                                <!-- First unread msg info end -->
                                               <!-- Second unread msg info start-->
                                         
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
                                                    <div class="h5 m-t-xs m-b-xs"><strong>Pranay K</strong>
                                                      <span class="text-muted m-l-sm pull-right"> 
                               <strong class="h6">12:18</strong> <small class="text-muted">pm</small>
                                <br>
                                <strong class="h6">17</strong> <small class="text-muted">feb</small> <small class="text-muted">2018</small>
                              </span> 
                                                        <br>
                                                        <br>
                                                       
                                                       Designation:<strong> Service manager2</strong>
                                                        <br>
                                                        <br>
                                                       Description:
                                                        <strong> // Description of unread messages will be here.
                                                        //</strong>
                                                        <span class="text-muted m-l-sm pull-right"> 
                                                         <a href="#comment-form" class="btn btn-default btn-xs">
                       <i class="text-muted"></i>Reply</a> 
                          
                      <a href="#" data-toggle="class" class="btn btn-default btn-xs active">
                     <i class="fa fa-star-o text-muted text"></i> 
                     <i class="fa fa-star text-danger text-active"></i>Mark as read </a> 
                                                 
                                                         
                                                
                                                        </div>
                                                        
                                                        </div>
                                                        </div>
                                                        </ul>
                                                        </div> 
                                                       </div>
                                                    
                                                <!-- Second unread msg info end -->
                                </div>

                                 </div>
                                                
                                                
                                                

                                                                         
                                    		
                                   	<!-- Read tab -->
                                    <div class="tab-pane bg-light dker" id="Read">
                                      <aside class="bg-light dk b-l" id="email-list">
                            			<section class="vbox">  
                                        <section class="scrollable hover">
			                                    <ul class="list-group no-radius m-b-none m-t-n-xxs list-group-alt list-group-lg">
			                                        <li class="list-group-item"> 
			                                        		<a href="#" class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg" class="img-circle"> 
			                                                </a> 
			                                                <a href="#" class="clear"> 
			                                                	<small class="pull-right text-muted" style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">
			                                                		<strong style="font-size: 15px">21/5/2018</strong> 
			                                                		<span>12:45 AM</span>
			                                                	</small>
			                                                	<strong style="font-size: 15px">Pranay kohad</strong><br>
			                                                	<span style="font-size: 15px">Service Manager</span><br>
			                                                	<span>Message : Welcome to this company</span> 
			                                                </a>
			                                        </li>
			                                        
			                                        
			                                        <li class="list-group-item"> 
			                                        		<a href="#" class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg" class="img-circle"> 
			                                                </a> 
			                                                <a href="#" class="clear"> 
			                                                	<small class="pull-right text-muted" style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">
			                                                		<strong style="font-size: 15px">21/5/2018</strong> 
			                                                		<span>12:45 AM</span>
			                                                	</small>
			                                                	<strong style="font-size: 15px">Pranay kohad</strong><br>
			                                                	<span style="font-size: 15px">Service Manager</span><br>
			                                                	<span>Message : Welcome to this company</span> 
			                                                </a>
			                                        </li>
			                                        
			                                        <li class="list-group-item"> 
			                                        		<a href="#" class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg" class="img-circle"> 
			                                                </a> 
			                                                <a href="#" class="clear"> 
			                                                	<small class="pull-right text-muted" style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">
			                                                		<strong style="font-size: 15px">21/5/2018</strong> 
			                                                		<span>12:45 AM</span>
			                                                	</small>
			                                                	<strong style="font-size: 15px">Pranay kohad</strong><br>
			                                                	<span style="font-size: 15px">Service Manager</span><br>
			                                                	<span>Message : Welcome to this company</span> 
			                                                </a>
			                                        </li>
			                                        
			                                        <li class="list-group-item"> 
			                                        		<a href="#" class="thumb-sm pull-left m-r-sm">
			                                                	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/avatar.jpg" class="img-circle"> 
			                                                </a> 
			                                                <a href="#" class="clear"> 
			                                                	<small class="pull-right text-muted" style="display: flex; flex-flow: column wrap; align-items: center; margin-top: 20px">
			                                                		<strong style="font-size: 15px">21/5/2018</strong> 
			                                                		<span>12:45 AM</span>
			                                                	</small>
			                                                	<strong style="font-size: 15px">Pranay kohad</strong><br>
			                                                	<span style="font-size: 15px">Service Manager</span><br>
			                                                	<span>Message : Welcome to this company</span> 
			                                                </a>
			                                        </li>
			                                        
			                                       
			                                        
			                                        
			                                        
												 </ul>
                              			  </section> 
                              			  </section>
                              			  </aside>          

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
	        
	        
	        <!-- modal starts-->
 
					<div class="modal fade" id="myModal" role="dialog">
						    <div class="modal-dialog modal-md">
						      <div class="modal-content">
						        <div class="modal-header">
						        	<h3 style="text-align: center">Your Reply</h3>  
						        </div>
						        <div class="modal-body">
						          <div class="form-group"> 
						          	<label style="font-size: 20px"><strong>To : </strong>Drew Willon </label> 
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
      <!-- modal starts-->
 
						  <div class="modal fade" id="myModal" role="dialog">
						    <div class="modal-dialog modal-md">
						      <div class="modal-content">
						        <div class="modal-header">
						        	
                <header class="panel-heading text-center"> <strong>Reply window</strong> </header>
                <form action="http://flatfull.com/themes/note/index.html" class="panel-body wrapper-lg">
                    <div class="form-group"> <label class="control-label">To:</label> <textarea="email" placeholder="Welcome to Reply Window"
                            class="form-control input-lg"> </div>
                   <button type="submit" class="btn btn-primary">Send</button>
                    <button type="submit" class="btn btn-primary">Cancel</button>
                   
                </form>
            </section>
                                </div>
						        </div>
						        
						      </div>
						    </div>
					  	</div>
					  
					  	<!-- modal ends -->
	                
</body>

</html>

