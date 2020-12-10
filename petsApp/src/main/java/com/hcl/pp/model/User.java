package com.hcl.pp.model;

/**
 * @SaiKumarNaidu (51897496)
 *
 * ${tags}
 */

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "User", uniqueConstraints = { @UniqueConstraint(columnNames = "userId"),
		@UniqueConstraint(columnNames = "userId") })
public class User implements Serializable {

	private static final long serialVersionUID = -1798070786993154676L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId", unique = true, nullable = false)
	private Integer userId;

	@Column(name = "password", unique = false, nullable = false, length = 100)
	@Size(min=5,max=20)
	@NotEmpty
	private String password;

	@Column(name = "userName", unique = true, nullable = false, length = 100)
	@Size(min=6,max=20)
	@NotEmpty
	private String userName;
	
	//@Transient private String Confirm_password;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private List<Pet> pets;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
}
