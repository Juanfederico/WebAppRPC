<html>
	<head>
		<?php include 'header.php' ?>
	</head>
	<body>
		<h3 style="text-align: center"> Buscar cancha por su ID </h3>
		<form action="cliente.php" method="POST">
			<input type="hidden" name="tipoConsulta" value="canchaid"/>
			ID de cancha:<input type="text" name="idcancha" value=""/>
			<input type="submit" value="Consultar"/>
		</form>
	</body>
</html>