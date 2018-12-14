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
    
                <section id="content">
                    <section class="vbox">
                        <div class="row">
                            <section class="scrollable padder">
                                    <section class="scrollable padder">
                                        <div class="content-header">
                                            <ul class="breadcrumb no-border no-radius b-b b-light pull-in">
                                                <li><a href="index.html"><i class="fa fa-home"></i> Home</a></li>
                                            </ul>
                                            <div class="m-b-md">
                                                <h3 class="m-b-none">Workset</h3>
                                                <small>Welcome back,Royal_Enfield</small>
                                            </div>
                                        </div>
                                     </section>
                                    </section>
                        </div>
                        <!-- Table  -->
                        <div class="row text-center m-b-md">
                                <section class="scrollable padder">
                                <h3><b>Bike_Offer</b></h3>
                                </section>
                        </div>
                        <div class="row ">
                        <section class="scrollable padder">
                        <div class="container">
                                <div id="example1_wrapper" class="dataTables_wrapper dt-bootstrap4">
                                    <div class="row">
                                        <div class="col-sm-12 col-md-6">
                                            <div class="dataTables_length" id="example1_length">
                                                <label>Show 
                                                    <select name="example1_length" aria-controls="example1" 
                                                    class="custom-select custom-select-sm form-control form-control-sm">
                                                        <option value="10">10</option>
                                                        <option value="25">25</option>
                                                        <option value="50">50</option>
                                                        <option value="100">100</option>
                                                    </select> entries
                                                </label>
                                            </div>
                                        </div>
                                        <div class="col-sm-12 col-md-6">
                                            <div id="example1_filter" class="dataTables_filter">
                                                <label>Search:
                                                    <input type="search" class="form-control form-control-sm" 
                                                    placeholder="" aria-controls="example1">
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <table id="example1" class="table table-bordered table-striped dataTable" 
                                            role="grid" aria-describedby="example1_info">
                                  <thead>
                                  <tr role="row">
                                      <th class="sorting_asc" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" aria-sort="ascending" 
                                            aria-label="Rendering engine: activate to sort column descending"
                                            style="width: 125px;">Offer_Name
                                      </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" aria-label="Browser: 
                                            activate to sort column ascending" 
                                            style="width: 125px;">Start_Date
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" aria-label="Platform(s): 
                                            activate to sort column ascending" 
                                            style="width: 125px;">End_Date
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                             rowspan="1" colspan="1" 
                                            aria-label="Engine version: activate to sort column ascending" 
                                            style="width: 125px;">DiscountInPercentage
                                        </th>
                                        
                                    </tr>
                                  </thead>
                                  <tbody>
                                    <tr role="row" class="odd">
                                    <td class="sorting"></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    
                                  
                                  </tbody>
                                  <tfoot>
                                  <tr>
                                 	 <th rowspan="1" colspan="1">Offer_Name</th>
                                    <th rowspan="1" colspan="1">Start_Date</th>
                                    <th rowspan="1" colspan="1">End_Date</th>
                                    <th rowspan="1" colspan="1">DiscountInPercentage</th>
                                    </tr>
                                  </tfoot>
                                </table>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12 col-md-5">
                                <div class="dataTables_info" id="example1_info" role="status" aria-live="polite">Showing 1 to 10 of 57 entries</div>
                            </div>
                            <div class="col-sm-12 col-md-7">
                                <div class="dataTables_paginate paging_simple_numbers" id="example1_paginate">
                                    <ul class="pagination">
                                    <li class="paginate_button page-item previous disabled" id="example1_previous">
                                        <a href="#" aria-controls="example1" data-dt-idx="0" tabindex="0" class="page-link">Previous</a>
                                    </li>
                                    <li class="paginate_button page-item active">
                                        <a href="#" aria-controls="example1" data-dt-idx="1" tabindex="0" class="page-link">1</a>
                                    </li>
                                    <li class="paginate_button page-item ">
                                        <a href="#" aria-controls="example1" data-dt-idx="2" tabindex="0" class="page-link">2</a>
                                    </li>
                                    <li class="paginate_button page-item ">
                                        <a href="#" aria-controls="example1" data-dt-idx="3" tabindex="0" class="page-link">3</a>
                                    </li>
                                    <li class="paginate_button page-item ">
                                        <a href="#" aria-controls="example1" data-dt-idx="4" tabindex="0" class="page-link">4</a>
                                    </li>
                                    <li class="paginate_button page-item ">
                                        <a href="#" aria-controls="example1" data-dt-idx="5" tabindex="0" class="page-link">5</a>
                                    </li>
                                    <li class="paginate_button page-item ">
                                        <a href="#" aria-controls="example1" data-dt-idx="6" tabindex="0" class="page-link">6</a>
                                    </li>
                                    <li class="paginate_button page-item next" id="example1_next">
                                        <a href="#" aria-controls="example1" data-dt-idx="7" tabindex="0" class="page-link">Next</a>
                                    </li>
                                    </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </div>
                         </section>
                        </div>
                         <!-- End table -->

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