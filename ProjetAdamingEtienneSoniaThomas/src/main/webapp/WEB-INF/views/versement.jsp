<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>versement</title>
</head>
<body>
	<h1>Effectuer un Versement</h1>
	<div class="form-group">
		<label>Nom du client du compte</label> 
		<input class="form-control"><br/>
		
		<label>Selectionnez le compte a affecter</label> 
		<select class="form-control">
			<option>Compte courant</option>
			<option>Compte Epargne</option>	
		</select><br/>
		
		<label>Montant à verser</label> 
		<input class="form-control"><br/>
		
		<button type="submit" class="btn btn-default">Effectuer le versement</button>
</body>
</html>