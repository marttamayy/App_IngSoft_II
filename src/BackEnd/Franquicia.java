package BackEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Franquicia {
	
	private int idFranquicia;
	private String provincia;
	private String ciudad;
	private String direccion;
	
	String conexion;
	
	public void conexionABD() {
		conexion = 
                "jdbc:sqlserver://yourserver.database.windows.net:1433;"
                + "database=AdventureWorks;"
                + "user=yourusername@yourserver;"
                + "password=yourpassword;"
                + "encrypt=true;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";
	}
	
	
	//GETTERS
	
	public int getIdFranquicia() {
		return this.idFranquicia;
	}
	
	public String getProvincia() {
		try (Connection conn = DriverManager.getConnection(conexion);){
			
			//TODO
			//El código SQL de las consultas va aquí
			
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return this.provincia;
	}
	
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	

	// SETTERS DE LOS ATRIBUTOS
	
	public void setIdFranquicia(int idFranquicia) {
		this.idFranquicia = idFranquicia;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
