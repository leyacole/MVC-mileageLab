<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Enter Mileage and Gallon Tank</h1>
	<form action="/get-result">
		<p>Mileage (MPG): <input type="number" name="mpg" placeholder= "Mileage"/></p>
		<p>Gallons in tank: <input type="number" name="gallons"  placeholder="Gallons"/> </p>
		<p><button type="submit">Submit</button></p>
	</form>

</body>
</html>