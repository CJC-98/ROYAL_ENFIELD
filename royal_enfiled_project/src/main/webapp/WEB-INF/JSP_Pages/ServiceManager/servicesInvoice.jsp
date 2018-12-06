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
	                    <h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">Services Invoice</h3>
	                </div>
	                
	               <!-- first table starts -->
                	<div class="col-sm-12">
                                    <section class="panel panel-default">
                                        <table class="table table-striped m-b-none b-a">
                                            <thead>
                                                <tr>
                                                    <th style="text-align: center">Invoice Id</th>
                                                    <th style="text-align: center">Amount</th>
                                                    <th style="text-align: center">GST(%)</th>
                                                    <th style="text-align: center">Total Amount</th>
                                                    <th style="text-align: center">Payment Status</th>
                                                    <th style="text-align: center">Details</th>
                                                </tr>
                                            </thead>
                                            
                                            <tbody>
                                            
                                                <tr style="text-align: center">
                                                    	 <td>1</td>
                                                         <td>2500</td>
                                                         <td>8</td>
                                                         <td>2700</td>
                                                         <td style="color: #FF681B">unpaid</td>
                                                         <td>
                                                         	<a href="" class="btn btn-sm btn-info btn-rounded" data-toggle="modal" data-target="#myModal">
                                                         		Amount Brakedown
                                                         	</a>
                                                     </td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>2</td>
                                                         <td>5421</td>
                                                         <td>8</td>
                                                         <td>5642</td>
                                                         <td style="color: #FF681B">unpaid</td>
                                                         <td>
                                                         	<a href="" class="btn btn-sm btn-info btn-rounded" data-toggle="modal" data-target="#myModal">
                                                         		Amount Brakedown
                                                         	</a>
                                                     </td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>3</td>
                                                         <td>4784</td>
                                                         <td>8</td>
                                                         <td>7524</td>
                                                         <td style="color: #81EF19">paid</td>
                                                         <td>
                                                         	<a href="" class="btn btn-sm btn-info btn-rounded" data-toggle="modal" data-target="#myModal">
                                                         		Amount Brakedown
                                                         	</a>
                                                     </td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>4</td>
                                                         <td>3544</td>
                                                         <td>8</td>
                                                         <td>4513</td>
                                                         <td style="color: #FF681B">unpaid</td>
                                                         <td>
                                                         	<a href="" class="btn btn-sm btn-info btn-rounded" data-toggle="modal" data-target="#myModal">
                                                         		Amount Brakedown
                                                         	</a>
                                                     </td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>5</td>
                                                         <td>9784</td>
                                                         <td>8</td>
                                                         <td>10325</td>
                                                         <td style="color: #81EF19">paid</td>
                                                         <td>
                                                         	<a href="" class="btn btn-sm btn-info btn-rounded" data-toggle="modal" data-target="#myModal">
                                                         		Amount Brakedown
                                                         	</a>
                                                     </td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>6</td>
                                                         <td>2500</td>
                                                         <td>8</td>
                                                         <td>2700</td>
                                                         <td style="color: #FF681B">unpaid</td>
                                                         <td>
                                                         	<a href="" class="btn btn-sm btn-info btn-rounded" data-toggle="modal" data-target="#myModal">
                                                         		Amount Brakedown
                                                         	</a>
                                                     </td>
                                                </tr>
    
                                               
                                            </tbody>
                                            
                                        </table>
                                    </section>
                                </div>
                                

                                <!-- fisrt table ends -->
                                
                                <!-- modal starts-->
 
						  <div class="modal fade" id="myModal" role="dialog">
						    <div class="modal-dialog modal-md">
						      <div class="modal-content">
						        <div class="modal-header">
						        	<h3 style="text-align: center">Amount Brakedown window</h3>  
						        </div>
						        <div class="modal-body">
						          		<div class="col-sm-12">
                                    <section class="panel panel-default">
                                        <table class="table table-striped m-b-none">
                                            <thead>
                                                <tr>
                                                    <th style="text-align: center">Work</th>
                                                    <th style="text-align: center">Cost</th>
                                                    <th style="text-align: center">Status</th>
                                                </tr>
                                            </thead>
                                            
                                            <tbody>
                                            
                                                <tr style="text-align: center">
                                                    	 <td>labour cost</td>
                                                         <td>500</td>
                                                         <td style="color: #81EF19">done</td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>engine oil change</td>
                                                         <td>350</td>
                                                         <td style="color: #81EF19">done</td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>brake oil change</td>
                                                         <td>30</td>
                                                         <td style="color: #81EF19">done</td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>engine tuning</td>
                                                         <td>500</td>
                                                         <td style="color: #81EF19">done</td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>horn tuning</td>
                                                         <td>200</td>
                                                         <td style="color: #81EF19">done</td>
                                                </tr>
                                                
                                                
    
                                               
                                            </tbody>
                                            
                                        </table>
                                    </section>
                                </div>
						        </div>
						        <div class="modal-footer">	
						          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						        </div>
						      </div>
						    </div>
					  	</div>
					  
					  	<!-- modal ends -->
	                
	            </section>
	        </section>
	 </section> 
</body>
</html>