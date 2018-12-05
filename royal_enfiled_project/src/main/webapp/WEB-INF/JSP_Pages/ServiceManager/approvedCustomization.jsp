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
	<section id="content" class="bg-light lter">
        <section class="vbox">
            <section class="scrollable padder">                                               
                                
                <div class="m-b-md">
                    <h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">Approved Customization</h3>
                </div>
                
                <div>
                
                	<!-- first table starts -->
                	<div class="col-sm-12">
                                    <section class="panel panel-default bg-light dker">
                                        <header class="panel-heading bg-primary lter" style="font-size: 18px; display: flex; flex-wrap: wrap; justify-content: space-around;">
                                        	<div><span style="font-weight: bold">Service Id:&nbsp;</span>BS0434</div>
                                        	<div><span style="font-weight: bold">Service Status:&nbsp;</span> <span style="color: #FFC700">waiting</span></div>
                                        	<div><span style="font-weight: bold">Appointment Date:&nbsp;</span> 23/12/2018</div>
                                        	<div>
                                        		<a href="CustomizationInprogressPage" class="btn btn-sm btn-warning btn-rounded">Start Customization</a>
                                        	</div>
                                        </header>
                                        
                                        <section class="panel panel-default">
				                             <header class="panel-heading bg-light dker">
				                                     <ul class="nav nav-tabs nav-justified">
				                                           <li class="active"><a href="#BikeInfornmation" data-toggle="tab">Bike Infornmation</a></li>
				                                           <li><a href="#CustomizationChart" data-toggle="tab">Customization Chart</a></li>
				                                           <li><a href="#CustomerInfornmation" data-toggle="tab">Customer Infornmation</a></li>
				                                           <li><a href="#CustomizationInvoice" data-toggle="tab">Customization Invoice</a></li>         
				                                     </ul>
				                             </header>
                                        <div class="panel-body bg-light dk">
                                            <div class="tab-content">

                                               
												<div class="tab-pane active bg-light dk" id="BikeInfornmation">
                                                	            <div class="col-sm-12">
								                                    
								                                        <table class="table table-striped m-b-none">
								                                            <thead>
								                                                <tr>
								                                                    <th style="text-align: center">Bike Name</th>
								                                                    <th style="text-align: center">Chassis Number</th>
								                                                    <th style="text-align: center">Plate Number</th>
								                                                </tr>
								                                            </thead>
								                                            
								                                            <tbody>
								                                            
								                                                <tr style="text-align: center">
								                                                         <td>Bullet 350cc</td>
								                                                         <td>5FHGSJ44456871264</td>
								                                                         <td>MH-45-GH-6454</td>
								                                                </tr>
								                                                          
								                                            </tbody>
								                                            
								                                        </table>
								                                    
								                                </div>             
                                    			</div>
                                   
                                   	
                                                <div class="tab-pane bg-light dk" id="CustomizationChart">
																<div class="col-sm-12">
								                                    
								                                        <table class="table table-striped m-b-none">
								                                            <thead>
								                                                <tr>
								                                                    <th style="text-align: center">Part</th>
								                                                    <th style="text-align: center">Cost</th>
								                                                    <th style="text-align: center">Status</th>
								                                                </tr>
								                                            </thead>
								                                            
								                                            <tbody>
								                                            
									                                            <tr style="text-align: center">
							                                                    	 <td>labour cost</td>
							                                                         <td>500</td>
							                                                         <td style="color: #FF681B">pending</td>
							                                                	</tr>
								                                            
								                                              	<tr style="text-align: center">
							                                                    	 <td>tail light</td>
							                                                         <td>250</td>
							                                                         <td style="color: #FF681B">pending</td>
							                                                	</tr>
                                                
								                                                <tr style="text-align: center">
								                                                         <td>head light</td>
								                                                         <td>400</td>
								                                                         <td style="color: #FF681B">pending</td>								                                                         
								                                                </tr>                              
								                                                          
								                                            </tbody>
								                                            
								                                        </table>
								                                   
								                                </div>		                                                
                                                </div>

                                              
                                                <div class="tab-pane bg-light dk" id="CustomerInfornmation">
																<div class="col-sm-12">
								                                    
								                                        <table class="table table-striped m-b-none">
								                                            <thead>
								                                                <tr>
								                                                    <th style="text-align: center">Customer Name</th>
								                                                    <th style="text-align: center">Address</th>
								                                                    <th style="text-align: center">Phone Number</th>
								                                                </tr>
								                                            </thead>
								                                            
								                                            <tbody>
								                                            
								                                                <tr style="text-align: center">
								                                                         <td>Rahul Yadav</td>
								                                                         <td>karve nager, pune</td>
								                                                         <td>9256324578</td>
								                                                </tr>
								                                                          
								                                            </tbody>
								                                            
								                                        </table>
								                                    
								                                </div>
						      					</div> 
						      					
						      					<div class="tab-pane bg-light dk" id="CustomizationInvoice">
																<div class="col-sm-12">
								                                    
								                                        <table class="table table-striped m-b-none">
								                                            <thead>
								                                                <tr>
								                                                    <th style="text-align: center">Amount</th>
								                                                    <th style="text-align: center">GST(%)</th>
								                                                    <th style="text-align: center">Total Amount</th>
								                                                </tr>
								                                            </thead>
								                                            
								                                            <tbody>
								                                            
									                                            <tr style="text-align: center">
							                                                    	 <td>5000</td>
							                                                         <td>8</td>
							                                                         <td>5800</td>
							                                                	</tr>
                                 
								                                            </tbody>
								                                            
								                                        </table>
								                                   
								                                </div>		
                                                </div>
						      					  
						    			</div>
					  			</div>
					                           
                      </section>
                      
                        
                                        
                                    </section>
                                </div>
                                <!-- fisrt table ends -->
                                

	<!-- first table starts -->
                	<div class="col-sm-12">
                                    <section class="panel panel-default bg-light dker">
                                        <header class="panel-heading bg-primary lter" style="font-size: 18px; display: flex; flex-wrap: wrap; justify-content: space-around;">
                                        	<div><span style="font-weight: bold">Service Id:&nbsp;</span>BS0434</div>
                                        	<div><span style="font-weight: bold">Service Status:&nbsp;</span> <span style="color: #FFC700">waiting</span></div>
                                        	<div><span style="font-weight: bold">Appointment Date:&nbsp;</span> 23/12/2018</div>
                                        	<div>
                                        		<a href="CustomizationInprogressPage" class="btn btn-sm btn-warning btn-rounded">Start Customization</a>
                                        	</div>
                                        </header>
                                        
                                        <section class="panel panel-default">
				                             <header class="panel-heading bg-light dker">
				                                     <ul class="nav nav-tabs nav-justified">
				                                           <li class="active"><a href="#BikeInfornmation" data-toggle="tab">Bike Infornmation</a></li>
				                                           <li><a href="#CustomizationChart" data-toggle="tab">Customization Chart</a></li>
				                                           <li><a href="#CustomerInfornmation" data-toggle="tab">Customer Infornmation</a></li>
				                                           <li><a href="#CustomizationInvoice" data-toggle="tab">Customization Invoice</a></li>         
				                                     </ul>
				                             </header>
                                        <div class="panel-body bg-light dk">
                                            <div class="tab-content">

                                               
												<div class="tab-pane active bg-light dk" id="BikeInfornmation">
                                                	            <div class="col-sm-12">
								                                    
								                                        <table class="table table-striped m-b-none">
								                                            <thead>
								                                                <tr>
								                                                    <th style="text-align: center">Bike Name</th>
								                                                    <th style="text-align: center">Chassis Number</th>
								                                                    <th style="text-align: center">Plate Number</th>
								                                                </tr>
								                                            </thead>
								                                            
								                                            <tbody>
								                                            
								                                                <tr style="text-align: center">
								                                                         <td>Bullet 350cc</td>
								                                                         <td>5FHGSJ44456871264</td>
								                                                         <td>MH-45-GH-6454</td>
								                                                </tr>
								                                                          
								                                            </tbody>
								                                            
								                                        </table>
								                                    
								                                </div>             
                                    			</div>
                                   
                                   	
                                                <div class="tab-pane bg-light dk" id="CustomizationChart">
																<div class="col-sm-12">
								                                    
								                                        <table class="table table-striped m-b-none">
								                                            <thead>
								                                                <tr>
								                                                    <th style="text-align: center">Part</th>
								                                                    <th style="text-align: center">Cost</th>
								                                                    <th style="text-align: center">Status</th>
								                                                </tr>
								                                            </thead>
								                                            
								                                            <tbody>
								                                            
									                                            <tr style="text-align: center">
							                                                    	 <td>labour cost</td>
							                                                         <td>500</td>
							                                                         <td style="color: #FF681B">pending</td>
							                                                	</tr>
								                                            
								                                              	<tr style="text-align: center">
							                                                    	 <td>tail light</td>
							                                                         <td>250</td>
							                                                         <td style="color: #FF681B">pending</td>
							                                                	</tr>
                                                
								                                                <tr style="text-align: center">
								                                                         <td>head light</td>
								                                                         <td>400</td>
								                                                         <td style="color: #FF681B">pending</td>								                                                         
								                                                </tr>                              
								                                                          
								                                            </tbody>
								                                            
								                                        </table>
								                                   
								                                </div>		                                                
                                                </div>

                                              
                                                <div class="tab-pane bg-light dk" id="CustomerInfornmation">
																<div class="col-sm-12">
								                                    
								                                        <table class="table table-striped m-b-none">
								                                            <thead>
								                                                <tr>
								                                                    <th style="text-align: center">Customer Name</th>
								                                                    <th style="text-align: center">Address</th>
								                                                    <th style="text-align: center">Phone Number</th>
								                                                </tr>
								                                            </thead>
								                                            
								                                            <tbody>
								                                            
								                                                <tr style="text-align: center">
								                                                         <td>Rahul Yadav</td>
								                                                         <td>karve nager, pune</td>
								                                                         <td>9256324578</td>
								                                                </tr>
								                                                          
								                                            </tbody>
								                                            
								                                        </table>
								                                    
								                                </div>
						      					</div> 
						      					
						      					<div class="tab-pane bg-light dk" id="CustomizationInvoice">
																<div class="col-sm-12">
								                                    
								                                        <table class="table table-striped m-b-none">
								                                            <thead>
								                                                <tr>
								                                                    <th style="text-align: center">Amount</th>
								                                                    <th style="text-align: center">GST(%)</th>
								                                                    <th style="text-align: center">Total Amount</th>
								                                                </tr>
								                                            </thead>
								                                            
								                                            <tbody>
								                                            
									                                            <tr style="text-align: center">
							                                                    	 <td>5000</td>
							                                                         <td>8</td>
							                                                         <td>5800</td>
							                                                	</tr>
                                 
								                                            </tbody>
								                                            
								                                        </table>
								                                   
								                                </div>		
                                                </div>
						      					  
						    			</div>
					  			</div>
					                           
                      </section>
                      
                        
                                        
                                    </section>
                                </div>
                                <!-- fisrt table ends -->
                                
                                
                                <!-- first table starts -->
                	<div class="col-sm-12">
                                    <section class="panel panel-default bg-light dker">
                                        <header class="panel-heading bg-primary lter" style="font-size: 18px; display: flex; flex-wrap: wrap; justify-content: space-around;">
                                        	<div><span style="font-weight: bold">Service Id:&nbsp;</span>BS0434</div>
                                        	<div><span style="font-weight: bold">Service Status:&nbsp;</span> <span style="color: #FFC700">waiting</span></div>
                                        	<div><span style="font-weight: bold">Appointment Date:&nbsp;</span> 23/12/2018</div>
                                        	<div>
                                        		<a href="CustomizationInprogressPage" class="btn btn-sm btn-warning btn-rounded">Start Customization</a>
                                        	</div>
                                        </header>
                                        
                                        <section class="panel panel-default">
				                             <header class="panel-heading bg-light dker">
				                                     <ul class="nav nav-tabs nav-justified">
				                                           <li class="active"><a href="#BikeInfornmation" data-toggle="tab">Bike Infornmation</a></li>
				                                           <li><a href="#CustomizationChart" data-toggle="tab">Customization Chart</a></li>
				                                           <li><a href="#CustomerInfornmation" data-toggle="tab">Customer Infornmation</a></li>
				                                           <li><a href="#CustomizationInvoice" data-toggle="tab">Customization Invoice</a></li>         
				                                     </ul>
				                             </header>
                                        <div class="panel-body bg-light dk">
                                            <div class="tab-content">

                                               
												<div class="tab-pane active bg-light dk" id="BikeInfornmation">
                                                	            <div class="col-sm-12">
								                                    
								                                        <table class="table table-striped m-b-none">
								                                            <thead>
								                                                <tr>
								                                                    <th style="text-align: center">Bike Name</th>
								                                                    <th style="text-align: center">Chassis Number</th>
								                                                    <th style="text-align: center">Plate Number</th>
								                                                </tr>
								                                            </thead>
								                                            
								                                            <tbody>
								                                            
								                                                <tr style="text-align: center">
								                                                         <td>Bullet 350cc</td>
								                                                         <td>5FHGSJ44456871264</td>
								                                                         <td>MH-45-GH-6454</td>
								                                                </tr>
								                                                          
								                                            </tbody>
								                                            
								                                        </table>
								                                    
								                                </div>             
                                    			</div>
                                   
                                   	
                                                <div class="tab-pane bg-light dk" id="CustomizationChart">
																<div class="col-sm-12">
								                                    
								                                        <table class="table table-striped m-b-none">
								                                            <thead>
								                                                <tr>
								                                                    <th style="text-align: center">Part</th>
								                                                    <th style="text-align: center">Cost</th>
								                                                    <th style="text-align: center">Status</th>
								                                                </tr>
								                                            </thead>
								                                            
								                                            <tbody>
								                                            
									                                            <tr style="text-align: center">
							                                                    	 <td>labour cost</td>
							                                                         <td>500</td>
							                                                         <td style="color: #FF681B">pending</td>
							                                                	</tr>
								                                            
								                                              	<tr style="text-align: center">
							                                                    	 <td>tail light</td>
							                                                         <td>250</td>
							                                                         <td style="color: #FF681B">pending</td>
							                                                	</tr>
                                                
								                                                <tr style="text-align: center">
								                                                         <td>head light</td>
								                                                         <td>400</td>
								                                                         <td style="color: #FF681B">pending</td>								                                                         
								                                                </tr>                              
								                                                          
								                                            </tbody>
								                                            
								                                        </table>
								                                   
								                                </div>		                                                
                                                </div>

                                              
                                                <div class="tab-pane bg-light dk" id="CustomerInfornmation">
																<div class="col-sm-12">
								                                    
								                                        <table class="table table-striped m-b-none">
								                                            <thead>
								                                                <tr>
								                                                    <th style="text-align: center">Customer Name</th>
								                                                    <th style="text-align: center">Address</th>
								                                                    <th style="text-align: center">Phone Number</th>
								                                                </tr>
								                                            </thead>
								                                            
								                                            <tbody>
								                                            
								                                                <tr style="text-align: center">
								                                                         <td>Rahul Yadav</td>
								                                                         <td>karve nager, pune</td>
								                                                         <td>9256324578</td>
								                                                </tr>
								                                                          
								                                            </tbody>
								                                            
								                                        </table>
								                                    
								                                </div>
						      					</div> 
						      					
						      					<div class="tab-pane bg-light dk" id="CustomizationInvoice">
																<div class="col-sm-12">
								                                    
								                                        <table class="table table-striped m-b-none">
								                                            <thead>
								                                                <tr>
								                                                    <th style="text-align: center">Amount</th>
								                                                    <th style="text-align: center">GST(%)</th>
								                                                    <th style="text-align: center">Total Amount</th>
								                                                </tr>
								                                            </thead>
								                                            
								                                            <tbody>
								                                            
									                                            <tr style="text-align: center">
							                                                    	 <td>5000</td>
							                                                         <td>8</td>
							                                                         <td>5800</td>
							                                                	</tr>
                                 
								                                            </tbody>
								                                            
								                                        </table>
								                                   
								                                </div>		
                                                </div>
						      					  
						    			</div>
					  			</div>
					                           
                      </section>
                      
                        
                                        
                                    </section>
                                </div>
                                <!-- fisrt table ends -->
                    
                    
               
               </div>
            
                      
        </section>
   </section> 
   </section>

 
</body>
</html>
