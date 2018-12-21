package com.dairysuite.bootstrap.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dairysuite.bootstrap.dao.model.Customers;
import com.dairysuite.bootstrap.model.Customer;
import com.dairysuite.bootstrap.model.CustomerList;
import com.dairysuite.bootstrap.model.Status;
import com.dairysuite.bootstrap.service.CommonService;

@Component
public class DsuiteApiImpl {
	@Autowired
	CommonService common;	
	
	public CustomerList getCustomers() {
		CustomerList custList = new CustomerList();
		List<Customer> customerList = new ArrayList<Customer>();
		Status status = new Status();
		try {
			List <Customers> customersList = new ArrayList<Customers>();
			customersList = common.getCustomer();
			for(Customers customer: customersList) {
				Customer cust = new Customer();
				cust.setId(customer.getId());	
				cust.setAddress(customer.getAddress());
				cust.setAlias(customer.getAlias());
				cust.setCity(customer.getCity());
				cust.setContactNo(customer.getContact_no());
				cust.setContactNo1(customer.getContact_no1());
//				System.out.println("its users"+customer.getUser().toString());
//				cust.setCreatedAt(customer.getCreated_at());
				//cust.setCreatedBy(customer.getCreated_by());
				cust.setCustomerName(customer.getCustomer_name());
				cust.setCustomerType(customer.getCustomer_name()); // need to check
				cust.setFirstName(customer.getFirstname());
				cust.setIsActive(customer.getIs_active());
				cust.setIsDelete(customer.getIs_delete());
				cust.setLastName(customer.getLastname());
				cust.setPincode(customer.getPincode());
				cust.setRoute(customer.getRoute());				
//				cust.setUpdatedAt(customer.getUpdated_at());
//				cust.setUpdatedBy(customer.getUpdated_by());
				customerList.add(cust);
			}
			custList.setCustomers(customerList);
			status.setCode(200);
			status.setMessage("Success");
			custList.setStatus(status);
		}
		catch(Exception e) {
			status.setCode(303);
			status.setMessage("Some error happened!!");
			custList.setStatus(status);
		}		
		return custList;
	}
	
	public CustomerList getCustomer(Integer cid) {
		System.out.println("customer cid:::"+cid);
		CustomerList custList = new CustomerList();
		List<Customer> list = new ArrayList<Customer>();
		Customer cust = new Customer();
		Customers customer = common.getCustomer(cid);
		
		cust.setId(customer.getId());	
		cust.setAddress(customer.getAddress());
		cust.setAlias(customer.getAlias());
		cust.setCity(customer.getCity());
//			cust.setContactNo(customer.getContact_no());
//			cust.setContactNo1(customer.getContact_no1());
//			cust.setCreatedAt(customer.getCreated_at());
//			cust.setCreatedBy(customer.getCreated_by());
		cust.setCustomerName(customer.getCustomer_name());
		cust.setCustomerType(customer.getCustomer_name()); // need to check
		cust.setFirstName(customer.getFirstname());
		cust.setIsActive(customer.getIs_active());
		cust.setIsDelete(customer.getIs_delete());
		cust.setLastName(customer.getLastname());
//			cust.setPincode(customer.getPincode());
		cust.setRoute(customer.getRoute());				
//			cust.setUpdatedAt(customer.getUpdated_at());
//			cust.setUpdatedBy(customer.getUpdated_by());
		list.add(cust);
		custList.setCustomers(list);
		Status status = new Status();
		status.setCode(200);
		status.setMessage("Success");
		custList.setStatus(status);
		return custList;
	}

}
