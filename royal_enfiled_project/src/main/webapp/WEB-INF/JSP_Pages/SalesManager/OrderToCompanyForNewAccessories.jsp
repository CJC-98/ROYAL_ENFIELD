<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en" class="bg-dark">
<!-- Mirrored from flatfull.com/themes/note/signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:17:05 GMT -->

<head>
    <meta charset="utf-8" />
    <title>Notebook | Web Application</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <link rel="stylesheet" href="css/font.css" type="text/css" />
    <link rel="stylesheet" href="css/app.v1.css" type="text/css" />
    <link rel="stylesheet" href="js/datepicker/datepicker.css" type="text/css" />
   <script type="text/javascript">
   function getAccessories() {

	   alert("in accessories");
		var bikeModel = document.getElementById("bikemodel").value;
		var req = new XMLHttpRequest();

		var url = "getbikeaccessories?bikeid=" + bikeModel;

		req.open("GET", url, true);

		req.send();

		req.onreadystatechange = function() {

			if (req.readyState == 4 && req.status == 200) {

				var list = JSON.parse(req.responseText);
				var accessories = document.getElementById("Accessories");
				//clean the select box...

				var option = document.createElement("option");
				option.text = list;
				option.value = list;
				accessories.add(option);

			}
		}
	}
   
   
   
   
   
   </script>
   
   
   
   
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body class=""><div style="overflow: scroll; height : 100%; max-height:1200px">
    <section id="content" class="m-t-lg wrapper-md animated fadeInDown">
        <div class="container aside-xxl"> <a class="navbar-brand block" href="index.html">OrderAccessories Form</a>
            <section class="panel panel-default m-t-lg bg-white">
                <header class="panel-heading text-center"> <strong>Order To Company</strong> </header>

               
                <form action="OrderAccessories" class="panel-body wrapper-lg">
                 <div class="form-group"> <label class="col-sm-3 control-label">OrderDate</label>
                    <div class="col-sm-3"> <input class="input-sm input-s datepicker-input form-control" size="20"
                          name="date"  type="date" value="12-02-2013" data-date-format="dd-mm-yyyy">
                    </div>
                </div>
                <br>
                    <div class="form-group"> <label class="col-sm-3 control-label">BikeModel</label>
                        <select required="required" data-required="true" class="form-control m-t" onchange="getAccessories()" name="bikeModelName" id="bikemodel">
                            <option value="Please choose Bike Model">Please choose Bike Model</option>
                           <c:forEach items="${data}" var="bike">
                           <option value="${bike.accId}" >${bike.bikeModelName}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group"> <label class="col-sm-3 control-label">AccessoriesType</label>
                        <select required="required" data-required="true" id="Accessories" name="accType" class="form-control m-t">
                            <option value="">Please choose Bike Accessories Type</option>
                            
                        </select>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">Quantity </label>
                        <input required="required" type='text' name='qty' id='qty' />
                        <input type='button' name='add' onclick='javascript: document.getElementById("qty").value++;'
                            value='+' />
                        <input type='button' name='subtract' onclick='javascript: document.getElementById("qty").value--;'
                            value='-' />
                    </div>
                    <center> <Button class="btn btn-s-md btn-success btn-rounded" href="#">OrderAccessories</Button> </center>
                </form>
            </section>
        </div>
    </section> <!-- footer -->
   
    <script src="js/datepicker/bootstrap-datepicker.js"></script><!-- slider -->
</div></body>
<!-- Mirrored from flatfull.com/themes/note/signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:17:05 GMT -->

</html>