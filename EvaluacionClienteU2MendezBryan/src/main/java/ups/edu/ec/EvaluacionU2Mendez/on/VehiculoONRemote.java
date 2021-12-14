package ups.edu.ec.EvaluacionU2Mendez.on;



import ups.edu.ec.EvaluacionU2Mendez.model.Vehiculo;


public interface VehiculoONRemote  {
	public void insertarVehiculo(Vehiculo vehiculo) throws Exception ;
	public void actualizarVehiculo(Vehiculo vehiculo) throws Exception;
	public Vehiculo buscarVehiculo(String placa) throws Exception;
	public void eliminarVehiculo(String placa) throws Exception;
	
	
}
