package com.dairysuite.bootstrap.dao.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase_details")
public class Purchase_details {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "purchase_date")
	private Date purchase_date;
	
	@Column(name = "total_amount")
	private Float total_amount;
	
	@Column(name = "created_by")
	private Integer created_by;
	
	@Column(name = "modify_by")
	private Integer modify_by;
	
	@Column(name = "created_at")
	private Date created_at;
	
	@Column(name = "modify_at")
	private Date modify_at;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}

	public Float getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Float total_amount) {
		this.total_amount = total_amount;
	}

	public Integer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
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

	public Date getModify_at() {
		return modify_at;
	}

	public void setModify_at(Date modify_at) {
		this.modify_at = modify_at;
	}	
	
	
	
}