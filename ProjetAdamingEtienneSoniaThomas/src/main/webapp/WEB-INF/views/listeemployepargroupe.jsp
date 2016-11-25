<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Afficher la liste des employés par groupe</title>
</head>
<body>
	<h1>Afficher les employés d'un groupe</h1>
	<form action="">
		<div class="form-group">
			<label>Nom du groupe</label> <select class="form-control"
				id="nomGroupe">
				<option>nomgroupe1</option>
				<option>nomgroupe2</option>
			</select><br />
			<button type="submit" class="btn btn-default">Afficher les employés</button>
		</div>
	</form>
</body>
</html>