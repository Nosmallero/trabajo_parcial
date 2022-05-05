package pe.edu.upc.parcial.model.business.crud.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.parcial.model.business.crud.RestaurantOwnerService;

import pe.edu.upc.parcial.model.entity.RestaurantOwner;

import pe.edu.upc.parcial.model.repository.JpaRepository;
import pe.edu.upc.parcial.model.repository.RestaurantOwnerRepository;



@Named
@ApplicationScoped
public class RestaurantOwnerServiceImpl implements RestaurantOwnerService{
	
	@Inject
	private RestaurantOwnerRepository restaurantOwnerRepository;
	@Override
	public JpaRepository<RestaurantOwner, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return this.restaurantOwnerRepository;
	}

	

	@Override
	public List<RestaurantOwner> findByFirstName(String firstName) throws Exception {
		// TODO Auto-generated method stub
		return this.restaurantOwnerRepository.findByFirstName(firstName);
	}

}
