<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Associer un employé à un groupe</title>
</head>
<body>
	<h1>Associer un employé à un groupe</h1>
	<form action="">
		<div class="form-group">
			<label>Nom de l'employé</label> 
			<select class="form-control" id="nomEmploye">
				<option>nom1</option>
				<option>nom2</option>
			</select><br/>
			
			<label>Nom du groupe</label> 
			<select class="form-control" id="nomGroupe">
				<option>nomgroupe1</option>
				<option>nomgroupe2</option>
			</select><br/>
			<button type="submit" class="btn btn-default">Ajouter employé au groupe</button>
		</div>
	</form>
</body>
</html>