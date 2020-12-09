package com.hcl.pp.model;

/**
 * @SaiKumarNaidu (51897496)
 *
 * ${tags}
 */

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Pet", uniqueConstraints = { @UniqueConstraint(columnNames = "petId") })
public class Pet implements Serializable {
	private static final long serialVersionUID = -6790693372846798580L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PetId", unique = true, nullable = false)
	private Integer petId;

	@Column(name = "petName", unique = true, nullable = false, length = 100)
	private String petName;

	@Column(name = "place", unique = false, nullable = false, length = 100)
	private String place;

	@Column(name = "age", unique = false, nullable = false, length = 100)
	private int age;
/*
	@ManyToOne
	private User user;*/

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

/*	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
*/
}