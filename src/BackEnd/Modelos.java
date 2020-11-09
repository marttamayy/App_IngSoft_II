package BackEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Modelos {
	
	private int idModelo;
	private String marca;
	private String categoriaModelo;
	private int numPuertas;
	private String manualAutomatico;
	private String tipoTecho;
	private String combustible;
	private int numPlazas;
	private int agnio;
	
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
	
	public int getIdModelo() {
		return this.idModelo;
	}
	
	public String getMarca() {
		try (Connection conn = DriverManager.getConnection(conexion);){
			
			//TODO
			//El código SQL de las consultas va aquí
			
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return this.marca;
	}
	
	
	public String getCategoriaModelo() {
		return this.categoriaModelo;
	}
	
	public int getNumPuertas() {
		return this.numPuertas;
	}
	
	public String getManualAutomatico() {
		return this.manualAutomatico;
	}
	
	public String getTipoTecho() {
		return this.tipoTecho;
	}
	
	public String getCombustible() {
		return this.combustible;
	}
	
	public int getNumPlazas() {
		return this.numPlazas;
	}
	
	public int getAgnio() {
		return this.agnio;
	}
		
	// SETTERS DE LOS ATRIBUTOS
	
	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setCatergoriaModelo(String categoriaModelo) {
		this.categoriaModelo = categoriaModelo;
	}
	
	public void setNumPuertas(int numPuerta) {
		this.numPuertas = numPuerta;
	}
	
	public void setManualAutomatico(String manualAutomatico) {
		this.manualAutomatico = manualAutomatico;
	}
	
	public void setTipoTecho(String tipoTecho) {
		this.tipoTecho = tipoTecho;
	}
	
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	public void setAgnio(int agnio) {
		this.agnio = agnio;
	}
		
}
