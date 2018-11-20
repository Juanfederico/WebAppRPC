<html>
	<head>
		<?php include 'header.php' ?>
	</head>
	<body>
		<h3 style="text-align: center"> Buscar turnos por estado </h3>
		<form action="cliente.php" method="POST">
			<input type="hidden" name="tipoConsulta" value="turnosestado"/>
			Estado:<input type="text" name="estado" value=""/>
			<input type="submit" value="Consultar"/>
		</form>
	</body>
</html>