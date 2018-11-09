<html>
	<head>
		<title>Cliente RPC</title>
	</head>
	<body>
		<h3> Buscar dia de mantenimiento por localidad </h3>
		<form action="cliente.php" method="POST">
			<input type="hidden" name="tipoConsulta" value="diamantenimiento"/>
			Localidad:<input type="text" name="localidad" value=""/>
			<span style="padding-right:50px;"></span>
			<input type="submit" value="Consultar"/>
		</form>
	</body>
</html>