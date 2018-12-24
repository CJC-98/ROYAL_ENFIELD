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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/css/app.v1.css" type="text/css" />
    <link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/notebook UI/js/datatables/datatables.css"
	type="text/css" />
	
	<script type="text/javascript">
	function editEmployee() 
	{
		alert("edit");
		document.myform.action="editEmployee";
		document.myform.submit();
		
	}
	
	function updateEmployee(employee) 
	{
		alert("update");
		document.myform.action="updateEmployee?employee="+employee;
		document.myform.submit();
	}
	function remove() 
	{
		alert("remove");
		document.myform.action="removeEmployee";
		document.myform.submit();
	}
	
	</script>
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
<body>
<form action="" name="myform">
	
    <section id="content" class="bg-light lter">
        <section class="vbox">
            
                        <!-- Table  -->
                        
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
                                            style="width: 125px;" onclick="sortTable(0)">Employee_id
                                      </th>

                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" aria-label="Browser: 
                                            activate to sort column ascending" 

                                            style="width: 125px;">ProfilePicture

                                            style="width: 125px;"onclick="sortTable(1)">Name

                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" aria-label="Platform(s): 
                                            activate to sort column ascending" 

                                            style="width: 125px;">Name

                                            style="width: 125px;"onclick="sortTable(2)">City

                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                             rowspan="1" colspan="1" 
                                            aria-label="Engine version: activate to sort column ascending" 

                                            style="width: 125px;">MobileNumber
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;">DateOfBrith


                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;"onclick="sortTable(4)">Email
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 

                                            style="width: 125px;">Joining_Date

                                            style="width: 125px;"onclick="sortTable(5)">Password

                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" 
                                            rowspan="1" colspan="1" 
                                            aria-label="CSS grade: activate to sort column ascending" 
                                            style="width: 125px;">
                                        </th>
                                        
                                    </tr>
                                  </thead>
                                  <tbody>

                                  <c:forEach items="${employeeList}" var="employeeList">

                                    <tr role="row" class="odd">

                                    <td><img  src="${pageContext.request.contextPath}/Resources/images/EmployeeProfilePicture/person1.jpg" width="50"></td>
                                    <td>${ employee.employeeName}</td>
                                    <td>${ employee.employeeMobileNumber}</td>
                                    <td>${ employee.employeeDateOfBirth}</td>
                                    <td>${ employee.employeeEmail}</td>
                                 	<td>${ employee.employeeJoiningDate}</td>
                                    <td>
                                     <div> 
                                     	<!-- Button to Open the Popup -->
                                   
		                                   <button type="button" 
		                                     class="btn btn-primary " 
                                    		 data-toggle="modal"
                                     		 data-target="#editdata" onclick="editEmployee(${employee})">Edit
  										   </button>
    								 		<button type="button" 
    											 class="btn btn-danger" 
    											 data-toggle="modal" 
    											 data-target="" onclick="removeEmployee()">Remove
 									 		</button>
    									
                                    </td>
                                    
                                   
										<!-- The Modal -->
  						<div class="modal" id="editdata">
    						<div class="modal-dialog">
      						   <div class="modal-content">
      
       								 <!-- Modal Header -->
        								<div class="modal-header">
          								<h4 class="modal-title">Employee_Details</h4>
         								 <button type="button" 
         								 class="close" 
         								 data-dismiss="modal">&times;</button>
        								</div>
        
       								 <!-- Modal body -->
        								<div class="modal-body">
        								  <div class="form-group">
        								  <input type="hidden" name="employeeId" value="${employee.employeeId}">
										    <label for="name">Name:</label>
										 	<input type="text"
											class="form-control" 
											id="name" placeholder="Enter name"
											name="employeeName" value="${employee.employeeName}" required>
										   </div>
        								
          									<div class="form-group">
												<label for="address">Address:</label>
												<div class="row">
												<div class="col-md-6">
													<input type="text" 
													class="form-control" 
													id="employeeAreaName"
													placeholder="Enter areaname"
												 	name="employeeAreaName" value="${employee.employeeAreaName}" required>
												</div>
												<div class="col-md-6">
													<input type="text" 
													class="form-control" 
													id="cityname"
													placeholder="Enter cityname" 
													name="employeeCityName" value="${employee.employeeCityName}" required>
												</div>
												</div>
											</div>
        								
          								<div class="form-group">
											<div class="row">
												<div class="col-md-6">
													<input type="text" 
													class="form-control" 
													id="employeeStateName"
													placeholder="Enter statename" 
													name="employeeStateName" value="${employee.employeeStateName}" required>
												</div>
												<div class="col-md-6">
													<input type="text" 
													class="form-control"
													id="employeeCountryName" 
													placeholder="Enter countryname"
													name="employeeCountryName" value="${employee.employeeCountryName}" required>
												</div>
											</div>
									</div>
									<div class="form-group">
											<div class="row">
												<div class="col-md-6">
													<input type="text" 
													class="form-control" id="pincode"
													placeholder="Enter pincode" 
													name="employeePincode" value="${employee.employeePincode}" required>
												</div>
											</div>
									</div>
								<div class="row">
										<div class="col-md-6">
											<!-- mobile no -->
												<div class="form-group">
													<label>Mobile no:</label> 
													<input type="text"
													class="form-control" 
													data-type="phone"
													placeholder="(XXX) XXXX XXX" 
													data-required="true" 
													name="employeeMobileNumber" value="${employee.employeeMobileNumber}">
												</div>
										</div>
										
							<div class="col-md-6">
							
								<div class="form-group">
									<label for="employeeDateOfBirth">Date Of Birth:</label> <input
										class="form-control" type="date" name="employeeDateOfBirth" value="${employee.employeeDateOfBirth}" required>
								</div>
							</div>
							</div>
							<div class="row">
								
										<div class="col-md-6">
											<label for="employeeDateOfJoining">Date Of Joining:</label> <input
												class="form-control" type="date" name="employeeDateOfJoining" value="${employee.employeeJoiningDate}" required>
											</div>
								
									 <div class="col-md-6">
										<div class="form-group">
											<label for="employeeEmail">Email:</label>
												<div class="form-group">
												<input id="email"
													type="text" class="form-control" 
													name="employeeEmail" 
													placeholder="Email" data-type="email"
													data-required="true" value="${employee.employeeEmail}">
												</div>
											<div class="emailMessage"></div>
										</div>
									</div>
							</div>
							<div class="row">
							<div class="col-md-6">
								<!-- password -->
								<div class="form-group">

									<label for="employeePassword">Password:</label>
									<div class="form-group">
										<input id="password"
											type="password" class="form-control" 
											name="employeePassword" 
											placeholder="Password" value="${employee.employeePassword}">
									</div>

								</div>

							</div>
							<div class="col-md-6">
								<!--Confirm password -->
								<div class="form-group">

									<label for="employeePassword">Confirm Password:</label>
									<div class="form-group">
										<input id="confirmPassword" type="password" class="form-control"
											 placeholder="Password" value="${employee.employeePassword}"
											onchange="checkPassword()">
									</div>
									<small id="passwordMessage" class="alert-danger"></small>
								</div>
							</div>
						</div>
							<!-- Model Footer -->
							<div class="modal-footer">
          								<div class="row">
          								
          									<div class="col-md-6">
         								 		<button type="button" 
         								 		class="btn btn-primary" 
         								 		data-togal="modal" onclick="updateEmployee('${employee}')">Update</button>
         								 	</div>
          									<div class="col-md-6">
         								 		<button type="button" 
         								 		class="btn btn-danger" 
         								 		data-dismiss="modal">Close</button>
         								 	</div>
         								 	
         								 	
        								</div>
        					</div>
							
							<!--End Footer  -->
							</div>
						</div>
    				</div>
  				</div>
 
 					
                                   	</tr>

                                  </c:forEach>
                                  </tbody>
                                  <tfoot>
                                  <tr><th rowspan="1" colspan="1">ProfilePicture</th>
                                    <th rowspan="1" colspan="1">Name</th>
                                    <th rowspan="1" colspan="1">MobileNumber</th>
                                    <th rowspan="1" colspan="1">DateOfBirth</th>
                                    <th rowspan="1" colspan="1">Email</th>

                                    <th rowspan="1" colspan="1">Joining_Date</th>
                                    <th></th>
                                    </tr>

                                    <th rowspan="1" colspan="1">Password</th></tr>

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
</form>
</body>
</html>