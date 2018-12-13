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
    <form action="Offers">
        <div class="container aside-xxl"> <a class="navbar-brand block" href="index.html">AddBikeOffer</a>
            <section class="panel panel-default m-t-lg bg-white">
                <header class="panel-heading text-center"> <strong>Offer On Bike</strong> </header>
                <div class="form-group"> <label class="control-label">OfferName</label> <input type="text" name="offerName"
                      size="20"  placeholder="EnterBikeOffer" class="form-control input-lg">
                </div>
                <div class="form-group"> <label class="control-label">DiscountInPercentage</label> <input type="text"
                        name="discountInPercentage" size="20" placeholder="EnterBikeDiscount" class="form-control input-lg">
                </div>
                <div class="form-group"> <label class="col-sm-2 control-label">StartDate</label>
                    <div class="col-sm-10"> <input class="input-sm input-s datepicker-input form-control" size="20"
                            type="date" name="startDate" value="12-02-2013" data-date-format="dd-mm-yyyy">
                    </div>
                </div>
                <div class="form-group"> <label class="col-sm-2 control-label">EndDate</label>
                    <div class="col-sm-10"> <input class="input-sm input-s datepicker-input form-control" size="20"
                            type="date" name="endDate" value="12-02-2013" data-date-format="dd-mm-yyyy">
                    </div>
                </div>

                <!-- <form action="http://flatfull.com/themes/note/index.html" class="panel-body wrapper-lg"> -->


                   <!--  <center> <a class="btn btn-s-md btn-success btn-rounded" href="#">Add Offer</a> </center> -->
                   <input type="submit" value="addoffer">
                </form>
            </section>
        </div>
    </section> <!-- footer -->
  <!--   <footer id="footer">
        <div class="text-center padder clearfix">
            <p> <small>Web app framework base on Bootstrap<br>&copy; 2013</small> </p>
        </div>
    </footer> --> <!-- / footer -->
    <!-- Bootstrap -->
    <!-- App -->
    <!-- <script src="js/app.v1.js"></script>-->
    <!--   <script src="js/app.plugin.js"></script>-->
    <script src="js/datepicker/bootstrap-datepicker.js"></script><!-- slider -->
</body>
<!-- Mirrored from flatfull.com/themes/note/signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:17:05 GMT -->

</html>