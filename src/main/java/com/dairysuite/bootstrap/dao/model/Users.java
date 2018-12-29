package com.dairysuite.bootstrap.dao.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class Users {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "contact_no")
	private Long contact_no;
	
	/*@Column(name = "is_active")
	private Integer is_active;
	
	@Column(name = "role")
	private String role;*/
	
	@Column(name = "is_delete")
	private Integer is_delete;
	
	@Column(name = "created_by")
	private Integer created_by;
	
	@Column(name = "updated_by")
	private Integer updated_by;
	
	@Column(name = "created_at")
	private Date created_at;
	
	@Column(name = "updated_at")
	private Date updated_at;
	
	//@OneToOne(mappedBy="user")
	//@Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	//private Customers customer;
}
