// Define la estrucura de directorios para la generación de código en Java y PHP
namespace java consultasClub
namespace php consultasClub

// Creo una estructura (o "entidad"/"clase")
struct Filial{
	1: i32 idfilial;
	2: string localidad;
	3: string horario_apertura;
	4: string horario_cierre;
	5: i32 diames_mantenimiento;
}

struct UserSocio{
	6: required string user;
}

// Definición de servicios
service SocioService
{
		// Ester servicio recibe dos parámetros y devuelve una lista de tipo Pelicula
		string traerMailSocio(6: string user),
        //list<Pelicula> traerPeliculasPorActor(1:string nombre, 2:string apellido),
}
