<!DOCTYPE html>
<html lang="en" class="app">
<!-- Mirrored from flatfull.com/themes/note/invoice.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:17:02 GMT -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<head>
    <meta charset="utf-8" />
    <title>Account | Invoice </title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <link rel="stylesheet" href="css/font.css" type="text/css" />
    <link rel="stylesheet" href="css/app.v1.css" type="text/css" />
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body class="">


    <section class="vbox">
      
      
       <c:set var="id" value="${0}" /> 
       <c:set var="SubTotal" value="${0}"/>
        
        <section>
            <section class="hbox stretch">               
                <section id="content">
                    <section class="vbox bg-white">                   
                        <header class="header b-b b-light hidden-print">						
                            <p>Invoice</p>                          
                        </header>
                        
                        <section class="scrollable wrapper">                        	
                            <span class="pull-left thumb-sm"> 
                                  <img src="${pageContext.request.contextPath}/Resources/Royal Enfield images/RL_logo3.jpg" class="img-circle"> 
                            </span>               
                            <div class="row">
                                <div class="col-xs-5">
                                    <h4>Royal Enfield</h4>
                                    <p><a href="#">www.RoyalEnfield.com</a></p>
                                    <p>1st Floor <br> Vikas Mitra Mandal Chowk Road, <br> Near Karve Nagar Stop,Pune-52 </p>
                                    <p> Contact no:- +91-8888022204<br> </p>
                                </div>
                                <div class="col-xs-6 text-right">
                                    <p class="h4">Date</p>
                                    <h5>
                                    	${date}
                                    </h5> 								
                                </div>
                            </div>
                            
                            <div class="well m-t">
                                <div class="row">
                                    <div class="col-xs-6"> <strong>TO:</strong>
                                    
                                    	
                                    	
                                        <h4>${regi.contact.name}</h4>
                                        <p> ${regi.contact.address.city}<br> ${regi.contact.address.state}<br> ${regi.contact.address.country}<br>
                                            Phone: ${regi.contact.mobile}<br> Email: ${regi.login.email}<br> </p>                                   	
                                    </div>
                                </div>
                            </div>
                            <p class="m-t m-b">Order date: <strong>${date}</strong><br>                            
                            	Order status: <span class="label bg-success">${purchaseSatus}</span><br>                             
                             </p>
                            <div class="line"></div>
                            
                            			
                            
                            
                            
                            
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th width="60">QTY</th>
                                        <th width="340">DESCRIPTION</th>
                                        <th width="140">UNIT PRICE</th>
                                        <th width="90">TOTAL</th>
                                    </tr>
                                </thead>
                                <tbody>
                                
                                	
                        			
                              		<c:forEach var="l" items="${list}"> 
                              		 
                              		 	<c:set var="id" value="${l.registration.registrationId}" /> 
                              		 	
                              		 	
                              		 
                                	 	<c:set var="BikeTotal" value="${0}"/>
                                	 	<c:set var="ATotal" value="${0}"/>
                                	 	
                                	 	
                                		<c:set var="qty" value="${l.qty}"/>
                                		<c:set var="bikeOnRoadPrice" value="${l.bikeSaleForUser.bikeOnRoadPrice}"/>
                                		<c:set var="BikeTotal" value="${qty * l.bikeSaleForUser.bikeOnRoadPrice}" />                                     		                              	
                                		          
                                		<c:set var="Aqty" value="${qty}" /> 
                                		<c:set var="ApartPrice" value="${l.accessories.partPrice}" />
                                		<c:set var="ATotal" value="${qty * l.accessories.partPrice}" />
                                		
                                		<c:set var="oldBikeqty" value="${qty}" /> 
                                		<c:set var="oldBikePrice" value="${l.oldbike.newBikeStock.bikePrice}" />
                                		<c:set var="OldBikeTotal" value="${qty * l.oldbike.newBikeStock.bikePrice}" />
                                		                      		
                                		<c:set var="SubTotal" value="${ATotal + BikeTotal + OldBikeTotal}" />   		  		
                                		
                                		<tr>				 
                                			<td> <c:out value="${qty}"/> </td>
                                			<td> <c:out value="${l.bikeSaleForUser.bikemodel.modelName}"/> </td>
                                			<td> <c:out value="${bikeOnRoadPrice}"/> </td>                    				
                                			<td> <c:out value="${BikeTotal}"/> </td>              			
                                		</tr>
                                		<tr>				 
                                			<td> <c:out value="${qty}"/> </td>
                                			<td> <c:out value="${l.accessories.partName}"/> </td>
                                			<td> <c:out value="${l.accessories.partPrice}"/> </td>                    				
                                			<td> <c:out value="${ATotal}"/> </td>              			
                                		</tr>
                                		<tr>				 
                                			<td> <c:out value="${qty}"/> </td>
                                			<td> <c:out value="${l.oldbike.newBikeStock.bikeModel.modelName}"/> </td>
                                			<td> <c:out value="${l.oldbike.newBikeStock.bikePrice}"/> </td>                    				
                                			<td> <c:out value="${OldBikeTotal}"/> </td>              			
                                		</tr>
                                  	</c:forEach>    
                                	                                                               	
	                                    <tr>
	                                        <td colspan="3" class="text-right"><strong>Subtotal</strong></td>
	                                        <td> <c:out value="${SubTotal}"/> </td>
	                                    </tr>   
	                                    
	                                    <tr>
	                                        <td colspan="3" class="text-right no-border"><strong>Total</strong></td>
	                                        <td><strong><c:out value="${SubTotal}"/></strong></td>
	                                    </tr>
	                                </tbody>
	                            </table>
	                            
	                            <div>
	                            	<form action="aa">
	                            	<input type="hidden" name="customerId" value="${id}">
	                            	<input type="hidden" name="ammount" value="${SubTotal}">
	                            	
	                            	<button type="submit" class="btn btn-s-md btn-primary pull-left" >Pay</button>
	                            	<button href="#" class="btn btn-s-md btn-danger pull-right" onClick="window.print();">Print</button>
	                            	</form>
	                            </div>
                      
                        </section>
                        
                       		 
                                
                    </section> 
                                   
                    <a href="#" class="hide nav-off-screen-block" data-toggle="class:nav-off-screen, open"
                        data-target="#nav,html"></a>
                </section>
                <aside class="bg-light lter b-l aside-md hide" id="notes">
                    <div class="wrapper">Notification</div>
                </aside>
            </section>
        </section>
    </section> <!-- Bootstrap -->
    <!-- App -->
    <script src="js/app.v1.js"></script>
    <script src="js/app.plugin.js"></script>
        
        
    <!--  <script>
	  function pay(sub, id){
		  var req = new XMLHttpRequest();		
			req.open("GET","aa?ammount="+sub+"&&customerId="+id,true);
			req.send();
			
	  }
	</script> -->
	
</body>


	

<!-- Mirrored from flatfull.com/themes/note/invoice.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:17:02 GMT -->

</html>