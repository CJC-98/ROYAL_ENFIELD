<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Cart</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />

<script type="text/javascript">
function removeItem(productId){
	alert(productId)
		
	document.deletecart.action="deletecart?productId="+productId;
	document.deletecart.submit();
	req.send();
	alert("sent()")
	
}

</script>
</head>

<body>

<section id="content">
                    <section class="vbox">
                        <section class="scrollable padder">


<!--
Lower Header Section 
-->


	<div class="span10">
    
	<div class="well well-small">
		<h1>Check Out <small class="pull-right"> 1 Items are in the cart </small></h1>
	<hr class="soften"/>	

	<table class="table table-bordered table-condensed">
              <thead>
                <tr>
                  <th>Product</th>
                  <th>Description</th>
				   
                  <th>Qty </th>
                  <th>Total</th>
				</tr>
              </thead>
              <tbody>
                <tr>
                <a:forEach items="${data}" var="data"> 
                <%-- <input type="hidden" id="productId" value="${data.productId}"> --%>
                  <td><img width="100" src="${pageContext.request.contextPath}/Resources/images/interceptor.jpg" alt=""></td>
                  <td>Classic 350</td>
                  
                  <td>1 </td>
                  <td>100000</td>
                  </a:forEach>
                </tr>
				
				 <tr>
                  <td colspan="3" class="alignR">Total products:	</td>
                  <td>1</td>
                </tr>
				 <tr>
                  <td colspan="3" class="alignR">Price	</td>
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