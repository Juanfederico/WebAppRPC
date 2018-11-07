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
	 
		// Creamos un cliente
		$client = new SocioServiceClient($protocol);

		// Abrimos la conexión
		$transport->open();
	 
		$user = $_POST['user'];
		$resultado = $client->traerMailSocio($user);
?>

<html>
	<head>
		<link rel="stylesheet" type="text/css" href="tabla.css"> 
		<meta charset="UTF-8">
		<title>Cliente RPC </title>
	</head>
	<body>
		<?php
			echo "<h1> Direccion de email del usuario $user: </h1> <br/>";
			echo $resultado;
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