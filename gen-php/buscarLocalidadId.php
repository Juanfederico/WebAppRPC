<html>
	<head>
		<title>Cliente RPC</title>
	</head>
	<body>
		<h3> Buscar localidad por ID de filial </h3>
		<form action="cliente.php" method="POST">
			<input type="hidden" name="tipoConsulta" value="localidadid"/>
			ID de la filial:<input type="text" name="idfilial" value=""/>
			<span style="padding-right:50px;"></span>
			<input type="submit" value="Consultar"/>
		</form>
	</body>
</html>