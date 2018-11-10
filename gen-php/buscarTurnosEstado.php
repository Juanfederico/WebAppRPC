<html>
	<head>
		<title>Cliente RPC</title>
	</head>
	<body>
		<h3> Buscar turnos por estado </h3>
		<form action="cliente.php" method="POST">
			<input type="hidden" name="tipoConsulta" value="turnosestado"/>
			Estado:<input type="text" name="estado" value=""/>
			<span style="padding-right:50px;"></span>
			<input type="submit" value="Consultar"/>
		</form>
	</body>
</html>