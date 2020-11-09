package BackEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Extras {
	
	private int idExtra;
	private int idModelo;
	private String tipo;
	private double costeAdicional;
	
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
	
	public int getIdExtra() {
		return this.idExtra;
	}
	
	public int getIdModelo() {
		return this.idModelo;
	}

	public String getTipo() {
		try (Connection conn = DriverManager.getConnection(conexion);){
			
			//TODO
			//El código SQL de las consultas va aquí
			
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return this.tipo;
	}
	
	public double getCosteAdicional() {
		return this.costeAdicional;
	}
		

	// SETTERS DE LOS ATRIBUTOS
	
	public void setIdExtra(int idExtra) {
		this.idExtra = idExtra;
	}
	
	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		
	public void setCosteAdicional(double costeAdicional) {
		this.costeAdicional = costeAdicional;
	}
	
}
