<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
</head>
<body>
	<form action="saveBike"  method="post" enctype="multipart/form-data">

			BikeModelName:<input type="text" name="modelName"><br>


			Bike Image:<input type="file" name="image" accept="image/*"><br>
            
            
			<input type="submit" value="SUBMIT">
		

	</form>

	<a href="Success">
		<input type="button" value="see images">
	</a>

</body>
</html>