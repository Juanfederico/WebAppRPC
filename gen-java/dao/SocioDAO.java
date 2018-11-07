package dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import servicios.UserSocio;
import dao.DataSource;

public class SocioDAO {
	DataSource ds;
	
	public SocioDAO(){
		ds = new DataSource();
	}
	
	public String traerMailSocio(String user){
		String emailSocio = null;
		String query = "SELECT email FROM socio WHERE user='"+user+"'";
		//String query = String.format("CALL TRAER_PELICULAS_POR_ACTOR('%s','%s')", nombre, apellido);
		ResultSet rs = this.ds.execute(query);
		try {
			while (rs.next()){
				System.out.println("entra");
				emailSocio = rs.getString("email");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.ds.close();
		}
		
		return emailSocio;
	}

}
