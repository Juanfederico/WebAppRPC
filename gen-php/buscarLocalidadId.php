<html>
	<head>
		<?php include 'header.php' ?>
	</head>
	<body>
		<h3 style="text-align: center"> Buscar localidad por ID de filial </h3>
		<form action="cliente.php" method="POST">
			<input type="hidden" name="tipoConsulta" value="localidadid"/>
			ID de la filial:<input type="text" name="idfilial" value=""/>
			<input type="submit" value="Consultar"/>
		</form>
	</body>
</html>