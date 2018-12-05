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
                                
                <div class="m-b-md" style="display: flex; flex-wrap: wrap; justify-content: space-between;">
                    <h3 class="m-b-none inline" style="font-size: 30pxl; font-weight: bold;">Available Services</h3>
                    <a href="" class="btn btn-lg btn-success btn-rounded" data-toggle="modal" data-target="#myModal" style="margin-top: 20px">Add new Service</a>
                </div>
                
                <div class="hbox" style="display: flex; flex-wrap: wrap; justify-content: center;">
                
                	<!-- table starts -->
                	<div class="col-sm-8">
                                    <section class="panel panel-default b-a" style="border-color: #C8C5C3">
                                        <!-- <header class="panel-heading bg-success dk" style="font-size: 25px;">Bullet 350cc</header> -->
                                        <table class="table table-striped m-b-none bg-light lt">
                                            <thead>
                                                <tr>
                                                    <th style="text-align: center">Service Name</th>
                                                    <th style="text-align: center">Cost</th>                      
                                                </tr>
                                            </thead>
                                            
                                            <tbody>
                                            
                                                <tr style="text-align: center">
                                                    	 <td>Engine oil change</td>
                                                         <td>350</td>                
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                         <td>rake oil change</td>
                                                         <td>50</td> 
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                         <td>Chain oil</td>
                                                         <td>30</td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                         <td>Chain spray</td>
                                                         <td>40</td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                         <td>Washing</td>
                                                         <td>100</td> 
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                         <td>Painting</td>
                                                         <td>2000</td> 
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                         <td>Suspenion tuning</td>
                                                         <td>600</td> 
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                         <td>Engine tuning</td>
                                                         <td>1200</td> 
                                                </tr>
                                                
          
                                            </tbody>
                                            
                                        </table>
                                    </section>
                                </div>
                                <!-- table ends -->
                                
                                
                    
                    
                    <!-- modal starts-->
 
						  <div class="modal fade" id="myModal" role="dialog">
						    <div class="modal-dialog modal-md">
						      <div class="modal-content">
						        <div class="modal-header">
						        	<h3 style="text-align: center">Add new service</h3>  
						        </div>
						        <div class="modal-body">
						          <div class="form-group"> 
						          	<label>Service Name</label> 
						          	<input type="text" class="form-control" placeholder="Enter service name"> 
						          </div>
                                  <div class="form-group"> 
                                  	<label>Cost</label> 
                                  	<input type="text" class="form-control" placeholder="Enter cost">
                                  </div>
						        </div>
						        <div class="modal-footer">
						          <button type="button" class="btn btn-primary" data-dismiss="modal">Submit</button>	
						          <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
						        </div>
						      </div>
						    </div>
					  	</div>
					  
					  	<!-- modal ends -->
               
               </div>
            
                      
        </section>
   </section> 
   </section>

 
</body>
</html>
