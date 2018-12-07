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
    <link rel="stylesheet" href="js/datepicker/datepicker.css" type="text/css" />
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body class="">
    <section id="content" class="m-t-lg wrapper-md animated fadeInDown">
        <div class="container aside-xxl"> <a class="navbar-brand block" href="index.html">OrderAccessories Form</a>
            <section class="panel panel-default m-t-lg bg-white">
                <header class="panel-heading text-center"> <strong>Order To Company</strong> </header>

                <div class="form-group"> <label class="col-sm-3 control-label">OrderDate</label>
                    <div class="col-sm-3"> <input class="input-sm input-s datepicker-input form-control" size="20"
                            type="date" value="12-02-2013" data-date-format="dd-mm-yyyy">
                    </div>
                </div>
                <form action="http://flatfull.com/themes/note/index.html" class="panel-body wrapper-lg">
                    <div class="form-group"> <label class="col-sm-3 control-label">BikeModel</label>
                        <select data-required="true" class="form-control m-t">
                            <option value="">Please choose Bike Model</option>
                            <option value="foo">Foo</option>
                            <option value="bar">Bar</option>
                        </select>
                    </div>
                    <div class="form-group"> <label class="col-sm-3 control-label">AccessoriesType</label>
                        <select data-required="true" class="form-control m-t">
                            <option value="">Please choose Bike Accessories Type</option>
                            <option value="foo">Helmate</option>
                            <option value="bar">Horn</option>
                            <option value="bar">HeadLight</option>
                            <option value="bar">Tyre</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">Quantity </label>
                        <input type='text' name='qty' id='qty' />
                        <input type='button' name='add' onclick='javascript: document.getElementById("qty").value++;'
                            value='+' />
                        <input type='button' name='subtract' onclick='javascript: document.getElementById("qty").value--;'
                            value='-' />
                    </div>
                    <center> <a class="btn btn-s-md btn-success btn-rounded" href="#">OrderBike</a> </center>
                </form>
            </section>
        </div>
    </section> <!-- footer -->
    <footer id="footer">
        <div class="text-center padder clearfix">
            <p> <small>Web app framework base on Bootstrap<br>&copy; 2013</small> </p>
        </div>
    </footer> <!-- / footer -->
    <!-- Bootstrap -->
    <!-- App -->
    <!-- <script src="js/app.v1.js"></script>-->
    <!--   <script src="js/app.plugin.js"></script>-->
    <script src="js/datepicker/bootstrap-datepicker.js"></script><!-- slider -->
</body>
<!-- Mirrored from flatfull.com/themes/note/signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:17:05 GMT -->

</html>