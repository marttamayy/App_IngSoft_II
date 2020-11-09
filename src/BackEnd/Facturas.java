package BackEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Facturas {
	
	private int idFactura;
	private int idTarifa;
	private double importe;
	private String estadoFactura;
	private String tipoPago;
	
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
	
	public int getIdFactura() {
		return this.idFactura;
	}
	
	public String getEstadoFactura() {
		try (Connection conn = DriverManager.getConnection(conexion);){
			
			//TODO
			//El código SQL de las consultas va aquí
			
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return this.estadoFactura;
	}
	
	
	public int getIdTarifa() {
		return this.idTarifa;
	}
	
	public double getImporte() {
		return this.importe;
	}
	
	public String getTipoPago() {
		return this.tipoPago;
	}
	

	// SETTERS DE LOS ATRIBUTOS
	
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	
	public void setIdTarifa(int idTarifa) {
		this.idTarifa = idTarifa;
	}
	
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public void setEstadoFactura(String estadoFactura) {
		this.estadoFactura = estadoFactura;
	}
	
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

}
