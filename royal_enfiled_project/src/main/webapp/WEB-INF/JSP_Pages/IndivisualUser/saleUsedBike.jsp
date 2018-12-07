<!DOCTYPE html>
<html lang="en" class="app">
<!-- Mirrored from flatfull.com/themes/note/form-validation.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:16:54 GMT -->

<head>
    <meta charset="utf-8" />
    <title>Notebook | Web Application</title>
    <meta name="description" content="app, web apasixp, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav"
    />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/css/app.v1.css" type="text/css" />
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body class="">


                      

               <section id="content">
                   
                    <section class="vbox">
                       <h1><strong>SALE USED BIKES</strong></h1>
                        
                            <div class="row">
                                <div class="col-lg-12">
                                    <!-- .breadcrumb -->
                                    <ul class="breadcrumb">
                                        <li><a href="#"><i class="fa fa-home"></i> Home</a></li>
                                       <a href="#"><i class=" fa fa-angle-double-right"></i>Used Bike</a>
                                        <a href="#"></a><i class=" fa fa-angle-double-right"></i>Sale Used Bike</a>
                                       
                                    </ul> <!-- / .breadcrumb -->
                                </div>
                                
                                </div>

                               
                                    <form action="http://flatfull.com/themes/note/index.html" class="panel-body wrapper-lg">
                                        <div class="container aside-xxxl"> <a class="navbar-brand Left" href="index.html">provide your Bike Details</a>
                                        <div class="form-group">
                                            <div class="divtd item-model-box">
                                                <div class="fieldlabel">Model:</div>
                                                <select id="model" name="model" onchange="setV('#company','#model','#version','#buyYear',null);">
                                                    <option value="">Classic 350</option>
                                                    <option value="">Thunder</option>
                                                <option value="">bike111</option>
                                                </select>
                                            </div>
        
                                        


                                        <div class="divtd">
                                            <div class="fieldlabel">Make Year:</div>
                                            <select id="buyYear" name="buyYear">
                                                <option value="">2018  </option>
                                                <option value="">2017  </option>
                                                <option value="">2016  </option>
                                                <option value="">2015  </option>
                                                <option value="">2014  </option>
                                                <option value="">2013  </option>
                                            </select>
                                        </div>
    
    
                                        <div class="divtd">
                                            <div class="fieldlabel">Asking Price:
                                                <span>[Digits Only]</span>
                                            </div>
                                            <input type="tel" name="askPrice" autocomplete="off" id="askPrice" onkeyup="showPriceFormat();" maxlength="8" />
                                            <div class="fieldoptional" id="displayPrice"></div>
                                        </div>
    
                                        <div class="divtd">
                                            <div class="fieldlabel">KMs Run:
                                                <span>[Digits Only]</span>
                                            </div>
                                            <input type="tel" name="KMs" id="KMs" autocomplete="off" onkeyup="showKMsFormat();" maxlength="8" />
                                            <div class="fieldoptional" id="displayKM"></div>
                                        </div>
    
                                        <div class="divtd">
                                            <div class="fieldlabel">Engine CC:
                                                <span>[Digits Only]</span>
                                            </div>
                                            <input type="tel" name="engCapacity" id="engCapacity" autocomplete="off" onkeyup="showCCFormat();" maxlength="7" />
                                            <div class="fieldoptional" id="displayCC"></div>
                                        </div>
                                       
                                        <div class="divFull clearboth">
                                            <br />
                                            <div class="fieldlabel">Additional details like condition of bike, documents, accessories, reason for selling
                                                etc.
                                            </div>
                                            <textarea id="comments" name="comments"></textarea>
                                        </div>
    
                                        
                                           
                                           
                        </form>  
                        <footer class="panel-footer text-center bg-light lter"> <button type="submit"
                            class="btn btn-success btn-s-xs">Sale Bike</button> </footer>
                        </div>
                        
                        </section>
                        </section>
                                <footer id="footer">
                                        <div class="text-center padder clearfix">
                                            <p>
                                                <small>Web app framework base on Bootstrap
                                                    <br>&copy; 2013</small>
                                            </p>
                                        </div>
                                    </footer>
                                    <!-- / footer -->
                                    <!-- Bootstrap -->
                                    <!-- App -->
                                    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/app.v1.js"></script>
                                    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/app.plugin.js"></script>
                                
                            </body>
                            
                            </html>                                   
                        

