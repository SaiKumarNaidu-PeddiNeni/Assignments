/**
 * 
 */
package com.bankproj.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Sai Kumar Naidu (51897496)
 *
 */
@Entity
@Table(name="customer_details")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	
	@Size(min = 5, max = 10)
	@NotEmpty(message = "Please enter your full name")
	private String fullName;
	
	@Size(min = 5, max = 10)
	@NotEmpty(message = "Please enter your sex")
	private String sex;
	
	@Size(min = 5, max = 10)
	@NotEmpty(message = "Please enter your address")
	private String address;
	
	@NotNull(message = "Please enter your phone number")
	private int phoneNo;
	
	@Size(min = 5, max = 10)
	@NotEmpty(message = "Please enter your aadhar")
	private String aadhar;
	
	@Size(min = 5, max = 10)
	@NotEmpty(message = "Please enter your Pan card number")
	private String panCard;
	
	@Size(min = 5, max = 10)
	@NotEmpty(message = "Please enter your Date of birth")
	private String dOB;
	
	@Size(min = 5, max = 10)
	@NotEmpty(message = "Please enter your Ration Card Number")
	private String rationCard;

	public Customer(int customerId, String fullName, String sex, String address, int phoneNo, String aadhar,
			String panCard, String dOB, String rationCard) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.sex = sex;
		this.address = address;
		this.phoneNo = phoneNo;
		this.aadhar = aadhar;
		this.panCard = panCard;
		this.dOB = dOB;
		this.rationCard = rationCard;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getdOB() {
		return dOB;
	}

	public void setdOB(String dOB) {
		this.dOB = dOB;
	}

	public String getRationCard() {
		return rationCard;
	}

	public void setRationCard(String rationCard) {
		this.rationCard = rationCard;
	}
	
}
