<html>
	<head>
		<?php include 'header.php' ?>
	</head>
	<body>
		<h3 style="text-align: center"> Buscar un socio por apellido </h3>
		<form action="cliente.php" method="POST">
			<input type="hidden" name="tipoConsulta" value="socioapellido"/>
			Apellido del socio:<input type="text" name="apellido" value=""/>
			<input type="submit" value="Consultar"/>
		</form>
	</body>
</html>