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
<<<<<<< HEAD
<script>
		function getAmountDetails(serviceId){
			var req = new XMLHttpRequest();		
			req.open("GET","getAmountDetails?serviceId="+serviceId,true);
			req.send(); 
			
			var table = document.getElementById("amountDataTable");
			
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
						
						cell1.innerHTML =  list[index].work;
						cell2.innerHTML =  list[index].cost;
						cell3.innerHTML =  list[index].status;
						
						cell1.style.textAlign = "center";

						
						cell3.style.color = "red";
						
					}
				}
			}
		}
		

		
	</script>
=======
	
	<script>
		function getServiceDetails(serviceId){

  			var req = new XMLHttpRequest();		
			req.open("GET","getServiceDetails?serviceId="+serviceId,true);
			req.send(); 
			
			var table = document.getElementById("serviceTable");
			
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
						
						cell1.innerHTML =  list[index].work;
						cell2.innerHTML =  list[index].cost;
						cell3.innerHTML =  list[index].status;
						
						cell1.style.textAlign = "center";
						cell2.style.textAlign = "center";
						cell3.style.textAlign = "center";
						
						if(list[index].status == 'done'){
							cell3.style.color = "#81EF19";
						}
						else{
							cell3.style.color = "#FF681B";
						}
						
						
					}
				}
			}  
		}
	</script>
	
>>>>>>> branch 'serviceManagerTeamBranch' of https://github.com/CJC-98/ROYAL_ENFIELD.git
	<section id="content" class="bg-light lter">
	        <section class="vbox">
	            <section class="scrollable padder">                                               
	                                
	                <div class="m-b-md">
	                    <h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">Servicing Invoice</h3>
	                </div>
	                
	               <!-- first table starts -->
	              <div class="col-sm-12">
                                    <section class="panel panel-default">
                                        <table class="table table-striped m-b-none b-a">
                                               <thead>
                                                <tr>
                                                    <th style="text-align: center">Invoice Id</th>
                                                    <th style="text-align: center">Amount</th>
                                                    <th style="text-align: center">S-GST(%)</th>
                                                    <th style="text-align: center">C-GST(%)</th>
                                                    <th style="text-align: center">Total Amount</th>
                                                    <th style="text-align: center">Payment Status</th>
                                                    <th style="text-align: center">Details</th>
                                                </tr>
                                            </thead>
                                            
                                            <tbody>
                                             <a:forEach var="data" items="${bikeServicingList}">
<<<<<<< HEAD
                                     <tr style="text-align: center">
                                                    	 <td>${data.servicingInvoice.servicingInvoiceId}</td>
                                                         <td>${data.servicingInvoice.amount}</td>
                                                         <td>${data.servicingInvoice.totalAmount}</td>
                                                         <td>${data.servicingInvoice.serviceCGstPercent}</td>
                                                         <td>${data.servicingInvoice.serviceSGstPercent}</td>
                                                         <td style="color: #FF681B">${data.servicingInvoice.paymentStatus}</td>
                                                         <td>
                                                         	
                                                         	<a href="#myModal" data-toggle="modal" data-target="#myModal" class="btn btn-md btn-info m-r rounded"><span onclick="getAmountDetails('${data.bikeServicingId}')">Amount Details</span></a>

                                                         </td>     
                                                     
                                                </tr>

                                                  </a:forEach>
                                             </tbody>
=======
		                                         <tr style="text-align: center">
	                                                    	 <td>${data.servicingInvoice.servicingInvoiceId}</td>
	                                                         <td>${data.servicingInvoice.amount}</td>
	                                                         <td>${data.servicingInvoice.serviceCGstPercent}</td>
	                                                         <td>${data.servicingInvoice.serviceSGstPercent}</td>
	                                                         <td>${data.servicingInvoice.totalAmount}</td>
	                                                         <td style="color: #81EF19">${data.servicingInvoice.paymentStatus}</td>
	                                                         <td>
	                                                         	<span onclick="getServiceDetails('${data.bikeServicingId}')">
	                                                         		<a class="btn btn-md btn-info btn-rounded" data-toggle="modal" data-target="#myModal">
	                                                         			Amount Details
	                                                         		</a>
	                                                         	</span>
	                                                     </td>
	                                                </tr>
                                              </a:forEach>
                                            </tbody>
>>>>>>> branch 'serviceManagerTeamBranch' of https://github.com/CJC-98/ROYAL_ENFIELD.git
                                          

                                             </tbody>
                       y
                                        </table>
                                    </section>
                                </div>
                                

                                <!-- fisrt table ends -->
                                
                               <!-- modal starts-->
 
						  <div class="modal fade"  id="myModal" role="dialog">
						    <div class="modal-dialog modal-md">
						      <div class="modal-content">
						        <div class="modal-header" >

						        	<h3 style="text-align: center" >Amount Details </h3>  
						        	 
						        </div>
						        
						        <div class="modal-body">
						          		
                                    <section class="panel panel-default">
<<<<<<< HEAD
                                        <table class="table table-striped m-b-none" id="amountDataTable">
=======
                                        <table class="table table-striped m-b-none" id="serviceTable">
>>>>>>> branch 'serviceManagerTeamBranch' of https://github.com/CJC-98/ROYAL_ENFIELD.git
                                            <thead>
                                                <tr>
                                                    <th style="text-align: center">Work</th>
                                                    <th style="text-align: center">Cost</th>
                                                    <th style="text-align: center">Status</th>
                                                </tr>
                                            </thead>
                                          
                                            
                                            <tbody>
<<<<<<< HEAD

                    
=======
>>>>>>> branch 'serviceManagerTeamBranch' of https://github.com/CJC-98/ROYAL_ENFIELD.git
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


</body>
</html>
