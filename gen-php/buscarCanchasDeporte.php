<html>
	<head>
		<?php include 'header.php' ?>
	</head>
	<body>
		<br><br>
		<div class="container">
     	<div class="row">
         <div class="col-md-12">
		<h3 style="text-align: center"> Buscar canchas de un determinado deporte </h3>
		<br>
		<form action="cliente.php" method="POST">
			<div class="input-group mb-3">
			<input type="hidden" name="tipoConsulta" value="canchasdeporte"/>
			<input type="text" name="deporte"  class="form-control" value="" placeholder="Deporte" />
			<br><br>
			<button type="submit" class="btn btn-inverse"> Consultar </button>
		</div>
		</form>

		</div>
</div>
</div>
	</body>
</html>