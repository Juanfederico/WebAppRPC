package handler;

import org.apache.thrift.TException;

import dao.SocioDAO;
import servicios.FilialService.Iface;

public class EjemploHandler implements Iface {

	@Override
	public String traerMailSocio(String user) throws TException {
		SocioDAO socioDao = new SocioDAO();
		return socioDao.traerMailSocio(user);
	}

}
