package com.dairysuite.bootstrap.service;

import java.util.List;

import com.dairysuite.bootstrap.model.Customers;

public interface ICommonService {
	public List<Customers> getCustomer();
	public Customers getCustomer(Integer cid);
}
