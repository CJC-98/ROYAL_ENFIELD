<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hello</title>
</head>
<body>
 <section class="panel panel-default">
                                        <header class="panel-heading bg-light">
                                            <ul class="nav nav-tabs nav-justified">
                                                <li class="active"><a href="#home" data-toggle="tab">Home</a></li>
                                                <li><a href="#profile" data-toggle="tab">Profile</a></li>
                                                <li><a href="#messages" data-toggle="tab">Messages</a></li>
                                                <li><a href="#settings" data-toggle="tab">Settings</a></li>
                                            </ul>
                                        </header>
                                        <div class="panel-body">
                                            <div class="tab-content">
                                                <div class="tab-pane active" id="home">home</div>
                                                <div class="tab-pane" id="profile">profile</div>
                                                <div class="tab-pane" id="messages">message</div>
                                                <div class="tab-pane" id="settings">settings</div>
                                            </div>
                                        </div>
                                         </section> <!-- /  .nav-justified -->
                                    <!-- left tab -->
                                    <section class="panel panel-default">
                                        <header class="panel-heading bg-light">
                                            <ul class="nav nav-tabs pull-right">
                                                <li class="active"><a href="#messages-1" data-toggle="tab"><i class="fa fa-comments text-default"></i></a></li>
                                                <li><a href="#profile-1" data-toggle="tab"><i class="fa fa-user text-default"></i>
                                                        Profile</a></li>
                                                <li><a href="#settings-1" data-toggle="tab"><i class="fa fa-cog text-default"></i>
                                                        Settings</a></li>
                                            </ul> <span class="hidden-sm">Right tab</span>
                                        </header>
                                        <div class="panel-body">
                                            <div class="tab-content">
                                                <div class="tab-pane active" id="messages-1">message</div>
                                                <div class="tab-pane" id="profile-1">profile</div>
                                                <div class="tab-pane" id="settings-1">settings</div>
                                            </div>
                                        </div>
</body>
</html>