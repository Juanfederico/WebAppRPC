package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.thrift.TException;

import consultasClub.Socio;
import consultasClub.UserIncorrecto;

public class SocioDAO {
	DataSource ds;
	
	public SocioDAO(){
		ds = new DataSource();
	}
	
	public String traerMailSocio(String user) throws TException, UserIncorrecto{
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
	
	public Socio traerSocioPorApellido(String apellido) {
		Socio socio = null;
		String query = "SELECT * FROM socio WHERE apellido='"+apellido+"'";
		//String query = String.format("CALL TRAER_PELICULAS_POR_ACTOR('%s','%s')", nombre, apellido);
		ResultSet rs = this.ds.execute(query);
		try {
			while (rs.next()){
				System.out.println("entra");
				socio = new Socio();
				socio.setIdsocio(Integer.parseInt(rs.getString("idsocio")));
				socio.setNum_afiliado(Integer.parseInt(rs.getString("num_afiliado")));
				socio.setUser(rs.getString("user"));
				socio.setNombre(rs.getString("nombre"));
				socio.setApellido(rs.getString("apellido"));
				socio.setDireccion(rs.getString("direccion"));
				socio.setTelefono(rs.getString("telefono"));
				socio.setEmail(rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.ds.close();
		}
		
		return socio;
	}

}
