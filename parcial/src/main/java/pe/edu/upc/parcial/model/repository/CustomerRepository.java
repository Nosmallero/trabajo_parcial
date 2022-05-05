package pe.edu.upc.parcial.model.repository;

import java.util.List;

import pe.edu.upc.parcial.model.entity.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	List<Customer> findByLastName(String lastName) throws Exception;
}
