<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main Page</title>
<style>

.myDiv{
text-align: center;
}

.btn1{
  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
  border: none;
  width: 150px;
  color: white;
	padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}

.btn2{
box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
  border: none;
  width: 150px;
  color: white;
	padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}

</style>
</head>
<body>

	<div class="myDiv">
	<form action="add">
	<input type="submit" style="background-color: #4CAF50;"
	class="btn1" value = "Add" name="add"/>
	</form>
  </div>
  
  <br>
  
  	<div class="myDiv">
  	<form action="edit">
	<input type="submit" style="background-color: #008CBA;" 
	class="btn2" value = "Edit" name="edit"/><br>
	</form>
	</div>
	
	<br>
	
	<div class="myDiv">
	<form action="search">
	<input type="submit" style="background-color: #e7e7e7;" 
  	class="btn1" value = "Search" name="search"/><br>
  	</form>
	</div>
	
	<br>
	
	<div class="myDiv">
	<form action="deleteRecord">
	<input type="submit" style="background-color: #555555;" 
 	class="btn2" value = "Delete" name="delete"/><br>
  	</form>
	</div>

</body>
</html>