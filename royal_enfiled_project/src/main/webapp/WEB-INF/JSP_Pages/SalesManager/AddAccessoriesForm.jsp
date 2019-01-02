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
    <link rel="stylesheet" href="css/font.css" type="text/css" />
    <link rel="stylesheet" href="css/app.v1.css" type="text/css" />
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body class="">
<div style="overflow: scroll; height : 100%; max-height:1200px">
    <section id="content" class="m-t-lg wrapper-md animated fadeInDown">
        <div class="container aside-xxl"> <a class="navbar-brand block" href="index.html">Add Accessories Form</a>
            <section class="panel panel-default m-t-lg bg-white">
                <header class="panel-heading text-center"> <strong>Add Accessories</strong> </header>
                <form action="addaccessories" class="panel-body wrapper-lg">
                    <div class="form-group"> <label class="control-label">Bike Model</label> <input required="required" type="text" name="bikeModel" placeholder="Enter Bike Model"
                            class="form-control input-lg"> </div>
                    <div class="form-group"> <label class="control-label">Accessories type</label> <input required="required" type="text" name="accessoriesType" placeholder="Enter Accessories Type"
                            class="form-control input-lg"> </div>
                   
                    <p class="text-muted text-center"></p> <button name="addAccessories" id="addAccessories"
                        class="btn btn-primary">Add Accessories</button>
                </form>
            </section>
        </div>
    </section> <!-- footer -->
   <!--  <footer id="footer">
        <div class="text-center padder clearfix">
            <p> <small>Web app framework base on Bootstrap<br>&copy; 2013</small> </p>
        </div>
    </footer> --> <!-- / footer -->
    <!-- Bootstrap -->
    <!-- App -->
   <script src="js/app.v1.js"></script>
    <script src="js/app.plugin.js"></script></div>
</body>
<!-- Mirrored from flatfull.com/themes/note/signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:17:05 GMT -->

</html>