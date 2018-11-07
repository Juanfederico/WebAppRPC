// Define la estrucura de directorios para la generación de código en Java y PHP
namespace java consultasClub
namespace php consultasClub

// Creo una estructura (o "entidad"/"clase")
struct Filial{
	1: i32 idfilial;
	2: required string localidad;
	3: required string horario_apertura;
	4: required string horario_cierre;
	5: required i32 diames_mantenimiento;
}

struct Socio{
	1: i32 idsocio;
	2: required i32 num_afiliado;
	3: required string user;
	4: required string nombre;
	5: required string apellido;
	6: required string direccion;
	7: required string telefono;
	8: required string email;
}

struct Cancha{
	1: i32 idcancha;
	2: i32 idfilial;
	3: required i32 num_cancha;
	4: required string deporte;
	5: required string categoria;
}

struct Turno
{
	1: i32 idturno;
	2: i32 idfilial;
	3: i32 idcancha;
	4: i32 idsocio;
	5: string fechahora;
	6: string estado;
}

// Definición de servicios
service SocioService
{
		string traerMailSocio(3: string user),
		Socio traerSocioPorApellido(5: string apellido),
}

service FilialService
{
		string traerLocalidad(1: i32 idfilial),
		i32 traerDiaMantenimiento(2: string localidad),
}

service CanchaService
{
		Cancha traerCanchaPorId(1: i32 idcancha),
		list<Cancha> traerCanchasPorDeporte(4: string deporte),
}

service TurnoService
{
		list<Turno> traerTurnosPorEstado(6: string estado),
}