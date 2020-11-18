package ec.ups.edu.appdis.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Vehiculo;

@Stateless
public class VehiculoDAO {
	
	@Inject
	private Connection con;

	public boolean insert(Vehiculo entity) throws SQLException {
		String sql= "INSERT INTO vehiculo {placa,marca,color)"
				+"VALUES(?.?.?.?)";
		PreparedStatement ps =con.prepareStatement(sql);
		ps.setString(1, entity.getPlaca());
		ps.setString(2, entity.getMarca());
		ps.setString(3, entity.getColor());
		ps.executeUpdate();
		ps.close();
		return true;
		
	}
	public boolean update(Vehiculo entity) throws SQLException {
		String sql = "UPDATE vehiculo SET placa=?,marca=?,color=? WHERE placa=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, entity.getPlaca());
		ps.setString(2, entity.getMarca());
		ps.setString(3, entity.getColor());
		ps.executeUpdate();
		ps.close();
		return true;
		
	}	public boolean read(String id) throws SQLException {
String sql ="SELECT * FROM vehiculo WHERE placa=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, id);
		ps.executeUpdate();
		ps.close();
		return true;
		
	}	public boolean delete(String id) throws SQLException {
String sql ="DELETE  FROM cliente WHERE dni=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, id);
		ps.executeUpdate();
		ps.close();
		return true;
		
	}
}
