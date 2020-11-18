package ec.ups.edu.appdis.g1.parqueadero.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.dao.FacturaDAO;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Factura;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;
@Stateless
public class GestionFacturasON {
	@Inject
	private FacturaDAO daoFactura;
		public boolean imprimirFactura(Factura factura) {
			
			return true;
		}
		
		public Ticket buscarFactura(int id) throws SQLException {
			daoFactura.read(id);
			return null;
			
		}
		public boolean guardarFactura(Factura factura) throws SQLException {
			daoFactura.insert(factura);
			return true;
			
		}
		
		public boolean eliminarFactura(int idFactura) throws SQLException {
			daoFactura.delete(idFactura);
		return true;	
		}
		public boolean actualizarFactura(Factura factura) throws SQLException {
			daoFactura.update(factura);
		return true;	
		}
		
		
}
