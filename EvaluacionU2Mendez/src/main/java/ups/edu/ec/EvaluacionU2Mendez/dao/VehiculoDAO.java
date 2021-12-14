package ups.edu.ec.EvaluacionU2Mendez.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.EvaluacionU2Mendez.model.Vehiculo;



@Stateless
public class VehiculoDAO {
	@PersistenceContext
	private EntityManager em;
	
	
	public void insert(Vehiculo vehiculo) {
		em.persist(vehiculo);
	}
	
	public void update(Vehiculo vehiculo) {
		em.merge(vehiculo);
	}
	
	public Vehiculo read(String placa) {
		Vehiculo p = em.find(Vehiculo.class, placa);
		return p;
	}
	
	public void delete(String placa) {
		Vehiculo p = em.find(Vehiculo.class, placa);
		em.remove(p);
	}
}
