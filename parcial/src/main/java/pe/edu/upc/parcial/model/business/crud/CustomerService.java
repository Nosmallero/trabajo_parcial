
package pe.edu.upc.parcial.model.business.crud;

import java.util.List;

import pe.edu.upc.parcial.model.entity.Customer;



public interface CustomerService extends CrudService<Customer, Integer>{
	List<Customer> findByLastName(String lastName) throws Exception;
}
