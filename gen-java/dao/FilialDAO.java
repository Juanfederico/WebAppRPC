package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FilialDAO {
	DataSource ds;
	
	public FilialDAO(){
		ds = new DataSource();
	}
	
	public String traerLocalidad(int idfilial){
		String localidad = null;
		String query = "SELECT localidad FROM filial WHERE idfilial="+idfilial;
		ResultSet rs = this.ds.execute(query);
		try {
			while (rs.next()){
				System.out.println("entra");
				localidad = rs.getString("localidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.ds.close();
		}
		System.out.println("Localidad:" + localidad);
		return localidad;
	}
	
	public int traerDiaMantenimiento(String localidad){
		int diames_mantenimiento = 0;
		String query = "SELECT diames_mantenimiento FROM filial WHERE localidad='"+localidad+"'";
		ResultSet rs = this.ds.execute(query);
		try {
			while (rs.next()){
				System.out.println("entra");
				diames_mantenimiento = Integer.parseInt(rs.getString("diames_mantenimiento"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.ds.close();
		}
		return (int) diames_mantenimiento;
	}

}
