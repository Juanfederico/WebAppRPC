package handler;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

import consultasClub.Socio;
import consultasClub.SocioService.Iface;
import consultasClub.UserIncorrecto;
import dao.SocioDAO;

public class ConsultaHandler implements Iface {
	
		@Override
		public String traerMailSocio(String user) throws org.apache.thrift.TException, UserIncorrecto {
			//try {
			SocioDAO socioDao = new SocioDAO();
			String mailSocio = socioDao.traerMailSocio(user);
			if(mailSocio==null) {
				UserIncorrecto exc = new UserIncorrecto();
				exc.setCodError(500);
				exc.setDescripcion("Error al traer el mail del socio");
				exc.setDetallesAdicionales("Compruebe que exista un usuario con ese userID o que el mismo tenga un mail asignado");
				throw exc;
			}
			return mailSocio;
		}

	@Override
	public Socio traerSocioPorApellido(String apellido) throws TException {
		SocioDAO socioDao = new SocioDAO();
		return socioDao.traerSocioPorApellido(apellido);
	}
}


