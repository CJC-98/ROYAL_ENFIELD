<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quick View</title>
</head>
<body>
	<section id="content">
		<section class="vbox">
			<section class="scrollable padder">
				<h1>Bike View</h1>

				<div class="thumbnail">
					<img
						src="${pageContext.request.contextPath}/Resources/images/interceptor.jpg"
						width="276px" height="376px" alt="">
					<div class="caption cntr">
						<centre>
						<p>Bike name</p>
						</centre>
						<p>
							<strong> $22.00</strong>
						</p>
						<h4>
							<a class="shopBtn" href="DealerDashboardPage" title="add to cart">
								Add to cart </a>
						</h4>
						<p>
							<strong> Specification</strong>
						</p>
						<table class="table table-striped m-b-none">
							<tbody>
								<tr>
									<td>Mileage</td>
									<td>40Kmph</td>
								</tr>
                             <tr>
									<td>Tyre Type</td>
									<td>vvv</td>
								</tr>
								<tr>
									<td>Wheel Type</td>
									<td>jjj</td>
								</tr>
								<tr>
									<td>Number Of gears</td>
									<td>6</td>
								</tr>

							</tbody>
						</table>

						<br class="clr">
					</div>
				</div>
</body>
</html>