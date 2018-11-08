package handler;

import org.apache.thrift.TException;

import dao.SocioDAO;
import consultasClub.Socio;
import consultasClub.SocioService.Iface;

public class ConsultaHandler implements Iface {
	@Override
	public String traerMailSocio(String user) throws TException {
		SocioDAO socioDao = new SocioDAO();
		return socioDao.traerMailSocio(user);
	}

	@Override
	public Socio traerSocioPorApellido(String apellido) throws TException {
		SocioDAO socioDao = new SocioDAO();
		return socioDao.traerSocioPorApellido(apellido);
	}
}
