package com.dairysuite.bootstrap.model;

import java.util.Date;

import javax.persistence.Column;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-19T02:44:50.512+05:30")

public class Users {

	
private Integer id;
	
	@JsonProperty("username")
	private String username;
	
	//@JsonIgnoreProperties
	//@JsonProperty("password")
	//private String password;
	
	@JsonProperty("firstname")
	private String firstname;
	
	@JsonProperty("lastname")
	private String lastname;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("contact_no")
	private Long contact_no;
	
	/*@JsonProperty("name = "is_active")
	private Integer is_active;
	
	@JsonProperty("name = "role")
	private String role;*/
	
	@JsonProperty("is_delete")
	private Integer is_delete;
	
	@JsonProperty("created_by")
	private Integer created_by;
	
	@JsonProperty("updated_by")
	private Integer updated_by;
	
	@JsonProperty("created_at")
	private Date created_at;
	
	@JsonProperty("updated_at")
	private Date updated_at;

	
}
