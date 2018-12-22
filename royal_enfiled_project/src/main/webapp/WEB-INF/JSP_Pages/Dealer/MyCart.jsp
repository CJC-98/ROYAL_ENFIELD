<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- author shital belokar 
this form is designed to display all cart items of login user 
-->
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %> 
  
 
<!DOCTYPE>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />

<script type="text/javascript">
function removeItem(productId){
	//alert(productId)
		
	document.deletecart.action="deletecart?productId="+productId;
	document.deletecart.submit();
	req.send();
	//alert("sent()")
	
}

</script>
</head>
<form name="deletecart"   method="POST">
<body>			
	
	
		<table class="table table-bordered">
							<tbody>			
				
				
				<th>Model Name</th>
				<th>Image</th>
				<th>Quantity</th>
				<th>Price</th>
			</tr>	
			
	 <a:forEach items="${data1}" var="data">  
	<tr>
	
	<td align="center">
	
					<input type="hidden" id="productId" value="${data.productId}">
					<a:out value="${data.bikeSaleForUser.bikemodel.modelName}"></a:out></td>
					<td align="center"><img src="${pageContext.request.contextPath}/Resources/images/bikeImages/${data.bikeSaleForUser.bikemodel.image}" width="100px"></td>
					<td><a:out value="${data.qty}"></a:out></td> 
			 		<td><a:out value="${data.totalprice}"></a:out></td>
			 		
			 		<td>  
			 		<input type="button" class="btn btn-s-md btn-danger btn-rounded" value="Remove"onclick="removeItem(${data.productId})">
			 		</td>
				</tr>
			 </a:forEach>
				
				<tr>
				
				</tbody>
				 <a:forEach items="${data2}" var="data">  
				<tr>
				<td align="center">
	
					<input type="hidden" id="productId" value="${data.productId}">
					<a:out value="${data.accessories.partName}"></a:out></td>
					<td align="center"><img src="${pageContext.request.contextPath}/Resources/images/bikeImages/${data.accessories.image}" width="100px"></td>
					<td><a:out value="${data.qty}"></a:out></td> 
			 		<td><a:out value="${data.totalprice}"></a:out></td>
			 		
			 		<td>  
			 		<input type="button" class="btn btn-s-md btn-danger btn-rounded" value="Remove"onclick="removeItem(${data.productId})">
			 		</td>
				</tr>
			 </a:forEach>
				
				 <a:forEach items="${data3}" var="data">  
	<tr>
	
	<td align="center">
	
					<input type="hidden" id="productId" value="${data.productId}">
					<a:out value="${data.oldbike.oldBikeModelName}"></a:out></td>
					<td align="center"><img src="${pageContext.request.contextPath}/Resources/images/bikeImages/${data.oldbike.bikeImage}" width="100px"></td>
					<td><a:out value="${data.qty}"></a:out></td> 
			 		<td><a:out value="${data.totalprice}"></a:out></td>
			 		
			 		<td>  
			 		<input type="button" class="btn btn-s-md btn-danger btn-rounded" value="Remove"onclick="removeItem(${data.productId})">
			 		</td>
				</tr>
			 </a:forEach>
			 			
				
		</table>
	<tr><td><h3><strong>Total Price: ${msg}</strong></h3></td></tr>
	
		<br>
		<tr>
										
					<%-- <td> <a href="addtocart?id=${data.bikemodel.modelId}">Buy Now</a></td>
 --%>					
 <a href="DealerDashboardPage"class="btn btn-s-md btn-success btn-rounded">Continue Shopping</a>
 <a href="status"class="btn btn-s-md btn-success btn-rounded">Buy</a>
			</tr>
				
					
				
</div> 

</body>

</form>
</html>
	
					