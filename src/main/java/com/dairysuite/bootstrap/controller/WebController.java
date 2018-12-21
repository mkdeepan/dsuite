package com.dairysuite.bootstrap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dairysuite.bootstrap.impl.DsuiteApiImpl;


@RestController
public class WebController {	
	@Autowired
	DsuiteApiImpl impl;
	
	@RequestMapping(value = "/web/index", method = RequestMethod.GET)
	public String get() {
		return "Deepan";
	}
	
//	@RequestMapping(value = "/web/getCustomerById", method = RequestMethod.GET)
//	public String getCustomer(@RequestParam("cid") Integer cid) {
//		return impl.getCustomer(cid);	
//	}
}
