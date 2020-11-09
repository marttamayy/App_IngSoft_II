package BackEnd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Reservas {
	
	private int idReserva;
	private int idCoche;
	private int idModelo;
	private int idFranquicia;
	private int idFactura;
	private String estadoReserva;
	private String fechaInicio;
	private String fechaFin;
	
	String conexion;
	
	public static void main (String[] args) {
		
		System.out.println("Esto es una prueba de configuración");
	}

	
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
	
	public int getIdReserva() {
		return this.idReserva;
	}
	
	public String getEstadoReserva() {
		try (Connection conn = DriverManager.getConnection(conexion);){
			
			//TODO
			//El código SQL de las consultas va aquí
			
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return this.estadoReserva;
	}
	
	
	public int getIdCoche() {
		return this.idCoche;
	}
	
	public int getIdModelo() {
		return this.idModelo;
	}
	
	public int getIdFranquicia() {
		return this.idFranquicia;
	}
	
	public int getIdFactura() {
		return this.idFactura;
	}
	
	public String getFechaInicio() {
		return this.fechaInicio;
	}
	
	public String getFechaFin() {
		return this.fechaFin;
	}
	

	// SETTERS DE LOS ATRIBUTOS
	
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	
	public void setIdCoche(int idCoche) {
		this.idCoche = idCoche;
	}
	
	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}
	
	public void setIdFranquicia(int idFranquicia) {
		this.idFranquicia = idFranquicia;
	}
	
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public void setFechaFin(String fechaFin) {
		this.fechaInicio = fechaFin;
	}
	
	
	

}
