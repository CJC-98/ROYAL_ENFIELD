<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Cart</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />
</head>
<body>
<section id="content">
                    <section class="vbox">
                        <section class="scrollable padder">


<!--
Lower Header Section 
-->

	<div class="row">
	<div class="span12">
    
	<div class="well well-small">
		<h1>Check Out <small class="pull-right"> 2 Items are in the cart </small></h1>
	<hr class="soften"/>	

	<table class="table table-bordered table-condensed">
              <thead>
                <tr>
                  <th>Product</th>
                  <th>Description</th>
				  <th>	Ref. </th>
                  <th>Avail.</th>
                  <th>Unit price</th>
                  <th>Qty </th>
                  <th>Total</th>
				</tr>
              </thead>
              <tbody>
                <tr>
                  <td><img width="100" src="${pageContext.request.contextPath}/Resources/images/interceptor.jpg" alt=""></td>
                  <td>Items name here<br>Carate : 22<br>Model : n/a</td>
                  <td> - </td>
                  <td><span class="shopBtn"><span class="icon-ok"></span></span> </td>
                  <td>$50.00</td>
                  <td>
					<input class="span1" style="max-width:34px" placeholder="1" id="appendedInputButtons" size="16" type="text" value="2">
				  <div class="input-append">
					<button class="btn btn-mini" type="button">-</button><button class="btn btn-mini" type="button"> + </button><button class="btn btn-mini btn-danger" type="button"><span class="icon-remove"></span></button>
				</div>
				</td>
                  <td>$100.00</td>
                </tr>
				<tr>
                  <td><img width="100" src="${pageContext.request.contextPath}/Resources/images/interceptor.jpg" alt=""></td>
                  <td>Item names and brief details<br>Carate:24 <br>Model:HBK24</td>
                  <td> - </td>
                  <td><span class="shopBtn"><span class="icon-ok"></span></span> </td>
                  <td>$348.42</td>
                  <td>
				  <input class="span1" style="max-width:34px" placeholder="1" size="16" type="text">
				  <div class="input-append">
					<button class="btn btn-mini" type="button">-</button><button class="btn btn-mini" type="button">+</button><button class="btn btn-mini btn-danger" type="button"><span class="icon-remove"></span></button>
				</div>
				  </td>
                  <td>$348.42</td>
                </tr>
               
				 <tr>
                  <td colspan="6" class="alignR">Total products:	</td>
                  <td> $448.42</td>
                </tr>
				 <tr>
                  <td colspan="6" class="alignR">Total products:	</td>
                  <td class="label label-primary"> $448.42</td>
                </tr>
				</tbody>
            </table><br/>
		
		
            
					  </div>
					</form> 
				  </td>
				  </tr>
              </tbody>
            </table>		
	<a href="products.html" class="shopBtn btn-large"><span class="icon-arrow-left"></span> Continue Shopping </a>
	<a href="login.html" class="shopBtn btn-large pull-right">Buy <span class="icon-arrow-right"></span></a>

</div>
</div>
</div>
<!-- 
Clients 
-->

<!--
Footer
-->

 </div>
</footer>
</div>
 <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/app.v1.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/easypiechart/jquery.easy-pie-chart.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/sparkline/jquery.sparkline.min.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.min.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.tooltip.min.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.resize.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.grow.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/demo.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/calendar/bootstrap_calendar.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/calendar/demo.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/sortable/jquery.sortable.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/app.plugin.js"></script>
</body>
</html>