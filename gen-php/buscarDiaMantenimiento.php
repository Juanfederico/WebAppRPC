<html>
	<head>
		<?php include 'header.php' ?>
	</head>
	<body>
		<h3 style="text-align: center"> Buscar dia de mantenimiento por localidad </h3>
		<form action="cliente.php" method="POST">
			<input type="hidden" name="tipoConsulta" value="diamantenimiento"/>
			Localidad:<input type="text" name="localidad" value=""/>
			<input type="submit" value="Consultar"/>	
		</form>
	</body>
</html>