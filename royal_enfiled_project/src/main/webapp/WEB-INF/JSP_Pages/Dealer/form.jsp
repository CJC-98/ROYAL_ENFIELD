<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Bike</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />
    
    
    <link href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/bootstrap.css" rel="stylesheet"/>
    
    <link href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/style.css" rel="stylesheet"/>
    
	<link href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font-awesome.css" rel="stylesheet">
</head>
<body>
<h3>PartId</h3><input type="text" name="partId"><br>
<h3>PartName</h3><input type="text" name="partName"><br>
<h3>PartPrice</h3><input type="text" name="partPrice"><br>
<h3>PartQuantity</h3><input type="text" name="partQuantity"><br>
<input type="submit" value="save">

</body>
</html>