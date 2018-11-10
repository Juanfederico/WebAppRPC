package handler;

import java.util.List;

import org.apache.thrift.TException;

import consultasClub.Cancha;
import consultasClub.CanchaService.Iface;
import dao.CanchaDAO;

public class CanchaHandler implements Iface {
	
	@Override
	public Cancha traerCanchaPorId(int idcancha) throws TException {
		CanchaDAO canchaDao = new CanchaDAO();
		return canchaDao.traerCanchaPorId(idcancha);
	}
	
	@Override
	public List<Cancha> traerCanchasPorDeporte(String deporte) throws TException {
		CanchaDAO canchaDao = new CanchaDAO();
		return canchaDao.traerCanchasPorDeporte(deporte);
	}
}