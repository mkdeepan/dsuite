package com.dairysuite.bootstrap.dao.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "prod_name")
	private String prod_name;
	
	@Column(name = "alias")
	private String alias;
	
	@Column(name = "brand_name")
	private String brand_name;
	
	@Column(name = "vendor_id")
	private Integer vendor_id;
	
	@Column(name = "is_active")
	private String is_active;
	
	@Column(name = "modify_at")
	private Date modify_at;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public Integer getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(Integer vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getIs_active() {
		return is_active;
	}

	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}

	public Date getModify_at() {
		return modify_at;
	}

	public void setModify_at(Date modify_at) {
		this.modify_at = modify_at;
	}

	public Integer getModify_by() {
		return modify_by;
	}

	public void setModify_by(Integer modify_by) {
		this.modify_by = modify_by;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Integer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}

	public Integer getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(Integer is_delete) {
		this.is_delete = is_delete;
	}

	@Column(name = "modify_by")
	private Integer modify_by;
	
	@Column(name = "created_at")
	private Date created_at;
	
	@Column(name = "created_by")
	private Integer created_by;
	
	@Column(name = "is_delete")
	private Integer is_delete;	
	

}
