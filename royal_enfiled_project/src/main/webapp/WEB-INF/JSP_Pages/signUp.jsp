<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
    <meta charset="utf-8" />
    <title>Notebook | Web Application</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
   <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/css/app.v1.css" type="text/css" />
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body class="">
    <section id="content" class="m-t-lg wrapper-md animated fadeInDown">
        <div class="container aside-xxl"> <a class="navbar-brand block" href="index.html">Notebook</a>
            <section class="panel panel-default m-t-lg bg-white">
                <header class="panel-heading text-center"> <strong>Sign up</strong> </header>
                <header class="panel-heading bg-light">
                                            <ul class="nav nav-tabs nav-justified">
                                                <li class="active"><a href="#user" data-toggle="tab">User</a></li>
                                                <li><a href="#dealer" data-toggle="tab">Dealer</a></li>
                                            </ul>
                                        </header>


                                        <div class="panel-body">
                                            <div class="tab-content">
                                                <div class="tab-pane active" id="user"style="overflow-y: scroll;">
<form action="save" class="panel-body wrapper-lg">
 <div class="form-group"> 
     <label class="control-label">Name</label> <input type="text"  name="name"placeholder="eg. Your name or company"class="form-control inputdefault"> </div>
<div class="form-group"> 
<label class="control-label">Contact Number</label> <input type="text" name="mobileno"placeholder="eg. 967*****66"class="form-control inputdefault"> </div>
<div class="form-group"> <label class="control-label">Email</label> <input type="email" name="email"placeholder="test@example.com"class="form-control inputdefault"> </div>
<div class="form-group"> 
<label class="control-label">Country</label>
<select name="country"select class="form-control input-sm" >
<option>Select Country</option>
<option value="india">India</option>
<option value="us">USA</option>
<option value="au">Australia</option>
<option value="sr">SriLanka</option>
</select></div>
<div class="form-group"> 
<label class="control-label">State</label>
<select name="state"class="form-control inputdefault">
<option >Select state</option>
<option value="mh">Maharashtra</option>
<option value="krl">Keral</option>
<option value="gj">Gujrat</option>
<option value="rj">Rajasthan</option>
</select>
</div>
<div class="form-group"> 
<label class="control-label">City</label>
<select name="city"class="form-control inputdefault">
<option >Select city</option>
<option value="mum">Mumbai</option>
<option value="pune">Pune</option>
<option value="ngp">Nagpur</option>
<option value="amt">Amravati</option>
<option value="psd">Pusad</option></select>
</div>
<div class="form-group">
    <label class="control-label">Pincode</label> <input type="text" name="pincode"placeholder="Enter Pinco" class="form-control inputdefault"> </div>
    <div class="form-group">
    <label class="control-label">Role</label> <input type="text" name="rolename"placeholder="rolename" class="form-control inputdefault"> </div>

<div class="form-group"> <label class="control-label">Password</label> <input type="password" name="password"placeholder="Type a password" class="form-control inputdefault"> </div>
<div class="form-group"> <label class="control-label">Confirm Password</label> <input type="password" id="inputPassword"placeholder="Type a password again" class="form-control inputdefault"> </div>
<div class="checkbox"> <label> <input type="checkbox"> Agree the <a href="#">terms and policy</a>
</label> </div> <button type="submit" class="btn btn-primary">Sign up</button>
                    <div class="line line-dashed"></div>
                    <p class="text-muted text-center"><small>Already have an account?</small></p> <a href="signin.html"
                        class="btn btn-default btn-block">Sign in</a>
                </form>
            </div>
                                                <div class="tab-pane" id="dealer">

     <form action="save" class="panel-body wrapper-lg">
 <div class="form-group"> 
     <label class="control-label">Name</label> <input type="text" name="name"placeholder="eg. Your name or company"class="form-control inputdefault"> </div>
<div class="form-group"> 
<label class="control-label">Contact Number</label> <input type="text" name="mobileno"placeholder="eg. 967*****66"class="form-control inputdefault"> </div>
<div class="form-group"> <label class="control-label">Email</label> <input type="email" name="email"placeholder="test@example.com"class="form-control inputdefault"> </div>
<div class="form-group"> 
<label class="control-label">Country</label>
<select name="country" class="form-control inputdefault">
<option>Select Country</option>
<option value="india">India</option>
<option value="us">USA</option>
<option value="au">Australia</option>
<option value="sr">SriLanka</option>
</select></div>
<div class="form-group"> 
<label class="control-label">State</label>
<select name="state"class="form-control inputdefault">
<option >Select state</option>
<option value="mh">Maharashtra</option>
<option value="krl">Keral</option>
<option value="gj">Gujrat</option>
<option value="rj">Rajasthan</option>
</select>
</div>
<div class="form-group"> 
<label class="control-label">City</label>
<select name="city"class="form-control inputdefault">
<option >Select city</option>
<option value="mum">Mumbai</option>
<option value="pune">Pune</option>
<option value="ngp">Nagpur</option>
<option value="amt">Amravati</option>
<option value="psd">Pusad</option></select>
</div>

<div class="form-group">
    <label class="control-label">Showroom Name:-</label> <input type="text" name="showroomname"placeholder="Enter ShowroomName" class="form-control inputdefault"> </div>
<div class="form-group">
    <label class="control-label">Pincode</label> <input type="text"name="pincode"placeholder="Enter Pinco" class="form-control inputdefault"> </div>

     <div class="form-group">
    <label class="control-label">Role</label> <input type="text" name="rolename"placeholder="rolename" class="form-control inputdefault"> </div>

<div class="form-group"> <label class="control-label">Password</label> <input type="password" name="password"placeholder="Type a password" class="form-control inputdefault"> </div>
<div class="form-group"> <label class="control-label">Confirm Password</label> <input type="password" id="inputPassword"placeholder="Type a password again" class="form-control inputdefault"> </div>
<div class="checkbox"> <label> <input type="checkbox"> Agree the <a href="#">terms and policy</a>
</label> </div> <button type="submit" class="btn btn-primary">Sign up</button>
                    <div class="line line-dashed"></div>
                    <p class="text-muted text-center"><small>Already have an account?</small></p> <a href="signin.html"
                        class="btn btn-default btn-block">Sign in</a>
                </form>

                                                </div>
                                                
                                            </div>
                                        </div>
                
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
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/app.v1.js"></script>
    <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/app.plugin.js"></script>
</body>
</html>