package ec.ups.edu.appdis.g1.parqueadero.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.dao.VehiculoDAO;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Vehiculo;

@Stateless

public class GestionVehiculoON {
	
	@Inject
	private VehiculoDAO daoVehiculo;
		public boolean registrarVehiculo(Vehiculo vehiculo) throws SQLException {
		daoVehiculo.insert(vehiculo);
			return true;
		}
		
		public Ticket actualizarVehiculo(Vehiculo vehiculo) throws SQLException {
			daoVehiculo.update(vehiculo);
			return null;
			
		}
		public double borrarVehiculo(String placa) throws SQLException {
			daoVehiculo.delete(placa);
			return 0;
			
		}
		
		public Vehiculo buscarVehiculo(String placa) throws SQLException {
			daoVehiculo.read(placa);
		return null;	
		}
		
		
}
