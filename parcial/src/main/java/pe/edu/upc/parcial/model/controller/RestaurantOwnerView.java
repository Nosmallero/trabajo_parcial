package pe.edu.upc.parcial.model.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.parcial.model.business.crud.CrudService;

import pe.edu.upc.parcial.model.business.crud.RestaurantOwnerService;

import pe.edu.upc.parcial.model.entity.RestaurantOwner;

@Named("ownerView")
@ViewScoped
public class RestaurantOwnerView implements Serializable, EntityView<RestaurantOwner,Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<RestaurantOwner> entities;
	private RestaurantOwner entitySelected;
	private List<RestaurantOwner> entitiesSelected;
	private RestaurantOwner entitySearch;
	
	@Inject
	private RestaurantOwnerService entityService;

	@PostConstruct
	public void init() {
		this.entitiesSelected = new ArrayList<>();
		this.entitySearch = new RestaurantOwner();
		getAllEntities();
	}
	
	
	@Override
	public CrudService<RestaurantOwner, Integer> getCrudService() {
		// TODO Auto-generated method stub
		return this.entityService;
	}

	@Override
	public void createNew() {
		// TODO Auto-generated method stub
		this.entitySelected = new RestaurantOwner();
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
			this.entities = this.entityService.search(this.entitySearch.getFirstName());
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}


	public List<RestaurantOwner> getEntities() {
		return entities;
	}


	public void setEntities(List<RestaurantOwner> entities) {
		this.entities = entities;
	}


	public RestaurantOwner getEntitySelected() {
		return entitySelected;
	}


	public void setEntitySelected(RestaurantOwner entitySelected) {
		this.entitySelected = entitySelected;
	}


	public List<RestaurantOwner> getEntitiesSelected() {
		return entitiesSelected;
	}


	public void setEntitiesSelected(List<RestaurantOwner> entitiesSelected) {
		this.entitiesSelected = entitiesSelected;
	}


	public RestaurantOwner getEntitySearch() {
		return entitySearch;
	}


	public void setEntitySearch(RestaurantOwner entitySearch) {
		this.entitySearch = entitySearch;
	}


	public RestaurantOwnerService getEntityService() {
		return entityService;
	}


	public void setEntityService(RestaurantOwnerService entityService) {
		this.entityService = entityService;
	}


	

	
	
	

}
