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
		function getCustomizationDetails(customizationId){

			var req = new XMLHttpRequest();		
			req.open("GET","getCustomizationDetails?custId="+customizationId,true);
			req.send(); 
			
			var table = document.getElementById("customizationDataTable");
			
			
			
			 while(table.rows.length>1){
				table.deleteRow(table.rows.length-1);
			 } 
			
			req.onreadystatechange=function(){
					
				if(req.readyState==4 && req.status==200){
					
					var list = JSON.parse(req.responseText);	
					
					for(index = 0; index < list.length; index++){

					
						var row = table.insertRow(1);
						
						var cell1 = row.insertCell(0);
						var cell2 = row.insertCell(1);
						var cell3 = row.insertCell(2);
						
						cell1.innerHTML =  list[index].part;
						cell2.innerHTML =  list[index].cost;
						cell3.innerHTML =  list[index].status;
						
						cell1.style.textAlign = "center";

						
						cell3.style.color = "red";
						
					}
				}
			}
		}
		
		
		
		
		function CustomizationInprogressPage(customizationId){
			var req = new XMLHttpRequest();		
			req.open("GET","CustomizationInprogressPage?customizationId="+customizationId,true);
			req.send();
			
			req.onreadystatechange=function(){
				if(req.readyState==4 && req.status==200){
					location.reload();
				}
			}
		}
		
		
		
	</script>

	<section id="content" class="bg-light lter">
        <section class="vbox">
            <section class="scrollable padder">                                               
                                
                <div class="m-b-md">
                    <h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">Pending Customization</h3>
                </div>
                
                <!-- fisrt table starts -->
	                  <a:forEach var="data" items="${bikeCustomizationsList}">
	                <div class="row">
                         <div class="col-sm-12" >
                             <section class="panel panel-default" >
                                          <header class="panel-heading bg-warning dk" style="font-size: 20px; font-weight: bold; display: flex; flex-wrap: wrap; align-items: flex-end; justify-content: space-between;">
                                         
                                          	<a:choose>
																	  <a:when test="${data.customizationBikeInfo.plateNumber !=''}">
																	 
																			 <div> 
				                                                         		
				                                                         			${data.customizationBikeInfo.modelName} ( ${data.customizationBikeInfo.plateNumber} )
				                                                    			 
				                                                    		</div>
																	  </a:when>
																	  <a:otherwise>
																			  <div> 
					                                                         		 
					                                                         			${data.customizationBikeInfo.modelName} ( ${data.customizationBikeInfo.chasisNumber} )
					                                                    			 
					                                                        	</div>
																	  </a:otherwise>
																</a:choose>
																
                                          </header>
                                                
                                          <table class="table table-striped m-b-none" >
                                                      
                                                <thead >
                                                                
                                                     <tr>   
                                                         <th style="text-align: center;">Customization Id</th>
                                                         <th style="text-align: center;">Appointment Date</th>
                                                         <th style="text-align: center;">Customization Details</th>
                                                         <th style="text-align: center;">Start Customization</th>
                                                     </tr>
                                                </thead>
                                                
                                                <tbody>
                                                        
                                                      <tr style="text-align: center;">
                                                         <td>${data.bikeCustomizationId}</td>
                                                         <td>${data.appointmentDate}</td>
                                                         <td>
                                                         	<span onclick="getCustomizationDetails('${data.bikeCustomizationId}')"><a href="#myModal" data-toggle="modal" data-target="#myModal" class="btn btn-md btn-info m-r rounded">Customization Details</a></span>
                                                         </td>     
                                                         <td>                                                  	
                                                         	<span onclick="CustomizationInprogressPage('${data.bikeCustomizationId}')">
                                                         	<a class="btn btn-md btn-primary m-r rounded">
                                                         		Start Customization
                                                         	</a>
                                                         	</span>
                                                         </td>                                           
                                                      </tr>
                                     
                                                    </tbody>

                                             </table>
                                                     
                             </section>
                                         
                        </div>
                    </div>
                    </a:forEach>
                    <!-- modal starts-->
 
						  <div class="modal fade" id="myModal" role="dialog">
						    <div class="modal-dialog modal-md">
						      <div class="modal-content">
						        <div class="modal-header">
						        	<h3 style="text-align: center">Customization Details</h3>  
						        </div>
						        <div class="modal-body">
						          		
                                    <section class="panel panel-default">
                                        <table class="table table-striped m-b-none" id="customizationDataTable">
                                            <thead>
                                                <tr>
                                                    <th style="text-align: center">Part</th>
                                                    <th style="text-align: center">Cost</th>
                                                    <th style="text-align: center">Status</th>
                                                </tr>
                                            </thead>
                                            

                                            </tbody>
                                            
                                        </table>
                                    </section>
                               
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
