package com.restro.customer;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String contact;
	private String password;
	private String c_password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String fistname) {
		this.firstname = fistname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getC_password() {
		return c_password;
	}
	public void setC_password(String c_password) {
		this.c_password = c_password;
	}

}
