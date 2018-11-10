package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import consultasClub.Cancha;

public class CanchaDAO {
	
	DataSource ds;
	
	public CanchaDAO(){
		ds = new DataSource();
	}
	
	public Cancha traerCanchaPorId(int idcancha){
		Cancha cancha = null;
		String query = "SELECT * FROM cancha WHERE idcancha="+idcancha;
		ResultSet rs = this.ds.execute(query);
		try {
			while (rs.next()){
				System.out.println("entra");
				cancha = new Cancha();
				cancha.setIdcancha(Integer.parseInt(rs.getString("idcancha")));
				cancha.setIdfilial(Integer.parseInt(rs.getString("idfilial")));
				cancha.setNum_cancha(Integer.parseInt(rs.getString("num_cancha")));
				cancha.setDeporte(rs.getString("deporte"));
				cancha.setCategoria(rs.getString("categoria"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.ds.close();
		}
		return cancha;
	}
	
	public List<Cancha> traerCanchasPorDeporte(String deporte){
		List<Cancha> canchas = new ArrayList<Cancha>();
		Cancha cancha = null;
		String query = "SELECT * FROM cancha WHERE deporte='"+deporte+"'";
		ResultSet rs = this.ds.execute(query);
		try {
			while (rs.next()){
				System.out.println("entra");
				cancha = new Cancha();
				cancha.setIdcancha(Integer.parseInt(rs.getString("idcancha")));
				cancha.setIdfilial(Integer.parseInt(rs.getString("idfilial")));
				cancha.setNum_cancha(Integer.parseInt(rs.getString("num_cancha")));
				cancha.setDeporte(rs.getString("deporte"));
				cancha.setCategoria(rs.getString("categoria"));
				canchas.add(cancha);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.ds.close();
		}
		return canchas;
	}
}
