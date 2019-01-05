package com.dairysuite.bootstrap.model;

import java.util.Date;

import javax.persistence.Column;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getContact_no() {
		return contact_no;
	}

	public void setContact_no(Long contact_no) {
		this.contact_no = contact_no;
	}

	public Integer getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(Integer is_delete) {
		this.is_delete = is_delete;
	}

	public Integer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}

	public Integer getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(Integer updated_by) {
		this.updated_by = updated_by;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	
}
