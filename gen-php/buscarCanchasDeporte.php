<html>
	<head>
		<title>Cliente RPC</title>
	</head>
	<body>
		<h3> Buscar canchas de un determinado deporte </h3>
		<form action="cliente.php" method="POST">
			<input type="hidden" name="tipoConsulta" value="canchasdeporte"/>
			Deporte:<input type="text" name="deporte" value=""/>
			<span style="padding-right:50px;"></span>
			<input type="submit" value="Consultar"/>
		</form>
	</body>
</html>