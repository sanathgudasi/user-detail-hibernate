package com.ripplestreet.userdetailshibernate.service;

import java.util.ArrayList;
import java.util.List;

import com.ripplestreet.userdetailshibernate.dao.AdressDao;
import com.ripplestreet.userdetailshibernate.dao.PersonInfoDao;
import com.ripplestreet.userdetailshibernate.dto.Adress;
import com.ripplestreet.userdetailshibernate.dto.PersonInfo;
import com.ripplestreet.userdetailshibernate.exception.UserDetailsHibernateException;

public class AdressService {
	AdressDao adressDao = new AdressDao();
	PersonInfoDao infoDao = new PersonInfoDao();

	public void saveAdress(int personId, String adressType, String street, String city, int pincode) {
		PersonInfo info = infoDao.getPersonInfo(personId);
		if(info!=null) {
			Adress adress = new Adress(adressType, street, city, pincode, null);
			adress.setInfo(info);
			info.getAdresses().add(adress);
			adressDao.saveAdress(info);
		}
		else throw new UserDetailsHibernateException("Person id does not exists to save adress");
	}
}
