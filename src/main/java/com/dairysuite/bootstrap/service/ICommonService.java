package com.dairysuite.bootstrap.service;

import java.util.List;
import java.util.Optional;

import com.dairysuite.bootstrap.dao.model.Customers;

public interface ICommonService {
	public List<Customers> getCustomer();
	public Optional<Customers> getCustomer(Integer cid);
}
