package BackEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Tarifas {
	
	private int idTarifa;
	private String tipoTarifa;
	
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
	
	public int getIdTarifa() {
		return this.idTarifa;
	}
	
	public String getTipoTarifa() {
		try (Connection conn = DriverManager.getConnection(conexion);){
			
			//TODO
			//El código SQL de las consultas va aquí
			
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return this.tipoTarifa;
	}
	

	// SETTERS DE LOS ATRIBUTOS
	
	public void setIdTarifa(int idTarifa) {
		this.idTarifa = idTarifa;
	}

	public void setTipoTarifa(String tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}
		

}
