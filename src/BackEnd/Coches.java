package BackEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Coches {
	
	private int idCoche;
	private int idModelo;
	private int idFranquicia;
	private String estadoCoche;
	
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
	
	public int getIdCoche() {
		return this.idCoche;
	}
	
	public int getIdModelo() {
		return this.idModelo;
	}
	
	public int getIdFranquicia() {
		return this.idFranquicia;
	}
	
	public String getEstadoCoche() {
		try (Connection conn = DriverManager.getConnection(conexion);){
			
			//TODO
			//El código SQL de las consultas va aquí
			
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return this.estadoCoche;
	}
		

	// SETTERS DE LOS ATRIBUTOS
	
	public void setIdCoche(int idCoche) {
		this.idCoche = idCoche;
	}
	
	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}
	
	public void setIdFranquicia(int idFranquicia) {
		this.idFranquicia = idFranquicia;
	}
	
	public void setEstadoCoche(String estadoCoche) {
		this.estadoCoche = estadoCoche;
	}

}
