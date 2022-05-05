package pe.edu.upc.parcial.model.controller;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.parcial.model.business.crud.CrudService;
import pe.edu.upc.parcial.model.business.crud.CustomerService;
import pe.edu.upc.parcial.model.entity.Customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("customerView")
@ViewScoped
public class CustomerView implements Serializable, EntityView<Customer,Integer> {

	
	private static final long serialVersionUID = 1L;

	private List<Customer> entities;
	private Customer entitySelected;
	private List<Customer> entitiesSelected;
	private Customer entitySearch;
	
	@Inject
	private CustomerService entityService;
	
	@PostConstruct
	public void init() {
		this.entitiesSelected = new ArrayList<>();
		this.entitySearch = new Customer();
		getAllEntities();
	}
	
	@Override
	public CrudService<Customer, Integer> getCrudService() {
		// TODO Auto-generated method stub
		return this.entityService;
	}

	@Override
	public void createNew() {
		// TODO Auto-generated method stub
		this.entitySelected = new Customer();
	}

	@Override
	public Integer getIdFromEntitySelected() {
		// TODO Auto-generated method stub
		return this.entitySelected.getId();
	}

	@Override
	public void searchEntity() {
		// TODO Auto-generated method stub
		try {	
			this.entities = this.entityService.search(this.entitySearch.getLastName());
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	public List<Customer> getEntities() {
		return entities;
	}

	public void setEntities(List<Customer> entities) {
		this.entities = entities;
	}

	public Customer getEntitySelected() {
		return entitySelected;
	}

	public void setEntitySelected(Customer entitySelected) {
		this.entitySelected = entitySelected;
	}

	public List<Customer> getEntitiesSelected() {
		return entitiesSelected;
	}

	public void setEntitiesSelected(List<Customer> entitiesSelected) {
		this.entitiesSelected = entitiesSelected;
	}

	public Customer getEntitySearch() {
		return entitySearch;
	}

	public void setEntitySearch(Customer entitySearch) {
		this.entitySearch = entitySearch;
	}

	public CustomerService getEntityService() {
		return entityService;
	}

	public void setEntityService(CustomerService entityService) {
		this.entityService = entityService;
	}
	

	
	
	
	
}
