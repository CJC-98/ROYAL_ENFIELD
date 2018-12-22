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
    
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>

<body>
	
	<script>
		function submitWork(){
			alert("your work is submitted");
		}
	</script>

	<section id="content"  class="bg-light lter">
	        <section class="vbox">
	            <section class="scrollable padder">                                               
	               <form action="submitCustomizationWork">                 
	                <div class="m-b-md hbox" style="display: flex; flex-wrap: wrap; align-items: flex-end; justify-content: space-between;">
                    	<h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">
                    		In-progress Customization
                    	</h3>
                    	<input class="btn btn-md btn-warning rounded m-r" type="submit" value="Submit Work">
                	</div>     
	               
	                <!-- fisrt table starts -->
	                <a:forEach var="data" items="${bikeCustomizationList}">
	                <div class="row">
                         <div class="col-sm-12">
                             <section class="panel panel-default">
                                          <header class="panel-heading bg-dark lter" style="font-size: 20px; color: white; font-weight: bold; display: flex; flex-wrap: wrap; align-items: flex-end; justify-content: space-between;">
                                          	${data.customizationBikeInfo.modelName} (
                                          		<a:choose>
                                          		          <a:when test="${data.customizationBikeInfo.plateNumber !=''}">
				                                                 ${data.customizationBikeInfo.plateNumber}
														  </a:when>
														  <a:otherwise>
					                                             ${data.customizationBikeInfo.chasisNumber}
														  </a:otherwise>
												</a:choose>
                                          	)
                                          	
                                          </header>
                                                
                                          <table class="table table-striped m-b-none">
                                                      
                                                <thead>
                                                                
                                                     <tr>   
                                                         <th style="text-align: center;">Part Id</th>
                                                         <th style="text-align: center;">Part</th>
                                                         <th style="text-align: center;">Cost</th>
                                                         <th style="text-align: center;">Check</th>
                                                     </tr>
                                                </thead>
                                                
                                                <tbody>
                                                       
                                                   <a:forEach var="part" items="${data.customizationChart}">     
                                                      <tr style="text-align: center;">
                                                         <td>${part.customizationChartId}</td>
                                                         <td>${part.part}</td>
                                                         <td>${part.cost}</td>
                                                         <td>
                                                         	<a:choose>
																	  <a:when test="${part.status == 'done'}">
																			 <div> 
				                                                         		<label style="color: #81EF19">
				                                                         			work done
				                                                    			</label> 
				                                                    		</div>
																	  </a:when>
																	  <a:otherwise>
																			  <div class="checkbox"> 
					                                                         		<label> 
					                                                         			<input type="checkbox" name="workStatusChange" value="${part.customizationChartId}">
					                                                    			</label> 
					                                                        	</div>
																	  </a:otherwise>
																</a:choose>
                                                         </td>
                                                      </tr>
                                                   </a:forEach>   
                                                      
                                                      <tr class="progress" style="height:30px">
	                                                   
														    <div class="progress-bar bg-success progress-bar-striped progress-bar-animated" 
														    	style="width:${data.customizationProgressPercent}%;height:20px">${data.customizationProgressPercent}%
														    </div>
														 
                                                      </tr>
        
                                                      
                                                    </tbody>

                                             </table>
                                                     
                             </section>
                                         
                        </div>
                    </div>
                    </a:forEach>
                    </form>
                    <!-- first record ends-->
                    

                  
                     
	            </section>
	        </section>
	 </section> 
	
	 
</body>
</html>