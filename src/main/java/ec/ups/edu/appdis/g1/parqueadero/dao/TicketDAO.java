package ec.ups.edu.appdis.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;

@Stateless
public class TicketDAO {
	

	@Inject
	private Connection con;
	

	public boolean insert(Ticket entity) throws SQLException {
		String sql= "INSERT INTO ticket {codigo,fechaIngreso,fechaSalida,tiempo, valor, vehiculo)"
				+"VALUES(?,?,?,?,?)";
		
		PreparedStatement ps =con.prepareStatement(sql);
		ps.setInt(1, entity.getCodigo());
		ps.setDate(2,(Date) entity.getFechaIngreso());
		ps.setDate(3,(Date) entity.getFechaSalida());
		ps.setInt(4, entity.getTiempo());
		ps.setString(5, entity.getVehiculo().getPlaca());
		ps.executeUpdate();
		ps.close();
		return true;
		
	}
	public boolean update(Ticket entity) throws SQLException {
		String sql = "UPDATE ticket SET codigo=?,fecha_ingreso=?,fecha_salida=?,tiempo=?,valor=?,vehiculo=?, WHERE codigo=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, entity.getCodigo());
		ps.setDate(2,(Date) entity.getFechaIngreso());
		ps.setDate(3,(Date) entity.getFechaSalida());
		ps.setInt(4, entity.getTiempo());
		ps.setString(5, entity.getVehiculo().getPlaca());
		ps.executeUpdate();
		ps.close();
		return true;
		
	}	public boolean read(int id) throws SQLException {
		String sql ="SELECT * FROM ticket WHERE numero=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, id);
		ps.executeUpdate();
		ps.close();
		return true;
	
	}	public boolean delete(int id) throws SQLException {
String sql ="DELETE  FROM cliente WHERE dni=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, id);
		ps.executeUpdate();
		ps.close();
		return true;
		
	}
}
