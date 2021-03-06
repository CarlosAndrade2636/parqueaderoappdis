package ec.ups.edu.appdis.g1.parqueadero.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.dao.TicketDAO;
import ec.ups.edu.appdis.g1.parqueadero.dao.VehiculoDAO;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Vehiculo;
@Stateless
public class GestionReportesON {
	@Inject
	private TicketDAO daoTicket;
	private VehiculoDAO daoVehiculo;
		public boolean registrarTicket(Ticket ticket) throws SQLException {
			daoTicket.insert(ticket);
			return true;
		}
		
		public Ticket salidaVehiculo(Ticket ticket) throws SQLException {
			daoTicket.update(ticket);
			return null;
			
		}
		public double calcularTiempo(int idTicket) {
			return 0;
			
		}
		
		public Vehiculo buscarVehiculo(String placa) throws SQLException {
			daoVehiculo.read(placa); 
		return null;	
		}
		
		
}
