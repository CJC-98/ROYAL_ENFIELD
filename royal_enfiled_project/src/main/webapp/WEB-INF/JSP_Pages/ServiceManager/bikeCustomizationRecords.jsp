<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
    <title>Notebook | Web Application</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/css/font.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/js/calendar/bootstrap_calendar.css" type="text/css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Resources/notebook UI/css/app.v1.css" type="text/css" />
</head>
	<script>
		function releaseBike() {
			
			//change button text, color, and disable it
			document.getElementById("myBtn").value = "Bike Released";
			document.getElementById("myBtn").setAttribute("class","btn btn-md btn-danger btn-rounded");
		    document.getElementById("myBtn").setAttribute("disabled",true);
		    
		    //change text and color 
		    document.getElementById("releaseStatus").innerText = "bike released";
		    document.getElementById("releaseStatus").style.color = "#FF681B";
		    
		}
	</script>
	

<body>
	<section id="content"  class="bg-light lter">
	        <section class="vbox">
	            <section class="scrollable padder">                                               
	                                
	                <div class="m-b-md">
	                    <h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">Bike Customization Records</h3>	               
	                </div>
	             
	              <!-- first table starts -->
                	<div class="col-sm-12">
                                    <section class="panel panel-default">
                                        <table class="table table-striped m-b-none b-a">
                                            <thead>
                                                <tr>
                                                    <th style="text-align: center">Id</th>
                                                    <th style="text-align: center">Appnt. Date</th>
                                                    <th style="text-align: center">Plate Number</th>
                                                    <th style="text-align: center">Chassis Number</th>
                                                    <th style="text-align: center">Payment Status</th>
                                                    <th style="text-align: center">Bike Release</th>
                                                    <th style="text-align: center">Release Status</th>       
                                                </tr>
                                            </thead>
                                             
                                            <tbody>
                                            
                                                <tr style="text-align: center">
                                                    	 <td>BC3451</td>
                                                         <td>08-10-18</td>
                                                         <td>MH12 AC 2345</td>
                                                         <td>T434528</td>
                                                         <td style="color: #FF681B">unpaid</td>
                                                         <td> 
                                                            <input type="button" class="btn btn-md btn-success btn-rounded" id="myBtn1" onclick="releaseBike()" value="Release Bike" disabled/>
                                                         </td>
                                                         <td style="color: #81EF19">on-hold</td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>BC3452</td>
                                                         <td>05-10-18</td>
                                                         <td>MH29 AD 1254</td>
                                                         <td>C434528</td>
                                                         <td style="color: #81EF19">paid</td>                           
                                                         <td>
                                                         	<input type="button" class="btn btn-md btn-success btn-rounded" id="myBtn" onclick="releaseBike()" value="Release Bike" />
                                                        </td>
                                                        <td style="color: #81EF19"  id="releaseStatus">on-hold</td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>BC8663</td>
                                                         <td>08-09-18</td>
                                                         <td>MH32 X 8546</td>
                                                          <td>H734528</td>
                                                         <td style="color: #81EF19">paid</td>
                                                         <td>
                                                         	<input type="button" class="btn btn-md btn-danger btn-rounded" id="myBtn4" onclick="releaseBike()" value="Bike Released" disabled/>
                                                        </td>
                                                        <td style="color: #FF681B">bike released</button></td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>BC8764</td>
                                                         <td>12-08-18</td>
                                                         <td>RJ14 FV 7842</td>
                                                          <td>U454528</td>
                                                         <td style="color: #FF681B">unpaid</td>
                                                         <td>
                                                         	<input type="button" class="btn btn-md btn-success btn-rounded" id="myBtn2" onclick="releaseBike()" value="Release Bike" disabled/>
                                                         </td>
                                                         <td style="color: #81EF19">On-hold</td>
                                                </tr>
                                                
                                                <tr style="text-align: center">
                                                    	 <td>BC8755</td>
                                                         <td>09-10-18</td>
                                                         <td>GJ02 ZV 5426</td>
                                                          <td>D994528</td>
                                                         <td style="color: #81EF19">paid</td>
                                                         <td>
                                                         	<input type="button" class="btn btn-md btn-danger btn-rounded" id="myBtn4" onclick="releaseBike()" value="Bike Released" disabled/>
                                                        </td>
                                                        <td style="color: #FF681B">bike released</button></td>
                                                </tr>
                                                
                                                
                                                <tr style="text-align: center">
                                                    	 <td>BC6876</td>
                                                         <td>02-09-18</td>
                                                         <td>MH25 GH 4587</td>
                                                         <td>L434528</td>
                                                         <td style="color: #FF681B">unpaid</td>
                                                         <td>
                                                         	<button type="button" class="btn btn-md btn-success btn-rounded"  disabled>
                                                         	 	Release Bike
                                                            </button>
                                                        </td>
                                                        <td style="color: #81EF19">on-hold</td>
                                                </tr>
    
                                               
                                            </tbody>
                                            
                                        </table>
                                    </section>
                                </div>
                                

                                <!-- fisrt table ends -->
                                
                                <!-- modal starts-->
 
						  <div class="modal fade" id="myModal" role="dialog">
						    <div class="modal-dialog modal-md">
						      <div class="modal-content">
						        <div class="modal-header">
						        	<h3 style="text-align: center">Bike Released Successfully</h3>  
						       
                                </div>
						        
						        <div class="modal-footer">	
						          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						        </div>
						      </div>
						    </div>
					  	</div>
					  
					  	<!-- modal ends -->
	                
	          
	               
	                
	            </section>
	        </section>
	 </section>
</body>
</html>