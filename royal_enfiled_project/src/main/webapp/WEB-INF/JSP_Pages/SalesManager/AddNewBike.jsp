<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" class="bg-dark">
<!-- Mirrored from flatfull.com/themes/note/signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:17:05 GMT -->

<head>
    <meta charset="utf-8" />
    <title>Notebook | Web Application</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->

<script>
	
	function openFile() {
		var fileReader= new FileReader();
		fileReader.readAsDataURL(document.getElementById("file").files[0]);
		fileReader.onload = function (oFREvent) {
            document.getElementById("uploadPreview").src = oFREvent.target.result;
        };
	}
</script>
</head>

<body class="">
    <section id="content" class="m-t-lg wrapper-md animated fadeInDown">
        <div class="container aside-xxl"> <a class="navbar-brand block" href="index.html">Add Bike Model Form</a>
            <section class="panel panel-default m-t-lg bg-white">
                <header class="panel-heading text-center"> <strong>Add Bike Model</strong> </header>
                <form action="saveNewBikeModel" 
					enctype="multipart/form-data" class="panel-body wrapper-lg" method="post">
                <div class="row">
							<div class="col-md-5">
								<div class="form-group">
									<img
										src="${pageContext.request.contextPath}/Resources/images/profilePic.png"
										alt="Smiley face" height="150" width="150" id="uploadPreview">
								</div>
							</div>
							</div>
                <!-- file tag -->
						<div class="row">
							<div class="col-md-offset-1">
								<input type='file' accept='image/*' onchange='openFile()' name="profilePic" id="file">
							</div>
						</div>
                    <div class="form-group"> <label class="control-label">Bike Model</label> <input type="text" name="bikeModel" placeholder="Enter Bike Model"
                            class="form-control input-lg"> </div>
                    <div class="form-group"> <label class="control-label">Bike Color</label> <input type="text" name="bikeColor" placeholder="Enter Bike Color"
                            class="form-control input-lg"> </div>
                    <div class="form-group"> <label class="control-label">Bike Engine Type</label> <input type="text" name="bikeEngine"
                            placeholder="Enter Bike Engine Type" class="form-control input-lg"> </div>
                   
                    <p class="text-muted text-center"></p> <button name="addBike" id="addBike"
                        class="btn">Add Bike</button>
                </form>
            </section>
        </div>
    </section> <!-- footer -->
   <!--  <footer id="footer">
        <div class="text-center padder clearfix">
            <p> <small>Web app framework base on Bootstrap<br>&copy; 2013</small> </p>
        </div>
    </footer>  --><!-- / footer -->
    <!-- Bootstrap -->
    <!-- App -->
   <!-- <script src="js/app.v1.js"></script>-->
  <!--   <script src="js/app.plugin.js"></script>-->
</body>
<!-- Mirrored from flatfull.com/themes/note/signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:17:05 GMT -->

</html>