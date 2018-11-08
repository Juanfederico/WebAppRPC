<html>
	<head>
		<title>Cliente RPC</title>
	</head>
	<body>
		<h3> Buscar un socio por apellido </h3>
		<form action="cliente.php" method="POST">
			<input type="hidden" name="tipoConsulta" value="socioapellido"/>
			Apellido del socio:<input type="text" name="apellido" value=""/>
			<span style="padding-right:50px;"></span>
			<input type="submit" value="Consultar"/>
		</form>
	</body>
</html>