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

import lombok.Data;

@Data
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
}