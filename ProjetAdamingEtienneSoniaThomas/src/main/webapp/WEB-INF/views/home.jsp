<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Connexion Session Employé</h2>
  <form>
    <div class="form-group">
      <label for="nom">Name :</label>
      <input type="text" class="form-control" id="nom" placeholder="Enter your Name">
    </div>
    <div class="form-group">
      <label for="code">Code :</label>
      <input type="text" class="form-control" id="code" placeholder="Enter your code">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default" href="menu">Submit</button>
  </form>
</div>

</body>
</html>

