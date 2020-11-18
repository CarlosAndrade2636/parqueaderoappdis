package ec.ups.edu.appdis.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Cliente;

@Stateless
public class ClienteDAO {

	@Inject
	private Connection con;
	
	

	public boolean insert(Cliente entity) throws SQLException {
		
		String sql= "INSERT INTO Cliente {dni,email,nombre,tipoDocumento)"
				+"VALUES(?.?.?.?)";
		PreparedStatement ps =con.prepareStatement(sql);
		ps.setString(1, entity.getDni());
		ps.setString(2, entity.getEmail());
		ps.setString(3, entity.getNombre());
		ps.setInt(4, entity.getTipoDocumento());
		ps.executeUpdate();
		ps.close();
		return true;
		
	}
	public boolean update(Cliente entity) throws SQLException {
		
		String sql = "UPDATE cliente SET dni=?,email=?,nombre=?,tipoDocumento=? WHERE dni=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, entity.getDni());
		ps.setString(2, entity.getEmail());
		ps.setString(3, entity.getNombre());
		ps.setInt(4,entity.getTipoDocumento());
		ps.executeUpdate();
		ps.close();
		return true;
		
	}	public boolean read(String id) throws SQLException {
		
		String sql ="SELECT * FROM cliente WHERE dni=?";
		
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
