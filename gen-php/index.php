<html>
	<head>
		<title>Cliente RPC</title>
	</head>
	<body>
		<h3> Consultar mail segun el nombre de usuario del socio </h3>
		<form action="cliente.php" method="POST">
			<input type="hidden" name="tipoConsulta" value="mailsocio"/>
			Nombre de usuario:<input type="text" name="user" value=""/>
			<span style="padding-right:50px;"></span>
			<input type="submit" value="Consultar"/>
		</form>
	</body>
</html>