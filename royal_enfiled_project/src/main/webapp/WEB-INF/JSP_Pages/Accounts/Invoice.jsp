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
      
      
        
        
        <section>
            <section class="hbox stretch">               
                <section id="content">
                    <section class="vbox bg-white">
                        <header class="header b-b b-light hidden-print"> 
                        	<button href="#" class="btn btn-sm btn-info pull-right" onClick="window.print();">Print</button>
                            <p>Invoice</p>
                        </header>
                        
                        <section class="scrollable wrapper">
                        	<img src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/images/logo1.png"
                                            class="img-circle">
                                          
                            <div class="row">
                                <div class="col-xs-6">
                                    <h4>Complete Java Clases..</h4>
                                    <p><a href="http://www.completejavaclasses.com/">www.completejavaclasses.com</a></p>
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
                                        <h4>Nagesh Nagshakti</h4>
                                        <p> 3rd Floor<br> lane no 6, Karvenagar 411052<br> Maharashtra, INDIA<br>
                                            Phone: 957-958-6717<br> Email: nageshwarbadkhal22@gmail.com<br> </p>
                                    </div>
                                    <div class="col-xs-6"> <strong>SHIP TO:</strong>
                                        <h4>Nagesh Nagshakti</h4>
                                        <p> 3rd Floor<br> lane no 6, Karvenagar 411052<br> Maharashtra, INDIA<br>
                                            Phone: 957-958-6717<br> Email: nageshwarbadkhal22@gmail.com<br> </p>
                                    </div>
                                </div>
                            </div>
                            <p class="m-t m-b">Order date: <strong>${date}</strong><br> Order status: <span class="label bg-success">Unpaid</span><br>
                                Order ID: <strong>#9399034</strong> </p>
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
                                
                                	<c:set var="SubTotal" value="${0}" />
                        			
                                	<c:forEach var="l" items="${list}">
                                		<c:set var="Total" value="${0}"/>
                                		<c:set var="qty" value="${l.qty}"/>
                                		<c:set var="unitcost" value="${l.unitCost}"/>
                                		<c:set var="Total" value="${l.qty * l.unitCost}" />                            		
                                		<c:set var="SubTotal" value="${SubTotal + Total}" />   		
                                		<tr>				 
                                			<td> <c:out value="${qty}"/> </td>
                                			<td> <c:out value="${l.name}"/> </td>
                                			<td> <c:out value="${l.unitCost}"/> </td>                    				
                                			<td> <c:out value="${Total}"/> </td>              			
                                		</tr>
                                	</c:forEach>
	                                    <tr>
	                                        <td colspan="3" class="text-right"><strong>Subtotal</strong></td>
	                                        <td> <c:out value="${SubTotal}"/> </td>
	                                    </tr>   
	                                    <tr>
	                                        <td colspan="3" class="text-right no-border"><strong>Shipping</strong></td>
	                                        <td>$0.00</td>
	                                    </tr>
	                                    <tr>
	                                        <td colspan="3" class="text-right no-border"><strong>VAT Included in Total</strong></td>
	                                        <td>$0.00</td>
	                                    </tr>
	                                    <tr>
	                                        <td colspan="3" class="text-right no-border"><strong>Total</strong></td>
	                                        <td><strong><c:out value="${SubTotal}"/></strong></td>
	                                    </tr>
	                                </tbody>
	                            </table>
                        </section>
                    </section> <a href="#" class="hide nav-off-screen-block" data-toggle="class:nav-off-screen, open"
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
</body>


	

<!-- Mirrored from flatfull.com/themes/note/invoice.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:17:02 GMT -->

</html>