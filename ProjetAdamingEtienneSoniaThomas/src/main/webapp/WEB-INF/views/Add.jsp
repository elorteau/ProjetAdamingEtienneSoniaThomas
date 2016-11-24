<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  

  						
  <button type="button" class="btn btn-primary btn-lg btn-block" data-toggle="collapse" data-target="#demo">Add Client</button>
   <div id="demo" class="collapse">
   <form class="form-horizontal">
  <div class="form-group">
    <label class="control-label col-sm-2" for="code">Code :</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" id="code" placeholder="Enter code">
    </div>

   
  <div class="form-group">
    <label class="control-label col-sm-2" for="nom">Nom:</label>
    <div class="col-sm-10"> 
      <input type="password" class="form-control" id="nom" placeholder="Enter nom">
    </div>
   <div class="form-group">
    <label class="control-label col-sm-2" for="prenom">Prenom:</label>
    <div class="col-sm-10"> 
      <input type="password" class="form-control" id="prenom" placeholder="Enter prenom">
    </div>
    <div class="form-group">
    <label class="control-label col-sm-2" for="prenom">Prenom:</label>
    <div class="col-sm-10"> 
      <input type="password" class="form-control" id="prenom" placeholder="Enter prenom">
    </div>
  </div>
   </div>
  <button type="button" class="btn btn-default btn-lg btn-block">Add Compte</button>
  <button type="button" class="btn btn-default btn-lg btn-block">Add Employe</button>
  <button type="button" class="btn btn-default btn-lg btn-block">Add Groupe</button>
 

  
</div>



</body>
</html>