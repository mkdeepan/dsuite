package com.dairysuite.bootstrap.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
				if(null!=customer.getUser())
				System.out.println("User values---firstname--->" + customer.getUser().getFirstname()+"email value--->"+ customer.getUser().getEmail() );
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
		Optional<Customers> customer = common.getCustomer(cid);
		
		cust.setId(customer.get().getId());	
		cust.setAddress(customer.get().getAddress());
		cust.setAlias(customer.get().getAlias());
		cust.setCity(customer.get().getCity());
//			cust.setContactNo(customer.get().getContact_no());
//			cust.setContactNo1(customer.getContact_no1());
//			cust.setCreatedAt(customer.getCreated_at());
//			cust.setCreatedBy(customer.getCreated_by());
		cust.setCustomerName(customer.get().getCustomer_name());
		cust.setCustomerType(customer.get().getCustomer_name()); // need to check
		cust.setFirstName(customer.get().getFirstname());
		cust.setIsActive(customer.get().getIs_active());
		cust.setIsDelete(customer.get().getIs_delete());
		cust.setLastName(customer.get().getLastname());
//			cust.setPincode(customer.getPincode());
		cust.setRoute(customer.get().getRoute());				
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
