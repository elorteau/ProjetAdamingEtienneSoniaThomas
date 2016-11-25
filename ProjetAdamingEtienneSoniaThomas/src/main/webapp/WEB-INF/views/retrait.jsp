<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>

    <!-- Bootstrap Core CSS -->
    <link href="<%=request.getContextPath()%>/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="<%=request.getContextPath()%>/resources/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<%=request.getContextPath()%>/resources/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<%=request.getContextPath()%>/resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<div id="wrapper">


		<!-- /.navbar-top-links -->

		<div class="navbar-default sidebar">
			<div class="sidebar-nav navbar-collapse">
				<ul class="nav" id="side-menu">
				
				<li><a href="toHome"><i class="fa fa-bar-chart-o fa-fw"></i>
							Home <span class="fa arrow"></span></a></li>
					
				
					<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>
							Banque <span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="toAddBanque">Ajouter une banque</a></li>
							<li><a href="toGestionBanque">Gestion banque </a></li>
							</a></li>
						</ul> <!-- /.nav-second-level --></li>
					<li><a href="tables.html"><i class="fa fa-table fa-fw"></i>Client<span
							class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="toAddClient">Ajouter un client</a></li>
							<li><a href="toGestionClient">Gestion clients</a></li>
							
						</ul> <!-- /.nav-second-level --></li>

					

					<li><a href="#"><i class="fa fa-wrench fa-fw"></i> Employe
							<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="toAddEmploye">Ajouter un employe</a></li>
							<li><a href="toGestionEmploye">Gestion d'employes</a></li>

						</ul> <!-- /.nav-second-level --></li>
					<li><a href="#"><i class="fa fa-sitemap fa-fw"></i> Groupe
							<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="toAddGroupe">Ajouter un groupe</a></li>
							<li><a href="toGestionGroupe">Gestion groupe></li>
						</ul> <!-- /.nav-second-level --></li>
					
				</ul>
			</div>
			<!-- /.sidebar-collapse -->
		</div>
		<!-- /.navbar-static-side -->
		</nav>
	<h1>Effectuer un Retrait</h1>
	<div class="form-group">
		<label>Nom du client du compte</label> 
		<input class="form-control"><br/>
		
		<label>Selectionnez le compte a affecter</label> 
		<select class="form-control">
			<option>Compte courant</option>
			<option>Compte Epargne</option>	
		</select><br/>
		
		<label>Montant � retirer</label> 
		<input class="form-control"><br/>
		
		<button type="submit" class="btn btn-default">Effectuer le retrait</button>

</div>
                                <!-- /.col-lg-6 (nested) -->
                            </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="<%=request.getContextPath()%>/resources/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<%=request.getContextPath()%>/resources/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="<%=request.getContextPath()%>/resources/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="<%=request.getContextPath()%>/resources/dist/js/sb-admin-2.js"></script>
	
</body>
</html>