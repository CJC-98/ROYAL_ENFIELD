<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Motorbike a Transportation Category Bootstrap Responsive Template | Home :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Motorbike Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->


<link href="${pageContext.request.contextPath}/Resources/css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="${pageContext.request.contextPath}/Resources/css/style.css" type="text/css" rel="stylesheet" media="all"> 
<link href="${pageContext.request.contextPath}/Resources/css/font-awesome.css" rel="stylesheet"> <!-- font-awesome icons -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/css/lightbox.css">
<!--//Custom Theme files-->
<!-- js -->
<script src="${pageContext.request.contextPath}/Resources/js/jquery-2.2.3.min.js"></script>  
<!-- //js -->
<!-- web-fonts -->
<link href="//fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Arsenal:400,400i,700,700i" rel="stylesheet"> 
<!-- //web-fonts --> 
</head>
<body>
<div id="spec" class="spec jarallax">
		<div class="container"> 
			<h3 class="agileits-title w3title2"><span>L</span>ogin</h3>
			<div class="specw3-agileits">
				<div class="col-md-6 spec-grids">	
				 
				<!-- contact -->
	<div class="contact" id="contact">
		<div class="container"> 
			<!-- <h6 class="agileits-title w3title2" align="left"><span>C</span>ontact Us</h3> -->
			<div class="contact-grids">
				<div class="col-md-7 contact-form" style="width: 500px">
					<form action="loginDashbord" method="post">
						<input type="text" name="Name" placeholder="UserName" required="" style="width: 470px;height: 200">
						<input type="password" class="email" name="Email" placeholder="Password" required="" style="width: 470px;height: 200">
						<!-- <textarea placeholder="Message" name="Message" required=""></textarea> -->
						<input type="submit" value="SUBMIT" style="width: 470px;height: 200">
					</form>
				</div>
				<div class="clearfix"> </div>	
			</div>
			
		</div>
	</div>
	<!-- //contact --> 
				
				
				</div>	
				<div class="col-md-6 spec-grids">	
				<a class="b-link-stripe b-animate-go" href="images/img1.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen book It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. ">
					<img src="${pageContext.request.contextPath}/Resources/images/img1.jpg" class="img-responsive" alt=""/>
					<div class="b-wrapper">
						<span class="b-animate b-from-left">
							<i class="fa fa-arrows-alt" aria-hidden="true"></i>
						</span>					
					</div>
				</a>
						</div>	
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
				<script src="${pageContext.request.contextPath}/Resources/js/SmoothScroll.min.js"></script> 
	<script src="${pageContext.request.contextPath}/Resources/js/jarallax.js"></script> 
	<script type="text/javascript">
		/* init Jarallax */
		$('.jarallax').jarallax({
			speed: 0.5,
			imgWidth: 1366,
			imgHeight: 768
		})
	</script>  
	<!-- //jarallax -->   
	<!-- start-smooth-scrolling -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/Resources/js/move-top.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/Resources/js/easing.js"></script>	
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
			
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script>
	<!-- //end-smooth-scrolling -->	
	<!-- smooth-scrolling-of-move-up -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			*/
			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script>
	<!-- //smooth-scrolling-of-move-up -->  
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/Resources/js/bootstrap.js"></script>
</body>
</html>