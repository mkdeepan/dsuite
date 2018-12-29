package com.dairysuite.bootstrap.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dairysuite.bootstrap.dao.model.CustomerDAO;
import com.dairysuite.bootstrap.dao.model.Customers;

@Repository
public class CommonService implements ICommonService{
	@PersistenceContext	
	private EntityManager entityManager;
	
	@Autowired
	CustomerDAO customerDAO;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Customers> getCustomer() {
		/*List <Customers> cust = new ArrayList<Customers>();
		String hql = "FROM Customers";
		cust = entityManager.createQuery(hql).getResultList();
		System.out.println("Cusotmers size::"+cust.size());
		return cust;*/
		return (List<Customers>) customerDAO.findAll();
	}

	@Override
	public Optional<Customers> getCustomer(Integer cid) {
		Optional<Customers> cust = null;
	    try {
	    	System.out.println("inside the get customer by id method------------->"+cid);
	    	cust = customerDAO.findById(cid);	
	    	System.out.println("resp:: address------------------------>>>>>>"+cust);
	    }
	    catch (Exception ex) {
	      System.out.println("err");
	    }
	    return cust;
	}
	
}
