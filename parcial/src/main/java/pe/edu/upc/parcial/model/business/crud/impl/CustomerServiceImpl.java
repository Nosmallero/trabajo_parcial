package pe.edu.upc.parcial.model.business.crud.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.parcial.model.business.crud.CustomerService;
import pe.edu.upc.parcial.model.entity.Customer;
import pe.edu.upc.parcial.model.repository.CustomerRepository;
import pe.edu.upc.parcial.model.repository.JpaRepository;



@Named
@ApplicationScoped
public class CustomerServiceImpl implements CustomerService{
	
	@Inject
	private CustomerRepository customerRepository;
	@Override
	public JpaRepository<Customer, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return this.customerRepository;
	}

	@Override
	public List<Customer> findByLastName(String lastName) throws Exception {
		// TODO Auto-generated method stub
		return this.customerRepository.findByLastName(lastName);
	}

}
