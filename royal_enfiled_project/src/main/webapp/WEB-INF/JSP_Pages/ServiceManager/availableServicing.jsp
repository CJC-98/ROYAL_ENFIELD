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
		function saveNewService(){
			
			var name = document.getElementById("serviceName").value;
			var cost = document.getElementById("cost").value;
	
			if(name!="" || cost!=""){
				document.getElementById("form1").submit();
			}
			else{
				alert("please add service and cost");
			}
					
		}
	</script>
		

	<section id="content" class="bg-light lter">
        <section class="vbox">
            <section class="scrollable padder">                                               
                                
                <div class="m-b-md" style="display: flex; flex-wrap: wrap; justify-content: space-between;">
                    <h3 class="m-b-none inline" style="font-size: 30pxl; font-weight: bold;">Available Servicing</h3>
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
                                            	
                                            	<a:forEach var="data" items="${serviceList}">
                                            		<tr style="text-align: center">
                                                    	 <td>${data.serviceName}</td>
                                                         <td>${data.cost}</td>                
                                                	</tr>
                                            	</a:forEach>

          
                                            </tbody>
                                            
                                        </table>
                                    </section>
                                </div>
                                <!-- table ends -->
                                
                                
                    
                    
                    <!-- modal starts-->
 						<form action="addNewService" id="form1">
						  <div class="modal fade" id="myModal" role="dialog">
						    <div class="modal-dialog modal-md">
						      <div class="modal-content">
						      
						        <div class="modal-header">
						        	<h3 style="text-align: center">Add new service</h3>  
						        </div>
						        <div class="modal-body">
						          <div class="form-group"> 
						          	<label>Service Name</label> 
						          	<input type="text" class="form-control" name="serviceName" id="serviceName" placeholder="Enter service name" required> 
						          </div>
                                  <div class="form-group"> 
                                  	<label>Cost</label> 
                                  	<input type="text" class="form-control" name="cost" id="cost" placeholder="Enter cost" required>
                                  </div>
						        </div>
						        <div class="modal-footer">
						          <input type="submit" class="btn btn-primary" data-dismiss="modal" onclick="saveNewService()" value="Submit">
						          <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
						        </div>
						    
						      </div>
						    </div>
					  	</div>
						</form> 
					  	<!-- modal ends -->
               
               </div>
            
                      
        </section>
   </section> 
   </section>

 
</body>
</html>
