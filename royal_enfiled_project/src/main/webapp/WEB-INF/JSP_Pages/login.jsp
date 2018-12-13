<!DOCTYPE html>
<html lang="en" class="bg-dark">
<!-- Mirrored from flatfull.com/themes/note/signin.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 19 Oct 2018 11:17:04 GMT -->

<head>
<meta charset="utf-8" />
<title>Royal Enfield | Web Application</title>
<meta name="description"
	content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css"
	type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css"
	type="text/css" />
<!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>

<body class="">
	<section id="content" class="m-t-lg wrapper-md animated fadeInUp">
		<div class="container aside-xxl">
			<a class="navbar-brand block" href=""> Royal Enfield </a>
			<section class="panel panel-default bg-white m-t-lg">

				<header class="panel-heading text-center">
					<strong>Sign in</strong>
				</header>
				<div class="row">
					<div class="col-md-offset-4">
						<small class="alert-danger">${msg}</small>
					</div>
				</div>

				<form action="SignIn" class="panel-body wrapper-lg">
					<div class="form-group">
						<label class="control-label">Email</label> <input type="email"
							placeholder="test@example.com" class="form-control input-lg"
							name="email">
					</div>
					<div class="form-group">
						<label class="control-label">Password</label> <input
							type="password" id="inputPassword" placeholder="Password"
							class="form-control input-lg" name="password">
					</div>
					<div class="checkbox">
						<label> <input type="checkbox"> Keep me logged in
						</label>
					</div>

					<a href="#" class="pull-right m-t-xs"> <small>Forgot
							password?</small>
					</a>


					<button type="submit" class="btn btn-primary">Sign in</button>


					<div class="line line-dashed"></div>
					<div class="line line-dashed"></div>
					<p class="text-muted text-center">
						<small>Do not have an account?</small>
					</p>
					<a href="signup.html" class="btn btn-default btn-block">Create
						an account</a>
				</form>
			</section>
		</div>
	</section>

	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/app.v1.js"></script>
	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/app.plugin.js"></script>
</body>

</html>
