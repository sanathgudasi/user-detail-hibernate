package com.ripplestreet.userdetailshibernate.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Adress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adressId;
	@Column(nullable = false)
	private String adressType;
	@Column(nullable = false)
	private String street;
	@Column(nullable = false)
	private String city;
	@Column(nullable = false)
	private int pincode;
	
	@ManyToOne
	private PersonInfo info;

	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adress(String adressType, String street, String city, int pincode, PersonInfo info) {
		super();
		this.adressType = adressType;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.info = info;
	}
	
	

	public int getAdressId() {
		return adressId;
	}

	public void setAdressId(int adressId) {
		this.adressId = adressId;
	}

	public String getAdressType() {
		return adressType;
	}

	public void setAdressType(String adressType) {
		this.adressType = adressType;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public PersonInfo getInfo() {
		return info;
	}

	public void setInfo(PersonInfo info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Adress [adressId=" + adressId + ", adressType=" + adressType + ", street=" + street + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}


	
	

}
