<html>
	<head>
		<?php include 'header.php' ?>
	</head>
	<body>
		<br><br>
		<div class="container">
     	<div class="row">
         <div class="col-md-12">
		<h3 style="text-align: center"> Buscar turnos por estado </h3>
		<br>
		<form action="cliente.php" method="POST">
			<div class="input-group mb-3">
			<input type="hidden" name="tipoConsulta" value="turnosestado"/>
			<input type="text" name="estado" class="form-control" value="" placeholder="Estado" />
			<br><br>
			<button type="submit" class="btn btn-inverse"> Consultar </button>
		</div>
		</form>

		</div>
</div>
</div>
	</body>
</html>