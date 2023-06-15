package com.ripplestreet.userdetailshibernate.service;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import com.ripplestreet.userdetailshibernate.dao.PersonInfoDao;
import com.ripplestreet.userdetailshibernate.dto.PersonInfo;

public class PersonInfoService {
	PersonInfoDao infoDao = new PersonInfoDao();
	
	public void savePersonInfo(PersonInfo info) {
		infoDao.savePersonInfo(info);
		System.out.println("saved!!");
	}

	public void deletePersonInfo(int id) {
		infoDao.deletePersonInfo(id);
	}

	public void getPersonInfo(int id) {
		PersonInfo info =  infoDao.getPersonInfo(id);
		System.out.println(info);

	}

	public void getAllPersonInfo() {
		List<PersonInfo> list	=	infoDao.getAllPersonInfo();
		for(PersonInfo info : list) {
			System.out.println(info);
		}
	}

	public void updatePersonName(int id, String name) {
		infoDao.updatePersonName(id, name);
	}

	public void updatePersonEmail(int id, String email) {
		infoDao.updatePersonEmail(id, email);
	}

	public void updatePersonPhone(int id, long phone) {
		infoDao.updatePersonPhone(id, phone);
	}

	public void updatePersonDob(int id, Date dob) {
		infoDao.updatePersonDob(id, dob);
	}


}



