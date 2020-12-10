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
import javax.persistence.ManyToOne;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Pet", uniqueConstraints = { @UniqueConstraint(columnNames = "petId") })
public class Pet implements Serializable {
	private static final long serialVersionUID = -6790693372846798580L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PetId", unique = true, nullable = false)
	private Integer petId;

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	@Column(name = "petName", unique = false, nullable = false, length = 25)
	@Size(min=3, max=20)
	@NotEmpty
	private String petName;

	@Column(name = "place", unique = false, nullable = false, length = 25)
	@Size(min=3,max=20)
	@NotEmpty
	private String place;

	@Column(name = "age", unique = false, nullable = false, length = 25)
	@Max(99)
	@Min(1)
	private int age;

	@ManyToOne
	private User owner;

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