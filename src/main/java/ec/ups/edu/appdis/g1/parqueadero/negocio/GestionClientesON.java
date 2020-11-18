package ec.ups.edu.appdis.g1.parqueadero.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.dao.ClienteDAO;
import ec.ups.edu.appdis.g1.parqueadero.dao.VehiculoDAO;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Cliente;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Vehiculo;

@Stateless
public class GestionClientesON {
	
	@Inject
	private ClienteDAO daoCliente;
	private VehiculoDAO daoVehiculo;
		public boolean registrarCliente(Cliente cliente) throws SQLException {
			daoCliente.insert(cliente);
			return true;
		}
		
		public Cliente buscarCliente(String idCliente) throws SQLException {
			daoCliente.read(idCliente);
			return null;
			
		}
	
		
		public Vehiculo buscarVehiculo(String placa) throws SQLException {
			daoVehiculo.read(placa);
			
		return null;	
		}
		
		
}
