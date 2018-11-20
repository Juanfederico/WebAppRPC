<html>
	<head>
		<?php include 'header.php' ?>	
	</head>
	<body>
		<h3 style="text-align: center"> Consultar mail segun el nombre de usuario del socio </h3>
		<form action="cliente.php" method="POST">
			<input type="hidden" name="tipoConsulta" value="mailsocio"/>
			Nombre de usuario:<input type="text" name="user" value=""/>
			<input type="submit" value="Consultar"/>
		</form>
	</body>
</html>