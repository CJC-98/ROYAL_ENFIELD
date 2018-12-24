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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/datatables/datatables.css"type="text/css" />
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js"></script> <script src="js/ie/respond.min.js"></script> <script src="js/ie/excanvas.js"></script> <![endif]-->
<script type="text/javascript">
function sortTable(n) {
	  var table, rows, switching,shouldSwitch, dir, switchcount = 0;
	  var y,x;
	  table = document.getElementById("table");
	  switching = true;
	  //Set the sorting direction to ascending:
	  dir = "asc"; 
	  /*Make a loop that will continue until
	  no switching has been done:*/
	  while (switching) {
	    //start by saying: no switching is done:
	    switching = false;
	    rows = table.rows;
	    /*Loop through all table rows (except the
	    first, which contains table headers):*/
	    for (i = 1; i < (rows.length - 2); i++) {
	      //start by saying there should be no switching:
	      shouldSwitch = false;
	      /*Get the two elements you want to compare,
	      one from current row and one from the next:*/
	      x = rows[i].getElementsByTagName("TD")[n];
	     // alert(x.innerHTML.toLowerCase());
	      y = rows[i + 1].getElementsByTagName("TD")[n];
	      /*check if the two rows should switch place,
	      based on the direction, asc or desc:*/
	      if (dir == "asc") {
	    	  //alert(i);
	        if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
	          //if so, mark as a switch and break the loop:
	          shouldSwitch= true;
	          break;
	        }
	      } else if (dir == "desc") {
	        if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
	          //if so, mark as a switch and break the loop:
	          shouldSwitch = true;
	          break;
	        }
	      }
	    }
	    if (shouldSwitch) {
	      /*If a switch has been marked, make the switch
	      and mark that a switch has been done:*/
	      rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
	      switching = true;
	      //Each time a switch is done, increase this count by 1:
	      switchcount ++;      
	    } else {
	      /*If no switching has been done AND the direction is "asc",
	      set the direction to "desc" and run the while loop again.*/
	      if (switchcount == 0 && dir == "asc") {
	        dir = "desc";
	        switching = true;
	      }
	    }
	  }
	}
</script>
</head>
<body class="">
    
                <section id="content" class="bg-light lter">
                    <section class="vbox">
                        <section class="scrollable padder">

                            <div class="content-header">
                            <ul class="breadcrumb no-border no-radius b-b b-light pull-in">
                                <li><a href="index.html"><i class="fa fa-home"></i> Home</a></li>
                            </ul>
                            <div class="m-b-md">
                                <h3 class="m-b-none">Workset</h3> <small>Welcome back,Royal_Enfield</small>
                            </div>
                        </div>
                        </section>
                        <!-- Table  -->
                        <div class="row text-center m-b-md">
                                <section class="scrollable padder">
                                <h3><b>Sold_Old_Bike_Stock</b></h3>
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
                                            <table id="table" class="table table-bordered table-striped dataTable" 
                                            role="grid" aria-describedby="example1_info">
     
                                            
     
                                            
                                  <thead>
                                  <tr role="row">
                                  <th class="sorting_asc" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" aria-sort="ascending" 
                                            aria-label="Rendering engine: activate to sort column descending"
                                            style="width: 125px;" onclick="sortTable(0)">Old_Bike_Id
                                      </th>
                                      <th class="sorting_asc" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" aria-sort="ascending" 
                                            aria-label="Rendering engine: activate to sort column descending"
                                            style="width: 125px;" onclick="sortTable(1)">Total_Km_Run
                                      </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" aria-label="Browser: 
                                            activate to sort column ascending" 
                                            style="width: 125px;"onclick="sortTable(2)">Bike_Condition
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" aria-label="Platform(s): 
                                            activate to sort column ascending" 
                                            style="width: 125px;"onclick="sortTable(3)">Bike_Mfg_Year
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                             rowspan="1" colspan="1" 
                                            aria-label="Engine version: activate to sort column ascending" 
                                            style="width: 125px;"onclick="sortTable(4)">Bike_Purchase_Year
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;"onclick="sortTable(5)">Bike_Service_Status
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;"onclick="sortTable(6)">Mobile_Number
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;"onclick="sortTable(7)">Registration_Number
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;"onclick="sortTable(8)">Tax_Paid_Details
                                        </th>
                                         <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;"onclick="sortTable(9)">Tax_Remaining
                                        </th>
                                         <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;"onclick="sortTable(10)">Seller_Details
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;"onclick="sortTable(11)">Bike_Mileage
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;"onclick="sortTable(12)">Bike_Image
                                        </th>
                                       
                                    </tr>
                                  </thead>
                                  <tbody>
                                  <c:forEach items="${soldOldBikeStockList}" var="soldOldBikeStock">
                                    <tr role="row" class="odd">
                                    <!-- <td class="sorting"></td> -->
                                    <td>${soldOldBikeStock.oldBikeId}</td>
                                    <td>${soldOldBikeStock.totalKmRun}</td>
                                    <td>${soldOldBikeStock.bikeCondition}</td>
                                    <td>${soldOldBikeStock.bikeMfgYear}</td>
                                    <td>${soldOldBikeStock.bikePurchaseYear}</td>
                                    <td>${soldOldBikeStock.bikeServiceStatus}</td>
                                    <td>${soldOldBikeStock.mobileNumber}</td>
                                    <td>${soldOldBikeStock.registrationNo}</td>
                                    <td>${soldOldBikeStock.taxPaidDetails}</td>
                                    <td>${soldOldBikeStock.taxRemaining}</td>
                                    <td>${soldOldBikeStock.sellerDetails}</td>
                                    <td>${soldOldBikeStock.bikeMileage}</td>
                                    <td>${soldOldBikeStock.bikeImage}</td>
                                    
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
								id="DataTables_Table_0_last">Last</a>
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
            </section> 
</body>
</html>