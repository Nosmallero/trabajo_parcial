package pe.edu.upc.parcial.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import pe.edu.upc.parcial.model.entity.RestaurantOwner;
import pe.edu.upc.parcial.model.repository.RestaurantOwnerRepository;

@Named
@ApplicationScoped
public class RestaurantOwnerRepositoryImpl implements RestaurantOwnerRepository{

	@PersistenceContext(unitName = "faveatPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return this.entityManager;
	}

	@Override
	public Optional<RestaurantOwner> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return this.findById(id, RestaurantOwner.class);
	}

	@Override
	public List<RestaurantOwner> findAll() throws Exception {
		String jpql = "SELECT restauranto FROM RestaurantOwner restauranto";
		return this.findByQuery(RestaurantOwner.class, jpql);
	}

	@Override
	public List<RestaurantOwner> findByFirstName(String firstName) throws Exception {
		String jpql = "SELECT restauranto FROM RestaurantOwner restauranto WHERE restauranto.firstName = '" + firstName + "'";
		return this.findByQuery(RestaurantOwner.class, jpql);
	}

	@Override
	public List<RestaurantOwner> findByData(String data) throws Exception {
		String jpql = "SELECT restauranto FROM RestaurantOwner restauranto WHERE restauranto.firstName LIKE '" + data  + "'";
		return this.findByQuery(RestaurantOwner.class, jpql);
	}

}
