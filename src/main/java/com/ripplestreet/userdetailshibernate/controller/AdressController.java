package com.ripplestreet.userdetailshibernate.controller;

import com.ripplestreet.userdetailshibernate.service.AdressService;

public class AdressController {
	
	AdressService adressService = new AdressService();
	public void saveAdress(int personId, String adressType, String street, String city, int pincode) {
		adressService.saveAdress(personId,adressType,street,city,pincode);
	}
}
