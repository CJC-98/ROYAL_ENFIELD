<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.app.extremity.model.Country"%>
<%@page import="java.util.*"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
    <meta charset="utf-8" />
    <title>Notebook | Web Application</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
   <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/css/app.v1.css" type="text/css" />
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
<!-- @author Sonika -->
<script type="text/javascript">
	function getState(op) {
		//alert("in getstate");
		if(op==1){
		var country = document.getElementById("country1").value;
		}
		else{
			var country = document.getElementById("country2").value;
		}
		var req = new XMLHttpRequest();
		var url = "getstate?a=" + country;
		//alert(url);
		req.open("GET", url, true);
		req.send();

		req.onreadystatechange = function() {
			//alert("in state2");
			//alert(req.readyState);
			//alert(req.status);
			if (req.readyState == 4 && req.status == 200) {
				//alert("if");
				var list = JSON.parse(req.responseText);
				var state = document.getElementById("state");
			//	alert(req.responseText);
				for ( var key in list) {
				//	alert(list);
					//alert(list[key]);
					//alert(key);
					var option = document.createElement("option");
					option.innerHTML.value = list[key].sname;
					option.text = list[key];
					if(op==1){
					state1.add(option);
					}
					else{
						state2.add(option);
					}
				}
			}
		}
	}


	function getCity(opt) {
		//alert(city1);
		if(opt==1)
			{
				var state = document.getElementById("state1").value;
			}
		else
			{
				var state = document.getElementById("state2").value;
			}
		var req = new XMLHttpRequest();
		var url = "cities?b=" + state;
		req.open("GET", url, true);
		req.send();
		req.onreadystatechange = function() {
			//alert(req.readyState);
			//alert(req.status);
			if (req.readyState == 4 && req.status == 200) {
				var list = JSON.parse(req.responseText);
				var city = document.getElementById("city");
				//alert(list);
				for ( var key in list) {
					//alert(list);
					//alert(list[key]);
					var option = document.createElement("option");
					option.innerHTML.value = list[key].cityName;
					option.text = list[key];
				//	city.add(option);
					if(opt==1){
						city1.add(option);
						}
						else{
							city2.add(option);
						}
				}
			}
		}
	}
	
	
	function checkForm() {
		// Fetching values from all input fields and storing them in variables.
		var name = document.getElementByName("name").value;
		var password = document.getElementByName("password").value;
		var email = document.getElementByName("email").value;
		var contactno = document.getElementByName("mobile").value;
		var showroomName = document.getElementByName("showroomName").value;
		//Check input Fields Should not be blanks.
		if (name == '' || password == '' || email == '' || contactno == '' || showroomName== '' ) {
		alert("Fill All Fields");
		} else {
		//Notifying error fields
		var username1 = document.getElementByName("username");
		var password1 = document.getElementByName("password");
		var email1 = document.getElementByName("email");
		var showroomName1 = document.getElementByName("shoeroomName");
		//Check All Values/Informations Filled by User are Valid Or Not.If All Fields Are invalid Then Generate alert.
		if (username1.innerHTML == 'Must be 3+ letters' || password1.innerHTML == 'Password too short' || email1.innerHTML == 'Invalid email' || website1.innerHTML == 'Invalid website') {
		alert("Fill Valid Information");
		} else {
		//Submit Form When All values are valid.
		document.getElementByName("myForm").submit();
		}
		}
		}
	
	function check(option){
		//alert("in check()")
		if(option==1){
		if (document.getElementById('password').value ==
		    document.getElementById('confirmpassword').value) {
			//alert("in if()")
		    document.getElementById('message1').style.color = 'green';
		    document.getElementById('message1').innerHTML = ' password matching';
		  } else {
		    document.getElementById('message1').style.color = 'red';
		    document.getElementById('message1').innerHTML = ' password and confirm password not matching';
		  }
		}
		else{
			if (document.getElementById('password1').value ==
			    document.getElementById('confirmpassword1').value) {
				//alert("in if()")
			    document.getElementById('message').style.color = 'green';
			    document.getElementById('message').innerHTML = ' password matching';
			  } else {
			    document.getElementById('message').style.color = 'red';
			    document.getElementById('message').innerHTML = ' password and confirm password not matching';
			  }
		}
	}

	
	function checkMailStatus(option){
	   // alert("came");
	    if(option==1){
	var email=$("#email").val();// value in field email
	$.ajax({
		type:'GET',
		
		//url : window.location + "/checkmail",
		
	       url:"checkmail",
	        		//put your real file name 
	      	data:'{param:"email"}',
	      	contentType :"application/json; charset=utf-8",
	     		 
	        data:{email: email},
	        success:function(msg){
	        alert(msg); // your message will come here.     
	        } 
	        
	 });
	
	}
	    else{
	    	var email=$("#email1").val();// value in field email
	    	$.ajax({
	    		type:'GET',
	    		
	    		//url : window.location + "/checkmail",
	    		
	    	       url:"checkmail",
	    	        		//put your real file name 
	    	      	data:'{param:"email"}',
	    	      	contentType :"application/json; charset=utf-8",
	    	     		 
	    	        data:{email: email},
	    	        success:function(msg1){
	    	        alert(msg1); // your message will come here.     
	    	        } 
	    	        
	    	 });
	    	
	    	}
		}
	
	 
	 
	</script>

