<!DOCTYPE html>
<html lang="en" class="app">
<!-- Mirrored from flatfull.com/themes/note/form-elements.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:16:47 GMT -->

<head>
    <meta charset="utf-8" />
    <title>Notebook | Web Application</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    
    <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
    <link rel="stylesheet" href="css/font.css" type="text/css" />
    <link rel="stylesheet" href="js/select2/select2.css" type="text/css" />
    <link rel="stylesheet" href="js/select2/theme.css" type="text/css" />
    <link rel="stylesheet" href="js/fuelux/fuelux.css" type="text/css" />
    <link rel="stylesheet" href="js/datepicker/datepicker.css" type="text/css" />
    <link rel="stylesheet" href="js/slider/slider.css" type="text/css" />
    <link rel="stylesheet" href="css/app.v1.css" type="text/css" />
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body class="">
    <section class="vbox">
        
        <section>
            <section class="hbox stretch">
                <!-- .aside -->
                <aside class="bg-light lter b-r aside-md hidden-print hidden-xs" id="nav">
                   
                </aside> <!-- /.aside -->
                <section id="content">
                    <section class="vbox">
                        <section class="scrollable padder">
                           
                            <div class="m-b-md">
                            	<center>
                                	<h3 class="m-b-none">Please do not refresh this page...</h3>
                                </center>
                            </div>
                            <br>
                            <br>
                            
                            <div class="row">
                            	<div class="col-sm-3"> </div>
                            	<div class="col-sm-6">
                            		<div class="progress">
										<div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width:40%">
											40%
										</div>
									</div>
                            	</div>
                            </div>            
                            
                            
                            
                            
                            <div class="row">                                
                                <div class="col-sm-6">
									<form method="post" action="https://securegw-stage.paytm.in/theia/processTransaction" name="f1">
										  <table border="1">
										        <tbody>
										            <input type="hidden" name="MID" value="kIIJpo08692383342691">
										            <input type="hidden" name="WEBSITE" value="WEBSTAGING">
										            <input type="hidden" name="ORDER_ID" value=${orderid }>
										            <input type="hidden" name="CUST_ID" value=${customerId }>
										          	<input type="hidden" name="MOBILE_NO" value="7777777777">
										         	<input type="hidden" name="EMAIL" value="NSTAMMEWAR@GMAIL.COM">
										            <input type="hidden" name="INDUSTRY_TYPE_ID" value="Retail">
										            <input type="hidden" name="CHANNEL_ID" value="WEB">
										            <input type="hidden" name="TXN_AMOUNT" value=${ammount }>
									                <input type="hidden" name="CALLBACK_URL" value="http://localhost:8081/callback">
								                    <input type="hidden" name="CHECKSUMHASH" value="${check }">
								                </tbody>
		   					            </table>
			
										<script type="text/javascript">
										        document.f1.submit();
										</script>
							        </form>                   
                                </div>
                            </div>
                                                   
                        </section>
                    </section> <a href="#" class="hide nav-off-screen-block" data-toggle="class:nav-off-screen, open"
                        data-target="#nav,html"></a>
                </section>
                <aside class="bg-light lter b-l aside-md hide" id="notes">
                    <div class="wrapper">Notification</div>
                </aside>
            </section>
        </section>
    </section> <!-- Bootstrap -->
    <!-- App -->
    <script src="js/app.v1.js"></script>
    
    <script src="js/fuelux/fuelux.js"></script><!-- datepicker -->
    <script src="js/datepicker/bootstrap-datepicker.js"></script><!-- slider -->
    <script src="js/slider/bootstrap-slider.js"></script><!-- file input -->
    <script src="js/file-input/bootstrap-filestyle.min.js"></script><!-- combodate -->
    <script src="js/libs/moment.min.js"></script>
    <script src="js/combodate/combodate.js"></script><!-- select2 -->
    <script src="js/select2/select2.min.js"></script><!-- wysiwyg -->
    <script src="js/wysiwyg/jquery.hotkeys.js"></script>
    <script src="js/wysiwyg/bootstrap-wysiwyg.js"></script>
    <script src="js/wysiwyg/demo.js"></script><!-- markdown -->
    <script src="js/markdown/epiceditor.min.js"></script>
    <script src="js/markdown/demo.js"></script>
    <script src="js/app.plugin.js"></script>
</body>
<!-- Mirrored from flatfull.com/themes/note/form-elements.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:16:54 GMT -->

</html>