package ups.edu.ec.EvaluacionU2Mendez.view;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

import ups.edu.ec.EvaluacionU2Mendez.model.Vehiculo;
import ups.edu.ec.EvaluacionU2Mendez.on.VehiculoONRemote;



public class VentVehiculo {
	
	
private VehiculoONRemote vehiculoRemote;
	
	public void conectar() throws Exception {
		try {
			final Hashtable<String, Comparable> jndiProperties = new Hashtable<String, Comparable>();
			jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,
					"org.wildfly.naming.client.WildFlyInitialContextFactory");
			jndiProperties.put("jboss.naming.client.ejb.context", true);

			jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
			jndiProperties.put(Context.SECURITY_PRINCIPAL, "p59");
			jndiProperties.put(Context.SECURITY_CREDENTIALS, "p59");

			final Context context = new InitialContext(jndiProperties);

			final String lookupName = "ejb:/EvaluacionU2Mendez/VehiculoON!ups.edu.ec.EvaluacionU2Mendez.on.VehiculoONRemote";

			this.vehiculoRemote = (VehiculoONRemote) context.lookup(lookupName);

		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}

	}
	
	
	public void insertarVehiculo(String placa, String marca, String color, String modelo, String dueno ) {
		Vehiculo vehiculo= new Vehiculo();
		vehiculo.setPlaca(placa);
		vehiculo.setMarca(marca);
		vehiculo.setColor(color);
		vehiculo.setModelo(modelo);
		vehiculo.setDueno(dueno);
		
		try {
			vehiculoRemote.insertarVehiculo(vehiculo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void actualizarVehiculo(String placa, String marca, String color, String modelo, String dueno ) {
		Vehiculo vehiculo= new Vehiculo();
		vehiculo.setPlaca(placa);
		vehiculo.setMarca(marca);
		vehiculo.setColor(color);
		vehiculo.setModelo(modelo);
		vehiculo.setDueno(dueno);

		
		try {
			vehiculoRemote.actualizarVehiculo(vehiculo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Vehiculo buscarVehiculo(String placa) {
		Vehiculo p;
		try {
			p = vehiculoRemote.buscarVehiculo(placa);
			return p;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			p= new Vehiculo();
			return p;
		}
		
	}
	/*
	public void eliminarVehiculo(String cedula) {
		VehiculoRemote.eliminarVehiculo(cedula);
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentVehiculo vh= new VentVehiculo();
		try {
			vh.conectar();
			//vh.insertarVehiculo("AAA", "Huandai", "Plateado", "Acent", "Juan");
			Vehiculo v= vh.buscarVehiculo("AAA");
			//vh.actualizarVehiculo("AAA", "Toyota", null, null, "Jose");
			System.out.println(v.getDueno() +" = "+v.getPlaca());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
