<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Customization of Bikes</h2>
  <form action="/action_page.php">
    <div class="form-group">
      <label for="modelname">Model Name</label>
      <input type="text" class="form-control" id="modelName"  name="modelName">
    </div>
    
    <div class="form-group">
      <label for="date">Appointment Date</label>
      <input type="date" class="form-control" id="date" placeholder="Enter booking date" name="date">
    </div>
    
    <div class="form-group">
    <label class="form-check-label">Select Tyre        
      </label>
      <div>
      <input class="button" type="radio" name="tyre"> MRF
        <input class="button" type="radio" name="tyre"> Appolo
        <input class="button" type="radio" name="tyre"> CEAT
        </div>
    </div>
    
    <div class="form-group">
    <label class="form-check-label">Select Lights        
      </label>
      <div>
      <input class="button" type="radio" name="light"> LED
        
      <input class="button" type="radio" name="light">LASER
        
      <input class="button" type="radio" name="light"> HID XENON
        </div>
    </div>
    
    <div>
    <label>Select Color</label>
    <input type="color" name="color" value="#ff0000">
    </div>
    
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

</body>
</html>