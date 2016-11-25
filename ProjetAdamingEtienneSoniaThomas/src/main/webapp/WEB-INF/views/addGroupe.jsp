<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Ajouter un groupe</title>
</head>
<body>
	<h1>Ajouter un groupe</h1>
	<form action="">
		<div class="form-group">

			<label>Code du groupe</label> <input class="form-control"
				id="codeGroupe"><br /> <label>Nom du groupe</label> <input
				class="form-control" id="nomGroupe"><br /> <label>Nom
				du groupe</label> <input class="form-control" id="nomGroupe"><br />

			<label>Banque associée au groupe</label> <select class="form-control" id="banqueGroupe">
				<option>1</option>
				<option>2</option>
				<option>3</option>
				
			</select>

			<button type="submit" class="btn btn-default">Enregistrer un
				groupe</button>

		</div>
	</form>
</body>
</html>