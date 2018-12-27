<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- author sonika 
display old bike specification
-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body class="bg-dark">
	<section id="content">
		<section class="vbox">
			<section class="scrollable padder">
				<h1>OldBike View</h1>

				<div class="thumbnail">
					<img src="${pageContext.request.contextPath}/Resources/images/bikeImages/${data.bikeImage}"	width="276px" height="376px" alt="">
					<div class="caption cntr">
						<centre>
						<h4><p><a:out value="${data.oldBikeModelName}"></a:out></p></h4>
						</centre>
						<p>
							<h5><strong><a:out value="${data.newPrice}"></a:out></strong></h5>
						</p>
<h4><a href="addcart2?id=${data.oldBikeStockId}" title="add to cart" class="btn btn-s-md btn-primary btn-rounded">Add to cart</a>
						</h4>
			
						<p>
							<strong> Specification</strong>
						</p>
						<table class="table table-striped m-b-none">
							<tbody>
									<tr>
									<td>Mileage</td>
									<td><a:out value="${data.bikeMileage}"></a:out></td>
								</tr>
								<tr>
									<td>Purchase Date</td>
									<td><a:out value="${data.bikePurchaseDate}"></a:out></td>
								</tr>
								<tr>
									<td>Registration Number</td>
									<td><a:out value="${data.registrationNo}"></a:out></td>
								</tr>
								<tr>
									<td>colour</td>
									<td><a:out value="${data.colors}"></a:out></td>
								</tr>
                            
<tr>
									<td>Total Km running</td>
									<td><a:out value="${data.totalKmRun}"></a:out></td>
								</tr>
							</tbody>
							</table>

						<br class="clr">
					</div>
				</div><%-- 

<table style="border:1px solid black; padding: 5px">
			<tr style="border:1px solid black;">			
				
				 
				<th>ModelName</th>
				<th>BikeImage</th>
				<th>ModelYear</th>
				<th>New price</th>
				<th>Mileage</th>
				<th>PurchaseDate</th>
				<th>Registration no</th>
				<th>Color</th>
				<th>Km Run</th>
				
			</tr>		
			<tr>
	
					
					<td align="center"><a:out value="${data.oldBikeModelName}"></a:out></td>
					<td align="center"><img src="${pageContext.request.contextPath}/Resources/images/bikeImages/${data.bikeImage}" width="100px"></td>
					<td align="center"><a:out value="${data.bikeModelYear}"></a:out></td>		
					<td align="center"><a:out value="${data.newPrice}"></a:out></td>
					<td align="center"><a:out value="${data.bikeMileage}"></a:out></td>	
					<td align="center"><a:out value="${data.bikePurchaseDate}"></a:out></td>	
					<td align="center"><a:out value="${data.registrationNo}"></a:out></td>	
					<td align="center"><a:out value="${data.colors}"></a:out></td>
					<td align="center"><a:out value="${data.totalKmRun}"></a:out></td>	 
					</tr>
				
					<td><h4><a href="addcart2?id=${data.oldBikeStockId}" title="add to cart" class="btn btn-s-md btn-primary btn-rounded">Add to cart</a><input type="hidden" name="t1" value="${data.oldBikeStockId}" ></td>
			
		
					
					
						<td><a href="quickview">Quick View</a>	</td>	
						<!-- <button type="button" class="btn btn-primary" data-toggle="modal" data-target="quickview"><i class="fa fa-search"></i> Quick View</button> -->
				</tr>
			
					
			
		
			

		</table>
	<td> <a href="success">BACK</a></td>
 --%>
</body>
</html>