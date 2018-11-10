<html>
	<head>
		<title>Cliente RPC</title>
	</head>
	<body>
		<h3> Buscar cancha por su ID </h3>
		<form action="cliente.php" method="POST">
			<input type="hidden" name="tipoConsulta" value="canchaid"/>
			ID de cancha:<input type="text" name="idcancha" value=""/>
			<span style="padding-right:50px;"></span>
			<input type="submit" value="Consultar"/>
		</form>
	</body>
</html>