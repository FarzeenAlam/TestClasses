<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
</head>
<body style="background-color:lightgrey; color:black; font-size:150%; text-align:center; font-family:verdana;">

	<form action="addStudent" method="post">
	<fieldset>
	<legend>Add a record</legend>
	<label>Enter the name:</label><br>
	<input type = "text" name="Name" autofocus><br>
	<label>Enter the position:</label><br>
	<input type = "text" name="Position"><br>
	<input type = "submit" value="Add"><br>
	</fieldset>
	</form>
	
	<br>
	
	<form action="updateStudent">
	<fieldset>
	<legend>Edit a record</legend>
	<label>Enter the id:</label><br>
	<input type="number" name="id"><br>
	<input type = "submit" value="Edit"><br>
	</fieldset>
	</form>
	
	<br>
	
	<form action="search">
	<fieldset>
	<legend>Search a record</legend>
	<label>Enter the id:</label><br>
	<input type = "number" name="id"><br>
	<input type="submit" value="Search"><br>
	</fieldset>
	</form>
	
	<br>
	
	<form action="delete">
	<fieldset>
	<legend>Delete a record</legend>
	<label>Enter the id:</label><br>
	<input type = "number" name="id"><br>
	<input type = "submit" value="Delete"><br>
	</fieldset>
	</form>
</body>
</html>