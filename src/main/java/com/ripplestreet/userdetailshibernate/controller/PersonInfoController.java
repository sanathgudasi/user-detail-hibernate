package com.ripplestreet.userdetailshibernate.controller;

import java.util.Date;
import java.util.List;

import com.ripplestreet.userdetailshibernate.dto.PersonInfo;
import com.ripplestreet.userdetailshibernate.service.PersonInfoService;

public class PersonInfoController {

	PersonInfoService infoService = new PersonInfoService();
	public void savePersonInfo(PersonInfo info) {
		infoService.savePersonInfo(info);
	}

	public void deletePersonInfo(int id) {
		infoService.deletePersonInfo(id);
	}

	public void getPersonInfo(int id) {
		infoService.getPersonInfo(id);

	}

	public void getAllPersonInfo() {
		infoService.getAllPersonInfo();
	}

	public void updatePersonName(int id, String name) {
		infoService.updatePersonName(id, name);
	}

	public void updatePersonEmail(int id, String email) {
		infoService.updatePersonEmail(id, email);
	}

	public void updatePersonPhone(int id, long phone) {
		infoService.updatePersonPhone(id, phone);
	}

	public void updatePersonDob(int id, Date dob) {
		infoService.updatePersonDob(id, dob);
	}


}



