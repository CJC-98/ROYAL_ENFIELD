<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %> 
  
 
<!DOCTYPE>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />

<script type="text/javascript">
function getPrice(){
	//alert("getPrice()")
	var quantity=document.getElementById("qty").value;
	//alert(quantity)	
	var price=document.getElementById("sp").value;
	//alert(sp)
	var total=price*quantity;
	//alert(total)
	document.getElementById("totalprice").value=total;

	
}



function saveCart(oldBikeStockId){
	//alert(oldBikeStockId)
	
	
	var qty=document.getElementById("qty").value;
	//alert(qty)
	var total=document.getElementById("totalprice").value;
	//alert(total)
	document.savecart.action="savecart2?id="+oldBikeStockId+"&qty="+qty+"&total="+total;
	document.savecart.submit();
	req.send();
	
	
}

</script>
</head>
<h1>Cart Page</h1>
<form name="savecart" method="POST">
<body>	
	
	
	
	
		
		


	<table class="table table-bordered">
							<tbody>
							<tr>
								<th></th>
								<th>Product Name</th>
								<th>Image</th>	
								<th>Bike Price</th>
								<th>Quantity</th>
									<th>Total Price</th>
								</tr>
								<tr>
	
	<td align="center">
					<td>
					<input type="hidden" id="oldBikeStockId" value="${data.oldBikeStockId}">
					<a:out value="${data.oldBikeModelName}"></a:out></td>
					<td align="center"><img src="${pageContext.request.contextPath}/Resources/images/bikeImages/${data.bikeImage}" width="100px"></td>
					<td align="center"><input readonly="readonly" type="text" id="sp" value="${data.newPrice}">
					</td>		
			<td> <input readonly="readonly" type='text'  id='qty' name="qty" value="1" onkeyup="getPrice()" />
			 
			 </td>
			 <td><input readonly="readonly" type="text" id="totalprice" value="${data.newPrice}"></td>
				</tr>
		
														</tbody>
							</table>
<tr>
					<td> </td>
					<input type="button"class="btn btn-s-md btn-primary btn-rounded"value="save To Cart" onclick="saveCart('${data.oldBikeStockId}')">
					<%-- <td> <a href="addtocart?id=${data.bikemodel.modelId}">Buy Now</a></td>
 --%>					<a href="DealerDashboardPage"class="btn btn-s-md btn-success btn-rounded">Continue Shopping</a>

					</tr>
		
</body>

</form>
</html>
	
					