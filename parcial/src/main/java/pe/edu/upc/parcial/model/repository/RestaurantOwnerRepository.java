package pe.edu.upc.parcial.model.repository;

import java.util.List;

import pe.edu.upc.parcial.model.entity.RestaurantOwner;

public interface RestaurantOwnerRepository extends JpaRepository<RestaurantOwner, Integer>{
	List<RestaurantOwner> findByFirstName(String firstName) throws Exception;
}
