<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    
    <script>
	function openFile() {
		var fileReader= new FileReader();
		fileReader.readAsDataURL(document.getElementById("file").files[0]);
		fileReader.onload = function (oFREvent) {
            document.getElementById("uploadPreview").src = oFREvent.target.result;
        };
	} 
	
	function getBikeEngine() {

		var bikeModel = document.getElementById("bikeModel").value;
		var req = new XMLHttpRequest();

		var url = "getbikeengine?bikeid=" + bikeModel;

		req.open("GET", url, true);

		req.send();

		req.onreadystatechange = function() {

			if (req.readyState == 4 && req.status == 200) {

				var list = JSON.parse(req.responseText);
				var bikeEngine = document.getElementById("bikeEngine");
				//clean the select box...

				var option = document.createElement("option");
				option.text = list;
				option.value = list;
				bikeEngine.add(option);

			}
		}
	}

	function getBikeColor() {

		var bikeModel = document.getElementById("bikeModel").value;
		var req = new XMLHttpRequest();

		var url = "getbikecolor?bikeid=" + bikeModel;

		req.open("GET", url, true);

		req.send();

		req.onreadystatechange = function() {

			if (req.readyState == 4 && req.status == 200) {

				var list = JSON.parse(req.responseText);

				var bikeColor = document.getElementById("color");
				//clean the select box...

				bikeColor.options.length = 0;
				for ( var key in list) {
					var option = document.createElement("option");
					option.innerHTML = list[key].colorName;
					option.value = list[key].colorName;
					bikeColor.add(option);
				}
			}
		}

	}
</script>
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body class="">

<div style="overflow: scroll; height : 100%; max-height:1200px">
    <section id="content" class="m-t-lg wrapper-md animated fadeInDown">
        <div class="container aside-xxl"> <a class="navbar-brand block" href="index.html">BikeSaleForUser Form</a>
            <section class="panel panel-default m-t-lg bg-white">
                <header class="panel-heading text-center"> <strong>BikeSaleForUser</strong> </header>
                 
                    <form action="BikeSaleToUser" class="panel-body wrapper-lg" 
                    enctype="multipart/form-data" method="post">
             <div class="row">
							<div class="col-md-5">
								<div class="form-group">
									<img
										src="${pageContext.request.contextPath}/Resources/images/profilePic.png"
										alt="Smiley face" height="150" width="150" id="uploadPreview">
								</div>
							</div>
							</div>
							<div class="row">
							<div class="col-md-offset-1">
								<input type='file' accept='image/*' onchange='openFile()' name="profilePic" id="file">
							</div>
						</div> 
                
                
                
                    
                   
                     <div class="form-group"> <label class="col-sm-3 control-label">Adding Date</label>
                        <div class="col-sm-3"> <input class="input-sm input-s datepicker-input form-control"
                                size="20" type="date" name="date" value="12-02-2013" data-date-format="dd-mm-yyyy">
                        </div>
                    </div>
                    <br>
                       <div class="form-group">
					
						<label class="col-sm-3 control-label">BikeModel</label> 
						<select	onchange="getBikeEngine()" name="modelName" id="bikeModel" data-required="true"
						required="required"	class="form-control m-t">
							<option value="">Please choose Bike Model</option>
							<c:forEach items="${data}" var="bk">

								<option value="${bk.bikeModelId}" >${bk.modelName}</option>
							</c:forEach>
						</select>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">BikeEngineType</label> <select
						required="required"	id="bikeEngine" name="engineType" onchange="getBikeColor()" data-required="true"
							class="form-control m-t">
							<option value="Please choose Bike Engine Type">Please
								choose Bike Engine Type</option>

						</select>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">BikeColor</label> <select
						required="required"	id="color" name="colorName" data-required="true" class="form-control m-t">
							<option value="">Please choose Bike Color Type</option>

						</select>
					</div>
                        <div class="form-group"> <label class="control-label">Bike Wheel</label> <input required="required" type="text" name="bikewheel"
                            placeholder="Enter Bike Wheel Type" class="form-control input-lg"> </div>
                            <div class="form-group"> <label class="control-label">Mileage</label> <input required="required" type="text" name="mileage"
                            placeholder="Enter Bike Mileage" class="form-control input-lg"> </div>
                            <div class="form-group"> <label class="control-label">noOfGears</label> <input  required="required" type="text" name="noOfGears"
                            placeholder="Enter NoOfGears" class="form-control input-lg"> </div>
                            <div class="form-group"> <label class="control-label">TyreType</label> <input required="required" type="text" name="tyreType"
                            placeholder="Enter Tyre Type" class="form-control input-lg"> </div>
                            <div class="form-group"> <label class="control-label">ShowroomPrice</label> <input required="required" type="text" name="showroomPrice"
                            placeholder="Enter Bike ShowRoom Price" class="form-control input-lg"> </div>
                            <div class="form-group"> <label class="control-label">OnRoadPricePrice</label> <input required="required" type="text" name="bikeOnRoadPrice"
                            placeholder="Enter Bike OnRoadPrice" class="form-control input-lg"> </div>
                            <div class="form-group"> <label class="control-label">EngineStartingType</label> <input required="required" type="text" name="engineStartingType"
                            placeholder="Enter Engine Starting Type" class="form-control input-lg"> </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">Quantity </label>
                            <input required="required" type='text' name='quantity' id='qty' />
                            <input type='button' name='add' onclick='javascript: document.getElementById("qty").value++;'
                                value='+' />
                            <input type='button' name='subtract' onclick='javascript: document.getElementById("qty").value--;'
                                value='-' />
                        </div>
                        </select>
                       <center> <Button class="btn btn-s-md btn-success btn-rounded">OrderBike</Button> </center>
                    </form>
            </section>
        </div>
    </section> <!-- footer -->
    <!-- <footer id="footer">
        <div class="text-center padder clearfix">
            <p> <small>Web app framework base on Bootstrap<br>&copy; 2013</small> </p>
        </div>
    </footer>  --><!-- / footer -->
    <!-- Bootstrap -->
    <!-- App -->
    <!-- <script src="js/app.v1.js"></script>-->
    <!--   <script src="js/app.plugin.js"></script>-->
    <script src="js/datepicker/bootstrap-datepicker.js"></script><!-- slider -->
</div></body>
<!-- Mirrored from flatfull.com/themes/note/signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:17:05 GMT -->

</html>