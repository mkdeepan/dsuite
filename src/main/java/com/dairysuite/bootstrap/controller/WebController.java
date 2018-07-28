package com.dairysuite.bootstrap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dairysuite.bootstrap.service.CommonService;


@RestController
@RequestMapping("/web")
public class WebController {	
	@Autowired
	CommonService common;
	
	@RequestMapping(value = "/index")
	public String get() {
		return "Deepan";
	}
	
	@RequestMapping(value = "/getCustomers", method = RequestMethod.GET)
	public String getCustomers() {
		System.out.println("customers:::");
		return common.getCustomer().toString();		
	}
	
	@RequestMapping(value = "/getCustomerById", method = RequestMethod.GET)
	public String getCustomer(@RequestParam("cid") Integer cid) {
		System.out.println("customer cid:::"+cid);
		return common.getCustomer(cid).toString();		
	}
}
