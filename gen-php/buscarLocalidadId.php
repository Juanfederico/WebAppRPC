<html>
	<head>
		<?php include 'header.php' ?>
	</head>
	<body>
		<br><br>
		<div class="container">
     	<div class="row">
         <div class="col-md-12">
		<h3 style="text-align: center"> Buscar localidad por ID de filial </h3>
		<br>
		<form action="cliente.php" method="POST" >
			<div class="input-group mb-3">
			<input type="hidden" name="tipoConsulta" value="localidadid"/>
			<input type="text" name="idfilial" class="form-control" value="" placeholder="ID de Filial" />
			<br><br>
			<button type="submit" class="btn btn-inverse"> Consultar </button>
		</form>

		</div>
</div>
</div>
	</body>
</html>