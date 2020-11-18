package ec.ups.edu.appdis.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Factura;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;
@Stateless
public class FacturaDAO {

	@Inject
	private Connection con;
	
	public boolean insert(Factura entity) throws SQLException {
		
		String sql ="INSERT INTO factura {codigo,fecha_ingreso,fecha_salida,valortotal}"
				+ "VALUES(?,?,?,?,?,?,?,?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, entity.getNumero());
				ps.setDate(2, (Date) entity.getFechaEmision());
				ps.setDate(3, (Date) entity.getFechaEmision());
				ps.setDouble(4, entity.getValorTotal());
				ps.executeUpdate();
				ps.close();
				
		return true;
		
	}
	public boolean update(Factura entity) throws SQLException {
		String sql = "UPDATE factura SET codigo=?,fecha_ingreso=?,fecha_salida=?,valortotal=? WHERE codigo=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, entity.getNumero());
		ps.setDate(2, (Date) entity.getFechaEmision());
		ps.setDate(3, (Date) entity.getFechaEmision());
		ps.setDouble(4, entity.getValorTotal());
		ps.executeUpdate();
		ps.close();
		return true;
		
	}	public boolean read(int id) throws SQLException {
		
String sql ="SELECT * FROM factura WHERE numero=?";
		
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
