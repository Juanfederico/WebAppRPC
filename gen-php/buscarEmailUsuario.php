<html>
	<head>
		<?php include 'header.php' ?>	
	</head>
	<body>
		<br><br>
		<div class="container">
     	<div class="row">
         <div class="col-md-12">
		<h3 style="text-align: center"> Consultar mail segun el nombre de usuario del socio </h3>
		<br>
		<form action="cliente.php" method="POST">
			<div class="input-group mb-3">
			<input type="hidden" name="tipoConsulta" value="mailsocio"/>
			<input type="text" name="user" class="form-control" value="" placeholder="Usuario" />
			<br><br>
			<button type="submit" class="btn btn-inverse"> Consultar </button>
		</div>
		</form>
	</div>
</div>
</div>
	</body>
</html>