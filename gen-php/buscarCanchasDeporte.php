<html>
	<head>
		<?php include 'header.php' ?>
	</head>
	<body>
		<h3 style="text-align: center"> Buscar canchas de un determinado deporte </h3>
		<form action="cliente.php" method="POST">
			<input type="hidden" name="tipoConsulta" value="canchasdeporte"/>
			Deporte:<input type="text" name="deporte" value=""/>
			<input type="submit" value="Consultar"/>
		</form>
	</body>
</html>