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

		$tipoConsulta = $_POST['tipoConsulta'];

		if (strcasecmp($tipoConsulta, "mailsocio") == 0) {
			// Creamos un socio
			$socio = new SocioServiceClient($protocolSocio);
			// Abrimos la conexión
			$transport->open();
			$user = $_POST['user'];
			$resultado = $socio->traerMailSocio($user);
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
			$filial = new FilialServiceClient($protocolFilial);
			//Abrimos la conexion
			$transport->open();
			$idfilial = $_POST['idfilial'];
			$resultado = $filial->traerLocalidad($idfilial);
		}
?>

<html>
	<head>
		<link rel="stylesheet" type="text/css" href="tabla.css"> 
		<meta charset="UTF-8">
		<title>Cliente RPC </title>
	</head>
	<body>
		<?php
			if (strcasecmp($tipoConsulta, "mailsocio") == 0){
				echo "<h1> Direccion de email del socio con nombre de usuario $user: </h1> <br/>";
				echo $resultado;
			}
			else if (strcasecmp($tipoConsulta, "socioapellido") == 0){
				echo "<h1> Datos del socio con apellido $apellido: </h1> <br/>";
				echo "<h3> ID de socio: </h3> $resultado->idsocio <br/>";
				echo "<h3> Nro de afiliado: </h3> $resultado->num_afiliado <br/>";
				echo "<h3> Usuario: </h3> $resultado->user <br/>";
				echo "<h3> Nombre: </h3> $resultado->nombre <br/>";
				echo "<h3> Apellido: </h3> $resultado->apellido <br/>";
				echo "<h3> Direccion: </h3> $resultado->direccion <br/>";
				echo "<h3> Telefono: </h3> $resultado->telefono <br/>";
				echo "<h3> Email: </h3> $resultado->email <br/>";
			}
			else if (strcasecmp($tipoConsulta, "localidadid") == 0){
				echo "<h1> Localidad de la filial con id $idfilial: </h1> <br/>";
				echo $resultado;
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