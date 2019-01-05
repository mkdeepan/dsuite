package com.dairysuite.bootstrap.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="customers")
public class Customers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "customer_name")
	private String customer_name;
	
	@Column(name = "alias")
	private String alias;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "route")
	private String route;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "contact_no")
	private Long contact_no;
	
	@Column(name = "contact_no1")
	private Long contact_no1;
	
	@Column(name = "is_delete")
	private Integer is_delete;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "pincode")
	private Integer pincode;


	@Column(name = "is_active")
	private Integer is_active;
	
	@Column(name="created_by")
	private Integer created_by;
	
	@Column(name = "updated_by")
	private Integer updated_by;
	
	@Column(name = "created_at")
	private Date created_at;
	
	@Column(name = "updated_at")
	private Date updated_at;

//	@Column(name = "customer_type")
//	private Enum<?> customer_type;
	
	//@OneToOne
	//@PrimaryKeyJoinColumn
	//private Users user;
	
	@OneToOne(targetEntity=Users.class,cascade=CascadeType.ALL)
	@JoinColumn(name="id",referencedColumnName="id")
	private Users user;
//	private Users user;
//

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
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

	public Long getContact_no() {
		return contact_no;
	}

	public void setContact_no(Long contact_no) {
		this.contact_no = contact_no;
	}

	public Long getContact_no1() {
		return contact_no1;
	}

	public void setContact_no1(Long contact_no1) {
		this.contact_no1 = contact_no1;
	}

	public Integer getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(Integer is_delete) {
		this.is_delete = is_delete;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Integer getIs_active() {
		return is_active;
	}

	public void setIs_active(Integer is_active) {
		this.is_active = is_active;
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

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
}