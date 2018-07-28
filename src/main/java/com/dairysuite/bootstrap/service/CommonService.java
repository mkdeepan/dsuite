package com.dairysuite.bootstrap.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dairysuite.bootstrap.model.CustomerDAO;
import com.dairysuite.bootstrap.model.Customers;

@Repository
public class CommonService implements ICommonService{
	@PersistenceContext	
	private EntityManager entityManager;
	
	@Autowired
	CustomerDAO customerDAO;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Customers> getCustomer() {
		List <Customers> cust = new ArrayList<Customers>();
		String hql = "FROM Customers";
		cust = entityManager.createQuery(hql).getResultList();
		System.out.println("Cusotmers size::"+cust.size());
		return cust;
	}

	@Override
	public Customers getCustomer(Integer cid) {
		Customers cust = null;
	    try {
	    	cust = customerDAO.findById(cid);	
	    	System.out.println("resp:: ");
	    }
	    catch (Exception ex) {
	      System.out.println("err");
	    }
	    return cust;
	}
	
}