<!DOCTYPE html>
<html lang="en" class="app">
<!-- Mirrored from flatfull.com/themes/note/invoice.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:17:02 GMT -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<head>
    <meta charset="utf-8" />
    <title>Account | NewBikeStock </title>
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
                        	<button href="#" class="btn btn-s-md btn-danger pull-right" onClick="window.print();">Print</button>                         	
                            <p>New Bike Stock</p> 
                           
                        </header>
                        
                        <section class="scrollable wrapper">                        	
                            <span class="pull-left thumb-sm"> 
                                  <img src="${pageContext.request.contextPath}/Resources/Royal Enfield images/RL_logo3.jpg" class="img-circle"> 
                            </span>               
     
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th width="60">Bike Id</th>
                                        <th width="130">Arrival Date</th>
                                        <th width="140">Bike Price</th>
                                        <th width="120">Chasis Number</th>
                                    </tr>
                                </thead>
                                <tbody>
                                
                                	
                        			
                                	<c:forEach var="l" items="${list}">                               			
                                		<tr>				 
                                			<td> <c:out value="${l.bikeId}"/> </td>
                                			<td> <c:out value="${l.arrivalDate}"/> </td>
                                			<td> <c:out value="${l.bikePrice}"/> </td>                    				
                                			<td> <c:out value="${l.chasisNumber}"/> </td>              			
                                		</tr>
                                	</c:forEach>                   
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