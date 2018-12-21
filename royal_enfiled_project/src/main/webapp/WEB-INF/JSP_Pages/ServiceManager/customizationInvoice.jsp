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
	<%-- colorlist
	<a:forEach items="${colors}" var="color">
		<a:out value="${color}"></a:out><br>
	</a:forEach> --%>
	
	<section id="content" class="bg-light lter">
	        <section class="vbox">
	            <section class="scrollable padder">                                               
	                                
	                <div class="m-b-md">
	                    <h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">Customization Invoice</h3>
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
                                            <a:forEach var="data" items="${bikeCustomizationsList }">
                                            <tr style="text-align: center">
                                            <td>${data.CustomizationInvoice.customizationInvoiceId }</td>
                                            <td>${data.CustomizationInvoice.amount }</td>
                                            <td>${data.CustomizationInvoice.customizationCGstPercent }</td>
                                            <td>${data.CustomizationInvoice.customizationsGstPercent }</td>
                                            <td>${data.CustomizationInvoice.totalAmount }</td>
                                            <td style="color: #FF681B">${ data.CustomizationInvoice.paymentStatus}</td>
                                            <td>
                                            <a href="" class="btn btn-md-info btn-rounded" data-toggle="modal">
                                            Amount Details</a>
                                            </td>
                                            </tr>
                                            </a:forEach>
                                               
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
						        	<h3 style="text-align: center">Amount Details</h3>  
						        </div>
						        <div class="modal-body">
						          		
                                    <section class="panel panel-default">
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
                                                    	 <td>brake change</td>
                                                         <td>500</td>
                                                         <td style="color: #81EF19">done</td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>silencer change</td>
                                                         <td>350</td>
                                                         <td style="color: #81EF19">done</td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>tail light change</td>
                                                         <td>300</td>
                                                         <td style="color: #81EF19">done</td>
                                                </tr>
                    
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