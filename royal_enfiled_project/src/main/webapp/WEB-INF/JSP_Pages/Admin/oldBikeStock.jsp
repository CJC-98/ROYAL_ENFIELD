<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
   <link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/datatables/datatables.css"
	type="text/css" />
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
</head>
<body class="">
    
                <section id="content" class="bg-light lter">
                    <section class="vbox">
                        <section class="scrollable padder">

                            <ul class="breadcrumb no-border no-radius b-b b-light pull-in">
                                <li><a href="index.html"><i class="fa fa-home"></i> Home</a></li>
                                <li><a href="#">Stock</a></li>
                                <li><a href="#">Bike</a></li>
                                 <li><a href="#">OldBikeStock</a></li>
                                
                              
                            </ul>
                            <div class="m-b-md">
                                <h3 class="m-b-none">OldBikeStock</h3>
                            </div>
                            <section class="panel panel-default">
                     
                        <!-- Table  -->
                       
                        <div class="row ">
                        
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
                                            style="width: 125px;">Old_Bike_Id
                                      </th>
                                      <th class="sorting_asc" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" aria-sort="ascending" 
                                            aria-label="Rendering engine: activate to sort column descending"
                                            style="width: 125px;">Total_Km_Run
                                      </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" aria-label="Browser: 
                                            activate to sort column ascending" 
                                            style="width: 125px;">Bike_Condition
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" aria-label="Platform(s): 
                                            activate to sort column ascending" 
                                            style="width: 125px;">Bike_Mfg_Year
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                             rowspan="1" colspan="1" 
                                            aria-label="Engine version: activate to sort column ascending" 
                                            style="width: 125px;">Bike_Purchase_Year
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;">Bike_Service_Status
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;">Mobile_Number
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;">Registration_Number
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;">Tax_Paid_Details
                                        </th>
                                         <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;">Tax_Remaining
                                        </th>
                                         <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;">Seller_Details
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;">Bike_Mileage
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;">Bike_Image
                                        </th>
                                       
                                    </tr>
                                  </thead>
                                  <tbody>
                                  <c:forEach items="${oldBikeStockList}" var="oldBikeStock">
                                    <tr role="row" class="odd">
                                    <!-- <td class="sorting"></td> -->
                                    <td>${oldBikeStock.oldBikeId}</td>
                                    <td>${oldBikeStock.totalKmRun}</td>
                                    <td>${oldBikeStock.bikeCondition}</td>
                                    <td>${oldBikeStock.bikeMfgYear}</td>
                                    <td>${oldBikeStock.bikePurchaseYear}</td>
                                    <td>${oldBikeStock.bikeServiceStatus}</td>
                                    <td>${oldBikeStock.mobileNumber}</td>
                                    <td>${oldBikeStock.registrationNo}</td>
                                    <td>${oldBikeStock.taxPaidDetails}</td>
                                    <td>${oldBikeStock.taxRemaining}</td>
                                    <td>${oldBikeStock.sellerDetails}</td>
                                    <td>${oldBikeStock.bikeMileage}</td>
                                    <td>${oldBikeStock.bikeImage}</td>
                                    </tr>
                                  </c:forEach>
                                  </tbody>
                                  <tfoot>
                                  <tr>
                                  <th rowspan="1" colspan="1">Old_Bike_Id</th>
                                  <th rowspan="1" colspan="1">Total_Km_Run</th>
                                    <th rowspan="1" colspan="1">Bike_Condition</th>
                                    <th rowspan="1" colspan="1">Bike_Mfg_Year</th>
                                    <th rowspan="1" colspan="1">Bike_Purchase_Year</th>
                                    <th rowspan="1" colspan="1">Bike_Service_Status</th>
                                    <th rowspan="1" colspan="1">Mobile_Number</th>
                                    <th rowspan="1" colspan="1">Registration_Number</th>
                                    <th rowspan="1" colspan="1">Tax_Paid_Details</th>
                                    <th rowspan="1" colspan="1">Tax_Remaining</th>
                                    <th rowspan="1" colspan="1">Seller_Details</th>
                                    <th rowspan="1" colspan="1">Bike_Mileage</th>
                                      <th rowspan="1" colspan="1">Bike_Image</th>
                                        
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
                               <div class="dataTables_paginate paging_full_numbers"
							id="DataTables_Table_0_paginate">
<a class="paginate_button first disabled"
								aria-controls="DataTables_Table_0" data-dt-idx="0" tabindex="0"
								id="DataTables_Table_0_first">First</a><a
								class="paginate_button previous disabled"
								aria-controls="DataTables_Table_0" data-dt-idx="1" tabindex="0"
								id="DataTables_Table_0_previous">Previous</a><span></span><a
								class="paginate_button next disabled"
								aria-controls="DataTables_Table_0" data-dt-idx="2" tabindex="0"
								id="DataTables_Table_0_next">Next</a><a
								class="paginate_button last disabled"
								aria-controls="DataTables_Table_0" data-dt-idx="3" tabindex="0"
								id="DataTables_Table_0_last">Last</a>                                    </div>
                                </div>
                            </div>
                        </div>
                        </div>
                                                </div>
                         </section>

                         <!-- End table -->
                        
                        

                            <aside class="bg-light lter b-l aside-md hide" id="notes">
                                <div class="wrapper">Notification</div>
                            </aside>
                    </section>
                </section>
            </section> 
</body>
</html>