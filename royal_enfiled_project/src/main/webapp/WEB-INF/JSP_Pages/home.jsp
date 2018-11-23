<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>ROYALENFIELD SERVICES</title>
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
	<!-- banner -->
	<div id="home" class="banner" style="background:url(${pageContext.request.contextPath}/Resources/images/back.jpg)no-repeat center 0px;">
		<div class="banner-agileinfo">
			<!-- header -->
			<div class="header">
				<div class="container">		
					<div class="logo">
						<h1><a href="index.html">Motorbike</a></h1>
					</div> 
					<div class="menu">
						<a href="" id="menuToggle"> <span class="navClosed"></span> </a>
						<nav>  
							<a href="#home" class="active scroll">Home</a> 
							<a href="#about" class="scroll">About</a>  
							<a href="#services" class="scroll">Services</a>  
							<a href="#news" class="scroll">News</a>
							<a href="#spec" class="scroll">Specifications</a> 
							<a href="#gallery" class="scroll">Gallery</a> 
							<a href="#contact" class="scroll">Contact</a>
							<a href="loginPage">Login</a>  
						</nav>
						<script>
						(function($){
							// Menu Functions
							$(document).ready(function(){
							$('#menuToggle').click(function(e){
								var $parent = $(this).parent('.menu');
							  $parent.toggleClass("open");
							  var navState = $parent.hasClass('open') ? "hide" : "show";
							  $(this).attr("title", navState + " navigation");
									// Set the timeout to the animation length in the CSS.
									setTimeout(function(){
										console.log("timeout set");
										$('#menuToggle > span').toggleClass("navClosed").toggleClass("navOpen");
									}, 200);
								e.preventDefault();
							});
						  });
						})(jQuery);
						</script>
		 
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
			<!-- //header -->
			<div class="banner-text">
				<div class="container">		
					<h2>WE OFFER THE BEST <span>MOTORBIKES</span></h2>
					<a href="#about" class="buy btn-wayra scroll"> More About</a>
				</div> 
			</div>
		</div>
	</div>
	<!-- //banner -->
	<!-- welcome -->	
	<div id="about" class="welcome">
		<div class="container"> 
			<div class="welcome-agileinfo">
				<div class="col-md-6 w3ls_welcome_left"> 
					<div class="w3ls_welcome_right1" style="text-align: justify;">
						<h3 class="agileits-title"><span>A</span>bout Us</h3>
						<h6>Royal Enfield<span> is a brand name under which The Enfield Cycle Company Limited</span> of Redditch,</h6> 
						<p>Worcestershire[1] sold motorcycles, bicycles, lawnmowers and stationary engines which they had manufactured. 
						Enfield Cycle Company also used the brand name Enfield without Royal.</p>
					</div> 
				</div>
				<div class="col-md-6 w3ls_welcome_right" style="margin-top: 45px">  	
					<div class="agileits_w3layouts_welcome_grid">
						<img src="${pageContext.request.contextPath}/Resources/Royal Enfield images/background images/wp1812072.jpg" alt=" " class="img-responsive" />
					
			
					</div> 
				</div> 
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!-- //welcome -->	
	<!-- slid -->
	<div class="slid jarallax">
		<div class="slid-text">
			<h4>24/7 Customer Service Support</h4>
			<p style="text-align: justify;">At Moterbike, we believe everyone deserves to have a bike that represents the person. Quality and 
			simplicity makes us the best in market. Our goal is to remove any technical or financial barriers that came when 
			when a person choose to buy a good bike. We're excited to help you on your journey!</p>
		</div>
		<div class="clearfix"> </div>
	</div>
	<!-- //slid -->
	<!-- services -->
	<div id="services" class="services">
		<div class="container"> 
			<h3 class="agileits-title w3title2"><span>S</span>ervices</h3>
			<div class="services-row-agileinfo">
				<div class="col-sm-4 col-xs-6 services-w3grid">
					<span class="fa fa-motorcycle hi-icon" aria-hidden="true"></span>
					<h5>Buy</h5>
					<p>Get a brand new bike at affordable price range</p>
				</div>
				<div class="col-sm-4 col-xs-6 services-w3grid">
					<span class="fa fa-heart hi-icon" aria-hidden="true"></span>
					<h5>Sale</h5>
					<p>Sale your bike and get maximum price</p>
				</div>
				<div class="col-sm-4 col-xs-6 services-w3grid">
					<span class="fa fa-wrench hi-icon" aria-hidden="true"></span>
					<h5>Customize</h5>
					<p>customize all kinds of bike according to your need</p>
				</div> 
				<div class="col-sm-4 col-xs-6 services-w3grid">
					<span class="fa fa-bell hi-icon" aria-hidden="true"></span>
					<h5>Cum soluta nobis</h5>
					<p>Itaque earum rerum hic a sapiente delectus finibus gravida</p>
				</div>
				<div class="col-sm-4 col-xs-6 services-w3grid">
					<span class="fa fa-check-square-o hi-icon" aria-hidden="true"></span>
					<h5>Soluta vum nobis</h5>
					<p>Itaque earum rerum hic a sapiente delectus finibus gravida</p>
				</div>
				<div class="col-sm-4 col-xs-6 services-w3grid">
					<span class="fa fa-gears hi-icon" aria-hidden="true"></span>
					<h5>Nobis cum soluta</h5>
					<p>Itaque earum rerum hic a sapiente delectus finibus gravida</p>
				</div> 
				<div class="clearfix"> </div>
			</div> 
		 </div>
	</div>
	<!-- //services -->
	<!-- specifications -->
	<div id="spec" class="spec jarallax">
		<div class="container"> 
			<h3 class="agileits-title w3title2"><span>S</span>pecifications</h3>
			<div class="specw3-agileits">
				<div class="col-md-6 spec-grids">	
					<h4>1. Key Features</h4>
					<ul>
						<li>
							<div class="specf-left">
								<p>Ex-showroom Price Value</p>
							</div>
							<div class="specf-right">
								<p>$50,85,182 </p>
							</div>
							<div class="clearfix"> </div>
						</li>
						<li>
							<div class="specf-left">
								<p>Displacement</p>
							</div>
							<div class="specf-right">
								<p>346 cc</p>
							</div>
							<div class="clearfix"> </div>
						</li>
						<li>
							<div class="specf-left">
								<p>fuel economy</p>
							</div>
							<div class="specf-right">
								<p>30kmpl </p>
							</div>
							<div class="clearfix"> </div>
						</li>
						<li>
							<div class="specf-left">
								<p>No. of Gears</p>
							</div>
							<div class="specf-right">
								<p>5</p>
							</div>
							<div class="clearfix"> </div>
						</li>
						<li>
							<div class="specf-left">
								<p>Speedometer</p>
							</div>
							<div class="specf-right">
								<p>Analogue</p>
							</div>
							<div class="clearfix"> </div>
						</li>
						<li>
							<div class="specf-left">
								<p>Latest technology</p>
							</div>
							<div class="specf-right">
								<p>Available </p>
							</div>
							<div class="clearfix"> </div>
						</li>
					</ul>
				</div>	
				<div class="col-md-6 spec-grids">	
					<h4>2. Key Features</h4>
					<ul>
						<li>
							<div class="specf-left">
								<p>Tyre Type</p>
							</div>
							<div class="specf-right">
								<p>Bridgestone</p>
							</div>
							<div class="clearfix"> </div>
						</li>
						<li>
							<div class="specf-left">
								<p>Bluetooth Connectivity</p>
							</div>
							<div class="specf-right">
								<p>Available</p>
							</div>
							<div class="clearfix"> </div>
						</li>
						<li>
							<div class="specf-left">
								<p>Stroke</p>
							</div>
							<div class="specf-right">
								<p>90 mm</p>
							</div>
							<div class="clearfix"> </div>
						</li>
						<li>
							<div class="specf-left">
								<p>Clutch</p>
							</div>
							<div class="specf-right">
								<p>Wet, Multi-plate</p>
							</div>
							<div class="clearfix"> </div>
						</li>
						<li>
							<div class="specf-left">
								<p>Warranty Time</p>
							</div>
							<div class="specf-right">
								<p>3 Years</p>
							</div>
							<div class="clearfix"> </div>
						</li>
						<li>
							<div class="specf-left">
								<p>Maximum Torque</p>
							</div>
							<div class="specf-right">
								<p>28 Nm @ 4,000 rpm </p>
							</div>
							<div class="clearfix"> </div>
						</li>
					</ul>
				</div>	
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>			
	<!-- //specifications -->
	<!-- news -->
	<div id="news" class="news">   
		<div class="container"> 
			<h3 class="agileits-title w3title2"><span>N</span>ews </h3>
			<div class="news-agileinfo">
				<div class="col-md-4 news-w3grid">
					<img src="${pageContext.request.contextPath}/Resources/Royal Enfield images/gallary images/wp3609155.jpg" alt="" style="height: 252px">				
					<div class="news-w3grid-info">
						<h5><span>10</span> April </h5>
						<h4>Donec cursus</h4>
						<p>Etiam ex lorem cursus vitae placerat suscipit dapibus tortor sed nec augue</p>
						<div class="article-links">
							<ul>
								<li><a href="#"><i class="glyphicon glyphicon-heart-empty"></i><span>1,052</span></a></li>
								<li><a href="#"><i class="glyphicon glyphicon-comment"></i><span>10K</span></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-4 news-w3grid">
					<img src="${pageContext.request.contextPath}/Resources/Royal Enfield images/gallary images/wp2467782.jpg" alt="" style="height: 252px">
					<div class="news-w3grid-info">
						<h5><span>15</span> April </h5>
						<h4>Suscipit dapib</h4>
						<p>Lorem cursus vitae placerat etiam ex suscipit dapibus tortor sed nec augue</p>
						<div class="article-links">
							<ul>
								<li><a href="#"><i class="glyphicon glyphicon-heart-empty"></i><span>1,052</span></a></li>
								<li><a href="#"><i class="glyphicon glyphicon-comment"></i><span>10K</span></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-4 news-w3grid">
					<img src="${pageContext.request.contextPath}/Resources/Royal Enfield images/gallary images/wp3609080.jpg" alt="" style="height: 252px">
					<div class="news-w3grid-info">
						<h5><span>18</span> April </h5>
						<h4>Tortor sed</h4>
						<p>Etiam ex lorem cursus vitae placerat suscipit dapibus tortor sed nec augue</p>
						<div class="article-links">
							<ul>
								<li><a href="#"><i class="glyphicon glyphicon-heart-empty"></i><span>1,052</span></a></li>
								<li><a href="#"><i class="glyphicon glyphicon-comment"></i><span>10K</span></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div> 
		</div> 
	</div>
	<!-- //news --> 
	<!-- gallery -->
	<div class="gallery" id="gallery">	 
		<h3 class="agileits-title w3title2"><span>G</span>allery</h3>
		<div class="gallery-info">	
			<div class="col-sm-6 gallery-grids glry-grid1">
				<div class="gallery-grids-top">
					<a class="b-link-stripe b-animate-go" href="" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen book It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. ">
						<img src="${pageContext.request.contextPath}/Resources/Royal Enfield images/gallary images/wp3609155.jpg" class="img-responsive" alt=""/>
						<div class="b-wrapper">
							<span class="b-animate b-from-left"> 
								<i class="fa fa-arrows-alt" aria-hidden="true"></i>
							</span>					
						</div>
					</a>
				</div>
				<div class="gallery-grids-top">
					<div class="col-sm-6 col-xs-6 bottom-grids">
						<a class="b-link-stripe b-animate-go" href="" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen book It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. ">
							<img src="${pageContext.request.contextPath}/Resources/Royal Enfield images/gallary images/wp3609080.jpg" class="img-responsive" alt=""/>
							<div class="b-wrapper">
								<span class="b-animate b-from-left">
									<i class="fa fa-arrows-alt" aria-hidden="true"></i>
								</span>					
							</div>
						</a>
					</div>
					<div class="col-sm-6 col-xs-6 bottom-grids">
						<a class="b-link-stripe b-animate-go" href="" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen book It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. ">
							<img src="${pageContext.request.contextPath}/Resources/Royal Enfield images/gallary images/wp2467763.jpg" class="img-responsive" alt="" style="height: 252px"/>
							<div class="b-wrapper">
								<span class="b-animate b-from-left">
									<i class="fa fa-arrows-alt" aria-hidden="true"></i>
								</span>					
							</div>
						</a>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="col-sm-3 col-xs-6 gallery-grids glry-grid2">
				<a class="b-link-stripe b-animate-go" href="" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen book It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. ">
					<img src="${pageContext.request.contextPath}/Resources/Royal Enfield images/gallary images/wp2467801.jpg" class="img-responsive" alt="" style="height: 350px"/>
					<div class="b-wrapper">
						<span class="b-animate b-from-left">
							<i class="fa fa-arrows-alt" aria-hidden="true"></i>
						</span>					
					</div>
				</a>
			</div>
			<div class="col-sm-3 col-xs-6 gallery-grids glry-grid3">
				<a class="b-link-stripe b-animate-go" href="images/g1.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen book It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. ">
					<img src="${pageContext.request.contextPath}/Resources/Royal Enfield images/gallary images/wp3609156.jpg" class="img-responsive" alt=""/>
					<div class="b-wrapper">
						<span class="b-animate b-from-left">
							<i class="fa fa-arrows-alt" aria-hidden="true"></i>
						</span>					
					</div>
				</a>
				<a class="b-link-stripe b-animate-go" href="images/img1.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen book It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. ">
					<img src="${pageContext.request.contextPath}/Resources/Royal Enfield images/gallary images/wp1925108.jpg" class="img-responsive" alt=""/>
					<div class="b-wrapper">
						<span class="b-animate b-from-left">
							<i class="fa fa-arrows-alt" aria-hidden="true"></i>
						</span>					
					</div>
				</a>
			</div>
			<div class="clearfix"></div>
			<script src="${pageContext.request.contextPath}/Resources/js/lightbox-plus-jquery.min.js"> </script>
		</div>
	</div>
	<!-- //gallery -->
	<!-- contact -->
	<div class="contact" id="contact">
		<div class="container"> 
			<h3 class="agileits-title w3title2"><span>C</span>ontact Us</h3>
			<div class="contact-grids">
				<div class="col-md-5 address">
					<h4>Get in touch with us</h4>
					<p class="cnt-p">Lorem ipsum dolor sit amet, consectetur adipisicing elit,sheets containing Lorem Ipsum passages sed do </p>
					<div class="agile_social_icons">
						<ul class="agileits_social_list">
							<li><a href="#" class="w3_agile_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
							<li><a href="#" class="agile_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
							<li><a href="#" class="w3_agile_dribble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
							<li><a href="#" class="w3_agile_vimeo"><i class="fa fa-vimeo" aria-hidden="true"></i></a></li>
						</ul>
					</div>  
					<p>Broome St, NY 10002, Canada. </p>
					<p>Telephone : +01 111 222 3333</p>
					<p>FAX : +1 888 4444</p>
					<p>Email : <a href="mailto:example@mail.com">mail@example.com</a></p>
				</div>
				<div class="col-md-7 contact-form">
					<form action="#" method="post">
						<input type="text" name="Name" placeholder="Name" required="">
						<input type="email" class="email" name="Email" placeholder="Email" required="">
						<textarea placeholder="Message" name="Message" required=""></textarea>
						<input type="submit" value="SUBMIT">
					</form>
				</div>
				<div class="clearfix"> </div>	
			</div>
			<div class="w3-agilemap">  
				<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d441.97253972753305!2d73.8149028827666!3d18.489145774681173!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2zMTjCsDI5JzIwLjkiTiA3M8KwNDgnNTQuNyJF!5e1!3m2!1sen!2sin!4v1540473153893" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>				
			</div> 
		</div>
	</div>
	<!-- //contact --> 
	<!-- footer -->
	<div class="footer">
		<div class="container"> 
			<div class="footer-w3lsrow">
				<div class="col-md-4 footer-grids footer-address">
					<h3>Contact Us :</h3>
					<ul>
						<li><i class="glyphicon glyphicon-send"></i> 1st floor,Above Roopam Sweets,Karvenagar Stop<span> Karvenagar,Pune. </span></li>
						<li><i class="glyphicon glyphicon-phone"></i> +111111 <span> +00 1111 222 </span></li>
						<li><i class="glyphicon glyphicon-envelope"></i> <a href="hr@mail.com"> hr@extremityindia.com</a></li>
					</ul>
				</div>
				<div class="col-md-4 footer-grids subscribe">
					<h3>Newsletter :</h3> 
					<form action="#" method="post">
						<input type="email" name="Email" placeholder="Your Email" required="">
						<input type="submit" value="Subscribe">
						<div class="clearfix"> </div> 
					</form>
					
				</div>
				<div class="col-md-4 footer-grids footer-icons">
					<h3>Follow Us :</h3>
					<div class="agile_social_icons">
						<ul class="agileits_social_list">
							<li><a href="#" class="w3_agile_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
							<li><a href="#" class="agile_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
							<li><a href="#" class="w3_agile_dribble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
							<li><a href="#" class="w3_agile_vimeo"><i class="fa fa-vimeo" aria-hidden="true"></i></a></li>
						</ul>
					</div>  
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="footer-bottom">
				<p>© 2017 Motorbike. All rights reserved | Design by <a href="http://w3layouts.com">W3layouts.</a></p>
			</div>
		</div>
	</div>
	<!-- //footer -->	  
	<!-- jarallax -->  
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