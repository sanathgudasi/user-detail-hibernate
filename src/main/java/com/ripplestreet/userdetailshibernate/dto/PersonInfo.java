package com.ripplestreet.userdetailshibernate.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class PersonInfo {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private long phone;
	@Column(nullable = false)
	private Date dob;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Adress> adresses;
	
	
	public PersonInfo() {
		super();
	}


	public PersonInfo(String name, String email, long phone, Date dob, List<Adress> adresses) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.adresses = adresses;
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


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public List<Adress> getAdresses() {
		return adresses;
	}


	public void setAdresses(List<Adress> adresses) {
		this.adresses = adresses;
	}


	@Override
	public String toString() {
		return "PersonInfo [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", dob=" + dob
				+ ", adresses=" + adresses + "]";
	}
	
	

	
	
	
	

}
