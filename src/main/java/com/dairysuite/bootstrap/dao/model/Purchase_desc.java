package com.dairysuite.bootstrap.dao.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase_desc")
public class Purchase_desc {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "purchase_id")
	private String purchase_id;
	
	@Column(name = "prod_id")
	private String prod_id;
	
	@Column(name = "prod_rate_per_unit")
	private Float prod_rate_per_unit;
	
	@Column(name = "prod_quan")
	private Float prod_quan;
	
	@Column(name = "prod_tax")
	private Float prod_tax;
	
	@Column(name = "sub_amount")
	private Float sub_amount;
	
	@Column(name = "prod_discount_id")
	private String prod_discount_id;
	
	@Column(name = "modify_by")
	private Integer modify_by;
	
	@Column(name = "created_at")
	private Date created_at;
	
	@Column(name = "created_by")
	private Integer created_by;
	
	@Column(name = "modify_at")
	private Date modify_at;

}
