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
    <link>
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>
<body class="">
    <section id="content" class="bg-light lter">
        			<section class="vbox">
           				 <section class="scrollable padder">
           				 <section class="panel panel-default">
                        <div class="container">
                         <form action="sendEmail" method="post" enctype="multipart/form-data">
                         <input type="hidden" name="designation" value="${designationId}">
                                <div class="card card-primary card-outline">
                                    <div class="card-header">
                                        <h3 class="card-title">Compose New Message</h3>
                                    </div>
                                    <!-- /.card-header -->
                                    <div class="card-body">
                                        <div class="form-group">
                                            <input class="form-control" placeholder="To:" name="to_address">
                                        </div>
                                        <div class="form-group">
                                            <input class="form-control" placeholder="Subject:" name="subject">
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
                                         
                                            <button type="submit" class="btn btn-primary"><i class="fa fa-envelope-o"></i>
                                                Send</button>
                                        </div>
                                                </div>
                                    <!-- /.card-footer -->
                                </div>
                                <!-- /. box -->
                               </form>
                                 </div>
                                </section>
                       

                            <!-- End compose -->

                            <aside class="bg-light lter b-l aside-md hide" id="notes">
                                <div class="wrapper">Notification</div>
                            </aside>
                    </section>
                </section>
            </section> 
             
</body>
</html>