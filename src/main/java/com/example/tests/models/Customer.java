package com.example.tests.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "Customer")
//@JsonIgnoreProperties(value = {"custId","order"})
public class Customer {
	@Id
	@Column(name = "cust_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(required = false)
	private Long custId;

	@Column(name = "cust_Details")
	private String custDetails;

	@Column(name = "cust_Address")
	private String custAddress;
	
	@Column(name="cust_Name")
	private String custName;

	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	private List<Orders> order;

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustDetails() {
		return custDetails;
	}

	public void setCustDetails(String custDetails) {
		this.custDetails = custDetails;
	}

	public List<Orders> getOrder() {
		return order;
	}

	public void setOrder(List<Orders> order) {
		this.order = order;
	}

}
