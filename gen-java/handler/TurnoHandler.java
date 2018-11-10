package handler;

import java.util.List;

import org.apache.thrift.TException;

import consultasClub.Turno;
import consultasClub.TurnoService.Iface;
import dao.TurnoDAO;

public class TurnoHandler implements Iface {
	
	@Override
	public List<Turno> traerTurnosPorEstado(String estado) throws TException {
		TurnoDAO turnoDao = new TurnoDAO();
		return turnoDao.traerTurnosPorEstado(estado);
	}
	
}