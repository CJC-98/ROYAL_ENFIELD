<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8" />
    <title>Notebook | Web Application</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>
<body class="">
    <section class="vbox">
        <!-- Start Header -->
        <header class="bg-dark dk header navbar navbar-fixed-top-xs">
            <div class="navbar-header aside-md"> <a class="btn btn-link visible-xs" data-toggle="class:nav-off-screen,open"
                    data-target="#nav,html"> <i class="fa fa-bars"></i> </a> <a href="#" class="navbar-brand"
                    data-toggle="fullscreen"><img src="images/logo.png" class="m-r-sm">Admin</a> <a class="btn btn-link visible-xs"
                    data-toggle="dropdown" data-target=".nav-user"> <i class="fa fa-cog"></i> </a> </div>
            <ul class="nav navbar-nav hidden-xs">
                <li class="dropdown"> <a href="#" class="dropdown-toggle dker" data-toggle="dropdown"> <i class="fa fa-building-o"></i>
                        <span class="font-bold">Active</span> </a>
                    <!-- This for Login User Details -->
                    <section class="dropdown-menu aside-xl on animated fadeInLeft no-borders lt">
                        <div class="wrapper lter m-t-n-xs"> <a href="#" class="thumb pull-left m-r"> <img src="images/Nikita.jpg"
                                    class="img-circle"> </a>
                            <div class="clear"> <a href="#"><span class="text-white font-bold">Nikita_Pise</a></span>
                                <small class="block">Art Director</small> <a href="#" class="btn btn-xs btn-success m-t-xs">Upgrade</a>
                            </div>
                        </div>
                        <div class="row m-l-none m-r-none m-b-n-xs text-center">
                            <div class="col-xs-4">
                                <div class="padder-v"> <span class="m-b-xs h4 block text-white">245</span> <small class="text-muted">Followers</small>
                                </div>
                            </div>
                            <div class="col-xs-4 dk">
                                <div class="padder-v"> <span class="m-b-xs h4 block text-white">55</span> <small class="text-muted">Likes</small>
                                </div>
                            </div>
                            <div class="col-xs-4">
                                <div class="padder-v"> <span class="m-b-xs h4 block text-white">2,035</span> <small
                                        class="text-muted">Photos</small> </div>
                            </div>
                        </div>
                    </section>
                    <!-- End Login User Details -->
                </li>
                <li>
                    <div class="m-t m-l"> <a href="price.html" class="dropdown-toggle btn btn-xs btn-primary" title="Upgrade"><i
                                class="fa fa-long-arrow-up"></i></a> </div>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right m-n hidden-xs nav-user">
                <li class="hidden-xs"> <a href="#" class="dropdown-toggle dk" data-toggle="dropdown"> <i class="fa fa-bell"></i>
                        <span class="badge badge-sm up bg-danger m-l-n-sm count">2</span> </a>
                    <section class="dropdown-menu aside-xl">
                        <section class="panel bg-white">
                            <!-- This for notification block -->
                            <header class="panel-heading b-light bg-light"> <strong>You have <span class="count">2</span>
                                    notifications</strong> </header>

                            <div class="list-group list-group-alt animated fadeInRight"> <a href="#" class="media list-group-item">
                                    <span class="pull-left thumb-sm"> <img src="images/Nikita.jpg" alt="Nikita said"
                                            class="img-circle"> </span> <span class="media-body block m-b-none"> Use
                                        awesome animate.css<br> <small class="text-muted">10 minutes ago</small> </span>
                                </a> <a href="#" class="media list-group-item"> <span class="media-body block m-b-none">
                                        1.0 initial released<br> <small class="text-muted">1 hour ago</small> </span>
                                </a> </div>
                            <footer class="panel-footer text-sm"> <a href="#" class="pull-right"><i class="fa fa-cog"></i></a>
                                <a href="#notes" data-toggle="class:show animated fadeInRight">See all the
                                    notifications</a> </footer>
                            <!-- This for notification block -->
                        </section>
                    </section>
                </li>
                <!-- Search_icon Block -->
                <li class="dropdown hidden-xs"> <a href="#" class="dropdown-toggle dker" data-toggle="dropdown"><i
                            class="fa fa-fw fa-search"></i></a>
                    <section class="dropdown-menu aside-xl animated fadeInUp">
                        <section class="panel bg-white">
                            <form role="search">
                                <div class="form-group wrapper m-b-none">
                                    <div class="input-group"> <input type="text" class="form-control" placeholder="Search">
                                        <span class="input-group-btn"> <button type="submit" class="btn btn-info btn-icon"><i
                                                    class="fa fa-search"></i></button> </span> </div>
                                </div>
                            </form>
                        </section>
                    </section>
                </li>
                <!-- End Search_icon Block -->
                <!-- Login_Profile Details -->
                <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <span class="thumb-sm avatar pull-left">
                            <img src="images/Nikita.jpg"> </span>Nikita_Pise <b class="caret"></b> </a>
                    <ul class="dropdown-menu animated fadeInRight"> <span class="arrow top"></span>
                        <li> <a href="#">Settings</a> </li>
                        <li> <a href="profile.html">Profile</a> </li>
                        <li> <a href="#"> <span class="badge bg-danger pull-right">3</span> Notifications </a> </li>
                        <li> <a href="docs.html">Help</a> </li>
                        <li class="divider"></li>
                        <li> <a href="modal.lockme.html" data-toggle="ajaxModal">Logout</a> </li>
                    </ul>
                </li>
                <!-- End Login_Profile Details -->
            </ul>
        </header>
        <!-- End Header -->
        <section>
            <section class="hbox stretch">
                <!-- .aside -->
                <aside class="bg-dark lter aside-md hidden-print hidden-xs" id="nav">
                    <section class="vbox">

                        <section class="w-f scrollable">
                            <div class="slim-scroll" data-height="auto" data-disable-fade-out="true" data-distance="0"
                                data-size="5px" data-color="#333333">
                                <!-- nav -->
                                <nav class="nav-primary hidden-xs">
                                    <ul class="nav">
                                        <li> <a href="index.html" class="active"> <i class="fa fa-dashboard icon">
                                                    <b class="bg-danger"></b> </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i>
                                                    <i class="fa fa-angle-up text-active"></i> </span> <span>Add</span>
                                            </a>
                                            <!-- This for sublist of Add -->
                                            <ul class="nav lt">
                                                <li> <a href="">
                                                        <i class="fa fa-angle-right"><b class="bg-danger"></b></i><span
                                                            class="pull-right">
                                                            <i class="fa fa-angle-down text"></i> <i class="fa fa-angle-up text-active"></i>
                                                        </span>
                                                        <span>Manager</span> </a>

                                                    <!-- this for sublist of Manager -->
                                                    <ul class="nav lt">
                                                        <li> <a href="saleManager.html" class="active">
                                                                <span>SalesManager</span> </a> </li>
                                                        <li> <a href="ServiceManager.html" class="active">
                                                                <span>ServiceManager</span> </a> </li>
                                                    </ul>
                                                    <!-- end of sublist of Manager -->
                                                </li>
											
                                                <li> <a href=""> <i class="fa fa-angle-right">
                                                            <b class="bg-danger"></b></i>

                                                        <span>Accountant</span> </a>

                                                </li>


                                            </ul>
                                            <!-- end of sublist of Add -->
                                        </li>
                                        <!-- This for User -->
                                        <li> <a href="#layout"> <i class="fa fa-columns icon"> <b class="bg-warning"></b>
                                                </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i> <i
                                                        class="fa fa-angle-up text-active"></i> </span> <span>User</span>
                                            </a>

                                        </li>
                                        <!-- End User -->
                                        <!-- This for Stock -->

                                        <li> <a href="#stock"> <i class="fa fa-flask icon"> <b class="bg-success"></b>
                                                </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i> <i
                                                        class="fa fa-angle-up text-active"></i> </span> <span>Stock</span>
                                            </a>
                                            <ul class="nav lt">
                                                <li> <a href="">
                                                          <i class="fa fa-angle-right"><b class="bg-danger"></b></i><span class="pull-right">
                                                            <i class="fa fa-angle-down text"></i> <i class="fa fa-angle-up text-active"></i> </span> 
                                                         <span>Bike</span> </a>
                                                     <!-- this for sublist of Bike -->
                                                         <ul class="nav lt">
                                                        <li> <a href="" class="active">
                                                            <span>New_Bike</span> </a> </li>
                                                        <li> <a href="" class="active">
                                                            <span>Old_Bike</span> </a> </li>
                                                        </ul>
                                                         <!-- end of sublist of Bike --> 
                                                    </li>
                                                <li> <a href="accessories.html"> 
                                                        <i class="fa fa-angle-right"></i> <span>Accesories</span> </a>
                                                </li>

                                                <li> <a href=""> <i class="fa fa-angle-right text"></i> <i class="fa fa-angle-down text-active"></i>
                                                        <span>Dead_stock</span> </a>
                                                    <ul class="nav bg">
                                                        <li> <a href="deadbike.html"> <i class="fa fa-angle-right"></i>
                                                                <span>Dead_Bike</span> </a> </li>
                                                        <li> <a href="deadaccessories.html"> <i class="fa fa-angle-right"></i>
                                                                <span>Dead_Accessories</span> </a> </li>
                                                    </ul>
                                                </li>

                                            </ul>
                                        </li>
                                      <!--  End Stock  --> 
                                      <!-- This for Sales -->
                                       
                                          <li> <a href="#stock"> <i class="fa fa-flask icon"> <b class="bg-success"></b>
                                            </i> <span class="pull-right">  <i class="fa fa-angle-up text-active"></i> 
                                            <i class="fa fa-angle-down text"></i></span> <span>Sale</span>
                                        </a>
                                        <ul class="nav lt">
                                            <li> <a href="">
                                                          <i class="fa fa-angle-right"><b class="bg-danger"></b></i><span class="pull-right">
                                                            <i class="fa fa-angle-up text-active"></i> <i class="fa fa-angle-down text"></i> </span> 
                                                         <span>Bike</span> </a> 
                                                         <!-- this for sublist of Bike -->
                                                         <ul class="nav lt">
                                                        <li> <a href="" class="active">
                                                            <span>New_Bike</span> </a> </li>
                                                        <li> <a href="" class="active">
                                                            <span>Old_Bike</span> </a> </li>
                                                        </ul>
                                                         <!-- end of sublist of Bike -->
                                                </li>
                                            <li> <a href="accessories.html"> <b class="badge bg-info pull-right"></b>
                                                    <i class="fa fa-angle-right"></i> <span>Accesories</span> </a>
                                             </li>
                       
                                        </ul>
										</li>
										<!--End Sales -->
												<!-- This for View -->
                                        <li> <a href="#view"> <i class="fa fa-user icon"> <b class="bg-warning"></b>
                                                </i> <span class="pull-right"> <i class="fa fa-angle-down text"></i> <i
                                                        class="fa fa-angle-up text-active"></i> </span> <span>View</span>
                                            </a>
                                            <ul class="nav lt">
                                                <li> <a href="salemanagerlist.html" class="active">
                                                        <i class="fa fa-angle-right"></i> 
                                                        <span>SalesManager</span> </a> </li>
                                                <li> <a href="servicemanagerlist.html" class="active">
                                                        <i class="fa fa-angle-right"></i> 
                                                        <span>ServiceManager</span> </a> </li>
                                                <li> <a href="accountantlist.html" class="active">
                                                        <i class="fa fa-angle-right"></i> 
                                                        <span>Accountant</span> </a> </li>
                                                <li> <a href="dealerlist.html" class="active">
                                                        <i class="fa fa-angle-right"></i> 
                                                        <span>Dealer</span> </a> </li>
                                                <li> <a href="userlist.html" class="active">
                                                        <i class="fa fa-angle-right"></i> 
                                                         <span>User</span> </a> </li>
                                            </ul>
                                            
                                        </li>
                                        <!-- End view -->
                                        </li>
                                        <!-- End Stock -->
                                        <li> <a href="mail.html"> <b class="badge bg-danger pull-right">3</b> <i class="fa fa-envelope-o icon">
                                                    <b class="bg-primary dker"></b> </i> <span>Message</span> </a> </li>
                                        <li> <a href="notebook.html"> <i class="fa fa-pencil icon"> <b class="bg-info"></b>
                                                </i> <span>Notes</span> </a> </li>
                                    </ul>
                                </nav> <!-- / nav -->
                            </div>
                        </section>
                        <footer class="footer lt hidden-xs b-t b-dark">
                            <div id="chat" class="dropup">
                                <section class="dropdown-menu on aside-md m-l-n">

                                </section>
                            </div>
                            <div id="invite" class="dropup">
                                <section class="dropdown-menu on aside-md m-l-n">
                                    <section class="panel bg-white">
                                        <header class="panel-heading b-b b-light"> John <i class="fa fa-circle text-success"></i>
                                        </header>
                                        <div class="panel-body animated fadeInRight">
                                            <p class="text-sm">No contacts in your lists.</p>
                                            <p><a href="#" class="btn btn-sm btn-facebook"><i class="fa fa-fw fa-facebook"></i>
                                                    Invite from Facebook</a></p>
                                        </div>
                                    </section>
                                </section>
                            </div> <a href="#nav" data-toggle="class:nav-xs" class="pull-right btn btn-sm btn-dark btn-icon">
                                <i class="fa fa-angle-left text"></i> <i class="fa fa-angle-right text-active"></i> </a>
                            <div class="btn-group hidden-nav-xs"> <button type="button" title="Chats" class="btn btn-icon btn-sm btn-dark"
                                    data-toggle="dropdown" data-target="#chat"><i class="fa fa-comment-o"></i></button>
                                <button type="button" title="Contacts" class="btn btn-icon btn-sm btn-dark" data-toggle="dropdown"
                                    data-target="#invite"><i class="fa fa-facebook"></i></button> </div>
                        </footer>
                    </section>
                </aside> <!-- /.aside -->
                <section id="content">
                    <section class="vbox">
                        <!-- <section class="scrollable padder">

                            <div class="content-header">
                            <ul class="breadcrumb no-border no-radius b-b b-light pull-in">
                                <li><a href="index.html"><i class="fa fa-home"></i> Home</a></li>
                            </ul>
                            <div class="m-b-md">
                                <h3 class="m-b-none">Workset</h3> <small>Welcome back,Royal_Enfield</small>
                            </div>
                        </div>
                        </section> -->
                        <!-- Compose mail -->
                        <div class="container">
                                <div class="card card-primary card-outline">
                                    <div class="card-header">
                                        <h3 class="card-title">Compose New Message</h3>
                                    </div>
                                    <!-- /.card-header -->
                                    <div class="card-body">
                                        <div class="form-group">
                                            <input class="form-control" placeholder="To:">
                                        </div>
                                        <div class="form-group">
                                            <input class="form-control" placeholder="Subject:">
                                        </div>
                                        <div class="form-group">
                                            <textarea id="compose-textarea" class="form-control" style="height: 300px">                      &lt;h1&gt;&lt;u&gt;Heading Of Message&lt;/u&gt;&lt;/h1&gt;
                                          &lt;h4&gt;Subheading&lt;/h4&gt;
                                          &lt;p&gt;But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain
                                            was born and I will give you a complete account of the system, and expound the actual teachings
                                            of the great explorer of the truth, the master-builder of human happiness. No one rejects,
                                            dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know
                                            how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again
                                            is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain,
                                            but because occasionally circumstances occur in which toil and pain can procure him some great
                                            pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise,
                                            except to obtain some advantage from it? But who has any right to find fault with a man who
                                            chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that
                                            produces no resultant pleasure? On the other hand, we denounce with righteous indignation and
                                            dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so
                                            blinded by desire, that they cannot foresee&lt;/p&gt;
                                          &lt;ul&gt;
                                            &lt;li&gt;List item one&lt;/li&gt;
                                            &lt;li&gt;List item two&lt;/li&gt;
                                            &lt;li&gt;List item three&lt;/li&gt;
                                            &lt;li&gt;List item four&lt;/li&gt;
                                          &lt;/ul&gt;
                                          &lt;p&gt;Thank you,&lt;/p&gt;
                                          &lt;p&gt;John Doe&lt;/p&gt;
                                        </textarea>
                                        </div>
                                        <div class="form-group">
                                            <div class="btn btn-default btn-file">
                                                <i class="fa fa-paperclip"></i> Attachment
                                                <input type="file" name="attachment">
                                            </div>
                                            <p class="help-block">Max. 32MB</p>
                                        </div>
                                    </div>
                                    <!-- /.card-body -->
                                    <div class="card-footer">
                                        <div class="float-right">
                                            <button type="button" class="btn btn-default"><i class="fa fa-pencil"></i>
                                                Draft</button>
                                            <button type="submit" class="btn btn-primary"><i class="fa fa-envelope-o"></i>
                                                Send</button>
                                        </div>
                                        <button type="reset" class="btn btn-default"><i class="fa fa-times"></i>
                                            Discard</button>
                                    </div>
                                    <!-- /.card-footer -->
                                </div>
                                <!-- /. box -->
                        </div>

                            <!-- End compose -->

                            <aside class="bg-light lter b-l aside-md hide" id="notes">
                                <div class="wrapper">Notification</div>
                            </aside>
                    </section>
                </section>
            </section> <!-- Bootstrap -->
             <!-- App -->
   			 <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/app.v1.js"></script>
   			 <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/easypiechart/jquery.easy-pie-chart.js"></script>
    		 <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/sparkline/jquery.sparkline.min.js"></script>
    		 <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.min.js"></script>
    		 <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.tooltip.min.js"></script>
    		 <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.resize.js"></script>
       		 <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/jquery.flot.grow.js"></script>
   			 <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/charts/flot/demo.js"></script>
   			 <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/calendar/bootstrap_calendar.js"></script>
   			 <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/calendar/demo.js"></script>
   			 <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/sortable/jquery.sortable.js"></script>
   			 <script src="${pageContext.request.contextPath}/Resources/notebook UI/js/app.plugin.js"></script>
            



</body>
</html>