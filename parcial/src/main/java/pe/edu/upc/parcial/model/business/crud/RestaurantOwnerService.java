package pe.edu.upc.parcial.model.business.crud;

import java.util.List;

import pe.edu.upc.parcial.model.entity.RestaurantOwner;

public interface RestaurantOwnerService extends CrudService<RestaurantOwner, Integer>{
	List<RestaurantOwner> findByFirstName(String firstName) throws Exception;
}
