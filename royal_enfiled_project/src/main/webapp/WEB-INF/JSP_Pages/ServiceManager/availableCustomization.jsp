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


	<section id="content" class="bg-light lter">
        <section class="vbox">
            <section class="scrollable padder">                                               
                                
                <div class="m-b-md" style="display: flex; flex-wrap: wrap; justify-content: space-between;">
                    <h3 class="m-b-none inline" style="font-size: 30pxl; font-weight: bold;">Available Customization</h3>
                </div>
                
                <div class="hbox" style="display: flex; flex-wrap: wrap; justify-content: center;">
                
                	<!-- table starts -->
                	<div class="col-sm-8">
                                    <section class="panel panel-default b-a" style="border-color: #C8C5C3">
                                        <!-- <header class="panel-heading bg-success dk" style="font-size: 25px;">Bullet 350cc</header> -->
                                        <table class="table table-striped m-b-none bg-light lt">
                                            <thead>
                                                <tr>
                                                    <th style="text-align: center">Part Name</th>
                                                    <th style="text-align: center">Cost</th>                      
                                                </tr>
                                            </thead>
                                            
                                            <tbody>
                                            	
                                            	<a:forEach var="data" items="${accessoriesStockList}">
                                            		<tr style="text-align: center">
                                                    	 <td>${data.partName}</td>
                                                         <td>${data.partPrice}</td>                
                                                	</tr>
                                            	</a:forEach>

          
                                            </tbody>
                                            
                                        </table>
                                    </section>
                                </div>
                                <!-- table ends -->
                                
                                
                
               
               </div>
            
                      
        </section>
   </section> 
   </section>

 
</body>
</html>
