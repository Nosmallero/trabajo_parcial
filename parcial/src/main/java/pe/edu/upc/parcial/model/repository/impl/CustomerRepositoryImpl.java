package pe.edu.upc.parcial.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.parcial.model.entity.Customer;
import pe.edu.upc.parcial.model.repository.CustomerRepository;



@Named
@ApplicationScoped
public class CustomerRepositoryImpl implements CustomerRepository{

	@PersistenceContext(unitName = "faveatPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return this.entityManager;
	}

	@Override
	public Optional<Customer> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return this.findById(id, Customer.class);
	}

	@Override
	public List<Customer> findAll() throws Exception {
		String jpql = "SELECT customer FROM Customer customer";
		return this.findByQuery(Customer.class, jpql);
	}

	@Override
	public List<Customer> findByLastName(String lastName) throws Exception {
		String jpql = "SELECT customer FROM Customer customer WHERE customer.lastName = '" + lastName + "'";
		return this.findByQuery(Customer.class, jpql);
	}

	@Override
	public List<Customer> findByData(String data) throws Exception {
		String jpql = "SELECT customer FROM Customer customer WHERE customer.lastName LIKE '" + data  + "'";
		return this.findByQuery(Customer.class, jpql);
	}

}