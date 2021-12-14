package ups.edu.ec.EvaluacionU2Mendez.on;

import javax.ejb.Remote;

import ups.edu.ec.EvaluacionU2Mendez.model.Vehiculo;

@Remote
public interface VehiculoONRemote  {
	public void insertarVehiculo(Vehiculo vehiculo) throws Exception ;
	public void actualizarVehiculo(Vehiculo vehiculo) throws Exception;
	public Vehiculo buscarVehiculo(String placa) throws Exception;
	public void eliminarVehiculo(String placa) throws Exception;
	
	
}
