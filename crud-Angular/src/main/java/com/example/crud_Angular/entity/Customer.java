package com.example.crud_Angular.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String name;
	private String email;
	private String Phone;
	

	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param phone
	 */
	public Customer(Long id, String name, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		Phone = phone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", Phone=" + Phone + "]";
	}

}
