<?php
	// Setea el path a las librerías de Thrift
	$GLOBALS['THRIFT_ROOT'] = 'Thrift';
	  
	//Carga automáticamente las clases requeridas
	 function __autoload($classname) {
		$directories = glob("Thrift" . '/*' , GLOB_ONLYDIR);
		$found = false;
		$i = 0;
		while (!$found && $i < count($directories)){
			$dir = $directories[$i];
			$filename = str_replace("\\", "/", "./" . $classname . ".php");
			if(file_exists( $filename ))
			{
				$found = true;
				require_once($filename);
			}else{
				$i++;
			}
		}
	}

	require_once 'consultasClub/FilialService.php';
	require_once 'consultasClub/CanchaService.php';
	require_once 'consultasClub/SocioService.php';
	require_once 'consultasClub/TurnoService.php';
	require_once 'consultasClub/Types.php'; 
	use Thrift\Exception\TException;
	use Thrift\Transport\TSocket;
	use Thrift\Protocol\TBinaryProtocol;
	use Thrift\Protocol\TMultiplexedProtocol;
	use Thrift\Transport\TBufferedTransport;
	use consultasClub\CanchaServiceClient;
	use consultasClub\FilialServiceClient;
	use consultasClub\SocioServiceClient;
	use consultasClub\TurnoServiceClient;
	//use ejemplo\Pelicula;
	try {
		// Crea una conexión con el servidor
		$socket = new TSocket('127.0.0.1', '9091');
		$socket->setRecvTimeout(10*1000); //Timeout de espera
		$transport = new TBufferedTransport($socket);
		$protocol = new TBinaryProtocol($transport);
		$protocolSocio = new TMultiplexedProtocol($protocol, 'SocioService');
		$protocolFilial = new TMultiplexedProtocol($protocol, 'FilialService');
		$protocolCancha = new TMultiplexedProtocol($protocol, 'CanchaService');
		$protocolTurno = new TMultiplexedProtocol($protocol, 'TurnoService');

		$tipoConsulta = $_POST['tipoConsulta'];

		if (strcasecmp($tipoConsulta, "mailsocio") == 0) {
			// Creamos un socio
			try{
				$socio = new SocioServiceClient($protocolSocio);
				// Abrimos la conexión
				$transport->open();
				$user = $_POST['user'];
				$resultado = $socio->traerMailSocio($user);
			}
			catch (TException $exc) {
				$tipoConsulta = "excepcion";
				$resultado = "Codigo de error: $exc->codError <br> Descripcion: $exc->descripcion <br> Detalles adicionales: $exc->detallesAdicionales";
			}
		}
		else if (strcasecmp($tipoConsulta, "socioapellido") == 0) {
			//Creamos un socio
			$socio = new SocioServiceClient($protocolSocio);
			//Abrimos la conexion
			$transport->open();
			$apellido = $_POST['apellido'];
			$resultado = $socio->traerSocioPorApellido($apellido);
		}
		else if (strcasecmp($tipoConsulta, "localidadid") == 0) {
			//Creamos un socio
			try{
				$filial = new FilialServiceClient($protocolFilial);
				//Abrimos la conexion
				$transport->open();
				$idfilial = $_POST['idfilial'];
				$resultado = $filial->traerLocalidad($idfilial);
			}
			catch (TException $exc) {
				$tipoConsulta = "excepcion";
				$resultado = "Codigo de error: $exc->codError <br> Descripcion: $exc->descripcion";
			}
		}
		else if (strcasecmp($tipoConsulta, "diamantenimiento") == 0) {
			//Creamos un socio
			$filial = new FilialServiceClient($protocolFilial);
			//Abrimos la conexion
			$transport->open();
			$localidad = $_POST['localidad'];
			$resultado = $filial->traerDiaMantenimiento($localidad);
		}
		else if (strcasecmp($tipoConsulta, "canchaid") == 0) {
			//Creamos un socio
			$cancha = new CanchaServiceClient($protocolCancha);
			//Abrimos la conexion
			$transport->open();
			$idcancha = $_POST['idcancha'];
			$resultado = $cancha->traerCanchaPorId($idcancha);
		}
		else if (strcasecmp($tipoConsulta, "canchasdeporte") == 0) {
			//Creamos un socio
			$cancha = new CanchaServiceClient($protocolCancha);
			//Abrimos la conexion
			$transport->open();
			$deporte = $_POST['deporte'];
			$resultado = $cancha->traerCanchasPorDeporte($deporte);
		}
		else if (strcasecmp($tipoConsulta, "turnosestado") == 0) {
			//Creamos un socio
			$turno = new TurnoServiceClient($protocolTurno);
			//Abrimos la conexion
			$transport->open();
			$estado = $_POST['estado'];
			$resultado = $turno->traerTurnosPorEstado($estado);
		}
?>

<html>
	<head>
		<link rel="stylesheet" type="text/css" href="tabla.css"> 
		<meta charset="UTF-8">
		<?php include 'header.php'?>
		<title>Cliente RPC - Resultado </title>
	</head>
	<body>
		<?php
			if (strcasecmp($tipoConsulta, "mailsocio") == 0){
				echo "<br><br>";
				echo '<div class="container">';
		     	echo '<div class="row">';
		        echo '<div class="col-md-12">';
				echo "<h1> Direccion de email del socio con nombre de usuario $user: </h1> <br/>";
				echo $resultado;
				echo '</div>';
				echo '</div>';
				echo '</div>';

			}
			else if (strcasecmp($tipoConsulta, "socioapellido") == 0){
				echo "<br><br>";
				echo '<div class="container">';
		     	echo '<div class="row">';
		        echo '<div class="col-md-12">';
		        echo "<h1> Datos del socio con apellido $apellido: </h1> <br>";
		        echo "<table class='table'>";
				include 'tablaSocio.php';
				echo "<tbody>";
				echo "<tr>";
				echo "<td>$resultado->idsocio </td>";
				echo "<td>$resultado->num_afiliado </td>";
				echo "<td>$resultado->user </td>";
				echo "<td>$resultado->nombre </td>";
				echo "<td>$resultado->apellido </td>";
				echo "<td>$resultado->direccion </td>";
				echo "<td>$resultado->telefono </td>";
				echo "<td>$resultado->email </td>";
				echo "</tr>";
				echo "</tbody>";
				echo "</table>";
				echo '</div>';
				echo '</div>';
				echo '</div>';
			}
			else if (strcasecmp($tipoConsulta, "localidadid") == 0){
				echo "<br><br>";
				echo '<div class="container">';
		     	echo '<div class="row">';
		        echo '<div class="col-md-12">';
				echo "<h1> Localidad de la filial con id $idfilial: </h1> <br/>";
				echo $resultado;
				echo '</div>';
				echo '</div>';
				echo '</div>';
			}
			else if (strcasecmp($tipoConsulta, "diamantenimiento") == 0){
				echo "<br><br>";
				echo '<div class="container">';
		     	echo '<div class="row">';
		        echo '<div class="col-md-12">';
				echo "<h1> Dia de mantenimiento para la localidad $localidad: </h1> <br/>";
				echo $resultado;
				echo '</div>';
				echo '</div>';
				echo '</div>';
			}
			else if (strcasecmp($tipoConsulta, "canchaid") == 0){
				echo "<br><br>";
				echo '<div class="container">';
		     	echo '<div class="row">';
		        echo '<div class="col-md-12">';
		        echo "<h1> Datos de la cancha con id $idcancha: </h1> <br/>";
		        echo "<table class='table'>";
				include 'tablaCancha.php';
				echo "<tbody>";
				echo "<tr>";
				echo "<td>$resultado->idcancha </td>";
				echo "<td>$resultado->idfilial </td>";
				echo "<td>$resultado->num_cancha </td>";
				echo "<td>$resultado->deporte </td>";
				echo "<td>$resultado->categoria </td>";
				echo "</tr>";
				echo "</tbody>";
				echo "</table>";
				echo '</div>';
				echo '</div>';
				echo '</div>';
				
				
			}
			else if (strcasecmp($tipoConsulta, "canchasdeporte") == 0){
				echo "<br><br>";
				echo '<div class="container">';
		     	echo '<div class="row">';
		        echo '<div class="col-md-12">';
				echo "<h1> Listado de canchas con deporte $deporte: </h1> <br/><br/>";
				$i = 1;
				echo "<table class='table'>";
				include 'tablaCanchas.php';
				echo "<tbody>";
				foreach($resultado as $cancha){
					echo "<tr>";
					echo "<th scope='row'>".$i."</th>";
					echo "<td> $cancha->idcancha </td>";
					echo "<td> $cancha->idfilial </td>";
					echo "<td> $cancha->num_cancha </td>";
					echo "<td> $cancha->deporte </td>";
					echo "<td> $cancha->categoria </td>";
					echo "<tr/>";
					$i++;
				}
				echo "</tbody>";
				echo "</table>";
				echo '</div>';
				echo '</div>';
				echo '</div>';
			}
			else if (strcasecmp($tipoConsulta, "turnosestado") == 0){
				echo "<br><br>";
				echo '<div class="container">';
		     	echo '<div class="row">';
		        echo '<div class="col-md-12">';
				echo "<h1> Listado de turnos con estado $estado: </h1> <br/><br/>";
				$i = 1;
				echo "<table class='table'>";
				include 'tablaTurnos.php';
				echo "<tbody>";
				foreach($resultado as $turno){
					echo "<tr>";
					echo "<th scope='row'>".$i."</th>";
					echo "<td> $turno->idturno </td>";
					echo "<td> $turno->idfilial </td>";
					echo "<td> $turno->idcancha </td>";
					echo "<td> $turno->idsocio </td>";
					echo "<td> $turno->fechahora </td>";
					echo "<td> $turno->estado </td>";
					echo "<tr/>";
					$i++;
				}
				echo "</tbody>";
				echo "</table>";
				echo '</div>';
				echo '</div>';
				echo '</div>';
			}
			else if (strcasecmp($tipoConsulta, "excepcion") == 0){
				echo "<br><br>";
				echo '<div class="container">';
		     	echo '<div class="row">';
		        echo '<div class="col-md-12">';
				echo '<h3>' . $resultado . '</h3>';
				echo '</div>';
				echo '</div>';
				echo '</div>';
			}
		} catch (TException $tx) {
			// Excepción propia de Thrift (falló en la conexión, timeout, etc.)
			echo "ThriftException: ".$tx->getMessage()."\r\n";

		} finally{
			// Cerramos la conexión
			$transport->close();
		}
		?>
	</body>
</html>