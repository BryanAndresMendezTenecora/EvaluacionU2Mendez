package ups.edu.ec.EvaluacionU2Mendez.on;

import javax.ejb.Stateless;
import javax.inject.Inject;


import ups.edu.ec.EvaluacionU2Mendez.dao.VehiculoDAO;
import ups.edu.ec.EvaluacionU2Mendez.model.Vehiculo;

@Stateless
public class VehiculoON implements VehiculoONLocal, VehiculoONRemote {

	@Inject
	private VehiculoDAO vehiculoDAO;
	
	
	public void insertarVehiculo(Vehiculo vehiculo) throws Exception{
		vehiculoDAO.insert(vehiculo);
	}
	
	
	public void actualizarVehiculo(Vehiculo vehiculo) throws Exception {
		vehiculoDAO.update(vehiculo);
	}
	
	public Vehiculo buscarVehiculo(String placa) throws Exception {
		return vehiculoDAO.read(placa);
	}
	
	public void eliminarVehiculo(String placa) throws Exception {
		vehiculoDAO.delete(placa);
	}
}
