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

<body>
	
	<script>
		function submit(){
			alert("your work is submitted");
		}
	</script>
	<section id="content"  class="bg-light lter">
	        <section class="vbox">
	            <section class="scrollable padder">                                               
	                                
	                <div class="m-b-md hbox" style="display: flex; flex-wrap: wrap; align-items: flex-end; justify-content: space-between;">
                    	<h3 class="m-b-none" style="font-size: 30pxl; font-weight: bold;">
                    		Bike Customization
                    	</h3>
                	</div>     
	
                    
                     <div class="row">
                         <div class="col-sm-12">
                          
                             <section class="panel panel-primary">
                             
                               <form action="savecustomize" 
                            	data-validate="parsley" enctype="multipart/form-data" method="post">
                            	
                             
                                          <header class="panel-heading bg-dark lter" style="color: white;  font-weight: bold; display: flex;">
                                        
                                        
											 <div class="form-group">
                                        <label class="col-sm-2 control-label">Model</label>
                                        <div class="col-sm-10">
                                            <input type="text" name="modelName" placeholder="Model name"class="form-control">

                                        </div>
                                    </div>				
                                    <div class="form-group">  <label class="col-sm-2 control-label">Date</label>
                                        <div class="col-sm-10"> <input class="input-sm input-s datepicker-input form-control"
                                                    size="20" type="date" value="12-02-2013" name="appointmentDate" data-date-format="dd-mm-yyyy" name="appointmentDate">
                                            </div>
                                            </div>
                                       
                                        
                                          <div class="form-group">
                                        <label class="col-sm-2 control-label">Chassis no.</label>
                                        <div class="col-sm-10"> <input type="text" name="chasisNumber" class="form-control" id="exampleInputEmail2"
                                                placeholder="Chassis no"> </div>
                                                </div>
                                             
                                                
                                                
                                            <div class="form-group">
                                        <label class="col-sm-2 control-label">Plate no.</label>
                                        <div class="col-sm-10"> <input type="text" name="plateNumber" class="form-control" 
                                                placeholder="Plate no."> </div>
                                                </div>
                                               
                                          
                                          </header>
                                        
								
                                                
                                          <table class="table table-striped m-b-none">
                                                      
                                             <thead>
                                                                
                                                     <tr>   
                                                         <th style="text-align: center;">Part Id</th>
                                                         <th style="text-align: center;">Part</th>
                                                         <th style="text-align: center;">Cost</th>
                                                         <th style="text-align: center;">Check</th>
                                                     </tr>
                                                </thead>
                                                
                                                <tbody>
                                                        
                                                      <tr style="text-align: center;">
                                                         <td>1</td>
                                                         <td>Mirror</td>
                                                         <td>500</td>
                                                         <td>
                                                         	<div class="checkbox"> 
                                                         		<label> 
                                                         			<input type="checkbox">
                                                    			</label> 
                                                    		</div>
                                                         </td>
                                                      </tr>
                                                      
                                                      <tr style="text-align: center;">
                                                         <td>2</td>
                                                         <td>tail light</td>
                                                         <td>2020</td>
                                                         <td>
                                                         	<div class="checkbox"> 
                                                         		<label> 
                                                         			<input type="checkbox">
                                                    			</label> 
                                                    		</div>
                                                         </td>
                                                      </tr>
                                                      
                                                      
                                                      
                                                      <tr style="text-align: center;">
                                                         <td>3</td>
                                                         <td>brake</td>
                                                         <td>500</td>
                                                         <td>
                                                         	<div class="checkbox"> 
                                                         		<label> 
                                                         			<input type="checkbox">
                                                    			</label> 
                                                    		</div>
                                                         </td>
                                                      </tr>
                                                      
                                                      <tr style="text-align: center;">
                                                         <td>4</td>
                                                         <td>silencer</td>
                                                         <td>150</td>
                                                         <td>
                                                         	<div class="checkbox"> 
                                                         		<label> 
                                                         			<input type="checkbox">
                                                    			</label> 
                                                    		</div>
                                                         </td>
                                                      </tr>
                                                      
        
       
                                                    
                                                      
                                                    </tbody>
                                                      
                                                    
                   
                                                    
                                             </table>
                                           </div>
										<input type="submit" value="Submit">
								
										
									</div>
									
									</form>
                                           
                                           

                                          </section>
                                           
	 
                        </div>
                        </div>
                                             	
                             </section>
                                         
                      
                  
   	            </section>
	        </section>
	
	
	 
</body>
</html>