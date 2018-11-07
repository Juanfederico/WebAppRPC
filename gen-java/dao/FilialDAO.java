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
		String query = "SELECT localidad FROM filial WHERE idfilial='"+idfilial+"'";
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
		return localidad;
	}

}
