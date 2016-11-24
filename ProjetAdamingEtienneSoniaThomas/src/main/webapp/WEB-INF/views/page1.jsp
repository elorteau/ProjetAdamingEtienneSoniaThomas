<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Bootstrap Admin Theme</title>

<link
	href="<%=request.getContextPath()%>/resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- MetisMenu CSS -->
<link
	href="<%=request.getContextPath()%>/resources/vendor/metisMenu/metisMenu.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link
	href="<%=request.getContextPath()%>/resources/dist/css/sb-admin-2.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="<%=request.getContextPath()%>/resources/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet">


</head>

<body>

	<div id="wrapper">


		<!-- /.navbar-top-links -->

		<div class="navbar-default sidebar" role="navigation">
			<div class="sidebar-nav navbar-collapse">
				<ul class="nav" id="side-menu">
					<li class="sidebar-search">
						<!-- /input-group -->
					</li>
					<li><a href="index.html"><i class="fa fa-dashboard fa-fw"></i>
							Home</a></li>
					<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>
							Banque <span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="flot.html">Ajouter une banque</a></li>
							<li><a href="morris.html">Recuperer la liste des
									employes </a></li>
							<li><a href="morris.html">Recuperer la liste des clients
							</a></li>
							<li><a href="morris.html">Recuperer la liste des comptes
							</a></li>
						</ul> <!-- /.nav-second-level --></li>
					<li><a href="tables.html"><i class="fa fa-table fa-fw"></i>Client<span
							class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="flot.html">Ajouter un Client</a></li>
							<li><a href="morris.html">Supprmier un Client</a></li>
							<li><a href="morris.html">Modifier un Client</a></li>
							<li><a href="morris.html">Modifier les coordonnees d'un
									Client</a></li>
							<li><a href="morris.html">Recuperer la liste des comptes</a>
							</li>
							<li><a href="morris.html">Chercher ClientParMc</a></li>
						</ul> <!-- /.nav-second-level --></li>

					<li><a href="forms.html"><i class="fa fa-edit fa-fw"></i>
							Compte<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="flot.html">Ajouter un Compte</a></li>
							<li><a href="flot.html">Supprimer un Compte</a></li>
							<li><a href="flot.html">Consulter un Compte</a></li>
							<li><a href="flot.html">Afficher la liste des comptes
									par employé</a></li>
						</ul></li>

					<li><a href="#"><i class="fa fa-wrench fa-fw"></i> Employe
							<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="panels-wells.html">Ajouter un employe</a></li>
							<li><a href="panels-wells.html">Associer un employe à un
									groupe</a></li>
							<li><a href="panels-wells.html">Recuperer la liste des
									employes</a></li>
							<li><a href="panels-wells.html">Recuperer la liste des
									employes par groupe</a></li>

						</ul> <!-- /.nav-second-level --></li>
					<li><a href="#"><i class="fa fa-sitemap fa-fw"></i> Groupe
							<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="panels-wells.html">Ajouter un groupe</a></li>
							<li><a href="panels-wells.html">Recuperer la liste des
									groupes</a></li>
						</ul> <!-- /.nav-second-level --></li>
					<li class="active"><a href="#"><i
							class="fa fa-files-o fa-fw"></i> Operations <span
							class="fa arrow"></span></a>
						<ul class="nav nav-second-level">

							<li><a href="panels-wells.html">Versement</a></li>
							<li><a href="panels-wells.html">Retrait</a></li>
							<li><a href="panels-wells.html">Virement</a></li>
						</ul> <!-- /.nav-second-level --></li>
				</ul>
			</div>
			<!-- /.sidebar-collapse -->
		</div>
		<!-- /.navbar-static-side -->
		</nav>

		<!-- Page Content -->
		<div id="page-wrapper">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">Blank</h1>
					</div>
					<!-- /.col-lg-12 -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.container-fluid -->
		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->

	<script
		src="<%=request.getContextPath()%>/resources/vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script
		src="<%=request.getContextPath()%>/resources/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script
		src="<%=request.getContextPath()%>/resources/vendor/metisMenu/metisMenu.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script
		src="<%=request.getContextPath()%>/resources/dist/js/sb-admin-2.js"></script>


</body>
</html>