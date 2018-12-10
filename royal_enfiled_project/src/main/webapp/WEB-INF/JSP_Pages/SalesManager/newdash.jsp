<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
		<title> </title>
		<style type="text/css">
		
		</style>
		<script type="text/javascript">
		function incrementValue()
		{
		    var value = parseInt(document.getElementById('number').value, 10);
		    value = isNaN(value) ? 0 : value;
		    value++;
		    document.getElementById('number').value = value;
		}
		
		</script>
	</head>
	<body>
	<center>
	<h3>hiiii</h3>
	
	
	<form>
   <input type="text" id="number" value="0"/>
   <input type="button" onclick="incrementValue()" value="Increment Value" />
</form>
		<form name="f1">
			<input type='text' name='qty' id='qty' />
			<input type='button' name='add' onclick='javascript: document.getElementById("qty").value++;' value='+'/>
			<input type='button' name='subtract' onclick='javascript: document.getElementById("qty").value--;' value='-'/>
		</form>
		</center>
	</body>
</html>