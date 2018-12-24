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

/* function status(){
	document.deletecart.action="status";
	document.deletecart.submit();
	req.send();
} */
function removeItem(productId){
	//alert(productId)
		
	document.deletecart.action="deletecart?productId="+productId;
	document.deletecart.submit();
	req.send();
	//alert("sent()")
	
}

</script>
<style>
body {font-family: Arial, Helvetica, sans-serif;}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  padding-top: 100px; /* Location of the box */
  left: 450px;
  top: 0;
  width: 90%; /* Full width */
  height: 1000%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(255,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
}

/* Modal Content */
.modal-content {
  background-color: #9fff80;
  margin: auto;
  padding: 20px;
  border: 1px solid #888;
  width: 80%;
  h1 {
  color: #000000;
}
  
}



.close:hover,
.close:focus {
  color: #000;
  text-decoration: none;
  cursor: pointer;
}
</style>

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
 <a href="continueShopping"class="btn btn-s-md btn-success btn-rounded">Continue Shopping</a>
 <input type="button"  value="Buy Now" class="btn btn-s-md btn-success btn-rounded" id="myBtn">
	<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
  
    <p><h1>Order Place successfully</h1><br>
    <a href=" status"class="btn btn-s-md btn-dark btn-rounded">Continue Shopping</a>
    </p>
  </div>

</div>

<script>
// Get the modal
var modal = document.getElementById('myModal');

// Get the button that opens the modal
var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal 
btn.onclick = function() {
  modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it


</script>			</tr>
				
					
				
</div> 

</body>

</form>
</html>
	
					