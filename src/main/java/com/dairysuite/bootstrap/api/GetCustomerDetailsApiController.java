package com.dairysuite.bootstrap.api;

import com.dairysuite.bootstrap.impl.DsuiteApiImpl;
import com.dairysuite.bootstrap.model.Customer;
import com.dairysuite.bootstrap.model.CustomerList;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-19T01:38:29.186+05:30")

@Controller
public class GetCustomerDetailsApiController implements GetCustomerDetailsApi {

    private static final Logger log = LoggerFactory.getLogger(GetCustomerDetailsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    DsuiteApiImpl impl;

    @org.springframework.beans.factory.annotation.Autowired
    public GetCustomerDetailsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CustomerList> getCustomerById(@ApiParam(value = "ID of customer",required=true) @PathVariable("cusId") Integer cusId) {
    	System.out.println("inside the getCustomer by id------>*********"+cusId);
    	CustomerList cust = impl.getCustomer(cusId);
        return new ResponseEntity<CustomerList> (cust,HttpStatus.OK);
    }

    public ResponseEntity<CustomerList> getCustomers() {
    	System.out.println("inside the getCustomers------>*********");
    	CustomerList cust = impl.getCustomers();
        return new ResponseEntity<CustomerList>(cust,HttpStatus.OK);
    }

}