</script>


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
<label class="control-label">Contact Number</label> <input type="text" name="mobile"placeholder="eg. 967*****66"class="form-control inputdefault"> </div>
<div class="form-group"> <label class="control-label">Email</label> <input type="text" name="email" id="email" placeholder="test@example.com"class="form-control inputdefault"  onkeyup="checkMailStatus(1)"> 
<span id="msg"></span> 
</div>
<div class="form-group"> 
<label class="control-label">Country</label>
 <select class="form-control input-sm" id="country1" name="country"
								onchange="getState(1)">
								<option>Select Country</option>
								
								<c:forEach items="${data}" var="data">
									<tr>
										<td><option value="${data.id}">${data.countryName}
											</option></td>
									</tr>
								</c:forEach>
							
							</select>
						</div>
						<div class="form-group">
							<label class="control-label">State</label> <select
								class="form-control inputdefault" id="state1" name="state"
								onchange="getCity(1)">
								<option>Select state</option>
								
							</select>
						</div>
						<div class="form-group">
							<label class="control-label">City</label> <select id="city1"
								name="city" class="form-control inputdefault">
								<option>Select city</option>
							
 </select>
</div>
<div class="form-group">
    <label class="control-label">Pincode</label> <input type="text" name="pincode"placeholder="Enter Pinco" class="form-control inputdefault"> </div>
    <div class="form-group">
    <label class="control-label"></label> <input type="hidden" name="rolename" value="User" class="form-control inputdefault"> </div>

<div class="form-group"> <label class="control-label">Password</label> <input type="password" name="password" placeholder="Type a password"  id="password1" class="form-control inputdefault"> </div>
<div class="form-group"> <label class="control-label">Confirm Password</label> <input type="password" id="confirmpassword1" placeholder="Type a password again"  class="form-control inputdefault" onkeyup="check(2)"> 
<span id='message'></span>
</div>
<div class="checkbox"> <label> <input type="checkbox"> Agree the <a href="#">terms and policy</a>
</label> </div> <button type="submit" class="btn btn-primary">Sign up</button>
                    <div class="line line-dashed"></div>
                    <p class="text-muted text-center"><small>Already have an account?</small></p> <a href="signin.html"
                        class="btn btn-default btn-block">Sign in</a>
                </form>
            </div>
                                                <div class="tab-pane" id="dealer">

     <form action="save" name="myform" class="panel-body wrapper-lg">
 <div class="form-group"> 
     <label class="control-label">Name</label> <input type="text" name="name"placeholder="eg. Your name or company"class="form-control inputdefault"> </div>
<div class="form-group"> 
<label class="control-label">Contact Number</label> <input type="text" name="mobile"placeholder="eg. 967*****66"class="form-control inputdefault"> </div>
<div class="form-group"> <label class="control-label">Email</label> <input type="text" id= email1 name="email"placeholder="test@example.com"class="form-control inputdefault" onkeyup="checkMailStatus(2)"> </div>
<span id="msg1"></span>  
<div class="form-group"> 
<label class="control-label">Country</label>
<select class="form-control input-sm" id="country2" name="country"
								onchange="getState(2)">
								<option>Select Country</option>
								<c:forEach items="${data}" var="data">
									<tr>
										<td><option value="${data.id}">${data.countryName}
											</option></td>
									</tr>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label class="control-label">State</label> <select
								class="form-control inputdefault" id="state2" name="state"
								onchange="getCity(2)">
								<option>Select state</option>
								
							</select>
						</div>
						<div class="form-group">
							<label class="control-label">City</label> <select id="city2"
								name="city" class="form-control inputdefault">
								<option>Select city</option>
								</select>
</div>

<div class="form-group">
    <label class="control-label">Showroom Name:-</label> <input type="text" name="showroomName"placeholder="Enter ShowroomName" class="form-control inputdefault"> </div>
<div class="form-group">
    <label class="control-label">Pincode</label> <input type="text"name="pincode"placeholder="Enter Pinco" class="form-control inputdefault"> </div>

    <div class="form-group">
    <label class="control-label" >Role</label> <input readonly="readonly" type="text" name="rolename" value="DEALER" placeholder="rolename" class="form-control inputdefault"> </div>

<div class="form-group"> <label class="control-label">Password</label> <input type="password" name="password"placeholder="Type a password" id="password" class="form-control inputdefault"> </div>
<div class="form-group"> <label class="control-label">Confirm Password</label> <input type="password" id="confirmpassword" placeholder="Type a password again" class="form-control inputdefault" onkeyup="check(1)"> 
<span id='message1'></span>
</div>
<div class="checkbox"> <label> <input type="checkbox"> Agree the <a href="#">terms and policy</a>
</label> </div> <button type="submit" onclick="checkForm()" class="btn btn-primary">Sign up</button>
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