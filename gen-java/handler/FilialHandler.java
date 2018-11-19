package handler;

import org.apache.thrift.TException;

import consultasClub.FilialService.Iface;
import consultasClub.IdIncorrecto;
import consultasClub.UserIncorrecto;
import dao.FilialDAO;

public class FilialHandler implements Iface {
	
	@Override
	public String traerLocalidad(int idfilial) throws TException, IdIncorrecto {
		FilialDAO filialDao = new FilialDAO();
		String localidad = filialDao.traerLocalidad(idfilial);
		if(localidad==null) {
			IdIncorrecto exc = new IdIncorrecto();
			exc.setCodError(501);
			exc.setDescripcion("Error al traer la localidad de la filial");
			throw exc;
		}
		return filialDao.traerLocalidad(idfilial);
	}
	
	@Override
	public int traerDiaMantenimiento(String localidad) throws TException {
		FilialDAO filialDao = new FilialDAO();
		return filialDao.traerDiaMantenimiento(localidad);
	}
}