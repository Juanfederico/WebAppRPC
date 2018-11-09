package handler;

import org.apache.thrift.TException;

import consultasClub.Filial;
import consultasClub.FilialService.Iface;
import dao.FilialDAO;

public class FilialHandler implements Iface {
	
	@Override
	public String traerLocalidad(int idfilial) throws TException {
		FilialDAO filialDao = new FilialDAO();
		return filialDao.traerLocalidad(idfilial);
	}
	
	@Override
	public int traerDiaMantenimiento(String localidad) throws TException {
		FilialDAO filialDao = new FilialDAO();
		return filialDao.traerDiaMantenimiento(localidad);
	}
}