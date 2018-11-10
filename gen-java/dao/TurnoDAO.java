package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import consultasClub.Turno;

public class TurnoDAO {
	
	DataSource ds;
	
	public TurnoDAO(){
		ds = new DataSource();
	}
	
	public List<Turno> traerTurnosPorEstado(String estado){
		List<Turno> turnos = new ArrayList<Turno>();
		Turno turno = null;
		String query = "SELECT * FROM turno WHERE estado='"+estado+"'";
		ResultSet rs = this.ds.execute(query);
		try {
			while (rs.next()){
				System.out.println("entra");
				turno = new Turno();
				turno.setIdturno(Integer.parseInt(rs.getString("idturno")));
				turno.setIdfilial(Integer.parseInt(rs.getString("idfilial")));
				turno.setIdcancha(Integer.parseInt(rs.getString("idcancha")));
				turno.setIdsocio(Integer.parseInt(rs.getString("idsocio")));
				turno.setFechahora(rs.getString("fechahora"));
				turno.setEstado(rs.getString("estado"));
				turnos.add(turno);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.ds.close();
		}
		return turnos;
	}
}